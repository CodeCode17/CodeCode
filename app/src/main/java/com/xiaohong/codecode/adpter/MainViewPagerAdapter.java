package com.xiaohong.codecode.adpter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xiaohong.codecode.fragment.BaseFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Feng on 2017/7/6.
 */

public class MainViewPagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = "MainViewPagerAdapter";
    List<BaseFragment> mFragments = new ArrayList<>();
    public static final String[] fragmentTitle = new String[]{"综艺", "体育", "新闻", "热点", "头条", "军事", "历史", "科技", "人文", "地理"};


    public MainViewPagerAdapter(FragmentManager fm, List<BaseFragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments == null ? null : mFragments.get(position);
//        return new Fragment();
    }
//
//    /**
//     * instantiateItem 会调用getItem 方法， 返回一个空的fragment
//     * ((BaseFragment) super.instantiateItem(container, position)); 会在父类找到对应的fragment， 进行数据的更新
//     *
//     * @param container
//     * @param position
//     * @return
//     */
//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
////        BaseFragment fragment = (BaseFragment) super.instantiateItem(container, position);
//        BaseFragment fragment = mFragments.get(position);
////        fragment.setTitle(fragmentTitle.get(position));
//        return fragment;
//    }

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }

    /**
     * 先于instantiateItem执行
     *
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle[position];
    }
}
