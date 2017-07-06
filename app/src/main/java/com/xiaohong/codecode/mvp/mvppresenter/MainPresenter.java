package com.xiaohong.codecode.mvp.mvppresenter;

import com.xiaohong.codecode.mvp.mvpmodel.MainModel;
import com.xiaohong.codecode.mvp.mvpmodel.impl.MainModeImpl;
import com.xiaohong.codecode.mvp.mvpview.MainView;

/**
 * Created by Feng on 2017/7/5.
 */

public class MainPresenter extends BasePresenter<MainView, MainModel> {
    private  MainView mMainView;

    public MainPresenter(MainView mainView) {
        this.mMainView = mainView;
        attachView(mMainView);
        setMvpModel(new MainModeImpl());
    }
}
