package com.jiyun.asmodeus.xy.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.RenqizhuboBean;

import java.util.ArrayList;


public class RenqizhuboRecyAdapter extends RecyclerView.Adapter<RenqizhuboRecyAdapter.Holder> implements View.OnClickListener {

    private ArrayList<RenqizhuboBean.DataBean.ListBean> mList;
    private Context context;

    public RenqizhuboRecyAdapter(ArrayList<RenqizhuboBean.DataBean.ListBean> mList) {
        this.mList = mList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.context=parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.renqizhuborecy_item, null);
        Holder holder = new Holder(view);
        //给这个VIew注册点击事件了
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        Glide.with(context).load(mList.get(position).getCover()).into(holder.mText);
        holder.mText1.setText(mList.get(position).getName());
        //itemVIew 跟 View一个东西  传入标记
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class Holder extends RecyclerView.ViewHolder {
        private ImageView mText;
        private TextView mText1;

        public Holder(View itemView) {
            super(itemView);
            mText = itemView.findViewById(R.id.fill_image);
            mText1 = itemView.findViewById(R.id.name);
        }
    }

    public interface OnItemClick {
        void setOnItemClick(View v, int position);
    }

    private OnItemClick mOnItem;

    @Override
    public void onClick(View v) {
        if (mOnItem != null) {
            mOnItem.setOnItemClick(v, (int) v.getTag());
        }
    }

    public void setOnItem(OnItemClick onItem) {
        this.mOnItem = onItem;
    }

}