package com.fooduca.fooduca.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fooduca.fooduca.POJO.Comida;
import com.fooduca.fooduca.R;

import java.util.List;

public class RecyclerViewComida extends RecyclerView.Adapter<RecyclerViewComida.MyViewHolder>{
    private List<Comida> comidas;
    private Context miContexto;


    public RecyclerViewComida(Context miContexto, List<Comida> comida){
        this.miContexto = miContexto;
        this.comidas = comida;
    }

    @Override
    public int getItemCount(){
        if (comidas != null){
            return comidas.size();
        }
        else{
            return 0;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view;
        LayoutInflater inflater = LayoutInflater.from(miContexto);
        view = inflater.inflate(R.layout.cardview_comida, parent, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("DefaultLocale")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){

        if(comidas != null){
            Comida current = comidas.get(position);
            holder.Nombre_comida.setText(comidas.get(position).getNombre_comida());
            if(comidas.get(position).getPrecio()==0){
                holder.Precio.setText("");
            }else{
                holder.Precio.setText(String.format("$%.2f", comidas.get(position).getPrecio()));
            }
            holder.ComidaImg.setImageResource(comidas.get(position).getComidaImg());
            //holder.Nombre_restaurante.setText(comidas.get(position).getNombre_restaurante());
        }
        else{
            holder.Nombre_comida.setText("No hay comida");
        }



    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Nombre_comida;
        ImageView ComidaImg;
        TextView Precio;
        ImageButton btn_fav;

        public MyViewHolder(View itemView){
            super(itemView);
            View view = itemView;
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String rest;
                    rest=comidas.get(getAdapterPosition()).getNombre_restaurante();
                    if(rest.equals(R.string.pronto)){
                        Toast.makeText(miContexto,rest,Toast.LENGTH_SHORT).show();
                    }else Toast.makeText(miContexto,"Encuéntrame en: "+rest,Toast.LENGTH_SHORT).show();
                }
            });
            Nombre_comida = itemView.findViewById(R.id.txt_nombre_comida);
            Precio =itemView.findViewById(R.id.txt_precio);
            ComidaImg = itemView.findViewById(R.id.img_comida);
        }
    } 
}
