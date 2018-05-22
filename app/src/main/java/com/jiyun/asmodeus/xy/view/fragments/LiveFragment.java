package com.jiyun.asmodeus.xy.view.fragments;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.ILiveContract;
import com.jiyun.asmodeus.xy.model.entity.BannerBean;
import com.jiyun.asmodeus.xy.model.entity.ReMenBean;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;
import com.jiyun.asmodeus.xy.presenter.LivePresenter;
import com.jiyun.asmodeus.xy.view.activity.SeeLiveActivity;
import com.jiyun.asmodeus.xy.view.activity.SeeRemenActivity;
import com.jiyun.asmodeus.xy.view.adapter.RemenRecyAdapter;
import com.jiyun.asmodeus.xy.view.adapter.RenqizhuboRecyAdapter;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;
import com.recker.flybanner.FlyBanner;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.OnClick;
public class LiveFragment extends BaseFragment implements ILiveContract.View {
    @BindView(R.id.message)
    ImageView message;
    @BindView(R.id.live_flaybanner)
    FlyBanner liveFlaybanner;
    @BindView(R.id.moretext)
    TextView moretext;
    @BindView(R.id.renqizhubo)
    RecyclerView renqizhubo;
    @BindView(R.id.remen)
    RecyclerView remen;
    private ArrayList<String> urls;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_live;
    }

    @Override
    protected void init() {
        ILiveContract.Presenter presenter = new LivePresenter(this);
        presenter.requestBannerBean();
        presenter.requestRenqizhuBoBean();
        presenter.requestReMenBean();

    }

    @Override
    protected void loadDatas() {

    }

    @Override
    public void LoadBannerBean(BannerBean bannerBean) {
        urls = new ArrayList<>();
        for (BannerBean.DataBeanX.DataBean.ListBean listBean : bannerBean.getData().getData().getList()) {
            urls.add(listBean.getAdPic());
        }
        liveFlaybanner.setImagesUrl(urls);
    }

    @Override
    public void LoadRenqizhuBoBean(RenqizhuboBean renqizhuboBean) {
        final ArrayList<RenqizhuboBean.DataBean.ListBean> beans = new ArrayList<>();
        beans.addAll(renqizhuboBean.getData().getList());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        renqizhubo.setLayoutManager(linearLayoutManager);
        RenqizhuboRecyAdapter renqizhuboRecyAdapter = new RenqizhuboRecyAdapter(beans);
        renqizhubo.setAdapter(renqizhuboRecyAdapter);
        renqizhuboRecyAdapter.setOnItem(new RenqizhuboRecyAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(View v, int position) {
                RenqizhuboBean.DataBean.ListBean listBean = beans.get(position);
                SeeLiveActivity.start(getActivity(), listBean);
            }
        });

    }

    @Override
    public void LoadReMenBean(ReMenBean reMenBean) {
        final List<ReMenBean.DataBean.ListBean> list = reMenBean.getData().getList();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2) {
            @Override
            public boolean canScrollVertically() {
                // 直接禁止垂直滑动
                return false;
            }
        };

        remen.setLayoutManager(gridLayoutManager);
        RemenRecyAdapter remenRecyAdapter = new RemenRecyAdapter((ArrayList<ReMenBean.DataBean.ListBean>) list);
        remen.setAdapter(remenRecyAdapter);
        remenRecyAdapter.setOnItem(new RemenRecyAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(View v, int position) {
                ReMenBean.DataBean.ListBean bean = list.get(position);
                SeeRemenActivity.start(getActivity(),bean);

            }
        });

    }


    @OnClick({R.id.message, R.id.moretext})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.message:
                break;
            case R.id.moretext:
                break;
        }
    }
}
