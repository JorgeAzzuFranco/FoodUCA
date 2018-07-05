package com.fooduca.fooduca;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

import com.fooduca.fooduca.Adapter.RecyclerViewComida;
import com.fooduca.fooduca.DBRoom.ComidaViewModel;
import com.fooduca.fooduca.POJO.Comida;

import java.util.ArrayList;
import java.util.List;

import com.fooduca.fooduca.Adapter.*;

public class ListaComidaActivity extends AppCompatActivity {

    RecyclerView rv;
    GridLayoutManager glm;
    String restau;
    RecyclerViewComida comidaAdapter;
    ImageView btn_fb;
    ImageView btn_ig;
    Data data = new Data();

    //instancias fab menu
    static boolean isFabOpen = false;
    FloatingActionButton fabMain;
    FloatingActionButton fabFb;
    FloatingActionButton fabIg;
    View bgFabMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_restaurante_individual);
        final Bundle datos = this.getIntent().getExtras();
        //restau = datos.getString("com");

        rv = findViewById(R.id.myrv);
        rv.setHasFixedSize(true);
        glm = new GridLayoutManager(this, 2);

        rv.setLayoutManager(glm);

        comidaAdapter = new RecyclerViewComida(getApplicationContext(), data.getComidas(datos.getString("com")));
        rv.setLayoutManager(glm);
        rv.setAdapter(comidaAdapter);

        //Floating menu
        fabFb = findViewById(R.id.fab_fb);
        bgFabMenu = findViewById(R.id.bg_fab_menu);
        fabMain = findViewById(R.id.fab_main);
        fabIg = findViewById(R.id.fab_ig);

        fabMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFabOpen){
                    ShowFabMenu();
                }else {
                    CloseFabMenu();
                }
            }
        });
        fabIg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CloseFabMenu();
                String obtenerig = datos.getString("ig");
                if (obtenerig != null) {
                    Uri uri = Uri.parse(obtenerig);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Este restaurante no posee ig",Toast.LENGTH_LONG).show();
                }

            }
        });
        fabFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CloseFabMenu();
                String obtenerfb = datos.getString("fb");
                if (obtenerfb != null) {
                    Uri uri = Uri.parse(obtenerfb);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Este Restaurante no posee fb",Toast.LENGTH_LONG).show();
                }
            }
        });
        bgFabMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CloseFabMenu();
            }
        });
    }

    private void CloseFabMenu() {
        isFabOpen=false;
        fabFb.setVisibility(View.INVISIBLE);
        fabIg.setVisibility(View.INVISIBLE);
        bgFabMenu.setVisibility(View.INVISIBLE);

        fabMain.animate().rotation(0f);
        bgFabMenu.animate().alpha(0f);
        fabFb.animate().translationY(0f).rotation(90f);
        fabIg.animate().translationY(0f).rotation(90f);
    }

    private void ShowFabMenu() {
        isFabOpen=true;
        fabFb.setVisibility(View.VISIBLE);
        fabIg.setVisibility(View.VISIBLE);
        bgFabMenu.setVisibility(View.VISIBLE);

        fabMain.animate().rotation(135f);
        bgFabMenu.animate().alpha(1f);
        fabFb.animate().translationY(-160f).rotation(0f);
        fabIg.animate().translationY(-300f).rotation(0f);
    }

}
