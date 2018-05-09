package com.example.administrator.recyclerview_01.model;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.recyclerview_01.R;

import org.w3c.dom.Text;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<GoodsBean.DataBean> list;

    public MyAdapter(Context context, List<GoodsBean.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.goods_item, null);
        MyHolder myHolder=new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyHolder extends RecyclerView.ViewHolder {


        private final ImageView img;
        private final TextView price01;
        private final TextView price02;

        public MyHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            price01 = itemView.findViewById(R.id.price01);
            price02 = itemView.findViewById(R.id.price02);
        }

        public ImageView getImg() {
            return img;
        }

        public TextView getPrice01() {
            return price01;
        }

        public TextView getPrice02() {
            return price02;
        }
    }
}
