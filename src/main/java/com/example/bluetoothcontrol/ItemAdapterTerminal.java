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

import org.w3c.dom.Text;


public class ItemAdapterTerminal extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private ArrayList<Terminal.dadosTerminal> dados ;


    public ItemAdapterTerminal(ArrayList<Terminal.dadosTerminal> dados) {
        this.dados = dados;
    }



    @Override
    public int getItemCount() {

        return dados != null ? dados.size() : 0;

    }

    @NonNull
    @Override
     public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View visual;
        if(i == 0)
         {
             visual = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.terminal_textview_send, viewGroup, false);
             return new SendViewHolder(visual);
         }
        else
        {
            visual = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.terminal_textview_receiver, viewGroup, false);
            return new ReceiverViewHolder(visual);
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        if(getItemViewType(i) == 0)
        {
            ((SendViewHolder) viewHolder).tvTerminalTextSend.setText(dados.get(i).getTexto());
            ((SendViewHolder) viewHolder).tvRecyclerSendDevice.setText(dados.get(i).getDevice());
        }
        else {
            ((ReceiverViewHolder) viewHolder).tvTerminalTextReceiver.setText(dados.get(i).getTexto());
            if (dados.get(i - 1).getTipo() != 1)

                ((ReceiverViewHolder) viewHolder).tvRecyclerReceiverDevice.setText(dados.get(i).getDevice());

        }


    }

    @Override
    public int getItemViewType(int position) {

        if(dados.get(position).getTipo() == 0)
         return 0;
        else
            return 1;

    }



    class ReceiverViewHolder extends  RecyclerView.ViewHolder
    {
        private TextView tvTerminalTextReceiver;
        private TextView tvRecyclerReceiverDevice;


        public ReceiverViewHolder(@NonNull View itemView) {
            super(itemView);

         tvTerminalTextReceiver = (TextView) itemView.findViewById(R.id.tvRecycleReceiver);
            tvRecyclerReceiverDevice = (TextView) itemView.findViewById(R.id.tvRecyclerReceiverDevice);

        }
    }


    class SendViewHolder extends  RecyclerView.ViewHolder
    {
        private TextView tvTerminalTextSend;
        private TextView tvRecyclerSendDevice;


        public SendViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTerminalTextSend = (TextView) itemView.findViewById(R.id.tvRecycleSend);
            tvRecyclerSendDevice = (TextView) itemView.findViewById(R.id.tvRecycleSendDevice);

        }
    }



}

