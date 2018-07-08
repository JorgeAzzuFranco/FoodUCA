package com.fooduca.fooduca;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fooduca.fooduca.Adapter.RecyclerViewCreadores;

public class AboutIndividualActivity extends AppCompatActivity {

    TextView nombre;
    TextView carrera;
    TextView git;
    TextView email;
    ImageView foto_crea;
    ImageView gmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_individual);

        nombre = findViewById(R.id.txt_nombre_creador);
        carrera = findViewById(R.id.txt_carrera_creador);
        git = findViewById(R.id.txt_git_creador);
        email = findViewById(R.id.txt_email_creador);
        foto_crea = findViewById(R.id.img_creador);
        gmail = findViewById(R.id.img_git);

        String nomb = getIntent().getStringExtra("nomb");
        String career = getIntent().getStringExtra("carrera");
        String git_ = getIntent().getStringExtra("git");
        final String mail = getIntent().getStringExtra("email");
        nombre.setText(nomb);
        carrera.setText(career);
        git.setText(git_);

        /*switch (nomb){
            case "Miguel Gonzalez":
                foto_crea.setImageResource(R.drawable.comida);
                break;
            case "Marlene Barahona":
                foto_crea.setImageResource(R.drawable.comida);
                break;
            case "Sara Romero":
                foto_crea.setImageResource(R.drawable.comida);
                break;
            case "Jorge Franco":
                foto_crea.setImageResource(R.drawable.jorge);
                break;
        }*/

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] TO = {mail};
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Asunto");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Escribe aquí tu mensaje");
                try {
                    startActivity(Intent.createChooser(emailIntent, "Enviar email..."));
                    finish();
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(getApplicationContext(),
                            "No tienes clientes de email instalados.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
