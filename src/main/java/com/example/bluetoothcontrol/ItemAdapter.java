package com.example.bluetoothcontrol;

import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import com.example.bluetoothcontrol.interfaces.ItemClickListener;


public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemHolder> {

    private ItemClickListener itemCliquado;
     private List<Item> listIntens;
   /* public ItemAdapter(ArrayList itens) {
        listIntens = itens;
    }
*/
   public ItemAdapter()
   {}


    public void setArrayList(ArrayList itens)
    {
        listIntens = itens;
    }
    @Override
    public ItemHolder onCreateViewHolder( ViewGroup viewGroup, int i) {




        return new ItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false));
    }

    //5a020c
    //1f00

    @Override
    public void onBindViewHolder(final ItemHolder itemHolder, final int i) {
             itemHolder.nome.setText((String.format(Locale.getDefault(), "%s", listIntens.get(i).getNome())));
             itemHolder.mac.setText((String.format(Locale.getDefault(), "%s", listIntens.get(i).getMac())));
             Log.i("Testando", "Tipo do elemento e: "+ listIntens.get(i).getTipo());
             if(listIntens.get(i).getTipo().equals("5a020c")) {
                 itemHolder.iVcv.setImageResource(R.drawable.iconecelular);
                 Log.i("Testando", "No adapter, elemento e" + listIntens.get(i).getNome() +"e e um smartphone");
             }else if(listIntens.get(i).getTipo().equals("1f00")) {
                 itemHolder.iVcv.setImageResource(R.drawable.bluetoothdevice);
                 Log.i("Testando", "No adapter, elemento e" + listIntens.get(i).getNome() +"e e um adaptador bluetooth");


             }
             if(listIntens.get(i).getStatusConection().equals("true"))
             {
                 itemHolder.iVStatusConection.setImageResource(R.drawable.iconconectado);
             }else if(listIntens.get(i).getStatusConection().equals("false"))
             {
                 itemHolder.iVStatusConection.setImageResource(R.drawable.icondesconectado);
             }

    }




    @Override
    public int getItemCount() {
        return listIntens != null ? listIntens.size() :0;
    }

    public void setItemCliquado(ItemClickListener r)
    {
        this.itemCliquado = r;
    }



    public class ItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CardView cv;
        public TextView nome;
        public TextView mac;
        private int posicao;
        private ImageView iVcv;
        private ImageView iVStatusConection;

        public ItemHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            nome = (TextView) itemView.findViewById(R.id.tVNome);
            mac = (TextView) itemView.findViewById(R.id.tVMac);
            iVcv = (ImageView) itemView.findViewById(R.id.iVcv);
            iVStatusConection = (ImageView) itemView.findViewById(R.id.iVStatusConection);

            itemView.setOnClickListener(this);

        }

        public int getPosicao()
        {
            return  this.posicao;
        }

        public void setPosicao(int posicao)
        {
            this.posicao = posicao;
        }



        @Override
        public void onClick(View view) {
           if(itemCliquado != null)
           {
               itemCliquado.onItemClick(view,getAdapterPosition() );
           }
            //Toast.makeText(view.getContext(), "Elemento" + getAdapterPosition() , Toast.LENGTH_SHORT).show();
            //setPosicao(getAdapterPosition());


        }












    }
}

