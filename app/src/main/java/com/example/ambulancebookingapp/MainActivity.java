package com.example.ambulancebookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmapsactivity();
            }
        });

        button=(Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPatientActivity();

            }
        });


    }
    public void openmapsactivity()
    {
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }
    public void openPatientActivity()
    {
        Intent intent=new Intent(this,PatientActivity.class);
        startActivity(intent);
    }

}