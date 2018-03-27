package com.shtoone.liqing.mvp.view.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.shtoone.liqing.R;
import com.shtoone.liqing.mvp.model.bean.RollingSpeedData;

/**
 * Created by Administrator on 2017/8/11.
 */
public class RollingSpeedFragmentRecyclerViewAdapter extends BaseQuickAdapter<RollingSpeedData.DataBean, BaseViewHolder> {

    public RollingSpeedFragmentRecyclerViewAdapter() {
        super(R.layout.item_recyclerview_rooling_speed, null);
    }

    @Override
    protected void convert(final BaseViewHolder holder, RollingSpeedData.DataBean item) {
        holder.setText(R.id.tv_shebeimingcheng_recyclerview_rooling_speed_fragment,item.getTmpno())
                .setText(R.id.tv_time_item_recyclerview_rooling_speed_fragment,item.getTmpshijian())
                .setText(R.id.tv_wendu_item_recyclerview_rooling_speed_fragment,item.getTmpsudu());
    }

}
