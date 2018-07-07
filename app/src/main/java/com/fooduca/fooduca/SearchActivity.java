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
        search = findViewById(R.id.search_btn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                min_alv = min.getText().toString();
                max_alv = max.getText().toString();
//                Integer pre_min = Integer.valueOf(min_alv);
//                Integer pre_max = Integer.valueOf(max_alv);
                Double pre_min = Double.valueOf(min_alv);
                Double pre_max = Double.valueOf(max_alv);
                Toast.makeText(getApplicationContext(), min_alv,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(), max_alv,Toast.LENGTH_SHORT).show();

                //Palma con el intent
                //Intent intent = new Intent(getApplicationContext(), ListaComidaActivity.class);
                //intent.putExtra("min", pre_min);
                //intent.putExtra("max", pre_max);
                //startActivity(intent);
            }
        });
    }
}
