package com.fooduca.fooduca.Fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fooduca.fooduca.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasRicosFragment extends Fragment {


    public MasRicosFragment() {
        // Required empty public constructor
        RecyclerView MiReVi3;
        RecyclerView.Adapter rvadapter;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mas_ricos, container, false);
    }

    public interface OnNavigationItemSelectedListener {
    }
}
