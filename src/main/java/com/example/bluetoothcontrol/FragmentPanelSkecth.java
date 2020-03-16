package com.example.bluetoothcontrol;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class FragmentPanelSkecth extends Fragment {

    RecyclerView recycleritens;
    ArrayList<Componente> componentes = new ArrayList<Componente>();
    ItemAdapterIntensConfigurarSckecth adapter ;
    LinearLayoutManager meuLayout;


    public FragmentPanelSkecth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_panel_skecth, null);

        meuLayout = new LinearLayoutManager(getContext());
        recycleritens = (RecyclerView) view.findViewById(R.id.recyclerVItensConfigurarScketch);


        recycleritens.setLayoutManager(meuLayout);

        adapter.setArrayList(componentes);

        recycleritens.setAdapter(adapter);

        return view;



    }

}
