package com.example.bluetoothcontrol;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGerarSkecth extends Fragment {


    public FragmentGerarSkecth() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      String myTag = getTag();
        ((GerarScketch) getActivity()).setTabFragmentB(myTag);

        return inflater.inflate(R.layout.fragment_gerar_skecth, container, false);
    }

}
