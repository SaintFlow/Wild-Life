package commonflow.wildlife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AnimalClassList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_class_list);

        //Set click listeners on all buttons
        Button mammalsButton = (Button) findViewById(R.id.mammals_button);
        mammalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mammalIntent = new Intent(v.getContext(), AnimalListActivity.class);
                mammalIntent.putExtra("class", 1);
                startActivity(mammalIntent);
            }
        });

        Button birdsButton = (Button) findViewById(R.id.birds_button);
        birdsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent birdsIntent = new Intent(v.getContext(), AnimalListActivity.class);
                birdsIntent.putExtra("class", 2);
                startActivity(birdsIntent);
            }
        });

        Button fishButton = (Button) findViewById(R.id.fish_button);
        fishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fishIntent = new Intent(v.getContext(), AnimalListActivity.class);
                fishIntent.putExtra("class", 3);
                startActivity(fishIntent);
            }
        });

        Button reptilesButton = (Button) findViewById(R.id.reptiles_button);
        reptilesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reptilesIntent = new Intent(v.getContext(), AnimalListActivity.class);
                reptilesIntent.putExtra("class", 4);
                startActivity(reptilesIntent);
            }
        });

        Button amphibiansButton = (Button) findViewById(R.id.amphibians_button);
        amphibiansButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent amphibiansIntent = new Intent(v.getContext(), AnimalListActivity.class);
                amphibiansIntent.putExtra("class", 5);
                startActivity(amphibiansIntent);
            }
        });

        Button anthropodsButton = (Button) findViewById(R.id.anthropods_button);
        anthropodsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anthropodsIntent = new Intent(v.getContext(), AnimalListActivity.class);
                anthropodsIntent.putExtra("class", 6);
                startActivity(anthropodsIntent);
            }
        });



    }
}
