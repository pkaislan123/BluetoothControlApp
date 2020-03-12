package com.example.bluetoothcontrol.interfaces;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.bluetooth.BluetoothDevice;
import android.support.v4.app.Fragment;

import com.example.bluetoothcontrol.PareadosActivity;

import java.util.ArrayList;

public class UserModel extends ViewModel {
    private final MutableLiveData<ArrayList<BluetoothDevice>> selected = new MutableLiveData<>();
    private final MutableLiveData<PareadosActivity> mandarFragment = new MutableLiveData<>();


    private ArrayList<BluetoothDevice> devices = new ArrayList<>();


    public void select(ArrayList<BluetoothDevice> dispositivosPareados) {

        selected.setValue(dispositivosPareados);
    }

    public void setFragment(PareadosActivity pareados) {
        mandarFragment.setValue(pareados);
    }

    public Fragment getFragment() {
        return mandarFragment.getValue();
    }


    public ArrayList<BluetoothDevice> getSelected() {
        return selected.getValue();
    }

}






