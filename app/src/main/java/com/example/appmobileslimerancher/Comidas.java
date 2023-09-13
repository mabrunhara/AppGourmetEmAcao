package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Comidas extends AppCompatActivity {

    Button btnvoltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comidas);

        btnvoltar2 = findViewById(R.id.btnvoltar2);
        btnvoltar2.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish ();
            }
        });

    }
}