package com.fooduca.fooduca.Fragmentos;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fooduca.fooduca.Adapter.RecyclerViewCreadores;
import com.fooduca.fooduca.Adapter.RecyclerViewRestaurantes;
import com.fooduca.fooduca.Data;
import com.fooduca.fooduca.POJO.Creadores;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;
import com.fooduca.fooduca.SearchActivity;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    View view;
    RecyclerView recycler;
    GridLayoutManager glm;
    List<Creadores> creadores;
    RecyclerView.Adapter rvadapter;
    Data datos = new Data();
    //Data datas = new Data();
    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_about, container, false);

        recycler = view.findViewById(R.id.Recyclerview_creadores);
        recycler.setHasFixedSize(true);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            glm = new GridLayoutManager(getContext().getApplicationContext(), 2);
        }
        else{
            glm = new GridLayoutManager(getContext().getApplicationContext(), 4);
            view.setBackgroundResource(R.drawable.holi_dos);
        }

        recycler.setLayoutManager(glm);

        //rvadapter = new RecyclerViewRestaurantes(getContext(),datos.getResPea());
        rvadapter = new RecyclerViewCreadores(getContext(),datos.getCreadores());
        recycler.setAdapter(rvadapter);

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public interface OnNavigationItemSelectedListener {
    }
}
