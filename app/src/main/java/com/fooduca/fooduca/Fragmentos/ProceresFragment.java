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
public class ProceresFragment extends Fragment {

    View view;
    RecyclerView recycler;
    GridLayoutManager glm;
    RecyclerViewRestaurantes adapter;
    List<Restaurante> restaurantes;
    public ProceresFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_proceres, container, false);
        recycler = view.findViewById(R.id.myrv);
        glm = new GridLayoutManager(getContext().getApplicationContext(), 2);
        recycler.setLayoutManager(glm);

        restaurantes = new ArrayList<>();
        restaurantes.add(new Restaurante("Pizza Hut",R.drawable.comida));
        restaurantes.add(new Restaurante("Los Cebollines",R.drawable.comida));
        restaurantes.add(new Restaurante("China Wok",R.drawable.comida));
        restaurantes.add(new Restaurante("Pollo Campero",R.drawable.comida));
        restaurantes.add(new Restaurante("Burguer King",R.drawable.comida));
        restaurantes.add(new Restaurante("McDonald",R.drawable.comida));
        restaurantes.add(new Restaurante("Starbucks",R.drawable.comida));
        restaurantes.add(new Restaurante("Wendy's",R.drawable.comida));

        adapter = new RecyclerViewRestaurantes(getContext(), restaurantes);
        recycler.setAdapter(adapter);
        recycler.setHasFixedSize(true);
        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
