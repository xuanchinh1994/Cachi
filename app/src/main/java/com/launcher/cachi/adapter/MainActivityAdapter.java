package com.launcher.cachi.adapter;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * @author Droid
 *继承 FragmentStatePagerAdapter，fragment才会及时更新
 */
public class MainActivityAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> mFragments;
    private FragmentManager fm;
    
    public MainActivityAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
        this.fm=fm;
    }

    @Override
    public Fragment getItem(int i) {
        return mFragments.get(i);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Parcelable saveState() {
        return null;
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

}
