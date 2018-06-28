package com.fooduca.fooduca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView cargando;

        cargando = (ImageView) findViewById(R.id.cargando);
        cargando.setImageResource(R.drawable.cargando);

        int cont = 0;
        while(cont != 1000000000){
            cont = cont +1;
        }
        if (cont == 1000000000){
            cont = 0;
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
}
