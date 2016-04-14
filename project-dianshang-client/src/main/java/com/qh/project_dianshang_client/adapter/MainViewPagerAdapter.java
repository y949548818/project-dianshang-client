package com.qh.project_dianshang_client.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by asus on 2016/4/11.
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter{
    List<Fragment>list;
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    public MainViewPagerAdapter(FragmentManager fm,List<Fragment>list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
