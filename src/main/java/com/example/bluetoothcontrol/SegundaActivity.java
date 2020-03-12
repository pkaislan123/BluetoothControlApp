package com.example.bluetoothcontrol;

import android.arch.lifecycle.ViewModelProviders;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bluetoothcontrol.adapter.MyFragmentsPageAdapter;
import com.example.bluetoothcontrol.interfaces.TrocaDados;
import com.example.bluetoothcontrol.interfaces.UserModel;

import java.util.ArrayList;

public class SegundaActivity extends AppCompatActivity implements TrocaDados {
    private static final int SELECT_DISCOVERED_DEVICE =1 ;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    FragmentManager gerenciadorFragment = getSupportFragmentManager();
    PareadosActivity pareados;

    private UserModel model;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        mViewPager.setAdapter(new MyFragmentsPageAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titles_tab)));
        mTabLayout.setupWithViewPager(mViewPager);
        UserModel model = ViewModelProviders.of(this).get(UserModel.class);
        pareados = (PareadosActivity) model.getFragment();

    }



    @Override
    public void adicionarPareado(BluetoothDevice bt) {
        pareados.adicionaPareado(bt);

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        finish();
    }
}
