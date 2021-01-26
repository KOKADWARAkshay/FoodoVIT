package com.example.foodovit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foodovit.views.MainActivity2;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view) {

    }
    public void onView(View view) {

    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonOTP = findViewById(R.id.buttonOTP);

        buttonOTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, EmailPasswordActivity.class);

                MainActivity.this.startActivity(intent);

            }
        });

        Button buttonGoogle = findViewById(R.id.buttonGoogle);

        buttonGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, GoogleLogIn.class);

                MainActivity.this.startActivity(intent);

            }
        });




    }
}



