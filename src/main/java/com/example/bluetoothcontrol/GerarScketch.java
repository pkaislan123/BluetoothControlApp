package com.example.bluetoothcontrol;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.bluetoothcontrol.adapter.GerarSckecthAdapter;

import java.util.ArrayList;

public class GerarScketch extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    FragmentManager gerenciadorFragment = getSupportFragmentManager();

    String TabFragmentA, TabFragmentB;


    private FragmentConfigurarSkecth fragmentConfigurarSkecth;
    private FragmentGerarSkecth fragmentGerarSkecth;

     ArrayList<Componente> componentes  = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_gerar_scketch);

        componentes = getIntent().getParcelableArrayListExtra("componentes");


        mTabLayout = (TabLayout) findViewById(R.id.tab_layout_scketch);
        mViewPager = (ViewPager) findViewById(R.id.mViewPager_scketch);

        // mViewPager.setAdapter(new GerarSckecthAdapter(getSupportFragmentManager()));
        setupViewPager(mViewPager);

        mTabLayout.setupWithViewPager(mViewPager);
        enviaDados();
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


    }

    private void setupViewPager(ViewPager viewPager) {
        fragmentConfigurarSkecth = new FragmentConfigurarSkecth();
        fragmentGerarSkecth = new FragmentGerarSkecth();
        GerarSckecthAdapter adapter = new GerarSckecthAdapter(getSupportFragmentManager());
        adapter.addFrag(fragmentConfigurarSkecth, "Configurar");
        adapter.addFrag(fragmentGerarSkecth, "Gerar");
        viewPager.setAdapter(adapter);
    }


    public void setTabFragmentA(String t) {
        TabFragmentA = t;

    }

    public String getTabFragmentA() {
        return TabFragmentA;
    }

    public void setTabFragmentB(String t) {
        TabFragmentB = t;

    }

    public String getTabFragmentB() {
        return TabFragmentB;
    }

    public void enviaDados() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("componentes",componentes);
        fragmentConfigurarSkecth.setArguments(bundle);

    }

    public void trocarPagina(int indice)
    {
        mViewPager.setCurrentItem(indice);
    }

}




