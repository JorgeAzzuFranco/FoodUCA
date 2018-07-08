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
import android.view.Gravity;
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
import android.widget.ImageView;
import android.widget.Toast;

import com.fooduca.fooduca.Adapter.RecyclerViewComida;
import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.Fragmentos.AboutFragment;
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
        AboutFragment.OnNavigationItemSelectedListener,
        MasRicosFragment.OnNavigationItemSelectedListener{

    List<Comida> comidas;
    Fragment fragment = null;
    ImageView holi;


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

        ImageView img;

        img = findViewById(R.id.holi);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast= Toast.makeText(getApplicationContext(), "^ Pulsa aquí para conocer más", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.CENTER_HORIZONTAL, 0, 85);
                toast.show();
                //Toast.makeText(getApplicationContext(), "^ Pulsa aquí para conocer mas",Toast.LENGTH_SHORT).setGravity(Gravity.TOP| Gravity.RIGHT, 50, 50);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        holi = findViewById(R.id.holi);
        int img = 0;
        boolean seleccionado = false;

        if (id == R.id.nav_camera) {
            fragment = new RecomendacionFragment();
            if (img == 0){
                holi.setImageResource(R.drawable.holi);
                img = 1;
            }
            seleccionado = true;
        } else if (id == R.id.nav_gallery) {
            fragment = new PeaFragment();
            if (img == 0){
                holi.setImageResource(R.drawable.holi);
                img = 1;
            }
            seleccionado = true;
        } else if (id == R.id.nav_slideshow) {
            fragment = new SultanaFragment();
            if (img == 0){
                holi.setImageResource(R.drawable.holi);
                img = 1;
            }
            seleccionado = true;
        } else if (id == R.id.nav_manage) {
            fragment = new ProceresFragment();
            if (img == 0){
                holi.setImageResource(R.drawable.holi);
                img = 1;
            }
            seleccionado = true;
        } else if (id == R.id.nav_sara) {
            fragment = new MasRicosFragment();
            if (img == 0){
                holi.setImageResource(R.drawable.holi);
                img = 1;
            }
            seleccionado = true;
        } else if (id == R.id.nav_marlene) {
            fragment = new AboutFragment();
            seleccionado = true;
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
