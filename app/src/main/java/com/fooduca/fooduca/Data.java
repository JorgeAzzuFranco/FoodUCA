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
        resPea.add(new Restaurante("Loreto's",R.drawable.logo_loretos,"https://www.facebook.com/LoretosSV/","https://www.instagram.com/loretossv/?hl=es-la",R.drawable.logo_koko_dos,true));
        resPea.add(new Restaurante("Jugolandia",R.drawable.logo_jugolandia, "https://www.facebook.com/JUGOLANDIA-123221487688654/", null,R.drawable.logo_jugolandia_dos,false));
        resPea.add(new Restaurante("The Mixed Brothers",R.drawable.logo_mixed_brothers, "https://www.facebook.com/tmbsv.1/", "https://www.instagram.com/themixedbrotherssv/?hl=es-la",R.drawable.logo_mixed_brothers_dos,false));
        resPea.add(new Restaurante("Pepper Jack",R.drawable.logo_pepper_jack,"https://www.facebook.com/PepperJk/", "https://www.instagram.com/pepperjackoficial/?hl=es-la",R.drawable.logo_pepper_jack_dos,false));
        resPea.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food, "https://www.facebook.com/CRAZY-FOOD-237071819662957/", null,R.drawable.logo_crazy_food_dos, true));
        resPea.add(new Restaurante("El Portalito",R.drawable.logo_portalito,R.drawable.logo_portalito_dos,true));
        resPea.add(new Restaurante("Delicias Do Brasil",R.drawable.logo_delicias_do_brasil,"https://www.facebook.com/deliciasdobrasil.sv/",null,R.drawable.logo_delicias_do_brasil_dos,false));
        resPea.add(new Restaurante("koko",R.drawable.logo_koko,R.drawable.logo_koko_dos,true));
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
        comidas.add(new Comida("Loreto's", "Tacos (res,pastor o pollo)", "$2.75", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hamburguesa de res", "$3.00", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Burrito (res, pastor o pollo)", "$3.00", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hamburguesa Pulled Pork", "$3.50", R.drawable.comida));
        comidas.add(new Comida("Loreto's", "Hot Dog", "$2.25", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Waffles", "Desde $1.50", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Wraps + lays", "$2.50", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza personal 1 Ingrediente", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pan con ajo", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Palitroques", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Lasaña", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pechuguitas de pollo empanizadas + papas o ensalada", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Tacos tostados", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Carne a la plancha", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Baleada + papas fritas", "$3.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza super personal 2 Ingredientes ", "$4.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza calzone 3 Ingredientes", "$4.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza mediana 8 porciones 3 Ingredientes", "$6.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza grande 10 porciones de 3 Ingredientes", "$8.00", R.drawable.comida));
        comidas.add(new Comida("El Portalito", "Pizza gigante 12 porciones de 3 Ingredientes", "$10.00", R.drawable.comida));
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
        comidas.add(new Comida("Pepper Jack", "Burger Jack Res", "$2.99", R.drawable.ppj_burger_jack_res));
        comidas.add(new Comida("Pepper Jack", "Burrito de Res", "$2.99", R.drawable.ppj_burrito_res));
        comidas.add(new Comida("Pepper Jack", "Club Sandwich", "$2.99", R.drawable.ppj_club_sandwich));
        comidas.add(new Comida("Pepper Jack", "Quesadilla", "$2.99", R.drawable.ppj_quesadillas));
        comidas.add(new Comida("Pepper Jack", "Ensalada Primavera", "$2.99", R.drawable.ppj_ensalada));
        comidas.add(new Comida("Pepper Jack", "Wraps", "$2.99", R.drawable.ppj_wrap));
        comidas.add(new Comida("Pepper Jack", "Panini Margarita", "$2.99", R.drawable.ppj_panini_margarita));
        comidas.add(new Comida("Pepper Jack", "Pepito de Res", "$3.45", R.drawable.ppj_pepito_res));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ Hongos", "$3.49", R.drawable.ppj_burger_bbq_hongos));
        comidas.add(new Comida("Pepper Jack", "Panini Full-Ham", "$3.49", R.drawable.ppj_panini_full_ham));
        comidas.add(new Comida("Pepper Jack", "Panini César", "$3.49", R.drawable.ppj_panini_cesar));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ Tocino", "$3.49", R.drawable.ppj_burger_bbq_tocino));
        comidas.add(new Comida("Pepper Jack", "Burger Macho Nacho", "$3.49", R.drawable.ppj_burger_macho_nacho));
        comidas.add(new Comida("Pepper Jack", "Ensalada César", "$3.49", R.drawable.ppj_ensalada));
        comidas.add(new Comida("Pepper Jack", "Doble BurgerJack", "$3.99", R.drawable.ppj_doble_burger_jack));
        comidas.add(new Comida("Pepper Jack", "Burger Magna7", "$3.99", R.drawable.ppj_burger_magna_7));
        comidas.add(new Comida("Pepper Jack", "Burger Jack Lover", "$3.99", R.drawable.ppj_jack_lover));
        comidas.add(new Comida("The Mixed Brothers", "Galletas con chispas de chocolate", "$0.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Brownie Tradicional (con azúcar glass)", "$1.00", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Brownie Red Velvet (con azúcar glass)", "$1.00", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Brownie con topping", "$1.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Flan de caramelo", "$1.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Cheesecake", "$1.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Tres leches", "$1.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Pie de Manzana", "$1.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Waffle", "$2.00", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Pie de Nutella", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini Cheddar Shroomy", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini Clásico Dijon", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini Chimi Chimi Chicken", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini Caprese", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini Tres Quesos", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Pizza personal", "$2.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Tiramisú", "$3.00", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Panini en combo", "$3.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Pizza grandota (10 piezas)", "$12.00", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Sodas", "$0.60", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Jugos", "$0.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Agua", "$0.50", R.drawable.comida));
        comidas.add(new Comida("The Mixed Brothers", "Frozen", "desde $1.75", R.drawable.comida));
        comidas.add(new Comida("koko", "3 Deditos de queso", "$1.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Orden pan con ajo", "$1.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Papas fritas", "$1.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Hot Dog", "$1.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Nachos + soda, jugo o té de lata", "$1.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Hamburguesa", "$1.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Hot Dog + papas fritas", "$2.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Torta de carne", "$2.00", R.drawable.comida));
        comidas.add(new Comida("koko", "3 Alitas + papas fritas", "$2.00", R.drawable.comida));
        comidas.add(new Comida("koko", "5 Nuggets + papas fritas", "$2.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Hamburguesa + papas fritas", "$2.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Panini", "$2.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Panini de jamón + papas fritas", "$3.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Pizza", "$3.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Pizza + pan con ajo", "$3.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Pudding", "$0.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Yogurt", "$0.75", R.drawable.comida));
        comidas.add(new Comida("koko", "Muffin", "$0.80", R.drawable.comida));
        comidas.add(new Comida("koko", "Bolsa con agua", "$0.15", R.drawable.comida));
        comidas.add(new Comida("koko", "Café", "$0.25", R.drawable.comida));
        comidas.add(new Comida("koko", "Café con leche", "$0.35", R.drawable.comida));
        comidas.add(new Comida("koko", "Chocolate instantáneo", "$0.35", R.drawable.comida));
        comidas.add(new Comida("koko", "Soda lata pequeña", "$0.40", R.drawable.comida));
        comidas.add(new Comida("koko", "Kolashampan/Salvacola lata", "$0.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Agua medio litro", "$0.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Jugo del valle", "$0.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Hi Energy", "$0.50", R.drawable.comida));
        comidas.add(new Comida("koko", "Soda lata", "$0.60", R.drawable.comida));
        comidas.add(new Comida("koko", "Te lipton lata", "$0.60", R.drawable.comida));
        comidas.add(new Comida("koko", "Jugo Petit lata", "$0.60", R.drawable.comida));
        comidas.add(new Comida("koko", "Agua litro", "$0.75", R.drawable.comida));
        comidas.add(new Comida("koko", "Te lipton botella", "$1.00", R.drawable.comida));
        comidas.add(new Comida("koko", "Raptor", "$1.15", R.drawable.comida));

        ArrayList<Comida> menu = new ArrayList<>();
        for(int i=0;i<comidas.size();i++){
            if(comidas.get(i).getNombre_restaurante().equals(rest)){
                menu.add(comidas.get(i));
            }
        }
        return menu;
    }
}
