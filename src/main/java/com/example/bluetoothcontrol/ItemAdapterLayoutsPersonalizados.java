package com.example.bluetoothcontrol;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.example.bluetoothcontrol.interfaces.ItemClickListener;

import org.w3c.dom.Text;


public class ItemAdapterLayoutsPersonalizados extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ArrayList<TelaEscolhaLayoutsPersonalizados.Telas> telas ;
     private ItemClickListener itemClickListener;

     public void setOnItemClickListener(ItemClickListener itemClickListener)
     {
         this.itemClickListener =  itemClickListener;
     }

    public ItemAdapterLayoutsPersonalizados(ArrayList<TelaEscolhaLayoutsPersonalizados.Telas> telas) {
        this.telas = telas;
    }



    @Override
    public int getItemCount() {

        return telas != null ? telas.size() : 0;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View visual;
        visual = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.escolhalayoutspersonalizados, viewGroup, false);
        return new ItemViewHolder(visual);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {


        ((ItemViewHolder) viewHolder).tvNomeLayoutPersonalizado.setText(telas.get(i).getNome());


    }



    class ItemViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView tvNomeLayoutPersonalizado;
        private ImageButton btnExcluirLayout;

        private ImageView iVLayoutPersonalizado;


        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNomeLayoutPersonalizado = (TextView) itemView.findViewById(R.id.tvNomeLayoutPersonalizado);
            btnExcluirLayout = (ImageButton) itemView.findViewById(R.id.btnExcluirLayout);
            iVLayoutPersonalizado = (ImageView) itemView.findViewById(R.id.iVLayoutPersonalizado);


            iVLayoutPersonalizado.setOnClickListener(this);
            btnExcluirLayout.setOnClickListener(this);

        }

        @Override
        public void onClick(View v)
        {

            if(itemClickListener != null)
            {
               itemClickListener.OnItemClick(v, getAdapterPosition());
                //itemClickListener.buttonExcluirOnClick(v, getAdapterPosition());
            }

        }
    }

 public interface ItemClickListener
 {
     void OnItemClick(View  v, int position);
    // void buttonExcluirOnClick(View v, int position);

 }


}

