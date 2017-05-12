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
import android.os.Bundle;
import android.os.Environment;
import android.preference.DialogPreference;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
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

/**
 * An activity representing a single Animal detail screen. This
 * activity is only used narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link AnimalListActivity}.
 */
public class AnimalDetailActivity extends AppCompatActivity {

    private static final int MY_PERMISSIONS_READ_EXTERNAL_STORAGE = 0;
    private static final int REQUEST_CAMERA = 1;
    private static final int SELECT_FILE = 1;
    //private Boolean result = false;
    private CharSequence userChosenTask = "";
    Bitmap bitmap;
    private ImageView ivImage;
    private Button btn;
    private LinearLayout li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        NestedScrollView sv = (NestedScrollView) findViewById(R.id.animal_detail_container);

        Button buttonTest = new Button(getApplicationContext());
        //Log.d("Child Count", sv.getChildCount() + "");
        //li = (LinearLayout) findViewById(R.id.animal_detail);
        li = new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams liParams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        li.setOrientation(LinearLayout.VERTICAL);
        TextView testers = new TextView(getApplicationContext());
        buttonTest.setLayoutParams(liParams);
        buttonTest.setText("Select Photo");
        li.addView(buttonTest);
        testers.setText("Will this work?");
        //Log.d("Child Count", sv.getChildCount() + "");
        //sv.removeAllViews();
        //Log.d("Child Count", sv.getChildCount() + "");
        //sv.addView(li);
        Log.d("Activity Turn", "Activity");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own detail action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //btn = (Button) findViewById(R.id.btnSelectPhoto);


        ivImage = new ImageView(getApplicationContext());

        /*for (int x = 0; x < 3; x++)
        {
            ImageView image = new ImageView(AnimalDetailActivity.this);
            R.id.an
        }*/

        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(AnimalDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(AnimalDetailFragment.ARG_ITEM_ID));
            AnimalDetailFragment fragment = new AnimalDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.animal_detail_container, fragment)
                    .commit();
        }
    }



    /*public void checkPermission() {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.READ_EXTERNAL_STORAGE)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
                        MY_PERMISSIONS_READ_EXTERNAL_STORAGE);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }
    }*/




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. Use NavUtils to allow users
            // to navigate up one level in the application structure. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            NavUtils.navigateUpTo(this, new Intent(this, AnimalListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
