package com.example.appmobileslimerancher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    Button btnsobre;
    Button btnlista;
    Button btnitens;
    Button btnsair;
    Button btncomp;

    Button btnlink;

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

                Intent Lista  = new Intent(getApplicationContext(), Lista.class);
                startActivity(Lista);
            }
        });

        btnitens = (Button) findViewById(R.id.btnitens);
        btnitens.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Comidas= new Intent(getApplicationContext(), Itens.class);
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

        Button btnlink = findViewById(R.id.btnlink);

        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://youtu.be/Fo5CR7utRik?si=8aFqP0-ys60dh-5T";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
