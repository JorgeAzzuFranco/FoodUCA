package com.fooduca.fooduca.DBRoom;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import com.fooduca.fooduca.POJO.Restaurante;

@Dao
public interface RestauranteDAO {

    @Query("SELECT * FROM RESTAURANTE")
    LiveData<Restaurante> getAllRestaurantes();
}
