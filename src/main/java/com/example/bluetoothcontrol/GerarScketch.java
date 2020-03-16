package com.example.bluetoothcontrol;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.bluetoothcontrol.adapter.GerarSckecthAdapter;

import java.util.ArrayList;

public class GerarScketch extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    FragmentManager gerenciadorFragment = getSupportFragmentManager();



    private FragmentPanelSkecth fragmentPanelSkecth ;
   private FragmentGerarSkecth fragmentGerarSkecth ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ArrayList<Componente> componentes = getIntent().getParcelableArrayListExtra("componentes");


        Bundle lista_componentes = new Bundle();
        lista_componentes.putParcelableArrayList("componentes", componentes);
        fragmentPanelSkecth = new FragmentPanelSkecth();

        fragmentPanelSkecth.setArguments(lista_componentes);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_scketch);

        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_scketch);
        mViewPager = (ViewPager) findViewById(R.id.mViewPagerScketch);

        mViewPager.setAdapter(new GerarSckecthAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.titles_tab_scketch)));
        mTabLayout.setupWithViewPager(mViewPager);


    }

}
