package commonflow.wildlife;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
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
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import commonflow.wildlife.dummy.DummyContent;

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
    private static final int REQUEST_CAMERA = 1;
    private static final int SELECT_FILE = 1;
    //private Boolean result = false;
    private CharSequence userChosenTask = "";
    private LinearLayout li;
    private boolean isImageAdded;
    private Bitmap jc;
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

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
            //((TextView) rootView.findViewById(R.id.animal_detail)).setText(mItem.details);

            Button buttonTest = new Button(getActivity());
            //Log.d("Child Count", sv.getChildCount() + "");
             li = (LinearLayout) rootView.findViewById(R.id.animal_detail);

            LinearLayout.LayoutParams liParams = new LinearLayout.LayoutParams
                    (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            li.setOrientation(LinearLayout.VERTICAL);


            TextView testers = new TextView(getActivity());
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
            //iv.setId(View.generateViewId());
            testers.setText("Will this work?");
            li.addView(ivImage);
            li.addView(testers);

            Log.d("Fragment", "fragment turn");
            //sv.removeAllViews();
            //Log.d("Child Count", sv.getChildCount() + "");
        }

        return rootView;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE)
                onSelectFromGalleryResult(data);
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    //For marsh-mellow builds that have permission alerts
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public static boolean checkPermission(final Context context)
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
                            ActivityCompat.requestPermissions((Activity) context,
                                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                                    MY_PERMISSIONS_READ_EXTERNAL_STORAGE); } });
                    AlertDialog alert = alertBuilder.create();
                    alert.show();
                } else
                {
                    ActivityCompat.requestPermissions((Activity) context,
                            new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                            MY_PERMISSIONS_READ_EXTERNAL_STORAGE);
                }
                return false;
            } else
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
                        galleryIntent();
                    }

                } else {

                    System.out.println("Permission FAILED!");
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                break;
            }

            // other 'case' lines to check for other
            // permissions this app might request
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
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent.createChooser(intent, "Select File"), SELECT_FILE);
    }

    private void onSelectFromGalleryResult(Intent data)
    {
        Bitmap bm;
        Log.d("selectfromGal", "here");
        if (data != null)
        {
            try {
                Log.d("get Data", data.getDataString());
                bm = MediaStore.Images.Media.getBitmap(
                        getActivity().getApplicationContext().getContentResolver(),data.getData());
                Log.d("Setting image", "setting image");
                ImageView second = new ImageView(getActivity());
                jc = bm;
                second.setImageBitmap(bm);
                TextView sedfs = new TextView(getActivity());
                sedfs.setText("FAFADA");
                li.addView(sedfs);
                isImageAdded = true;


                //To update the fragment to display the image, detach it, attach it, then commit
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.detach(this).attach(this).commit();

                //li.addView(ivImage);

                //Bundle extras = data.getExtras();
                //Log.d("Extra?", data.hasExtra("data") + "");
                //bm = (Bitmap) extras.get("data");
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void onResume()
    {
        super.onResume();
        if (isImageAdded)
        {
            ivImage.setImageBitmap(jc);
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
