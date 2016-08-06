package com.android.system.materialdesign.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by cuihangchao on 2016/8/5 0005.
 */
public class MyViewPagerAdater extends FragmentPagerAdapter {
   private Context mContext;
    private List<String> mTitles;
   private List<Fragment> mFragments;

    public MyViewPagerAdater(FragmentManager fm, Context mContext, List<String> mTitles, List<Fragment> mFragments) {
        super(fm);
        this.mContext = mContext;
        this.mTitles = mTitles;
        this.mFragments = mFragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
