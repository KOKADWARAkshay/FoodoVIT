package com.example.foodovit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.foodovit.views.MainActivity2;

public class MainActivity3 extends AppCompatActivity {

    public void onClick(View view) {

    }

    public void onThen(View view) {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button buttonnm = findViewById(R.id.buttonnm);

        buttonnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);

                MainActivity3.this.startActivity(intent);

            }
        });

        Button button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity3.this, LaundryActivity.class);

                MainActivity3.this.startActivity(intent);

            }
        });
    }
}

