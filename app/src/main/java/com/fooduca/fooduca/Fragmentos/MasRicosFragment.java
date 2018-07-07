package com.fooduca.fooduca.Fragmentos;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fooduca.fooduca.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MasRicosFragment extends Fragment {
    EditText min;
    EditText max;
    View view;
    Button search;
    Fragment fragment = null;
    public MasRicosFragment() {
        // Required empty public constructor
        RecyclerView MiReVi3;
        RecyclerView.Adapter rvadapter;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_mas_ricos, container, false);
        min = view.findViewById(R.id.precio_min);
        max = view.findViewById(R.id.precio_max);
        search = view.findViewById(R.id.search_btn);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), min.getText().toString(),Toast.LENGTH_SHORT).show();
                Toast.makeText(getContext(), max.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
