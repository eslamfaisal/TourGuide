package com.example.android.tourguid;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainActivityAdaptor extends FragmentPagerAdapter {

    public MainActivityAdaptor(Context context, FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new SquaresFragment();
        } else if (position == 2) {
            return new MonumentsFragment();
        } else if (position == 3) {
            return new MosquesFragment();
        } else {
            return new UniversityFragment();
        }
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 5;
    }

}



