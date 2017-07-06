package com.xiaohong.codecode.mvp.mvpview.acitivity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.xiaohong.codecode.R;
import com.xiaohong.codecode.adpter.MainViewPagerAdapter;
import com.xiaohong.codecode.core.TabLayoutUtils;
import com.xiaohong.codecode.fragment.BaseFragment;
import com.xiaohong.codecode.fragment.Test0Fragment;
import com.xiaohong.codecode.fragment.Test1Fragment;
import com.xiaohong.codecode.mvp.BaseActivity;
import com.xiaohong.codecode.mvp.mvppresenter.MainPresenter;
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
    @BindView(R.id.main_toolbar)
    Toolbar mMainToolbar;
    @BindView(R.id.activity_main)
    CoordinatorLayout mActivityMain;
    @BindView(R.id.main_drawer_layout)
    DrawerLayout mMainDrawerLayout;


    private List<BaseFragment> mFragments;

    private MainViewPagerAdapter mMainViewPagerAdapter;

    private String[] mFragmentTitle;
    private ActionBarDrawerToggle mToogle;


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
        initDrawerLayout();
        initData();
    }

    private void initDrawerLayout() {
        mMainDrawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            @Override
            public void onDrawerOpened(View drawerView) {
                Snackbar.make(mActivityMain, "onDrawerOpened", Snackbar.LENGTH_SHORT).show();

            }

            @Override
            public void onDrawerClosed(View drawerView) {
                Snackbar.make(mActivityMain, "onDrawerClosed", Snackbar.LENGTH_SHORT).show();

            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }

    private void initToolBar() {
        if (mMainToolbar != null) {
            setSupportActionBar(mMainToolbar);
            setSupportActionBar(mMainToolbar);
            mToogle = new ActionBarDrawerToggle(this, mMainDrawerLayout, mMainToolbar, R.string.open, R.string.close);
            mMainDrawerLayout.addDrawerListener(mToogle);
            mToogle.syncState();
//        mMainToolbar.setLogo(R.drawable.ic_account_circle_white_36dp);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mMainDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mMainDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
        ActionBar toolBar = getSupportActionBar();
        if (toolBar != null) {
            toolBar.setTitle("");
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.toolbar_menu_search:
                Snackbar.make(mActivityMain, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.toolbar_menu_download:
                Snackbar.make(mActivityMain, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.toolbar_menu_games:
                Snackbar.make(mActivityMain, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;
            case R.id.toolbar_menu_tv:
                Snackbar.make(mActivityMain, item.getTitle(), Snackbar.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initData() {
        mFragments = new ArrayList<>();
        mFragments.add(new Test0Fragment());
        mFragments.add(new Test1Fragment());
        mFragments.add(new Test0Fragment());
        mFragments.add(new Test1Fragment());
        mFragments.add(new Test0Fragment());
        mFragments.add(new Test1Fragment());
        mFragmentTitle = getResources().getStringArray(R.array.tab_layout_main_title);
        mMainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager(), mFragments, mFragmentTitle);
        mViewPager.setAdapter(mMainViewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
}
