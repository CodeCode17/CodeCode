package com.xiaohong.codecode.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.xiaohong.codecode.mvp.mvppresenter.MainPresenter;

/**
 * Created by Feng on 2017/7/5.
 */

public abstract class MVPActivity<P extends MainPresenter> extends AppCompatActivity {

    private P mPresenter;

    protected abstract P createPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onDestroy() {
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        super.onDestroy();
    }
}
