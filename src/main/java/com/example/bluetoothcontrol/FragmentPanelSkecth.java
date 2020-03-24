package com.example.bluetoothcontrol;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.bluetoothcontrol.adapter.GerarSckecthAdapter;

import java.util.ArrayList;

public class FragmentPanelSkecth extends Fragment {

    RecyclerView recycleritens;
    ArrayList<Componente> componentes = new ArrayList<Componente>();
    ItemAdapterIntensConfigurarSckecth adapter ;
    ;
    LinearLayoutManager meuLayout;


    public FragmentPanelSkecth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        componentes = getArguments().getParcelableArrayList("componentes");
        Log.i("ComponentesFra", componentes.get(0).getNomeComponente());

        View view = inflater.inflate(R.layout.fragment_panel_skecth, null);

        String myTag = getTag();
        ((GerarScketch) getActivity()).setTabFragmentA(myTag);


        adapter = new ItemAdapterIntensConfigurarSckecth(getContext());
        meuLayout = new LinearLayoutManager(getContext());
        recycleritens = (RecyclerView) view.findViewById(R.id.recyclerVItensConfigurarScketch);

        recycleritens.setLayoutManager(meuLayout);

        adapter.setArrayList(componentes);

        recycleritens.setAdapter(adapter);
        recycleritens.addItemDecoration(
                new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));


        adapter.setSpinnerSelectedListener(new ItemAdapterIntensConfigurarSckecth.SpinnerSelectedListener() {
            @Override
            public void onItemClick(String item, int position) {
                Toast.makeText(getContext(), item + " posicao: " + position, Toast.LENGTH_SHORT).show();
            }
        });

        adapter.setPinoListener(new ItemAdapterIntensConfigurarSckecth.PinoListener() {
            @Override
            public void onItemClick(String pino, int position) {
                Toast.makeText(getContext(), pino + "posicao: " + position, Toast.LENGTH_SHORT).show();

            }
        });

        return view;



    }

}
