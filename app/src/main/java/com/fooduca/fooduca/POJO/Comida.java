package com.fooduca.fooduca.POJO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

//@Entity(tableName = "COMIDA")
public class Comida {

//    @PrimaryKey(autoGenerate = true)
    private int idCom;
//    @ColumnInfo(name = "nomRes")
    private String nombre_restaurante;
//    @ColumnInfo(name = "nombre")
    private String nombre_comida;
//    @ColumnInfo(name = "precio")
    private double precio;
//    @ColumnInfo(name = "comidaImg")
    private int ComidaImg;

    public Comida(String nombre_restaurante, String nombre_comida, double precio,int ComidaImg) {
        this.nombre_restaurante = nombre_restaurante;
        this.nombre_comida = nombre_comida;
        this.precio = precio;
        this.ComidaImg = ComidaImg;

    }public Comida(String nombre_restaurante, String nombre_comida,int ComidaImg) {
        this.nombre_restaurante = nombre_restaurante;
        this.nombre_comida = nombre_comida;
        this.ComidaImg = ComidaImg;

    }

    public int getIdCom() {
        return idCom;
    }

    public void setIdCom(int idCom) {
        this.idCom = idCom;
    }

    public void setNombre_restaurante(String nombre_restaurante) {
        this.nombre_restaurante = nombre_restaurante;
    }

    public String getNombre_restaurante() {
        return nombre_restaurante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_comida() {
        return nombre_comida;
    }

    public void setNombre_comida(String nombre_comida) {
        this.nombre_comida = nombre_comida;
    }

    public int getComidaImg() {
        return ComidaImg;
    }

    public void setComidaImg(int ComidaImg) {
        ComidaImg = ComidaImg;
    }
}
