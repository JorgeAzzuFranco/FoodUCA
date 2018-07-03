package com.fooduca.fooduca.DBRoom;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;

//@Database(entities= {Comida.class, Restaurante.class}, version = 1)
public abstract class ComidaRoomDatabase extends RoomDatabase{

//    public abstract ComidaDAO comidaDAO();
//
//    private static ComidaRoomDatabase INSTANCE;
//
//    static ComidaRoomDatabase getDatabase(final Context context){
//        synchronized (ComidaRoomDatabase.class) {
//            if (INSTANCE == null){
//
//                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
//                        ComidaRoomDatabase.class, "comida_database")
//                        .addCallback(callback).build();
//            }
//        }
//
//        return INSTANCE;
//    }
//
//    private static RoomDatabase.Callback callback = new RoomDatabase.Callback(){
//        @Override
//        public void onOpen(@NonNull SupportSQLiteDatabase db){
//            super.onOpen(db);
//            new poblarDB(INSTANCE).execute();
//        }
//    };
//
//    private static class poblarDB extends AsyncTask<Void, Void, Void>{
//
//        private ComidaDAO comidaDAO;
//
//        public poblarDB(ComidaRoomDatabase db) {
//            comidaDAO = db.comidaDAO();
//        }
//
//        @Override
//        protected Void doInBackground(Void... voids) {
//            Comida com;
//
//            com = new Comida("Kissitos", "comida 1", "2.50", R.drawable.comida);
//            comidaDAO.insert(com);
//            com = new Comida("Loretos", "comida 2", "2.50", R.drawable.comida);
//            comidaDAO.insert(com);
//            com = new Comida("Crazy Food", "comida 3", "2.50", R.drawable.comida);
//            comidaDAO.insert(com);
//            return null;
//        }
//    }
}