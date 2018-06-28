package com.fooduca.fooduca.DBRoom;

import android.arch.lifecycle.LiveData;
//import android.arch.persistence.room.Dao;
//import android.arch.persistence.room.Query;

import com.fooduca.fooduca.POJO.Comida;

//@Dao
public interface ComidaDAO {

    //@Query("SELECT * FROM COMIDA")
    LiveData<Comida> getAllComida();
}
