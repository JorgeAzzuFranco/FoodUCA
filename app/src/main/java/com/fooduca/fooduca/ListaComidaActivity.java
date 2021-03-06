package com.fooduca.fooduca;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
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
    Double min, max;
    boolean tea;
    RecyclerViewComida comidaAdapter;
    ImageView btn_fb;
    ImageView btn_ig;
    ImageView banner_view;
    TextView freeTea;
    int banner;
    Data data = new Data();

    //instancias fab menu
    static boolean isFabOpen = false;
    FloatingActionButton fabMain;
    FloatingActionButton fabFb;
    FloatingActionButton fabIg;
    View bgFabMenu;
    ImageView imaRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview_restaurante_individual);
        final Bundle datos = this.getIntent().getExtras();

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int width = metrics.widthPixels;
        imaRes = findViewById(R.id.img_restaurante_individual);
        freeTea = findViewById(R.id.te_id);


        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {

        }else{
            imaRes.getLayoutParams().width = width/3;
            freeTea.getLayoutParams().width = width/3;
        }

        rv = findViewById(R.id.myrv);
        rv.setHasFixedSize(true);
        glm = new GridLayoutManager(this, 2);

        rv.setLayoutManager(glm);
        banner_view = findViewById(R.id.img_restaurante_individual);
        banner = datos.getInt("img");
        tea = datos.getBoolean("te");

        min = datos.getDouble("min");
        max = datos.getDouble("max");

        fabMain = findViewById(R.id.fab_main);

        if(max != 0.0){
            comidaAdapter = new RecyclerViewComida(getApplicationContext(), data.getSearch(min,max));
            fabMain.setVisibility(View.INVISIBLE);
        }else{
            comidaAdapter = new RecyclerViewComida(getApplicationContext(), data.getComidas(datos.getString("com")));
            banner_view.setImageResource(banner);
            //Te gratis
            if(tea){
                freeTea.setText(R.string.incluye_te);
            }

            //Floating menu
            fabFb = findViewById(R.id.fab_fb);
            bgFabMenu = findViewById(R.id.bg_fab_menu);
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
                String obtenernomb = datos.getString("com");
                if (obtenerig != null) {
                    Toast.makeText(getApplicationContext(), getString(R.string.redirige)+obtenernomb,Toast.LENGTH_LONG).show();
                    Uri uri = Uri.parse(obtenerig);
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), obtenernomb+getString(R.string.no_ig),Toast.LENGTH_LONG).show();
                }

            }
        });
        fabFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CloseFabMenu();
                String obtenerfb = datos.getString("fb");
                String obtenerfbid = datos.getString("fbid");
                String obtenernomb = datos.getString("com");
                if (obtenerfb != null) {
                    try {
                        Toast.makeText(getApplicationContext(), getString(R.string.redirigiendo_pag)+obtenernomb,Toast.LENGTH_LONG).show();
                        Uri uri1 = Uri.parse(obtenerfbid);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri1));
                    } catch (Exception e) {
                        Toast.makeText(getApplicationContext(),"App no instalada",Toast.LENGTH_SHORT).show();
                        Uri uri2 = Uri.parse(obtenerfb);
                        startActivity(new Intent(Intent.ACTION_VIEW, uri2));
                    }
                }else {
                    Toast.makeText(getApplicationContext(), obtenernomb+getString(R.string.no_fb),Toast.LENGTH_LONG).show();
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

        rv.setLayoutManager(glm);
        rv.setAdapter(comidaAdapter);
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
