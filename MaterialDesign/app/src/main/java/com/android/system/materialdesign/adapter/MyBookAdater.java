package com.android.system.materialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.system.materialdesign.BookInfo;
import com.android.system.materialdesign.R;

import java.util.List;

/**
 * Created by cuihangchao on 2016/8/6 0006.
 */
public class MyBookAdater extends BaseRecyclerAdapter<BookInfo> {
   private BookViewHolder bkvh;
    public MyBookAdater(Context mContext, List<BookInfo> mList) {
        super(mContext, mList);
    }

    @Override
    BaseViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View v=mInflater.inflate(R.layout.crad_item,null,false);
        return new BookViewHolder(v);
    }

    @Override
    void onBindeMyViewHolder(BaseViewHolder holder, final int position) {
    bkvh= (BookViewHolder) holder;
    BookInfo bk=mList.get(position);
        bkvh.name.setText("书名:"+bk.getName());
        bkvh.author.setText("作者:"+bk.getOuthor());
        bkvh.price.setText("价格:"+bk.getPrice());
        if(mItemClickListener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   mItemClickListener.onItemClick(bkvh.itemView,position,mList.get(position));
                }
            });
            holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mItemClickListener.onItemLongClick(bkvh.itemView, position,mList.get(position));
                    return true;
                }
            });

        }
    }
    public class BookViewHolder extends BaseViewHolder{
        public TextView name;
        public TextView author;
        public TextView price;
         public BookViewHolder(View itemView) {
            super(itemView);
             name= (TextView) itemView.findViewById(R.id.name);
             author= (TextView) itemView.findViewById(R.id.athour);
             price= (TextView) itemView.findViewById(R.id.price);
        }
    }
}
