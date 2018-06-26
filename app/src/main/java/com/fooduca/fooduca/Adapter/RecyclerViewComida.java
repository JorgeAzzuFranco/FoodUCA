package com.fooduca.fooduca.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.R;

import java.util.List;

public class RecyclerViewComida {
    private List<Comida> comidas;
    private Context miContexto;

    public RecyclerViewComida(Context miContexto,List<Comida> comidas){
        this.miContexto = miContexto;
        this.comidas = comidas;
    }

    //@Override
    public int getItemCount(){
        return comidas.size();
    }

    @NonNull
    //@Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        LayoutInflater inflater = LayoutInflater.from(miContexto);
        view = inflater.inflate(R.layout.cardview_comida, parent, false);
        return new MyViewHolder(view);
    }

    //@Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){
        holder.Nombre_comida.setText(comidas.get(position).getNombre_comida());
        holder.ComidaImg.setImageResource(comidas.get(position).getComidaImg());
        holder.Precio.setText(comidas.get(position).getPrecio());
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Nombre_comida;
        ImageView ComidaImg;
        TextView Precio;
        ImageButton btn_fav;

        public MyViewHolder(View itemView){
            super(itemView);

            Nombre_comida = itemView.findViewById(R.id.txt_nombre_comida);
            ComidaImg = itemView.findViewById(R.id.img_comida);
            Precio =itemView.findViewById(R.id.txt_precio);
            btn_fav = itemView.findViewById(R.id.imgbtn_fav);
        }
    }
}