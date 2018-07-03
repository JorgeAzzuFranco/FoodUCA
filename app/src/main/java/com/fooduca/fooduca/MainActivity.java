package com.fooduca.fooduca;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.fooduca.fooduca.Adapter.RecyclerViewComida;
import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.Fragmentos.MasRicosFragment;
import com.fooduca.fooduca.Fragmentos.PeaFragment;
import com.fooduca.fooduca.Fragmentos.ProceresFragment;
import com.fooduca.fooduca.Fragmentos.RecomendacionFragment;
import com.fooduca.fooduca.Fragmentos.SultanaFragment;
import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.POJO.Restaurante;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        PeaFragment.OnNavigationItemSelectedListener,
        ProceresFragment.OnNavigationItemSelectedListener,
        SultanaFragment.OnNavigationItemSelectedListener,
        RecomendacionFragment.OnNavigationItemSelectedListener,
        MasRicosFragment.OnNavigationItemSelectedListener{

    List<Comida> comidas;
    Fragment fragment = null;


    //ESTO DA EL MENSAJE PARA QUE NO SE SALGA DE UN SOLO DEL NAVIGATION DRAWER
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK) {

            new AlertDialog.Builder(this)
                    .setIcon(R.drawable.bye)
                    .setTitle(" ¿Te vas tan pronto?")
                    .setMessage("Aun tienes muchos platillos por probar")
                    .setNegativeButton("VOLVER", null)// sin listener
                    .setPositiveButton("SALIR", new DialogInterface.OnClickListener() {// un listener que al pulsar, cierre la aplicacion
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                    // Salir
                            MainActivity.this.finish();
                        }
                    })
                    .show();

        // Si el listener devuelve true, significa que el evento esta procesado, y nadie debe hacer nada mas
            return true;
        }
        // para las demas cosas, se reenvia el evento al listener habitual
        return super.onKeyDown(keyCode, event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.pizzahut.com.sv/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Parte del proyecto

        comidas = new ArrayList<>();
        comidas.add(new Comida("","Hamburguesa","$3.00",R.drawable.comida));
        comidas.add(new Comida("","Pizza","$2.00",R.drawable.comida));
        comidas.add(new Comida("","Sandwich","$1.00",R.drawable.comida));
        comidas.add(new Comida("","Sopa","$2.00",R.drawable.comida));
        comidas.add(new Comida("","Taco","$2.00",R.drawable.comida));
        comidas.add(new Comida("","Chili","$3.00",R.drawable.comida));
        comidas.add(new Comida("","Burrito","$4.00",R.drawable.comida));
        comidas.add(new Comida("","Lasagna","$5.00",R.drawable.comida));
        comidas.add(new Comida("","Chimichanga","$1.00",R.drawable.comida));
        comidas.add(new Comida("","Tortilla","$0,25",R.drawable.comida));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        boolean seleccionado = false;

        if (id == R.id.nav_camera) {
            fragment = new RecomendacionFragment();
            seleccionado = true;
        } else if (id == R.id.nav_gallery) {
            fragment = new PeaFragment();
            seleccionado = true;
        } else if (id == R.id.nav_slideshow) {
            fragment = new SultanaFragment();
            seleccionado = true;
        } else if (id == R.id.nav_manage) {
            fragment = new ProceresFragment();
            seleccionado = true;
        } else if (id == R.id.nav_sara) {
            fragment = new MasRicosFragment();
            seleccionado = true;
        } else if (id == R.id.nav_marlene) {

        }else if (id == R.id.nav_jorge) {

        }else if (id == R.id.nav_miguel) {

        }

        if(seleccionado) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contenido,fragment).commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
