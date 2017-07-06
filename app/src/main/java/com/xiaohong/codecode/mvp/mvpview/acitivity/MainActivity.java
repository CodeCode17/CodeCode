package com.xiaohong.codecode.mvp.mvpview.acitivity;


import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;


import com.xiaohong.codecode.R;
import com.xiaohong.codecode.adpter.MainViewPagerAdapter;
import com.xiaohong.codecode.fragment.BaseFragment;
import com.xiaohong.codecode.fragment.Test0Fragment;
import com.xiaohong.codecode.fragment.Test1Fragment;
import com.xiaohong.codecode.mvp.mvppresenter.MainPresenter;
import com.xiaohong.codecode.mvp.BaseActivity;
import com.xiaohong.codecode.mvp.mvpview.MainView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity<MainPresenter> implements MainView {


    @BindView(R.id.main_view_pager)
    ViewPager mViewPager;
    @BindView(R.id.main_tab_layout)
    TabLayout mTabLayout;
    @BindView(R.id.main_header_navigationView)
    NavigationView mNavigationView;
    @BindView(R.id.main_tool_bar)
    Toolbar mToolbar;


    private List<BaseFragment> mFragments;

    private MainViewPagerAdapter mMainViewPagerAdapter;


    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initToolBar();
        initData();
    }

    private void initToolBar() {
        ActionBar supportActionBar = getSupportActionBar();
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
        }
    }


    private void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new Test0Fragment());
        mFragments.add(new Test1Fragment());
        mMainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mMainViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        if (mNavigationView == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) mNavigationView.getChildAt(0);
            if (navigationMenuView != null) {
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }
}
