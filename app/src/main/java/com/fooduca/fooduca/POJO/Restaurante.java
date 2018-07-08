package com.fooduca.fooduca.POJO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//@Entity(tableName = "RESTAURANTE")
public class Restaurante {

//    @PrimaryKey(autoGenerate = true)
    private int idRes;
//    @ColumnInfo(name = "nomRestaurante")
    private String nombre_restaurante;
//    @ColumnInfo(name = "restauranteImg")
    private int RestauranteImg;

    public int getRestauranteBanner() {
        return RestauranteBanner;
    }

    public void setRestauranteBanner(int restauranteBanner) {
        RestauranteBanner = restauranteBanner;
    }

    private int RestauranteBanner;
    private boolean te;
//    @ColumnInfo(name = "web")
    private String web;
    private String fb;
    private String fbid;
    private String ig;
    //Antiguo para Pea
    public Restaurante(String nombre_restaurante, int RestauranteImg, int restauranteBanner, boolean tea) {
        this.nombre_restaurante = nombre_restaurante;
        this.RestauranteBanner=restauranteBanner;
        this.RestauranteImg = RestauranteImg;
        this.te = tea;
    }
    //Nuevo para Pea (con fb e ig)
    public Restaurante(String nombre_restaurante, int restauranteImg, String fb, String ig, int restauranteBanner, boolean tea) {
        this.idRes = idRes;
        this.te = tea;
        this.nombre_restaurante = nombre_restaurante;
        RestauranteImg = restauranteImg;
        this.RestauranteBanner = restauranteBanner;
        this.fb = fb;
        this.ig = ig;
    }
    //Nuevo Nuevo xd con fbid, fb, ig
    public Restaurante(String nombre_restaurante, int restauranteImg, String fbid, String fb, String ig, int restauranteBanner, boolean tea) {
        this.idRes = idRes;
        this.te = tea;
        this.nombre_restaurante = nombre_restaurante;
        RestauranteImg = restauranteImg;
        this.RestauranteBanner = restauranteBanner;
        this.fbid = fbid;
        this.fb = fb;
        this.ig = ig;
    }

    //Para Sultana y Proceres (con pag web)
    public Restaurante(String nombre_restaurante, int restauranteImg, String web) {
        this.nombre_restaurante = nombre_restaurante;
        RestauranteImg = restauranteImg;
        this.web = web;
    }

    public boolean isTe() {
        return te;
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) { this.nombre_restaurante = nombre_restaurante; }

    public int getRestauranteImg() {
        return RestauranteImg;
    }

    public void setRestauranteImg(int RestauranteImg) {
        RestauranteImg = RestauranteImg;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getFb() { return fb; }

    public void setFb(String fb) { this.fb = fb; }

    public String getIg() { return ig; }

    public void setIg(String ig) { this.ig = ig; }

    public String getFbid() {
        return fbid;
    }

    public void setFbid(String fbid) {
        this.fbid = fbid;
    }
}

