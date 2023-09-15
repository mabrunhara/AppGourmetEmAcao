package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lista extends AppCompatActivity {
    Button btnvoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        btnvoltar3 = findViewById(R.id.btnvoltar3);
        btnvoltar3.setOnClickListener (new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish ();
            }
        });

    }
}