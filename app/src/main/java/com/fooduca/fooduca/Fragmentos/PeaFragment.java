package com.fooduca.fooduca.Fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeaFragment extends Fragment {

    View view;
    RecyclerView recycler;
    GridLayoutManager glm;
    List<Restaurante> res;
    RecyclerView.Adapter rvadapter;

    public PeaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pea, container, false);

        recycler = view.findViewById(R.id.Recyclerview_restaurantes_pea);
        recycler.setHasFixedSize(true);
        glm = new GridLayoutManager(getContext().getApplicationContext(), 2);

        res = new ArrayList<>();
        res.add(new Restaurante("Pepper Jack",R.drawable.logo_pepper_jack,"https://www.facebook.com/PepperJk/", null));
        res.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food, "https://www.facebook.com/CRAZY-FOOD-237071819662957/", null));
        res.add(new Restaurante("Delicias Do Brasil",R.drawable.logo_delicias_do_brasil,"https://www.facebook.com/deliciasdobrasil.sv/",null));
        res.add(new Restaurante("La chinita",R.drawable.comida, "https://www.facebook.com/La-Chinita-374421906396594/",null));
        res.add(new Restaurante("Loreto's",R.drawable.logo_loretos,"https://www.facebook.com/LoretosSV/",null));
        res.add(new Restaurante("Jugolandia",R.drawable.comida, "https://www.facebook.com/JUGOLANDIA-123221487688654/", null));
        res.add(new Restaurante("Kissitos",R.drawable.comida,"https://www.facebook.com/kissitos/",null));
        res.add(new Restaurante("La casita",R.drawable.comida));
        recycler.setLayoutManager(glm);

        rvadapter = new RecyclerViewRestaurantes(getContext(),res);
        recycler.setAdapter(rvadapter);

        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
