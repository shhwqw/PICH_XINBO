package com.shtoone.liqing.mvp.presenter.others;

import com.shtoone.liqing.mvp.contract.others.AboutContract;
import com.shtoone.liqing.mvp.presenter.base.BasePresenter;

/**
 * Created by Administrator on 2016/11/22.
 */
public class AboutPresenter extends BasePresenter<AboutContract.View> implements AboutContract.Presenter {


    public AboutPresenter(AboutContract.View mView) {
        super(mView);
    }

    @Override
    public void start() {

    }
}
