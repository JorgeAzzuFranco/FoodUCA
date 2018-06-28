package com.fooduca.fooduca.Fragmentos;


import android.content.Intent;
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
    List<Restaurante> res;
    RecyclerView.Adapter rvadapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_proceres, container, false);

        recycler = view.findViewById(R.id.Recyclerview_restaurantes_proceres);
        recycler.setHasFixedSize(true);
        glm = new GridLayoutManager(getContext().getApplicationContext(), 2);

        res = new ArrayList<>();
        res.add(new Restaurante("Pizza Hut",R.drawable.logo_pizza_hut,"https://www.pizzahut.com.sv/"));
        res.add(new Restaurante("Los Cebollines",R.drawable.logo_los_cebollines, "http://www.cebollines.com/"));
        res.add(new Restaurante("China Wok",R.drawable.logo_china_wok, "http://www.chinawok.com.sv/"));
        res.add(new Restaurante("Pollo Campero",R.drawable.logo_pollo_campero,"https://www.campero.com/sv"));
        res.add(new Restaurante("Burguer King",R.drawable.logo_burger_king, "https://www.bk.com/international"));
        res.add(new Restaurante("McDonald",R.drawable.logo_mcdonalds,"https://www.mcdonalds.com/us/es-us.html"));
        res.add(new Restaurante("Starbucks",R.drawable.logo_starbucks,"https://www.starbucks.com/"));
        res.add(new Restaurante("Wendy's",R.drawable.logo_wendys,"https://www.wendyselsalvador.com/"));
//        res.add(new Restaurante("Pizza Hut",R.drawable.logo_pizza_hut));
//        res.add(new Restaurante("Los Cebollines",R.drawable.logo_los_cebollines));
//        res.add(new Restaurante("China Wok",R.drawable.logo_china_wok));
//        res.add(new Restaurante("Pollo Campero",R.drawable.logo_pollo_campero));
//        res.add(new Restaurante("Burguer King",R.drawable.logo_burger_king));
//        res.add(new Restaurante("McDonald",R.drawable.logo_mcdonalds));
//        res.add(new Restaurante("Starbucks",R.drawable.logo_starbucks));
//        res.add(new Restaurante("Wendy's",R.drawable.logo_wendys));
        recycler.setLayoutManager(glm);

        rvadapter = new RecyclerViewRestaurantes(getContext(),res);
        recycler.setAdapter(rvadapter);
        //intentando ir a pag al darle a la img
//        imgview = view.findViewById(R.id.img_restaurante);
//        imgview.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Uri uri = Uri.parse("https://www.pizzahut.com.sv/");
//                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//                startActivity(intent);
//            }
//        });
        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
