package com.jiyun.asmodeus.xy.view.fragments;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.MapView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.jiyun.asmodeus.xy.App;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.contract.ICreateRoomContract;
import com.jiyun.asmodeus.xy.model.entity.CreateRoomBean;
import com.jiyun.asmodeus.xy.model.utils.SharedPreferencesUtils;
import com.jiyun.asmodeus.xy.presenter.CreateRoomPresenter;
import com.jiyun.asmodeus.xy.view.activity.OpenLiveActivity;
import com.jiyun.asmodeus.xy.view.activity.SeeLiveActivity;
import com.jiyun.asmodeus.xy.view.activity.StartLiveActivity;
import com.jiyun.asmodeus.xy.view.adapter.PopuRecyAdapter;
import com.jiyun.asmodeus.xy.view.base.BaseFragment;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;

import java.util.ArrayList;

import butterknife.BindView;

import butterknife.OnClick;


import static android.graphics.BitmapFactory.decodeResource;


public class OpenLiveFreeFragment extends BaseFragment implements ICreateRoomContract.View {


    @BindView(R.id.live_Camera)
    ImageView liveCamera;
    @BindView(R.id.live_off)
    ImageView liveOff;
    @BindView(R.id.chuantouxiang)
    ImageView chuantouxiang;
    @BindView(R.id.miaoshuEd)
    EditText miaoshuEd;
    @BindView(R.id.wechat)
    ImageView wechat;
    @BindView(R.id.weibo)
    ImageView weibo;
    @BindView(R.id.wechatQuan)
    ImageView wechatQuan;
    @BindView(R.id.haha)
    ImageView haha;
    @BindView(R.id.meiyanLin)
    RelativeLayout meiyanLin;
    @BindView(R.id.OPENLive_button)
    Button OPENLiveButton;

    @BindView(R.id.main_weizhi)
    TextView mainWeizhi;
    @BindView(R.id.relative12)
    RelativeLayout relative12;
    @BindView(R.id.relativeLayout)
    RelativeLayout relativeLayout;
    @BindView(R.id.view2)
    View view2;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.activity_popup_demo)
    RelativeLayout activityPopupDemo;

    private SeekBar meibai_seekbar;
    private SeekBar mopi_seekbar;
    private SeekBar hongrui_seekbar;
    private RecyclerView popu_recy;
    private View lastView;
    int lastVisibility = -1;
    private AMap aMap;
    private TXLivePusher mLivePusher;
    private CreateRoomPresenter createRoomPresenter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_open_live_ziyou;
    }

    @Override
    protected void init() {
        mLivePusher = ((OpenLiveActivity) getActivity()).getmLivePusher();

        MapView mapView = new MapView(getActivity());
        aMap = mapView.getMap();
        onMyLocationChange(aMap.getMyLocation());
    }

    @Override
    protected void loadDatas() {
        createRoomPresenter = new CreateRoomPresenter(this);
    }


    @OnClick({R.id.live_Camera, R.id.live_off, R.id.chuantouxiang, R.id.wechat, R.id.weibo, R.id.wechatQuan, R.id.meiyanLin, R.id.OPENLive_button})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.live_Camera:
                mLivePusher.switchCamera();
                break;
            case R.id.live_off:
                getActivity().finish();
                break;
            case R.id.chuantouxiang:
                break;
            case R.id.wechat:
                break;
            case R.id.weibo:
                break;
            case R.id.wechatQuan:

                break;
            case R.id.meiyanLin:

                initPopu();
                OPENLiveButton.setVisibility(View.GONE);
                meiyanLin.setVisibility(View.GONE);
                break;
            case R.id.OPENLive_button:
                String USERNO = (String) SharedPreferencesUtils.getParam(App.context, "USERNO", "asdf");
                createRoomPresenter.createRoom("110114", "1", miaoshuEd.getText().toString().trim(), USERNO);
                break;
        }
    }

    private void initPopu() {
        View view = getLayoutInflater().inflate(R.layout.popu, null);
        meibai_seekbar = view.findViewById(R.id.Meibai_seekbar);
        mopi_seekbar = view.findViewById(R.id.Mopi_seekbar);
        hongrui_seekbar = view.findViewById(R.id.Hongrui_seekbar);
        popu_recy = view.findViewById(R.id.popu_recy);
        mLivePusher.setBeautyFilter(1, mopi_seekbar.getProgress(), meibai_seekbar.getProgress(), hongrui_seekbar.getProgress());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        popu_recy.setLayoutManager(linearLayoutManager);
        ArrayList<Integer> integers = new ArrayList<>();
        final int[] ass = {R.mipmap.orginal, R.mipmap.langman, R.mipmap.qingxin, R.mipmap.weimei, R.mipmap.fennen, R.mipmap.huaijiu, R.mipmap.landiao, R.mipmap.qingliang, R.mipmap.rixi};
        final int[] asa = {0, R.mipmap.filter_langman, R.mipmap.filter_qingxin, R.mipmap.filter_weimei, R.mipmap.filter_fennen, R.mipmap.filter_huaijiu, R.mipmap.filter_landiao, R.mipmap.filter_qingliang, R.mipmap.filter_rixi};
        for (int i = 0; i < ass.length; i++) {
            integers.add(ass[i]);
        }

        PopuRecyAdapter popuRecyAdapter = new PopuRecyAdapter(R.layout.popurecy_item, integers);
        popu_recy.setAdapter(popuRecyAdapter);
        popuRecyAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Bitmap bmp = null;
                bmp = decodeResource(getResources(), asa[position]);

                if (mLivePusher != null) {
                    mLivePusher.setFilter(bmp);
                }
                ImageView img = view.findViewById(R.id.fugai);
                int visibility = img.getVisibility();
                if (visibility == View.GONE) {
                    img.setVisibility(View.VISIBLE);
                }
                if (visibility == View.VISIBLE) {
                    img.setVisibility(View.GONE);
                }
                if (lastVisibility != -1) {
                    lastView.findViewById(R.id.fugai).setVisibility(View.GONE);
                }
                lastVisibility = visibility;
                lastView = view;
            }
        });
        PopupWindow mPopup = new PopupWindow(getActivity());
        //加载一个视图模板
        mPopup.setContentView(view);
        //给他设置高度和宽度
        mPopup.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
        mPopup.setWidth(ViewGroup.LayoutParams.MATCH_PARENT);
        mPopup.setFocusable(true);
        //设置处理Popup其他地方能点击 通过两个方法相辅相成才能实现这个跟Android模拟机的版本有关
        mPopup.setOutsideTouchable(true);
        //在java代码里写一些组件的颜色背景 Android提供一个可以把16进制色值的参数转成Android可以识别值
        mPopup.setBackgroundDrawable(new BitmapDrawable());
        mPopup.showAtLocation(getActivity().findViewById(R.id.activity_popup_demo), Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        mPopup.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                OPENLiveButton.setVisibility(View.VISIBLE);
                meiyanLin.setVisibility(View.VISIBLE);
            }
        });


    }

    public void onMyLocationChange(Location location) {
        //得到
        AMapLocationClientOption mLocationOption = new AMapLocationClientOption();
        AMapLocationClient aMapLocationClient = new AMapLocationClient(getContext());
        mLocationOption.setLocationPurpose(AMapLocationClientOption.AMapLocationPurpose.SignIn);
        if (null != aMapLocationClient) {
            aMapLocationClient.setLocationOption(mLocationOption);
            //设置场景模式后最好调用一次stop，再调用start以保证场景模式生效
            aMapLocationClient.stopLocation();
            aMapLocationClient.startLocation();
        }
        //设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //设置定位间隔,单位毫秒,默认为2000ms，最低1000ms。
        mLocationOption.setInterval(1000);
        //设置是否允许模拟位置,默认为true，允许模拟位置
        mLocationOption.setMockEnable(false);
        //单位是毫秒，默认30000毫秒，建议超时时间不要低于8000毫秒。
        mLocationOption.setHttpTimeOut(20000);
        //关闭缓存机制
        mLocationOption.setLocationCacheEnable(false);
        //给定位客户端对象设置定位参数
        aMapLocationClient.setLocationOption(mLocationOption);
        aMapLocationClient.setLocationListener(new AMapLocationListener() {
            @Override
            public void onLocationChanged(AMapLocation aMapLocation) {
                if (aMapLocation != null) {
                    if (aMapLocation.getErrorCode() == 0) {

                        //地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
                        String address = aMapLocation.getAddress();
                        mainWeizhi.setText(address);

                    } else {
                        //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                        Log.e("AmapError", "location Error, ErrCode:"
                                + aMapLocation.getErrorCode() + ", errInfo:"
                                + aMapLocation.getErrorInfo());
                    }
                }
            }
        });
    }


    @Override
    public void showCreateRoomData(CreateRoomBean createRoomBean) {
        Log.e("==============", createRoomBean.getMsg());
        Intent intent = new Intent(getContext(), StartLiveActivity.class);
        intent.putExtra("name", miaoshuEd.getText().toString().trim());
        intent.putExtra("createRoomBean", createRoomBean);
        startActivity(intent);
        getActivity().finish();
    }
}
