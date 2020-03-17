package com.example.bluetoothcontrol.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.bluetoothcontrol.FragmentGerarSkecth;
import com.example.bluetoothcontrol.FragmentPanelSkecth;

import java.util.ArrayList;
import java.util.List;

public class GerarSckecthAdapter extends FragmentPagerAdapter {
    private final List<String> mTabTitles = new ArrayList<>();
    private final List<Fragment> mfragmentList = new ArrayList<>();


    public GerarSckecthAdapter(FragmentManager fm) {
        super(fm);


    }

    @Override
    public Fragment getItem(int i) {
        /*switch(i)
        {
            case 0:
                return new FragmentPanelSkecth();
            case 1:
                return new FragmentGerarSkecth();
            default:
                return null;
        }

         */
        return mfragmentList.get(i);


    }

    @Override
    public int getCount() {
        return mfragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int i)
    {
        return mTabTitles.get(i);
    }


    public void addFrag(Fragment fragment, String title)
    {
        mfragmentList.add(fragment);
        mTabTitles.add(title);


    }



}


