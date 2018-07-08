package com.fooduca.fooduca;

import android.util.Log;

import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.POJO.Restaurante;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data {

    ArrayList<Restaurante> resSultana = new ArrayList<>();
    ArrayList<Restaurante> resProceres = new ArrayList<>();
    ArrayList<Restaurante> resPea = new ArrayList<>();
    ArrayList<Comida> comidas;

    public Data() {
        comidas = new ArrayList<>();
        comidas.add(new Comida("Loreto's", "Tacos de res,\npastor o pollo", 2.75, R.drawable.lore_tacos));
        comidas.add(new Comida("Loreto's", "Hamburguesa\n      de res", 3.00, R.drawable.lore_hamburguesa));
        comidas.add(new Comida("Loreto's", "Burrito de res,\npastor o pollo", 3.00, R.drawable.lore_burrito));
        comidas.add(new Comida("Loreto's", "Hamburguesa\n   Pulled Pork", 3.50, R.drawable.lore_pulled_pork));
        comidas.add(new Comida("Loreto's", "Hot Dog", 2.25, R.drawable.lore_hot_dog));
        comidas.add(new Comida("Loreto's", "Torta", 3.00, R.drawable.lore_torta));
        //desde
        comidas.add(new Comida("El Portalito", "Waffles",1.50, R.drawable.ep_waffles));
        comidas.add(new Comida("El Portalito", "Wraps + lays", 2.50, R.drawable.ep_wrapp));
        comidas.add(new Comida("El Portalito", "Pizza personal 1 Ingrediente", 3.00, R.drawable.tmb_pizza_personal));
        comidas.add(new Comida("El Portalito", "Pan con ajo", 3.00, R.drawable.jl_pan_con_ajo));
        comidas.add(new Comida("El Portalito", "Palitroques", 3.00, R.drawable.ep_palitroques));
        comidas.add(new Comida("El Portalito", "Lasaña", 3.00, R.drawable.ep_lasagna));
        comidas.add(new Comida("El Portalito", "Pechuguitas de pollo empanizadas + papas o ensalada", 3.00, R.drawable.ep_pechugas_pollo));
        comidas.add(new Comida("El Portalito", "Tacos tostados", 3.00, R.drawable.ep_tacos_tostados));
        comidas.add(new Comida("El Portalito", "Carne a la plancha", 3.00, R.drawable.jl_carne_plancha));
        comidas.add(new Comida("El Portalito", "Baleada + papas fritas", 3.00, R.drawable.ep_baleada));
        comidas.add(new Comida("El Portalito", "Pizza super personal 2 Ingredientes ", 4.00, R.drawable.tmb_pizza_personal));
        comidas.add(new Comida("El Portalito", "Pizza calzone 3 Ingredientes", 4.00, R.drawable.ep_pizza_calzone));
        comidas.add(new Comida("El Portalito", "Pizza mediana 8 porciones 3 Ingredientes", 6.00, R.drawable.ep_pizza_mediana));
        comidas.add(new Comida("El Portalito", "Pizza grande 10 porciones de 3 Ingredientes", 8.00, R.drawable.ep_pizza_grande));
        comidas.add(new Comida("El Portalito", "Pizza gigante 12 porciones de 3 Ingredientes", 10.00, R.drawable.ep_pizza_gigante));
        //desde es el licuado osea el de abajo
        comidas.add(new Comida("Jugolandia", "Licuados", 1.00, R.drawable.jl_licuado));
        comidas.add(new Comida("Jugolandia", "Frozen", 1.00, R.drawable.jl_frozen));
        comidas.add(new Comida("Jugolandia", "Hot Dog", 1.00, R.drawable.jl_hot_dog));
        comidas.add(new Comida("Jugolandia", "Sandwich", 1.00, R.drawable.jl_sandwich));
        comidas.add(new Comida("Jugolandia", "Papas Fritas", 1.25, R.drawable.jl_papas));
        comidas.add(new Comida("Jugolandia", "Hamburguesa", 2.25, R.drawable.jl_hamburguesa));
        comidas.add(new Comida("Jugolandia", "Torta Loca", 2.00, R.drawable.jl_torta));
        comidas.add(new Comida("Jugolandia", "Panini", 2.00, R.drawable.jl_panini));
        comidas.add(new Comida("Jugolandia", "Orden de 5\n Chorizos +\n frijoles + tortilla", 2.00, R.drawable.jl_chorizo));
        comidas.add(new Comida("Jugolandia", "Orden de\n Pan con ajo\n (3 piezas)", 1.50, R.drawable.jl_pan_con_ajo));
        comidas.add(new Comida("Jugolandia", "Sandwich Triple Express", 2.50, R.drawable.jl_sandwich_triple));
        comidas.add(new Comida("Jugolandia", "Alitas de pollo + papas fritas", 2.50, R.drawable.jl_alitas_de_pollo));
        comidas.add(new Comida("Jugolandia", "Pollo a la plancha + te + chirimol + arroz + ensalada + 2 tortillas", 2.50, R.drawable.jl_pechuga_pollo));
        comidas.add(new Comida("Jugolandia", "Carne a la plancha + te + chirimol + arroz + ensalada + 2 tortillas", 2.75, R.drawable.jl_carne_plancha));
        //desde
        comidas.add(new Comida("Pepper Jack", "Wraps", 2.99, R.drawable.ppj_wrap));
        comidas.add(new Comida("Pepper Jack", "Burrito de Res", 2.99, R.drawable.ppj_burrito_res));
        comidas.add(new Comida("Pepper Jack", "Club Sandwich", 2.99, R.drawable.ppj_club_sandwich));
        comidas.add(new Comida("Pepper Jack", "Quesadilla", 2.99, R.drawable.ppj_quesadillas));
        comidas.add(new Comida("Pepper Jack", "Ensalada\nPrimavera", 2.99, R.drawable.ppj_ensalada));
        comidas.add(new Comida("Pepper Jack", "Burger Jack Res", 2.99, R.drawable.ppj_burger_jack_res));
        comidas.add(new Comida("Pepper Jack", "Panini Full-Ham", 3.49, R.drawable.ppj_panini_full_ham));
        comidas.add(new Comida("Pepper Jack", "Pepito de Res", 3.45, R.drawable.ppj_pepito_res));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ\n   Hongos", 3.49, R.drawable.ppj_burger_bbq));
        comidas.add(new Comida("Pepper Jack", "Panini Margarita", 2.99, R.drawable.ppj_panini_margarita));
        comidas.add(new Comida("Pepper Jack", "Panini César", 3.49, R.drawable.ppj_panini_cesar));
        comidas.add(new Comida("Pepper Jack", "Ensalada César", 3.49, R.drawable.ppj_ensalada));
        comidas.add(new Comida("Pepper Jack", "Burger BBQ Tocino", 3.49, R.drawable.ppj_burger_bbq));
        comidas.add(new Comida("Pepper Jack", "Burger Macho\n       Nacho", 3.49, R.drawable.ppj_burger_macho_nacho));
        comidas.add(new Comida("Pepper Jack", "Doble Burger Jack", 3.99, R.drawable.ppj_doble_burger_jack));
        comidas.add(new Comida("Pepper Jack", "Burger Jack Lover", 3.99, R.drawable.ppj_jack_lover));
        comidas.add(new Comida("Pepper Jack", "Burger Magna7", 3.99, R.drawable.ppj_burger_magna_7));
        //desde
        comidas.add(new Comida("The Mixed\n Brothers", "Brownie con\ntopping", 1.50, R.drawable.tmb_brownie_topping));
        comidas.add(new Comida("The Mixed\n Brothers", "Flan de caramelo", 1.50, R.drawable.tmb_flan));
        comidas.add(new Comida("The Mixed\n Brothers", "Brownie\nTradicional\n(con azúcar glass)", 1.00, R.drawable.tmb_brownie));
        comidas.add(new Comida("The Mixed\n Brothers", "Brownie\nRed Velvet\n(con azúcar glass)", 1.00, R.drawable.tmb_brownie_red));
        comidas.add(new Comida("The Mixed\n Brothers", "Pizza grandota\n(10 piezas)", 12.00, R.drawable.tmb_pizza));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini en combo", 3.50, R.drawable.tmb_panini_combo));
        comidas.add(new Comida("The Mixed\n Brothers", "Cheesecake", 1.50, R.drawable.tmb_cheesecake));
        comidas.add(new Comida("The Mixed\n Brothers", "Tres leches", 1.50, R.drawable.tmb_tres_leches));
        comidas.add(new Comida("The Mixed\n Brothers", "Pie de Manzana", 1.50, R.drawable.tmb_pie_manzana));
        comidas.add(new Comida("The Mixed\n Brothers", "Pie de Nutella", 2.50, R.drawable.tmb_pie_nutella));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini Cheddar\nShroomy", 2.50, R.drawable.tmb_panini_cheddar));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini Clásico\nDijon", 2.50, R.drawable.tmb_panini_clasico_dijon));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini Chimi\nChimi Chicken", 2.50, R.drawable.tmb_panini_chimi));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini Tres\nQuesos", 2.50, R.drawable.tmb_panini_tres_quesos));
        comidas.add(new Comida("The Mixed\n Brothers", "Panini Caprese", 2.50, R.drawable.tmb_panini_caprese));
        comidas.add(new Comida("The Mixed\n Brothers", "Pizza personal", 2.50, R.drawable.tmb_pizza_personal));
        comidas.add(new Comida("The Mixed\n Brothers", "Tiramisú", 3.00, R.drawable.tmb_tiramisu));
        comidas.add(new Comida("The Mixed\n Brothers", "Waffle", 2.00, R.drawable.tmb_waffle));
        comidas.add(new Comida("The Mixed\n Brothers", "Sodas", 0.60, R.drawable.tmb_sodas));
        comidas.add(new Comida("The Mixed\n Brothers", "Jugos", 0.50, R.drawable.tmb_frozzen));
        comidas.add(new Comida("The Mixed\n Brothers", "Agua", 0.50, R.drawable.tmb_agua));
        comidas.add(new Comida("The Mixed\n Brothers", "Frozen", 1.75, R.drawable.jl_frozen));
        comidas.add(new Comida("The Mixed\n Brothers", "Galletas con chispas de chocolate", 0.50, R.drawable.tmb_cockies));
        //desde
        comidas.add(new Comida("koko", "3 Deditos de queso", 1.00, R.drawable.kk_dedos_queso));
        comidas.add(new Comida("koko", "Orden pan con ajo", 1.00, R.drawable.jl_pan_con_ajo));
        comidas.add(new Comida("koko", "Papas fritas", 1.00, R.drawable.jl_papas));
        comidas.add(new Comida("koko", "Hot Dog", 1.00, R.drawable.jl_hot_dog));
        comidas.add(new Comida("koko", "Nachos + soda, jugo o té de lata", 1.50, R.drawable.kk_nachos));
        comidas.add(new Comida("koko", "Hamburguesa", 1.50, R.drawable.jl_hamburguesa));
        comidas.add(new Comida("koko", "Hot Dog + papas fritas", 2.00, R.drawable.jl_hot_dog));
        comidas.add(new Comida("koko", "Torta de carne", 2.00, R.drawable.jl_torta));
        comidas.add(new Comida("koko", "3 Alitas + papas fritas", 2.00, R.drawable.jl_alitas_de_pollo));
        comidas.add(new Comida("koko", "5 Nuggets + papas fritas", 2.00, R.drawable.kk_nuggets));
        comidas.add(new Comida("koko", "Hamburguesa + papas fritas", 2.50, R.drawable.jl_hamburguesa));
        comidas.add(new Comida("koko", "Panini", 2.50, R.drawable.jl_panini));
        comidas.add(new Comida("koko", "Panini de jamón + papas fritas", 3.00, R.drawable.jl_panini));
        comidas.add(new Comida("koko", "Pizza", 3.00, R.drawable.tmb_pizza_personal));
        comidas.add(new Comida("koko", "Pizza + pan con ajo", 3.50, R.drawable.tmb_pizza_personal));
        comidas.add(new Comida("koko", "Pudding", 0.50, R.drawable.kk_pudding));
        comidas.add(new Comida("koko", "Yogurt", 0.75, R.drawable.kk_yogurt));
        comidas.add(new Comida("koko", "Muffin", 0.80, R.drawable.kk_muffing));
        comidas.add(new Comida("koko", "Café", 0.25, R.drawable.kk_cafe));
        comidas.add(new Comida("koko", "Café con leche", 0.35, R.drawable.kk_cafe_leche));
        comidas.add(new Comida("koko", "Chocolate instantáneo", 0.35, R.drawable.kk_chocolate));
        comidas.add(new Comida("koko", "Soda lata pequeña", 0.40, R.drawable.tmb_sodas));
        comidas.add(new Comida("koko", "Kolashampan/Salvacola lata", 0.50, R.drawable.kk_salvacola));
        comidas.add(new Comida("koko", "Agua medio litro", 0.50, R.drawable.tmb_agua));
        comidas.add(new Comida("koko", "Jugo del valle", 0.50, R.drawable.kk_delvalle));
        comidas.add(new Comida("koko", "Soda lata", 0.60, R.drawable.tmb_sodas));
        comidas.add(new Comida("koko", "Te lipton lata", 0.60, R.drawable.kk_te_botella));
        comidas.add(new Comida("koko", "Jugo Petit lata", 0.60, R.drawable.kk_petit));
        comidas.add(new Comida("koko", "Agua litro", 0.75, R.drawable.tmb_agua));
        comidas.add(new Comida("koko", "Te lipton botella", 1.00, R.drawable.kk_te_botella));
        comidas.add(new Comida("koko", "Raptor", 1.15, R.drawable.kk_raptor));
        //kissitos no desaparezcas
        comidas.add(new Comida("Kissitos", "Pupusa revuelta o frijol con queso", 0.55, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Pupusa de queso", 0.60, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "3 pupusas pequeñas", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Panini desayuno", 1.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Burrito mañanero", 1.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana guanaca", 1.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Típico express", 1.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "3 pupusas medianas + bebida", 2.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Desayuno\ntípico", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Pancakes", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Meltys 1 ingrediente", 2.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Croissant pequeño", 2.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Meltys con huevo", 3.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana 1 ingrediente", 3.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Espartano pequeño", 3.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Filete a la plancha", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Atenas", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Tacos", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "4 Mozarella Sticks", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Croissant con Omelette", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Mexicana", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Búfalo", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Italiana", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana 3 Quesos", 3.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Suprema", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Chipotle", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Meat lovers", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Alfredo", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Troyana Californiana", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Burrito pollo/res", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "7 chunks", 3.50, R.drawable.ep_pechugas_pollo));
        comidas.add(new Comida("Kissitos", "Stick sampler", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Hamburguesa", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Lasagna", 3.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Hulk", 3.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Ensalada", 3.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Papitas francesas tradicionales", 2.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Papitas francesas especialidades", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Papitas francesas tradicionales (media orden)", 1.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Papitas francesas especialidades (media orden)", 1.75, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Nachos con chili", 3.00, R.drawable.kk_nachos));
        comidas.add(new Comida("Kissitos", "Nachos con chili (media orden)", 1.75, R.drawable.kk_nachos));
        comidas.add(new Comida("Kissitos", "Flan de caramelo", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Gelatina especial", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Tres leches caramelo o nutella", 1.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Tiramisu", 1.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Carrot cake", 1.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Brownie", 0.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Brownie preparado", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Brownie especial (M&M, caramelo, chocolate)", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Brownie a la moda", 1.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Berrylicious", 2.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa nutella + fresas + banano + brownie", 2.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa dulce de leche + fresas + banano + brownie", 2.25, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa pollo", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa hongos", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa jamon", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa tocino", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Crepa tres quesos", 2.50, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Pie kissitos nutella + fresas + banano + brownie", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Pie kissitos dulce de leche + fresas + banano + brownie", 1.00, R.drawable.comida));
        comidas.add(new Comida("Kissitos", "Pie de jamon, hongos o tocino", 1.00, R.drawable.comida));

        comidas.add(new Comida("Crazy Food", "Crazy wrap + papas o nachos", 2.75, R.drawable.cf_wrap));
        comidas.add(new Comida("Crazy Food", "Crazy torta + papas o nachos", 2.75, R.drawable.jl_torta));
        comidas.add(new Comida("Crazy Food", "Crazy pechus + papas o nachos", 2.75, R.drawable.cf_pechus));
        comidas.add(new Comida("Crazy Food", "Fritito + papas o nachos", 1.50, R.drawable.cf_frititos));
        comidas.add(new Comida("Crazy Food", "Cheese meat + papas o nachos", 3.00, R.drawable.cf_cheesemeat));
        comidas.add(new Comida("Crazy Food", "Mini cheese meat + papas o nachos", 2.00, R.drawable.cf_cheesemeat));
        comidas.add(new Comida("Crazy Food", "Que bonito + papas + nachos", 6.00, R.drawable.cf_que_bonito));
        comidas.add(new Comida("Crazy Food", "Papas señoritas Jr", 1.50, R.drawable.cf_papas));
        comidas.add(new Comida("Crazy Food", "Crazy combinado + papas o nachos", 3.50, R.drawable.ep_pechugas_pollo));
        comidas.add(new Comida("Delicias Do Brasil", "Dedito de Queso", 1.00, R.drawable.ddb_dedito_queso));
        comidas.add(new Comida("Delicias Do Brasil", "Sandwich",R.drawable.ddb_sandwich));
        comidas.add(new Comida("Delicias Do Brasil", "Empanizado de salchicha",R.drawable.ddb_dedito_queso));
        comidas.add(new Comida("Delicias Do Brasil", "Coxinha",R.drawable.ddb_coxinha));
        this.comidas = comidas;
    }

    public ArrayList<Restaurante> getResPea() {
        //restaurantes Pea
        resPea.add(new Restaurante("Loreto's",R.drawable.logo_loretos,"fb://page/718985018241746","https://www.facebook.com/LoretosSV/","https://www.instagram.com/loretossv/?hl=es-la",R.drawable.logo_loretos_dos,true));
        resPea.add(new Restaurante("Jugolandia",R.drawable.logo_jugolandia,"fb://page/123221487688654", "https://www.facebook.com/JUGOLANDIA-123221487688654/", null,R.drawable.logo_jugolandia_dos,false));
        resPea.add(new Restaurante("The Mixed\n Brothers",R.drawable.logo_mixed_brothers,"fb://page/697386557043193", "https://www.facebook.com/tmbsv.1/", "https://www.instagram.com/themixedbrotherssv/?hl=es-la",R.drawable.logo_mixed_brothers_dos,false));
        resPea.add(new Restaurante("Pepper Jack",R.drawable.logo_pepper_jack,"fb://page/1551954871721238","https://www.facebook.com/PepperJk/", "https://www.instagram.com/pepperjackoficial/?hl=es-la",R.drawable.logo_pepper_jack_dos,false));
        resPea.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food,"fb://page/237071819662957", "https://www.facebook.com/CRAZY-FOOD-237071819662957/", null,R.drawable.logo_crazy_food_dos, true));
        resPea.add(new Restaurante("El Portalito",R.drawable.logo_portalito,R.drawable.logo_portalito_dos,true));
        resPea.add(new Restaurante("Delicias Do Brasil",R.drawable.logo_delicias_do_brasil,"fb://page/247675158608761","https://www.facebook.com/deliciasdobrasil.sv/",null,R.drawable.logo_delicias_do_brasil_dos,false));
        resPea.add(new Restaurante("koko",R.drawable.logo_koko,R.drawable.logo_koko_dos,true));
        resPea.add(new Restaurante("Kissitos",R.drawable.logo_kissitos,"fb://page/348256351921709","https://www.facebook.com/kissitos/","https://www.instagram.com/loretossv/?hl=es-la",R.drawable.logo_kissitos_dos,true));
        resPea.add(new Restaurante("Pronto...",R.drawable.log,R.drawable.holi,false));
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

        ArrayList<Comida> menu = new ArrayList<>();
        for(int i=0;i<comidas.size();i++){
            if(comidas.get(i).getNombre_restaurante().equals(rest)){
                menu.add(comidas.get(i));
            }
        }
        return menu;
    }

    public Comida randomItem(){
        Comida random= comidas.get(new Random().nextInt(comidas.size()));
        return random;
    }

    public ArrayList<Comida> getSearch(double min, double max){
        ArrayList<Comida> search = new ArrayList<>();
        for(int i=0;i<comidas.size();i++){
            if(comidas.get(i).getPrecio() <max && comidas.get(i).getPrecio()>min){
                search.add(comidas.get(i));
            }
        }
        return search;
    }

}
