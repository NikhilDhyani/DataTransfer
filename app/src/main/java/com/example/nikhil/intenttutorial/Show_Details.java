package com.example.nikhil.intenttutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Show_Details extends AppCompatActivity {

    TextView G_Name,G_Age,G_Class;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show__details);


        Intent i = getIntent();

        String name = i.getStringExtra("Name");
        Integer age = i.getIntExtra("Age",1);
        String className = i.getStringExtra("ClassName");


        G_Age = findViewById(R.id.D_Age);
        G_Name = findViewById(R.id.D_Name);
        G_Class = findViewById(R.id.D_Class);


        G_Name.setText(name);
        G_Class.setText(className);

        G_Age.setText(String.valueOf(age));





    }
}
