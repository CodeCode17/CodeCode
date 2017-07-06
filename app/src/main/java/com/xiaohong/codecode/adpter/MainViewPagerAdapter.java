package com.xiaohong.codecode.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xiaohong.codecode.fragment.BaseFragment;

import java.util.List;


/**
 * Created by Feng on 2017/7/6.
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private List<BaseFragment> mFragments;
    private String[] mFragmentTitle;


    public MainViewPagerAdapter(FragmentManager fm, List<BaseFragment> fragments, String[] fragmentTitle) {
        super(fm);
        this.mFragments = fragments;
        this.mFragmentTitle = fragmentTitle;
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
        return mFragmentTitle[position];
    }
    /*
    @Override
    public Fragment getItem(int position) {
//        return mFragments == null ? null : mFragments.get(position);
//        return new Fragment();
        return mFragments.get(position);
    }

    *//**
     * instantiateItem 会调用getItem 方法， 返回一个空的fragment
     * ((BaseFragment) super.instantiateItem(container, position)); 会在父类找到对应的fragment， 进行数据的更新
     *
     * @param container
     * @param position
     * @return
     *//*
   *//* @Override
    public Object instantiateItem(ViewGroup container, int position) {
//        BaseFragment fragment = (BaseFragment) super.instantiateItem(container, position);
        BaseFragment fragment = mFragments.get(position);
//        fragment.setTitle(mFragmentTitle.get(position));
//        Log.d(TAG, "instantiateItem: ");
        return fragment;
    }*//*

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
//        return mFragments.get(position).getTitle();
        Log.d(TAG, "getPageTitle: ");
        return mFragmentTitle[position];
    }*/
}
