package com.fooduca.fooduca.DBRoom;

import android.app.Application;
import android.arch.lifecycle.CompositeGeneratedAdaptersObserver;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.fooduca.fooduca.POJO.Comida;

import java.util.List;

public class ComidaRepository {

//    private ComidaDAO comidaDAO;
//    private LiveData<List<Comida>> mAllComida;
//    private LiveData<Double> cant;
//
//    ComidaRepository(Application application) {
//        ComidaRoomDatabase db = ComidaRoomDatabase.getDatabase(application);
//        comidaDAO = db.comidaDAO();
//        mAllComida = comidaDAO.getAllComida();
//        cant = comidaDAO.getCantComida();
//    }
//
//    LiveData<List<Comida>> getmAllComida(){
//        return mAllComida;
//    }
//
//    LiveData<Double> getComidaA() {return cant;}
//
//    public void insert(Comida comida) {
//        new insertAsyncTask(comidaDAO).execute(comida);
//    }
//
//    private class insertAsyncTask extends AsyncTask<Comida, Void, Void> {
//
//        private ComidaDAO mAsyncTaskDao;
//
//        public insertAsyncTask(ComidaDAO comidaDAO) {
//            mAsyncTaskDao = comidaDAO;
//        }
//
//        @Override
//        protected Void doInBackground(Comida... comidas) {
//            mAsyncTaskDao.insert(comidas[0]);
//            return null;
//        }
//    }
}
