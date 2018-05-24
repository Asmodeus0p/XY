package com.jiyun.asmodeus.xy.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.jiyun.asmodeus.xy.R;
import com.jiyun.asmodeus.xy.model.entity.GiftBean;
import com.jiyun.asmodeus.xy.view.activity.SeeLiveActivity;

import java.util.ArrayList;

public class PoPuGridAdapter extends RecyclerView.Adapter<PoPuGridAdapter.Holder> implements View.OnClickListener {
        private Context context;
    private ArrayList<GiftBean.DataBean.ListBean> mList;

    public PoPuGridAdapter(ArrayList<GiftBean.DataBean.ListBean> mList) {
        this.mList = mList;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gift_poput_item, null);
        Holder holder = new Holder(view);
        //给这个VIew注册点击事件了
        view.setOnClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {
        holder.gift_name.setText(mList.get(position).getGiftName());
        holder.gift_price.setText(mList.get(position).getGiftPrice()+"金币");
        Glide.with(context).load(mList.get(position).getGiftPic()).into(holder.gift_img);
        //itemVIew 跟 View一个东西  传入标记
        holder.itemView.setTag(position);

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class Holder extends RecyclerView.ViewHolder {
        private ImageView gift_img;
        private TextView gift_name;
        private TextView gift_price;



        public Holder(final View itemView) {
            super(itemView);
            gift_img = itemView.findViewById(R.id.gift_img);
            gift_name = itemView.findViewById(R.id.gift_name);

            gift_price = itemView.findViewById(R.id.gift_price);


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