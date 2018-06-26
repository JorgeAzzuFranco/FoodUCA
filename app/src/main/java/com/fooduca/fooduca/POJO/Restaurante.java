package com.fooduca.fooduca.POJO;

public class Restaurante {
    private String nombre_restaurante;
    private int RestauranteImg;

    public Restaurante(String nombre_restaurante, int RestauranteImg) {
        this.nombre_restaurante = nombre_restaurante;
        this.RestauranteImg = RestauranteImg;

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
}

