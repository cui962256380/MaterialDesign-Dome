package com.android.system.materialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by cuihangchao on 2016/8/6 0006.
 */
public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder> {
    protected Context mContext;
    protected List<T> mList;
    protected RecyclerView mRecyclerView;
    public OnItemClickListener mItemClickListener;
    public View mParntView;
    public LayoutInflater mInflater;


    public BaseRecyclerAdapter(Context mContext, List<T> mList) {
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
        this.mList = mList;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(mRecyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(mRecyclerView);
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return onCreateMyViewHolder(parent, viewType);
    }
    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        onBindeMyViewHolder(holder, position);
    }

    abstract BaseViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType);

    abstract void onBindeMyViewHolder(BaseViewHolder holder, int position);


    public interface OnItemClickListener<T> {
        void onItemClick(View view, int position, T model);

        void onItemLongClick(View view, int position, T model);
    }

    public void setOnMyItemClickListener(OnItemClickListener<T> listener) {
        this.mItemClickListener = listener;
    }

}

