package com.fooduca.fooduca.Fragmentos;


import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fooduca.fooduca.Data;
import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecomendacionFragment extends Fragment {

    View view;
    Data datos = new Data();
    ImageView imageView;
    TextView nombreRest;
    TextView nombrePlato;
    TextView precio;
    Comida random;
    ImageView refresh;

    public RecomendacionFragment() {
        // Required empty public constructor
    }


    @SuppressLint("DefaultLocale")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_recomendacion, container, false);

        imageView = view.findViewById(R.id.recomen_comida_img);
        nombrePlato = view.findViewById(R.id.txt_nombre_comida);
        nombreRest = view.findViewById(R.id.txt_nombre_restaurante);
        precio = view.findViewById(R.id.txt_precio);
        refresh = view.findViewById(R.id.bttn_refresh);

        if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
        }
        else{
            view.setBackgroundResource(R.drawable.holi_dos);
        }

        random = datos.randomItem();

        imageView.setImageResource(random.getComidaImg());
        nombrePlato.setText(random.getNombre_comida());
        nombreRest.setText(random.getNombre_restaurante());
        precio.setText(String.format("$%.2f", random.getPrecio()));
        refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                random = datos.randomItem();

                imageView.setImageResource(random.getComidaImg());
                nombrePlato.setText(random.getNombre_comida());
                nombreRest.setText(random.getNombre_restaurante());
                precio.setText(String.format("$%.2f", random.getPrecio()));
            }
        });
        return view;
    }

    public interface OnNavigationItemSelectedListener {
    }
}
