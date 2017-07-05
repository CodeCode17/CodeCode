package com.xiaohong.codecode.activity;



import android.os.Bundle;
import android.support.annotation.Nullable;


import com.xiaohong.codecode.R;
import com.xiaohong.codecode.mvp.mvppresenter.MainPresenter;
import com.xiaohong.codecode.mvp.MVPActivity;
import com.xiaohong.codecode.mvp.mvpview.MainView;

public class MainActivity extends MVPActivity<MainPresenter> implements MainView{


    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
