package com.fooduca.fooduca.POJO;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "RESTAURANTE")
public class Restaurante {

    @PrimaryKey(autoGenerate = true)
    private int idRes;
    @ColumnInfo(name = "nomRestaurante")
    private String nombre_restaurante;
    @ColumnInfo(name = "restauranteImg")
    private int RestauranteImg;

    public Restaurante(String nombre_restaurante, int RestauranteImg) {
        this.nombre_restaurante = nombre_restaurante;
        this.RestauranteImg = RestauranteImg;

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

