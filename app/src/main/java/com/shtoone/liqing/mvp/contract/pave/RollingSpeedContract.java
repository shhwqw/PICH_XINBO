package com.shtoone.liqing.mvp.contract.pave;

import com.shtoone.liqing.mvp.contract.base.BaseContract;
import com.shtoone.liqing.mvp.model.bean.RollingSpeedData;

import java.util.Map;

/**
 * Created by Administrator on 2017/8/11.
 */

public interface RollingSpeedContract extends BaseContract{

    interface View extends BaseContract.View{
        void responseRollingSpeedData(RollingSpeedData data);
        void responseLoadMore(RollingSpeedData data);
    }

    interface Presenter extends BaseContract.Presenter{
        void requestRollingSpeedData(Map map);
        void loadMoreData(Map map);
    }
}
