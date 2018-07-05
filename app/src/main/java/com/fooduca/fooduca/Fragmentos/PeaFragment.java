package com.fooduca.fooduca.Fragmentos;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.Data;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;
import com.fooduca.fooduca.SearchActivity;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PeaFragment extends Fragment {

    View view;
    FloatingActionButton searchBtn;
    RecyclerView recycler;
    GridLayoutManager glm;
    List<Restaurante> res;
    RecyclerView.Adapter rvadapter;
    Data datos = new Data();

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

        recycler.setLayoutManager(glm);

        rvadapter = new RecyclerViewRestaurantes(getContext(),datos.getResPea());
        recycler.setAdapter(rvadapter);

        searchBtn = view.findViewById(R.id.search_btn);



        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SearchActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
