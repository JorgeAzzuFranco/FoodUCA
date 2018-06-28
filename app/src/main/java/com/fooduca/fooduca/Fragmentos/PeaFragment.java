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

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeaFragment extends Fragment {

    View view;
    RecyclerView recycler;
    GridLayoutManager glm;
    RecyclerViewRestaurantes adapter;
    List<Restaurante> rest;
    public PeaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_pea, container, false);
        recycler = view.findViewById(R.id.myrv);
        recycler.setHasFixedSize(true);
        glm = new GridLayoutManager(getContext().getApplicationContext(), 2);
        recycler.setLayoutManager(glm);
        adapter = new RecyclerViewRestaurantes(getContext(), rest);
        recycler.setAdapter(adapter);
        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
