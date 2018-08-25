package com.example.nikhil.intenttutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,age,className;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.Ed_Name);
        age = findViewById(R.id.Ed_Age);
        className = findViewById(R.id.Ed_Class);
        button = findViewById(R.id.E_btn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I =  new Intent(MainActivity.this,Show_Details.class);

                int x = Integer.parseInt(age.getText().toString());
                //I.putExtra("Name",name.getText().toString());
                I.putExtra("Name",name.getText().toString());

                I.putExtra("Age",x);
                I.putExtra("ClassName",className.getText().toString());

                startActivity(I);

            }
        });

    }
}
