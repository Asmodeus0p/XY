package com.jiyun.asmodeus.xy.view.adapter;


import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.jiyun.asmodeus.xy.R;

import java.util.List;

public class PopuRecyAdapter extends BaseQuickAdapter<Integer,BaseViewHolder> {

    public PopuRecyAdapter(int layoutResId, @Nullable List<Integer> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Integer item) {
        ImageView moren = helper.itemView.findViewById(R.id.moren);


        moren.setImageResource(item);
    }
}
