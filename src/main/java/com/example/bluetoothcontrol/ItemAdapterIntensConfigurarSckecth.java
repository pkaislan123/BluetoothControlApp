package com.example.bluetoothcontrol;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapterIntensConfigurarSckecth extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Componente> componentes ;


    public void setArrayList(ArrayList<Componente> componentes)
    {
        this.componentes = componentes;
        ;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View visual;
        visual = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itens_configurar_scketch, viewGroup, false);
        return new ItemAdapterIntensConfigurarSckecth.ItemViewHolder(visual);    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((ItemAdapterIntensConfigurarSckecth.ItemViewHolder) viewHolder).itens_configurar_scketch_nome_componente.setText(componentes.get(i).getNomeComponente());

    }

    @Override
    public int getItemCount() {
        return componentes != null ? componentes.size() : 0;
    }

    class ItemViewHolder extends  RecyclerView.ViewHolder  {
        private TextView itens_configurar_scketch_nome_componente;
        private Spinner itens_configurar_scketch_tipo_componente;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            itens_configurar_scketch_nome_componente = (TextView) itemView.findViewById(R.id.itens_configurar_scketch_nome_componente);
            itens_configurar_scketch_tipo_componente = (Spinner) itemView.findViewById(R.id.itens_configurar_scketch_tipo_componente);


        }

    }
}

