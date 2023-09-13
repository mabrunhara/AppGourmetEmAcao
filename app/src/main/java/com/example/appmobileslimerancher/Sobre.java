package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sobre extends AppCompatActivity {

    Button btnvoltar;
    Button btntel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        btnvoltar = findViewById(R.id.btnvoltar);
        btnvoltar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick(View v){
                finish ();
            }
        });

        btntel = findViewById(R.id.btntel);
        btntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("tel:11984332342");
                Intent Sobre = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(Sobre);
            }
        });
    }
}