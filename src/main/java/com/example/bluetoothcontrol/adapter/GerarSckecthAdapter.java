package com.example.bluetoothcontrol.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.bluetoothcontrol.FragmentGerarSkecth;
import com.example.bluetoothcontrol.FragmentPanelSkecth;

public class GerarSckecthAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles;

    public GerarSckecthAdapter(FragmentManager fm, String[]  mbTabTitles) {
        super(fm);


        this.mTabTitles = mbTabTitles;
    }

    @Override
    public Fragment getItem(int i) {
        switch(i)
        {
            case 0:
                return new FragmentPanelSkecth();
            case 1:
                return new FragmentGerarSkecth();
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


