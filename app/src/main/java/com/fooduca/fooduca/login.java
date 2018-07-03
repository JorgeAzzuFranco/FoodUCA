package com.fooduca.fooduca;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle("AVISO");
        dialogo1.setIcon(R.drawable.hi);
        dialogo1.setMessage("¿Estas list@ para una avalancha de sabor?");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                aceptar();
            }
        });
        dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }

    public void aceptar() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
        Toast t=Toast.makeText(this,"Bienvenido a FoodUCA", Toast.LENGTH_SHORT);
        t.show();
        finish();
    }

    public void cancelar() {
        finish();
    }
}
