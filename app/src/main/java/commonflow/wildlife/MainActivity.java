package commonflow.wildlife;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        toolbar.setTitle("Wild-Life");
        setSupportActionBar(toolbar);

        PreferenceManager.setDefaultValues(this, R.xml.preference, false);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        Button animalListButton = (Button) findViewById(R.id.animal_list_button);
        animalListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalListIntent = new Intent(getApplicationContext(),
                        AnimalListActivity.class);
                startActivity(animalListIntent);
            }
        });

        Button animalClassButton = (Button) findViewById(R.id.animal_classes_button);
        animalClassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalClassIntent = new Intent(getApplicationContext(),
                        AnimalClassList.class);
                startActivity(animalClassIntent);
            }
        });

        Button speciesHelpButton = (Button) findViewById(R.id.help_button);
        speciesHelpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent speciesHelpClassIntent = new Intent(getApplicationContext(),
                        SpeciesHelpActivity.class);
                startActivity(speciesHelpClassIntent);
            }
        });

        Button optionsButton = (Button) findViewById(R.id.options_button);
        optionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent optionsClassIntent = new Intent(getApplicationContext(),
                        OptionsActivity.class);
                startActivity(optionsClassIntent);
            }
        });
    }

}
