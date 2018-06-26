package com.fooduca.fooduca.POJO;

public class Comida {
    private String nombre;
    private String precio;
    private int ComidaImg;

    public Comida(String nombre, String precio,int ComidaImg) {
        this.nombre = nombre;
        this.precio = precio;
        this.ComidaImg = ComidaImg;

    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String descripcion) {
        this.precio = descripcion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String title) {
        this.nombre = title;
    }

    public int getComidaImg() {
        return ComidaImg;
    }

    public void setComidaImg(int ComidaImg) {
        ComidaImg = ComidaImg;
    }
}
