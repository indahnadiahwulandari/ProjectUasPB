package com.example.profesiindah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    CardView cardViewKoki;
    CardView cardViewAtlet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.logo2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        cardViewKoki = findViewById(R.id.Koki);
        cardViewAtlet = findViewById(R.id.Atlet);
u
        cardViewKoki.setOnClickListener(this);
        cardViewAtlet.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Koki:
                startActivity(new Intent(this, FotoKoki.class));
                break;
            case R.id.Atlet:
                startActivity(new Intent(this, FotoAtlet.class));
                break;
        }
    }
}
