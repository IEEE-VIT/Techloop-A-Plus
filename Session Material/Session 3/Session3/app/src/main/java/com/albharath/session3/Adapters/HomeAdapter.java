package com.albharath.session3.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.albharath.session3.Fragments.ConverterFragment;
import com.albharath.session3.Fragments.FraggitFragment;

/**
 * Created by jade on 22/2/18.
 */

public class HomeAdapter extends FragmentPagerAdapter{

    String[] arr = {"Converter","Fraggit"};

    public HomeAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return arr[position];
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            ConverterFragment firstFragment = new ConverterFragment();
            return firstFragment;
        }
        else {
            FraggitFragment secondFragment = new FraggitFragment();
            return secondFragment;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
