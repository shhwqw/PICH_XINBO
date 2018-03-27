package com.shtoone.liqing.mvp.presenter.paveSite;

import com.shtoone.liqing.mvp.contract.pave.RollingSpeedContract;
import com.shtoone.liqing.mvp.model.HttpHelper;
import com.shtoone.liqing.mvp.model.bean.RollingSpeedData;
import com.shtoone.liqing.mvp.presenter.base.BasePresenter;

import java.io.IOException;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Administrator on 2017/8/11.
 */
public class RollingSpeedPresenter extends BasePresenter<RollingSpeedContract.View> implements RollingSpeedContract.Presenter {


    public RollingSpeedPresenter(RollingSpeedContract.View mView) {
        super(mView);
    }

    @Override
    public void requestRollingSpeedData(Map map) {

        HttpHelper.getInstance().initService().requestRollingSpeedData(map).enqueue(new Callback<RollingSpeedData>() {
            @Override
            public void onResponse(Call<RollingSpeedData> call, Response<RollingSpeedData> response) {

                if (response.isSuccessful()) {
                    RollingSpeedData data=response.body();
                    if (data.isSuccess()) {
                        if(isViewAttached()){
                            getView().responseRollingSpeedData(data);
                            getView().showContent();
                        }
                    }else {
                        getView().showError(new IOException());

                    }
                }else {
                    getView().showError(new IOException());
                }

            }

            @Override
            public void onFailure(Call<RollingSpeedData> call, Throwable t) {

                getView().showError(t);
            }
        });

    }

    @Override
    public void loadMoreData(Map map) {
        HttpHelper.getInstance().initService().requestRollingSpeedData(map).enqueue(new Callback<RollingSpeedData>() {
            @Override
            public void onResponse(Call<RollingSpeedData> call, Response<RollingSpeedData> response) {

                if (response.isSuccessful()) {
                    RollingSpeedData data=response.body();
                    if (data.isSuccess()) {
                        getView().responseLoadMore(data);
                        getView().showContent();
                    }else {
                        getView().showError(new IOException());

                    }
                }else {
                    getView().showError(new IOException());
                }

            }

            @Override
            public void onFailure(Call<RollingSpeedData> call, Throwable t) {

                getView().showError(t);
            }
        });

    }

    @Override
    public void start() {

    }

}
