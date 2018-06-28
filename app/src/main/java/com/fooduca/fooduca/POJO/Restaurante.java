package com.fooduca.fooduca.POJO;

//import android.arch.persistence.room.ColumnInfo;
//import android.arch.persistence.room.Entity;

//@Entity(tableName = "RESTAURANTE")
public class Restaurante {

    //@ColumnInfo(name = "nomRestaurante")
    private String nombre_restaurante;
    //@ColumnInfo(name = "restauranteImg")
    private int RestauranteImg;
    private String web;

    public Restaurante(String nombre_restaurante, int RestauranteImg) {
        this.nombre_restaurante = nombre_restaurante;
        this.RestauranteImg = RestauranteImg;
    }

    public Restaurante(String nombre_restaurante, int restauranteImg, String web) {
        this.nombre_restaurante = nombre_restaurante;
        RestauranteImg = restauranteImg;
        this.web = web;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public void setNombre_restaurante(String nombre_restaurante) {

        this.nombre_restaurante = nombre_restaurante;
    }

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
}

