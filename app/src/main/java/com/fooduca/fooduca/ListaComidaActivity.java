package com.fooduca.fooduca;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.fooduca.fooduca.Adapter.RecyclerViewComida;
import com.fooduca.fooduca.DBRoom.ComidaViewModel;
import com.fooduca.fooduca.POJO.Comida;

import java.util.ArrayList;
import java.util.List;

import com.fooduca.fooduca.Adapter.*;

public class ListaComidaActivity extends AppCompatActivity {

    RecyclerView rv;
    GridLayoutManager glm;
    List<Comida> comidas;
    RecyclerViewComida comidaAdapter;
    ImageView btn_fb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_restaurante_individual);

        btn_fb = findViewById(R.id.btn_fb);
        btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                holder.url.setText(restaurantes.get(position).getWeb());
//                holder.RestauranteImg.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        String obtenerurl = restaurantes.get(position).getWeb();
//                        if (obtenerurl != null) {
//                            Intent intent = new Intent(Intent.ACTION_VIEW);
//                            intent.setData(Uri.parse(obtenerurl));
//                            startActivity(intent);
//                        }
//                    }
//                });
                Uri uri = Uri.parse("https://www.facebook.com./");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        rv = findViewById(R.id.myrv);
        rv.setHasFixedSize(true);
        glm = new GridLayoutManager(this, 2);

        rv.setLayoutManager(glm);

        comidas = new ArrayList<>();
        comidas.add(new Comida("Kissitos", "comida 1", "2.50", R.drawable.comida));
        comidas.add(new Comida("Loretos", "comida 2", "2.50", R.drawable.comida));
        comidas.add(new Comida("Crazy Food", "comida 3", "2.50", R.drawable.comida));

        comidaAdapter = new RecyclerViewComida(getApplicationContext(), comidas);
        rv.setLayoutManager(glm);
        rv.setAdapter(comidaAdapter);
    }
}
