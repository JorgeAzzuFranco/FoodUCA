package com.fooduca.fooduca.Fragmentos;


import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.Data;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProceresFragment extends Fragment {


    public ProceresFragment() {
        // Required empty public constructor
    }
    ImageView imgview;
    View view;
    RecyclerView recycler;
    GridLayoutManager glm;
    RecyclerView.Adapter rvadapter;
    Data datos = new Data();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_proceres, container, false);

        recycler = view.findViewById(R.id.Recyclerview_restaurantes_proceres);
        recycler.setHasFixedSize(true);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            glm = new GridLayoutManager(getContext().getApplicationContext(), 2);
        }
        else{
            glm = new GridLayoutManager(getContext().getApplicationContext(), 4);
        }

        recycler.setLayoutManager(glm);

        rvadapter = new RecyclerViewRestaurantes(getContext(),datos.getResProceres());
        recycler.setAdapter(rvadapter);

        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
