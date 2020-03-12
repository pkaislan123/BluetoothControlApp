package com.example.bluetoothcontrol.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.bluetoothcontrol.BuscaFragment;
import com.example.bluetoothcontrol.PareadosActivity;


public class MyFragmentsPageAdapter extends FragmentPagerAdapter {

    private String[] mTabTitles;

    public MyFragmentsPageAdapter(FragmentManager fm, String[]  mbTabTitles) {
        super(fm);


        this.mTabTitles = mbTabTitles;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i)
        {
            case 0:
                return new BuscaFragment();
            case 1:
                return new PareadosActivity();

            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return this.mTabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int i)
    {
        return this.mTabTitles[i];
    }





}


