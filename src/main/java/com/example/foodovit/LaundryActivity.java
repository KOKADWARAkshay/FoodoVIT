package com.example.foodovit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LaundryActivity extends AppCompatActivity {

    public void onPay(View view) {

    }
    public void openWhatsApp(View view) {
        String text = "How can i help you?";// Replace with your message.

        String toNumber = "+919307473197"; // Replace with mobile phone number without +Sign or leading zeros, but with country code
        //Suppose your country is India and your phone number is “xxxxxxxxxx”, then you need to send “91xxxxxxxxxx”.



        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone=" + toNumber + "&text=" + text));
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);

        Button button9 = findViewById(R.id.button9);

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LaundryActivity.this, PaymentActivity.class);

                LaundryActivity.this.startActivity(intent);

            }
        });
    }

}