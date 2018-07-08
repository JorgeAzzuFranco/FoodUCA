package com.fooduca.fooduca.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fooduca.fooduca.AboutIndividualActivity;
import com.fooduca.fooduca.ListaComidaActivity;
import com.fooduca.fooduca.POJO.Creadores;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewCreadores extends RecyclerView.Adapter<RecyclerViewCreadores.MyViewHolder>{

    private List<Creadores> creadores;
    private Context miContexto2;

    public RecyclerViewCreadores(Context miContexto2,List<Creadores> creadores){
        this.miContexto2 = miContexto2;
        this.creadores = creadores;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(miContexto2);
        view = inflater.inflate(R.layout.cardview_creador, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewCreadores.MyViewHolder holder, final int position) {
            holder.nom_crea.setText(creadores.get(position).getNombre());
            holder.crea_img.setImageResource(creadores.get(position).getFoto());
            holder.crea_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AboutIndividualActivity.class);
                    intent.putExtra("nomb", creadores.get(position).getNombre());
                    intent.putExtra("img", creadores.get(position).getFoto());
                    intent.putExtra("carrera",creadores.get(position).getCarrera());
                    intent.putExtra("git",creadores.get(position).getGit());
                    intent.putExtra("email",creadores.get(position).getEmail());
                    miContexto2.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return creadores.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nom_crea;
        ImageView crea_img;
        
        public MyViewHolder(View itemView) {
            super(itemView);
            nom_crea = itemView.findViewById(R.id.txt_nombre_creador);
            crea_img = itemView.findViewById(R.id.img_creador);
        }
    }
}
