package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnsobre;
    Button btnlista;
    Button btnitens;
    Button btnsair;
    Button btncomp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnsobre = (Button) findViewById (R.id.btnsobre);
        btnsobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Sobre  = new Intent(getApplicationContext(), Sobre.class);
                startActivity(Sobre);

            }
        });

        btnlista = (Button) findViewById(R.id.btnlista);
        btnlista.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent Slimes  = new Intent(getApplicationContext(), Slimes.class);
                startActivity(Slimes);
            }
        });

        btnitens = (Button) findViewById(R.id.btnitens);
        btnitens.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Comidas= new Intent(getApplicationContext(), Comidas.class);
                startActivity(Comidas);

            }
        });

        btnsair = (Button) findViewById(R.id.btnsair);
        btnsair.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });

        btncomp = (Button) findViewById(R.id.btncomp);
        btncomp.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent();
                MainActivity.setAction(Intent.ACTION_SEND);
                MainActivity.putExtra(Intent.EXTRA_SUBJECT, "Compartilhar");
                MainActivity.putExtra(Intent.EXTRA_TEXT, " Sua mensagem a ser compartilhada");
                MainActivity.setType("text/plain");
                startActivity(MainActivity);
            }
        });




    }
}
