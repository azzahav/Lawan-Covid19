package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class statistics extends AppCompatActivity {
    ImageView back;
    TextView see;
    ImageView kite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        back =findViewById(R.id.imageView2);
        see =findViewById(R.id.textView25);
        kite =findViewById(R.id.imageView4);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(statistics.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(statistics.this, CekUpdate.class);
                startActivity(i);

            }
        });

        kite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(statistics.this, Anggota.class);
                startActivity(i);

            }
        });
    }
}
