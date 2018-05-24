package com.jiyun.asmodeus.xy.view.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class GiftPopuAdapter extends PagerAdapter {
    private ArrayList<View> mList;

    public GiftPopuAdapter(ArrayList<View> mList) {
        this.mList = mList;
    }


    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * 功能：该函数用来判断instantiateItem(ViewGroup, int)
     * 函数所返回来的Key与一个页面视图是否是代表的同一个视图
     * (即它俩是否是对应的，对应的表示同一个View)
     * 返回值：如果对应的是同一个View，返回True，否则返回False。
     *
     * @param view
     * @param object
     * @return
     */
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    /**
     * 该方法实现的功能是移除一个给定位置的页面。
     * 适配器有责任从容器中删除这个视图。
     * 这是为了确保在finishUpdate(viewGroup)返回时视图能够被移除
     *
     * @param container
     * @param position
     * @param object
     */
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //super 这个必须得删除
        container.removeView(mList.get(position));
    }

    /**
     * 这个函数的实现的功能是创建指定位置的页面视图。
     * 适配器有责任增加即将创建的View视图到这里给定的container中，
     * 这是为了确保在finishUpdate(viewGroup)返回时this is be done!
     * 返回值：返回一个代表新增视图页面的Object（Key），
     * 这里没必要非要返回视图本身，也可以这个页面的其它容器。其实我的理解是可以代表当前页面的任意值，只要你可以与你增加的View一一对应即可，比如position变量也可以做为Key（最后我们举个例子试试可不可行）
     *
     * @param container
     * @param position
     * @return
     */
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mList.get(position));
        return mList.get(position);
    }
}
