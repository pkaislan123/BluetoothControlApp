package com.example.bluetoothcontrol;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGerarSkecth extends Fragment {


    EditText skecth_definida ;
    public FragmentGerarSkecth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_gerar_skecth, container, false);

        String myTag = getTag();
        ((GerarScketch) getActivity()).setTabFragmentB(myTag);

        skecth_definida = view.findViewById(R.id.skecth_definida);

        return view;
    }

}
