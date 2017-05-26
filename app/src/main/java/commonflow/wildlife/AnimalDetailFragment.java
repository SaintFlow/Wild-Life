package commonflow.wildlife;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.support.annotation.IdRes;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import commonflow.wildlife.dummy.AnimalPicture;
import commonflow.wildlife.dummy.DBHandler;
import commonflow.wildlife.dummy.DummyContent;
import commonflow.wildlife.dummy.Encyclopedia;
import commonflow.wildlife.dummy.FileChecker;

/**
 * A fragment representing a single Animal detail screen.
 * This fragment is either contained in a {@link AnimalListActivity}
 * in two-pane mode (on tablets) or a {@link AnimalDetailActivity}
 * on handsets.
 */
public class AnimalDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */

    private ImageView ivImage;

    private static final int MY_PERMISSIONS_READ_EXTERNAL_STORAGE = 0;
    private static final int MY_PERMISSION_MANAGE_DOCUMENTS = 1;
    private static final int REQUEST_CAMERA = 2;
    private static final int SELECT_FILE = 1;
    //private Boolean result = false;
    private CharSequence userChosenTask = "";
    private LinearLayout li;
    private boolean isImageAdded;
    private Bitmap jc;
    DBHandler db;

    public AnimalDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.animal_detail, container, false);

        if (mItem != null)
        {
            //Creating the database
            db = new DBHandler(getContext());
            Button buttonTest = new Button(getActivity());

            //Creating the linear layout
            li = (LinearLayout) rootView.findViewById(R.id.animal_detail);
            LinearLayout.LayoutParams liParams = new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            li.setOrientation(LinearLayout.VERTICAL);

            //Setting and adding the Select button to the layout
            buttonTest.setLayoutParams(liParams);
            buttonTest.setText("Select Photo");
            buttonTest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectImage();
                }
            });
            li.addView(buttonTest);

            ivImage = new ImageView(getActivity());
            ViewGroup.LayoutParams imageParams = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            ivImage.setLayoutParams(imageParams);
            li.addView(ivImage);

            List<AnimalPicture> animals = db.getAnimalList(mItem.content);
            int i = 0;
            //Creating encyclopedia
            Encyclopedia ec = new Encyclopedia();

            //Adding each stored picture from the database into view
            for (AnimalPicture ani : animals) {
                Bitmap b;

                try {
                    Uri uriTemp = Uri.parse(ani.getAnimal_picture_url());
                    FileInputStream fis = getContext().openFileInput(ani.getAnimal_picture_url());
                    Log.d("URL", "URL is " + uriTemp.toString());
                    b = BitmapFactory.decodeStream(fis);
                    ImageView temp = new ImageView(getContext());
                    temp.setPadding(5, 5, 5, 5);
                    temp.setImageBitmap(b);
                    li.addView(temp);
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //First check if encyclopedia has the animal, if so, add its contents underneath
                //the picture
                if (ec.hasAnimal(mItem.content)) {
                    if (i < ec.getAnimalSize(mItem.content)) {
                        TextView factoid = new TextView(getContext());
                        factoid.setText(ec.getAnimalEntry(mItem.content, i));
                        li.addView(factoid);
                        i++;
                    }
                }
            }
        }

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE) {
                onSelectFromGalleryResult(data);
            }
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }



    //For marsh-mellow builds that have permission alerts
    public boolean checkPermission(final Context context)
    {
        int currentAPIVersion = Build.VERSION.SDK_INT;
        if(currentAPIVersion>=android.os.Build.VERSION_CODES.M)
        {
            if (ContextCompat.checkSelfPermission(context, Manifest.permission.READ_EXTERNAL_STORAGE)
                    != PackageManager.PERMISSION_GRANTED)
            {
                if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context,
                        Manifest.permission.READ_EXTERNAL_STORAGE))
                {
                    AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
                    alertBuilder.setCancelable(true); alertBuilder.setTitle("Permission necessary");
                    alertBuilder.setMessage("External storage permission is necessary");
                    alertBuilder.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener()
                    {
                        @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
                        public void onClick(DialogInterface dialog, int which)
                        {
                            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                                    MY_PERMISSIONS_READ_EXTERNAL_STORAGE); } });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();
                } else
                {

                    requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_READ_EXTERNAL_STORAGE);
                }
                return false;
            }
            else
            {
                return true;
            }
        } else
        {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        Log.d("request Result", "onRequestPermissionsResult");
        switch (requestCode) {
            case MY_PERMISSIONS_READ_EXTERNAL_STORAGE: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (userChosenTask.equals("Take Photo"))
                    {
                        System.out.println("Permission successful, take photo");
                        cameraIntent();
                    } else if (userChosenTask.equals("Choose from Library"))
                    {
                        Log.d("Success", "can choose from gallery");
                        galleryIntent();
                    }

                } else {

                    System.out.println("Permission FAILED!");
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                break;
            }
            case MY_PERMISSION_MANAGE_DOCUMENTS:
            {
                Log.d("manage document case", "please work");
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {


                } else {

                    Log.d("MANAGE", "ERROR: manage documents permission NOT successful");
                }
                break;
            }
        }
    }

    public void selectImage()
    {
        final CharSequence[] items = {"Take Photo", "Choose from Library", "Cancel"};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Add Photo!");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {

                boolean result = checkPermission(getActivity());
                if (items[item].equals("Take Photo"))
                {
                    userChosenTask = "Take Photo";
                    Log.d("Success","chose Photo");
                    if (result)
                    {
                        Log.d("Success","take photo");
                        cameraIntent();
                    }
                } else if (items[item].equals("Choose from Library"))
                {
                    userChosenTask = "Choose from Library";
                    if (result)
                    {
                        galleryIntent();
                    }
                } else if (items[item].equals("Cancel"))
                {
                    dialog.dismiss();
                } else
                {
                    System.out.println("Permission FAILED");
                }
            }
        });
        builder.show();

    }

    private void cameraIntent()
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    private void galleryIntent()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        if (android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT) {
            intent.setAction(Intent.ACTION_GET_CONTENT);
        } else {
            intent.setAction(Intent.ACTION_OPEN_DOCUMENT);
            intent.addCategory(Intent.CATEGORY_OPENABLE);
        }
        startActivityForResult(intent.createChooser(intent, "Select File"), SELECT_FILE);
    }

    private Bitmap getBitmapFromUri(Uri uri) throws IOException {

        ParcelFileDescriptor parcelFileDescriptor =
                getActivity().getContentResolver().openFileDescriptor(uri, "r");
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        Bitmap image = BitmapFactory.decodeFileDescriptor(fileDescriptor);
        parcelFileDescriptor.close();
        return image;
    }

    private void onSelectFromGalleryResult(Intent data)
    {
        Bitmap bm;
        Log.d("selectfromGal", "here");
        if (data != null)
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            Random random = new Random();
            //String filename = mItem.content + String.format("%s.%s", sdf.format( new Date() ),
            //random.nextInt(9));
            String filename = mItem.content + sdf.format(new Date());
            //File file = new File(filename, );
            AnimalPicture ac = new AnimalPicture();
            ac.setAnimal_picture_url(filename);
            ac.setAnimal_name(mItem.content);
            db.addNewAnimalPicture(ac);
            FileOutputStream out = null;
            try {

                bm = MediaStore.Images.Media.getBitmap(
                        getActivity().getApplicationContext().getContentResolver(),data.getData());
                Uri path = data.getData();

                out = getContext().openFileOutput(filename, Context.MODE_PRIVATE);
                bm.compress(Bitmap.CompressFormat.PNG, 100, out);

                Log.d("get Data", path.getPath());

                //To update the fragment to display the image, detach it, attach it, then commit
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.detach(this).attach(this).commit();

            } catch (IOException e)
            {
                e.printStackTrace();
            } finally {
                if (out != null)
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }

        }
    }


    private void onCaptureImageResult(Intent data) {
        Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        thumbnail.compress(Bitmap.CompressFormat.JPEG, 90, bytes);
        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");
        FileOutputStream fo;
        try {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ivImage.setImageBitmap(thumbnail);
    }
}
