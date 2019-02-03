package com.example.divyampandya63.qourier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Paypal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paypal);
        ImageView courierImageView = findViewById(R.id.imageLogo);
        TextView nameTextView = findViewById(R.id.nameOfCourier);
        TextView rateTextView = findViewById(R.id.rateOfCourier);

        Intent intent = getIntent();
        String urlOfLogo = intent.getStringExtra("url");

        Picasso.with(Paypal.this)
                .load(urlOfLogo)
                .into(courierImageView);

        String nameOfc = intent.getStringExtra("name");
        nameTextView.setText(nameOfc);

        String rateOfc = intent.getStringExtra("rate");
        rateTextView.setText(rateOfc);
        LinearLayout rcoin = findViewById(R.id.rcoin);
        rcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Paypal.this,"Payment Processing",Toast.LENGTH_LONG).show();
            }
        });

    }

}
