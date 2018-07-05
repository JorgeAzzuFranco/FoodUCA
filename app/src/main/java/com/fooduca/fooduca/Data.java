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
        resPea.add(new Restaurante("Loreto's",R.drawable.logo_loretos,"https://www.facebook.com/LoretosSV/","https://www.instagram.com/loretossv/?hl=es-la"));
        resPea.add(new Restaurante("Jugolandia",R.drawable.comida, "https://www.facebook.com/JUGOLANDIA-123221487688654/", null));
        resPea.add(new Restaurante("The Mixed Brothers",R.drawable.comida, "https://www.facebook.com/tmbsv.1/", "https://www.instagram.com/themixedbrotherssv/?hl=es-la"));
        resPea.add(new Restaurante("Pepper Jack",R.drawable.logo_pepper_jack,"https://www.facebook.com/PepperJk/", "https://www.instagram.com/pepperjackoficial/?hl=es-la"));
        resPea.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food, "https://www.facebook.com/CRAZY-FOOD-237071819662957/", null));
        resPea.add(new Restaurante("El Portalito",R.drawable.comida));
        resPea.add(new Restaurante("Delicias Do Brasil",R.drawable.logo_delicias_do_brasil,"https://www.facebook.com/deliciasdobrasil.sv/",null));
        resPea.add(new Restaurante("La chinita",R.drawable.comida, "https://www.facebook.com/La-Chinita-374421906396594/",null));
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

    public ArrayList<Comida> getComidas(String rest){
        comidas.add(new Comida("Kissitos", "comida Kissitos", "$2.50", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Tacos (res,pastor o pollo)", "$2.75", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hamburguesa de res", "$3.00", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Burrito (res, pastor o pollo)", "$3.00", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hamburguesa Pulled Pork", "$3.50", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hot Dog", "$2.25", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Waffles + te", "Desde $1.50", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Wraps + lays + te", "$2.50", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza personal 1 Ingrediente + te", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pan con ajo", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Palitroques + te", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Lasaña + te", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pechuguitas de pollo empanizadas + papas o ensalada + te", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Tacos tostados", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Carne a la plancha", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Baleada + papas fritas + te", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza super personal 2 Ingredientes + te ", "$4.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza calzone 3 Ingredientes", "$4.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza mediana 8 porciones 3 Ingrediente", "$6.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza grande 10 porciones de 3 Ingrediente", "$8.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza gigante 12 porciones de 3 Ingrediente", "$10.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Licuados", "desde $1.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Frozen", "$1.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Hot Dog", "$1.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Sandwich", "$1.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Papas Fritas", "$1.25", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Pan con ajo (3 piezas)", "$1.50", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Torta Loca", "$2.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Panini", "$2.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Orden de 5 Chorizos + frijoles + tortilla", "$2.00", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Hamburguesa", "desde $2.25", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Sandwich Triple Express", "$2.50", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Alitas de pollo + papas fritas", "$2.50", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Pollo a la plancha + te + chirimol + arroz + ensalada + 2 tortillas", "$2.50", R.drawable.comida));
        comidas.add(new Comida("Jugolandia", "Carne a la plancha + te + chirimol + arroz + ensalada + 2 tortillas", "$2.75", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger Jack Res", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burrito de Res", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Club Sandwich", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Quesadilla", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Ensalada Primavera", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Wraps", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Panini Margarita", "$2.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Pepito de Res", "$3.45", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ Hongos", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Panini Full-Ham", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Panini César", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ Tocino", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger Macho Nacho", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Ensalada César", "$3.49", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Doble BurgerJack", "$3.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger Magna7", "$3.99", R.drawable.comida));
        comidas.add(new Comida("Pepper Jack", "Burger Jack Lover", "$3.99", R.drawable.comida));

        ArrayList<Comida> menu = new ArrayList<>();
        for(int i=0;i<comidas.size();i++){
            if(comidas.get(i).getNombre_restaurante().equals(rest)){
                menu.add(comidas.get(i));
            }
        }
        return menu;
    }
}
