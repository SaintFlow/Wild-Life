package commonflow.wildlife;


import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Build;
import android.os.Environment;

import android.support.v4.view.PagerAdapter;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import commonflow.wildlife.dummy.AnimalPicture;
import commonflow.wildlife.dummy.DBHandler;

/**
 * Created by Randy on 5/29/2017.
 * Class for the ViewPager for the SlideShowActivity
 */
public class CustomPagerAdapter extends PagerAdapter
{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private FragmentManager fm;
    DBHandler db;
    public static List<AnimalPicture> animals;

    /**
     * Constructor for the CustomPageAdapter
     * @param context The context of the application
     * @param animal The name of the animal
     * @param fragman The FragmentManager
     */
    public CustomPagerAdapter(Context context, String animal, FragmentManager fragman)
    {
        fm = fragman;
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        db = new DBHandler(context);

        animals = db.getAnimalList(animal);
    }

    /**
     * Checks if the external storage can be written to.
     * @return True if the external storage is writable, false otherwise
     */
    public boolean isExternalStorageWritable()
    {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    /**
     * Returns the directory of where the Wild-Life pictures are stored.
     * @param albumName The name of the directory
     * @return The directory to store the Wild-Life pictures
     */
    public File getAlbumStorageDir(String albumName)
    {
        // Get the directory for the user's public pictures directory.
        File file = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), albumName);
        if (!file.mkdirs()) {
            Log.e("FileError", "Directory not created");
        }
        return file;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, int position) {
        final View itemView = mLayoutInflater.inflate(R.layout.pager_item, container, false);
        final ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        final Animation animationFadeIn = AnimationUtils.loadAnimation(
                itemView.getContext(), R.anim.fade_in);
        final Animation animationFadeOut = AnimationUtils.loadAnimation(
                itemView.getContext(), R.anim.fade_out);

        ImageButton saveButton = (ImageButton) itemView.findViewById(R.id.saveButton);
        ImageButton deleteButton = (ImageButton) itemView.findViewById(R.id.deleteButton);
        View rectangle = itemView.findViewById(R.id.tint_rectangle);

        //Store the position of the animal picture in each button, for access
        saveButton.setTag(animals.get(position));
        deleteButton.setTag(animals.get(position));

        //Creates an onClick Listener for when the user clicks on the delete button, which
        //then displays an alert dialog
        deleteButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                showNoticeDialog((AnimalPicture) v.getTag());
            }
        });


        saveButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                AnimalPicture animal = (AnimalPicture) v.getTag();
                String filepath = animal.getAnimal_picture_url();
                if (isExternalStorageWritable())
                {
                    File exportDir = getAlbumStorageDir("WildLifePictures");
                    File savedImage = new File(exportDir, System.currentTimeMillis() + ".jpg");

                    try {
                        FileInputStream fis = imageView.getContext().openFileInput(filepath);
                        //Log.d("URL", "URL is " + uriTemp.toString());
                        Bitmap bm = BitmapFactory.decodeStream(fis);
                        FileOutputStream savedStream = new FileOutputStream(savedImage);
                        bm.compress(Bitmap.CompressFormat.JPEG, 100, savedStream);
                        String fileSuccess = "File saved!";
                        //int duration = Toast.LENGTH_SHORT;

                        Toast.makeText(itemView.getContext(), fileSuccess, Toast.LENGTH_LONG).show();

                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }

                }

            }
        });

        //Make the save, rectangle and delete buttons invisible when first loaded
        if (saveButton.getVisibility() == saveButton.VISIBLE)
            saveButton.setVisibility(saveButton.INVISIBLE);
        if (deleteButton.getVisibility() == deleteButton.VISIBLE)
            deleteButton.setVisibility(deleteButton.INVISIBLE);
        if (rectangle.getVisibility() == rectangle.VISIBLE)
            rectangle.setVisibility(rectangle.INVISIBLE);

        //Make the Status bar invisible by default
        //Check the build to determine how to hide the status bar
        //hideStatusBar();
        Bitmap b = null;
        try
        {
            FileInputStream fis = mContext.openFileInput(animals.get(position).getAnimal_picture_url());
            //Log.d("name", animals.toString());
            b = BitmapFactory.decodeStream(fis);
        } catch (Exception io)
        {
            io.printStackTrace();
        }
        imageView.setImageBitmap(b);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton saveButton = (ImageButton) itemView.findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) itemView.findViewById(R.id.deleteButton);
                View rectangle = (View) itemView.findViewById(R.id.tint_rectangle);

                //Hide or show objects when the image is pressed once
                if (saveButton.getVisibility() == saveButton.VISIBLE)
                {
                    hideSystemUI();
                    saveButton.startAnimation(animationFadeOut);
                    saveButton.setVisibility(saveButton.INVISIBLE);
                } else
                {
                    showSystemUI();
                    saveButton.setVisibility(saveButton.VISIBLE);
                    saveButton.startAnimation(animationFadeIn);
                }

                if (deleteButton.getVisibility() != deleteButton.INVISIBLE)
                {
                    deleteButton.startAnimation(animationFadeOut);
                    deleteButton.setVisibility(deleteButton.INVISIBLE);
                } else
                {
                    deleteButton.setVisibility(deleteButton.VISIBLE);
                    deleteButton.startAnimation(animationFadeIn);
                }

                if (rectangle.getVisibility() != rectangle.INVISIBLE)
                {
                    rectangle.startAnimation(animationFadeOut);
                    rectangle.setVisibility(deleteButton.INVISIBLE);
                } else
                {
                    rectangle.setVisibility(deleteButton.VISIBLE);
                    rectangle.startAnimation(animationFadeIn);
                }
            }
        });
        container.addView(itemView);
        return itemView;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == ((RelativeLayout) object);
    }

    @Override
    public int getCount()
    {
        return animals.size();
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((RelativeLayout) object);
    }

    /**
     * Displays an alert dialog for deleting an animal picture from the SlideShow view.
     * The argument is an AnimalPicture, the picture that is selected for deletion.
     *
     * @param aniPic the image that is targeted for deletion
     */
    public void showNoticeDialog(AnimalPicture aniPic)
    {
        // Create an instance of the dialog fragment and show it
        NoticeDialogFragment dialog = new NoticeDialogFragment();
        dialog.setAniPic(aniPic);
        AppCompatActivity test = (AppCompatActivity) mContext;
        test.getSupportFragmentManager();
        dialog.show(fm,"d");

    }

    private void hideStatusBar()
    {
        //Check the build to determine how to hide the status bar
        if (Build.VERSION.SDK_INT < 16) {
            ((Activity) mContext).getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        } else
        {
            View decorView = ((Activity) mContext).getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    private void showStatusBar()
    {
        if (Build.VERSION.SDK_INT < 16) {
            ((Activity) mContext).getWindow().setFlags(WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FORCE_NOT_FULLSCREEN);
        } else
        {
            View decorView = ((Activity) mContext).getWindow().getDecorView();
            // Show the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_VISIBLE;
            decorView.setSystemUiVisibility(uiOptions);
        }
    }

    private void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        View mDecorView = ((Activity) mContext).getWindow().getDecorView();
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }

    // This snippet shows the system bars. It does this by removing all the flags
// except for the ones that make the content appear under the system bars.
    private void showSystemUI()
    {
        View mDecorView = ((Activity) mContext).getWindow().getDecorView();
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

}
