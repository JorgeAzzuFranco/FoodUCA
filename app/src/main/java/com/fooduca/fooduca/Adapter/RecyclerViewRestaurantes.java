package com.fooduca.fooduca.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fooduca.fooduca.MainActivity;
import com.fooduca.fooduca.POJO.Restaurante;
import com.fooduca.fooduca.R;

import java.util.List;

public class RecyclerViewRestaurantes extends RecyclerView.Adapter<RecyclerViewRestaurantes.MyViewHolder>{
    private List<Restaurante> restaurantes;
    private Context miContexto2;

    public RecyclerViewRestaurantes(Context miContexto2,List<Restaurante> restaurantes){
        this.miContexto2 = miContexto2;
        this.restaurantes = restaurantes;
    }

    @Override
    public int getItemCount(){
        return restaurantes.size();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        LayoutInflater inflater = LayoutInflater.from(miContexto2);
        view = inflater.inflate(R.layout.cardview_restaurante, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewRestaurantes.MyViewHolder holder, int position){
        holder.Nombre_restaurante.setText(restaurantes.get(position).getNombre_restaurante());
        holder.RestauranteImg.setImageResource(restaurantes.get(position).getRestauranteImg());
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Nombre_restaurante;
        ImageView RestauranteImg;

        public MyViewHolder(View itemView){
            super(itemView);

            Nombre_restaurante = itemView.findViewById(R.id.txt_nombre_restaurante);
            RestauranteImg = itemView.findViewById(R.id.img_restaurante);
        }
    }
}

