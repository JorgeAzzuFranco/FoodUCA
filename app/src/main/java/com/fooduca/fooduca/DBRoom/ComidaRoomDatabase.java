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

@Database(entities= {Comida.class, Restaurante.class}, version = 1)
public abstract class ComidaRoomDatabase extends RoomDatabase{

    public abstract ComidaDAO comidaDAO();
    public abstract RestauranteDAO restauranteDAO();

    private static ComidaRoomDatabase INSTANCE = null;

    static ComidaRoomDatabase getDatabase(final Context context) {

        if (INSTANCE == null){
            synchronized (ComidaRoomDatabase.class){
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ComidaRoomDatabase.class, "comida_database")
                            .addCallback(sComidaDBCallback)
                            .build();
                }
            }
        }

        return INSTANCE;
    }

    private static RoomDatabase.Callback sComidaDBCallback = new RoomDatabase.Callback() {

        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            new PopulateDbAsync(INSTANCE).execute();
        }
    };

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final ComidaDAO cDao;

        PopulateDbAsync(ComidaRoomDatabase db) {
            cDao = db.comidaDAO();
        }

        @Override
        protected Void doInBackground(final Void... params) {
            cDao.deleteAll();
            Comida comida = new Comida("Aguacate Frito", "1.50", R.drawable.comida);
            cDao.insert(comida);
            return null;
        }
    }

}
