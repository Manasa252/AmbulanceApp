package com.example.ambulancebookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PatientActivity extends AppCompatActivity {
    private Button booknow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);

        booknow= (Button) findViewById(R.id.booknow);
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmapsactivity();
            }
        });
    }

    public void openmapsactivity()
    {
        Intent intent=new Intent(this,MapsActivity.class);
        startActivity(intent);
    }

}