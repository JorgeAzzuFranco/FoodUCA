package com.fooduca.fooduca;

import android.util.Log;

import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.POJO.Restaurante;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Data {

    ArrayList<Restaurante> resSultana = new ArrayList<>();
    ArrayList<Restaurante> resProceres = new ArrayList<>();
    ArrayList<Restaurante> resPea = new ArrayList<>();
    ArrayList<Comida> comidas = new ArrayList<>();

    public ArrayList<Restaurante> getResPea() {
        //restaurantes Pea
        resPea.add(new Restaurante("Pepper Jack",R.drawable.logo_pepper_jack,"https://www.facebook.com/PepperJk/", null));
        resPea.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food, "https://www.facebook.com/CRAZY-FOOD-237071819662957/", null));
        resPea.add(new Restaurante("Delicias Do Brasil",R.drawable.logo_delicias_do_brasil,"https://www.facebook.com/deliciasdobrasil.sv/",null));
        resPea.add(new Restaurante("La chinita",R.drawable.comida, "https://www.facebook.com/La-Chinita-374421906396594/",null));
        resPea.add(new Restaurante("Loreto's",R.drawable.logo_loretos,"https://www.facebook.com/LoretosSV/",null));
        resPea.add(new Restaurante("Jugolandia",R.drawable.comida, "https://www.facebook.com/JUGOLANDIA-123221487688654/", null));
        resPea.add(new Restaurante("Kissitos",R.drawable.comida,"https://www.facebook.com/kissitos/",null));
        resPea.add(new Restaurante("La casita",R.drawable.comida));
        return resPea;
    }

    public ArrayList<Restaurante> getResSultana() {
        resSultana.add(new Restaurante("Mister Donut",R.drawable.logo_mister_donut,"http://www.misterdonut.com.sv/"));
        resSultana.add(new Restaurante("Wendy's",R.drawable.logo_wendys,"https://www.wendyselsalvador.com/"));

        return resSultana;
    }

    public ArrayList<Restaurante> getResProceres() {
        resProceres.add(new Restaurante("Pizza Hut",R.drawable.logo_pizza_hut,"https://www.pizzahut.com.sv/"));
        resProceres.add(new Restaurante("Los Cebollines",R.drawable.logo_los_cebollines, "http://www.cebollines.com/"));
        resProceres.add(new Restaurante("China Wok",R.drawable.logo_china_wok, "http://www.chinawok.com.sv/"));
        resProceres.add(new Restaurante("Pollo Campero",R.drawable.logo_pollo_campero,"https://www.campero.com/sv"));
        resProceres.add(new Restaurante("Burguer King",R.drawable.logo_burger_king, "https://www.bk.com/international"));
        resProceres.add(new Restaurante("McDonald",R.drawable.logo_mc_donald,"https://www.mcdonalds.com/us/es-us.html"));
        resProceres.add(new Restaurante("Starbucks",R.drawable.logo_starbucks,"https://www.starbucks.com/"));
        resProceres.add(new Restaurante("Wendy's",R.drawable.logo_wendys,"https://www.wendyselsalvador.com/"));
        return resProceres;
    }

    public ArrayList<Comida> getComidas(String rest) {
        comidas.add(new Comida("Kissitos", "comida Kissitos", "2.50", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "comida Loreto's", "2.50", R.drawable.comida));
        comidas.add(new Comida("Crazy Food", "comida Crazy Food", "2.50", R.drawable.comida));

        ArrayList<Comida> menu = new ArrayList<>();
        for(int i=0;i<comidas.size();i++){
            if(comidas.get(i).getNombre_restaurante().equals(rest)){
                menu.add(comidas.get(i));
            }
        }
        return menu;
    }
}
