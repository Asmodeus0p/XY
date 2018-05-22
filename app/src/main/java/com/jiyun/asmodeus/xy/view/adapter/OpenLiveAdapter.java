package com.jiyun.asmodeus.xy.view.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.jiyun.asmodeus.xy.view.base.BaseFragment;

import java.util.ArrayList;

public class OpenLiveAdapter extends FragmentPagerAdapter {
    private ArrayList<String> title = new ArrayList<>();
    private ArrayList <BaseFragment> fragments = new ArrayList<>();

    public OpenLiveAdapter(FragmentManager fm, ArrayList<BaseFragment> fragments, ArrayList <String> title) {
        super(fm);
        this.fragments = fragments;
        this.title = title;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}