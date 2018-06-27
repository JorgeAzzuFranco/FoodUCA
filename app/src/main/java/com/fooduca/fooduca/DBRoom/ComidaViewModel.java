package com.fooduca.fooduca.DBRoom;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.fooduca.fooduca.POJO.Comida;

import java.util.List;

public class ComidaViewModel extends AndroidViewModel {

    private ComidaRepository mComidaRepository;
    private LiveData<List<Comida>> mAllComida;
    private LiveData<Double> cant;

    public ComidaViewModel(@NonNull Application application) {
        super(application);
        mComidaRepository = new ComidaRepository(application);
        mAllComida = mComidaRepository.getmAllComida();
        cant = mComidaRepository.getComidaA();
    }

    LiveData<List<Comida>> getmAllComida(){return mAllComida;}
    public void insert(Comida comida){mComidaRepository.insert(comida);}

}
