package com.fooduca.fooduca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.fooduca.fooduca.Adapter.RecyclerViewCreadores;

public class AboutIndividualActivity extends AppCompatActivity {

    TextView nombre;
    TextView carrera;
    TextView git;
    TextView email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_individual);

        nombre = findViewById(R.id.txt_nombre_creador);
        carrera = findViewById(R.id.txt_carrera_creador);
        git = findViewById(R.id.txt_git_creador);
        email = findViewById(R.id.txt_email_creador);
        String nomb = getIntent().getStringExtra("nomb");
        String career = getIntent().getStringExtra("carrera");
        String git_ = getIntent().getStringExtra("git");
        String mail = getIntent().getStringExtra("email");
        //int foto = getIntent().getIntExtra("img");
        nombre.setText(nomb);
        carrera.setText(career);
        git.setText(git_);
        email.setText(mail);
    }
}
