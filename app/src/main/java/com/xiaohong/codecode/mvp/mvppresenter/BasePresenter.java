package com.xiaohong.codecode.mvp.mvppresenter;

import com.xiaohong.codecode.mvp.mvpmodel.MainModel;
import com.xiaohong.codecode.mvp.mvpview.BaseView;

/**
 * Created by Feng on 2017/7/5.
 */

public class BasePresenter<V extends BaseView, M extends MainModel> {
    private V mvpView;
    private M mvpModel;

    public void attachView(V mvpView) {
        this.mvpView = mvpView;
    }

    public void setMvpModel(M mvpModel) {
        this.mvpModel = mvpModel;
    }

    public void detachView() {
        if (mvpView != null) {
            mvpView = null;
        }
        if (mvpModel != null) {
            mvpModel = null;
        }
    }
}
