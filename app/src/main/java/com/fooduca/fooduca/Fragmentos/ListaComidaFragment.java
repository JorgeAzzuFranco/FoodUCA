package com.fooduca.fooduca.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fooduca.fooduca.R;


public class ListaComidaFragment extends Fragment {

    View v;


    public ListaComidaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_lista_comida, container, false);



        return v;
    }

}
