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
        res.add(new Restaurante("Pepper Jack",R.drawable.logo_pepperjack));
        res.add(new Restaurante("Crazy Food",R.drawable.logo_crazy_food));
        res.add(new Restaurante("Delicias do Brazil",R.drawable.logo_delicias_do_brasil));
        res.add(new Restaurante("La chinita",R.drawable.comida));
        res.add(new Restaurante("Loreto's",R.drawable.logo_loretos));
        res.add(new Restaurante("Jugolandia",R.drawable.comida));
        res.add(new Restaurante("Otro 1",R.drawable.comida));
        res.add(new Restaurante("Otro 2",R.drawable.comida));
        recycler.setLayoutManager(glm);

        rvadapter = new RecyclerViewRestaurantes(getContext(),res);
        recycler.setAdapter(rvadapter);

        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
