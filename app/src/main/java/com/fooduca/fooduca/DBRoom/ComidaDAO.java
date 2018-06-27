package com.fooduca.fooduca.DBRoom;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.view.ViewDebug;

import com.fooduca.fooduca.POJO.Comida;

import java.util.List;

@Dao
public interface ComidaDAO {

    @Query("SELECT * FROM COMIDA")
    LiveData<List<Comida>> getAllComida();

    @Insert
    void insert(Comida comida);

    @Query("DELETE FROM COMIDA")
    void deleteAll();

    @Query("SELECT count(*) FROM COMIDA")
    LiveData<Double> getCantComida();
}
