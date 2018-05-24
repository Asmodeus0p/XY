package com.jiyun.asmodeus.xy.view.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.view.adapter.PoPuGridAdapter;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class GiftFragment extends Fragment {


    @BindView(R.id.Gift_Recy)
    RecyclerView GiftRecy;
    Unbinder unbinder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gift, container, false);
        unbinder = ButterKnife.bind(this, view);
        initData();
        return view;
    }

    private void initData() {

        Bundle arguments = getArguments();
        List<GiftBean.DataBean.ListBean> list = (List<GiftBean.DataBean.ListBean>) arguments.getSerializable("url");
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        GiftRecy.setLayoutManager(staggeredGridLayoutManager);
        GiftRecy.setAdapter(new PoPuGridAdapter((ArrayList<GiftBean.DataBean.ListBean>) list));


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
