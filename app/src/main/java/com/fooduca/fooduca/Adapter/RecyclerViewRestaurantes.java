package com.fooduca.fooduca.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fooduca.fooduca.ListaComidaActivity;
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
    public void onBindViewHolder(@NonNull final RecyclerViewRestaurantes.MyViewHolder holder, final int position){
        holder.Nombre_restaurante.setText(restaurantes.get(position).getNombre_restaurante());
        holder.RestauranteImg.setImageResource(restaurantes.get(position).getRestauranteImg());
        holder.url.setText(restaurantes.get(position).getWeb());
        holder.RestauranteImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String obtenerurl = restaurantes.get(position).getWeb();
                if (obtenerurl != null) {
                    Toast.makeText(miContexto2, "Redirigiendo a pagina web...",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse(obtenerurl));
                    miContexto2.startActivity(intent);
                }
                else{
                    Intent intent = new Intent(v.getContext(), ListaComidaActivity.class);
                    intent.putExtra("com", restaurantes.get(position).getNombre_restaurante());
                    intent.putExtra("fb", restaurantes.get(position).getFb());
                    intent.putExtra("ig", restaurantes.get(position).getIg());
                    //intent.putExtra("img", restaurantes.get(position).getRestauranteImg());
                    miContexto2.startActivity(intent);
                }
            }
        });
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Nombre_restaurante;
        ImageView RestauranteImg;
        TextView url;

        public MyViewHolder(View itemView){
            super(itemView);

            Nombre_restaurante = itemView.findViewById(R.id.txt_nombre_restaurante);
            RestauranteImg = itemView.findViewById(R.id.img_restaurante);
            url = itemView.findViewById(R.id.txt_URL_restaurante);
        }
    }
}

