package commonflow.wildlife;


import android.app.FragmentManager;
import android.content.Context;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import android.os.Environment;

import android.support.v4.view.PagerAdapter;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
 */
public class CustomPagerAdapter extends PagerAdapter
{

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private FragmentManager fm;
    DBHandler db;
    public static List<AnimalPicture> animals;

    public CustomPagerAdapter(Context context, String animal, FragmentManager fragman)
    {
        fm = fragman;
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        db = new DBHandler(context);

        animals = db.getAnimalList(animal);


    }

    public boolean isExternalStorageWritable()
    {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

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
        ImageButton saveButton = (ImageButton) itemView.findViewById(R.id.saveButton);

        ImageButton deleteButton = (ImageButton) itemView.findViewById(R.id.deleteButton);
        saveButton.setTag(animals.get(position));
        deleteButton.setTag(animals.get(position));
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



        if (saveButton.getVisibility() != saveButton.INVISIBLE)
            saveButton.setVisibility(saveButton.INVISIBLE);
        if (deleteButton.getVisibility() != deleteButton.INVISIBLE)
            deleteButton.setVisibility(deleteButton.INVISIBLE);
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

                if (saveButton.getVisibility() != saveButton.INVISIBLE)
                {
                    saveButton.setVisibility(saveButton.INVISIBLE);
                } else
                {
                    saveButton.setVisibility(saveButton.VISIBLE);
                }

                if (deleteButton.getVisibility() != deleteButton.INVISIBLE)
                {
                    deleteButton.setVisibility(deleteButton.INVISIBLE);
                } else
                {
                    deleteButton.setVisibility(deleteButton.VISIBLE);
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

}
