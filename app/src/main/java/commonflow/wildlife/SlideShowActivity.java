package commonflow.wildlife;

import android.app.ActionBar;
import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Environment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import commonflow.wildlife.dummy.AnimalPicture;
import commonflow.wildlife.dummy.DBHandler;
import commonflow.wildlife.dummy.FileChecker;

/**
 * Slide Show Activity class for displaying images in a slide show. It uses to Viewpager to
 * show these images on screen
 */
public class SlideShowActivity extends AppCompatActivity implements NoticeDialogFragment.NoticeDialogListener{

    CustomPagerAdapter mCustomPagerAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Hide the system UI on creation of the activity
        hideSystemUI();

        setContentView(R.layout.activity_slide_show);

        mCustomPagerAdapter = new CustomPagerAdapter(this, getIntent().getStringExtra("AnimalName"), getFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(mCustomPagerAdapter);
        mViewPager.setCurrentItem(getIntent().getIntExtra("Position", 0));

        //Set page listeners for the viewpager
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                //Hide buttons and objects when the page is scrolled
                hideSystemUI();
                ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) findViewById(R.id.deleteButton);
                View rectangle = (View) findViewById(R.id.tint_rectangle);
                rectangle.setVisibility(saveButton.INVISIBLE);
                saveButton.setVisibility(saveButton.INVISIBLE);
                deleteButton.setVisibility(deleteButton.INVISIBLE);
            }

            @Override
            public void onPageSelected(int position)
            {
                //Hide buttons and objects when the page is scrolled
                /*hideSystemUI();
                ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) findViewById(R.id.deleteButton);
                View rectangle = (View) findViewById(R.id.tint_rectangle);
                rectangle.setVisibility(saveButton.INVISIBLE);
                saveButton.setVisibility(saveButton.INVISIBLE);
                deleteButton.setVisibility(deleteButton.INVISIBLE);*/

            }

            @Override
            public void onPageScrollStateChanged(int state) {

                //Hide buttons and objects when the page is scrolled
                hideSystemUI();
                ImageButton saveButton = (ImageButton) findViewById(R.id.saveButton);
                ImageButton deleteButton = (ImageButton) findViewById(R.id.deleteButton);
                View rectangle = (View) findViewById(R.id.tint_rectangle);
                rectangle.setVisibility(saveButton.INVISIBLE);
                saveButton.setVisibility(saveButton.INVISIBLE);
                deleteButton.setVisibility(deleteButton.INVISIBLE);
            }
        });

    }


    @Override
    public void onDialogPositiveClick(DialogFragment dialog)
    {
        //Delete the image upon confirmation of the alert dialog
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

    /**
     * Hide the System UI, including the navigation bar and the status bar. The animations for the
     * display are done automatically.
     */
    private void hideSystemUI() {
        // Set the IMMERSIVE flag.
        // Set the content to appear under the system bars so that the content
        // doesn't resize when the system bars hide and show.
        View mDecorView = getWindow().getDecorView();
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }

    /**
     * Shows the system UI, including the navigation bar and the status bar. The animations
     * for the display are done automatically.
     */
    private void showSystemUI()
    {
        View mDecorView = getWindow().getDecorView();
        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }
}
