package com.example.bluetoothcontrol;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bluetoothcontrol.adapter.GerarSckecthAdapter;

public class GerarScketch extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    FragmentManager gerenciadorFragment = getSupportFragmentManager();



    FragmentPanelSkecth fragmentPanelSkecth = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_scketch);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager);

        mViewPager.setAdapter(new GerarSckecthAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titles_tab)));
        mTabLayout.setupWithViewPager(mViewPager);


    }
}
