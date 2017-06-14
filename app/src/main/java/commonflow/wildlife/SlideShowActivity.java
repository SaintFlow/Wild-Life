package commonflow.wildlife;

import android.app.DialogFragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import commonflow.wildlife.dummy.AnimalPicture;
import commonflow.wildlife.dummy.DBHandler;
import commonflow.wildlife.dummy.FileChecker;

public class SlideShowActivity extends AppCompatActivity implements NoticeDialogFragment.NoticeDialogListener{

    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_show);



        mCustomPagerAdapter = new CustomPagerAdapter(this, getIntent().getStringExtra("AnimalName"), getFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);
        mViewPager.setCurrentItem(getIntent().getIntExtra("Position", 0));



        //Button deleteButton = (Button) findViewById(R.id.deleteButton);

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) findViewById(R.id.deleteButton);
                saveButton.setVisibility(saveButton.INVISIBLE);
                deleteButton.setVisibility(deleteButton.INVISIBLE);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) findViewById(R.id.deleteButton);
                saveButton.setVisibility(saveButton.INVISIBLE);
                deleteButton.setVisibility(deleteButton.INVISIBLE);
            }
        });

    }


    @Override
    public void onDialogPositiveClick(DialogFragment dialog)
    {
        NoticeDialogFragment newDialog = (NoticeDialogFragment) dialog;
        AnimalPicture animal = newDialog.getAniPic();
        DBHandler db = new DBHandler(getApplicationContext());
        db.deleteAnimalPicture(animal.getAnimal_id());
        getApplicationContext().deleteFile(animal.getAnimal_picture_url());
        CustomPagerAdapter.animals.remove(animal);

        Toast.makeText(getApplicationContext(), "Picture Deleted", Toast.LENGTH_LONG).show();
        mViewPager.setAdapter(mCustomPagerAdapter);

    }

    @Override
    public void onDialogNegativeClick(DialogFragment dialog) {

    }
}
