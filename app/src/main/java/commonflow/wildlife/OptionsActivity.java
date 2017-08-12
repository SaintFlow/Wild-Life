package commonflow.wildlife;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class OptionsActivity extends AppCompatActivity
implements OptionsFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Settings");
        setSupportActionBar(toolbar);

       //Adding fragment
        getFragmentManager().beginTransaction().replace(R.id.options_container,
                new OptionsFragment()).commit();
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
