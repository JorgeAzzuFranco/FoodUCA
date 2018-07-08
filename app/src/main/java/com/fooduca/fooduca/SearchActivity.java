package com.fooduca.fooduca;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fooduca.fooduca.Fragmentos.PeaFragment;
import com.fooduca.fooduca.Fragmentos.ProceresFragment;

public class SearchActivity extends AppCompatActivity {

    EditText min;
    EditText max;
    Button search;
    String min_alv;
    String max_alv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_activity);

        min = findViewById(R.id.precio_min);
        max = findViewById(R.id.precio_max);
        search = findViewById(R.id.search_btn1);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!min.getText().toString().equals("")&&!max.getText().toString().equals("")){
                min_alv = min.getText().toString();
                max_alv = max.getText().toString();
                    if(Double.valueOf(max_alv)>0.0) {
                        //Palma con el intent
                        Double pre_min = Double.valueOf(min_alv);
                        Double pre_max = Double.valueOf(max_alv);
                        if(pre_max>pre_min) {
                            Intent intent = new Intent(getApplicationContext(), ListaComidaActivity.class);
                            intent.putExtra("min", pre_min);
                            intent.putExtra("max", pre_max);
                            startActivity(intent);
                        }else {
                            Toast.makeText(getApplicationContext(), "Valor máximo debe ser mayor que el mínimo",Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(getApplicationContext(), "Por favor ingresa un valor máximo mayor a 0",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(), "Datos incompletos",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
