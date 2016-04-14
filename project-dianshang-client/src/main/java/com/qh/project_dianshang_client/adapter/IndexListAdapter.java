package com.qh.project_dianshang_client.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textservice.TextInfo;
import android.widget.TextView;

import com.qh.project_dianshang_client.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by asus on 2016/4/14.
 */
public class IndexListAdapter extends RecyclerView.Adapter<IndexListAdapter.AdapterHolder> {
//    List<String>menus=new ArrayList<>()
    String[] menus=new String[]{"名师课程","技术服务","找团队","找客户","找投资","学营销","大数据","我要众筹","排行榜","全部"};
    Context mContext;
    LayoutInflater mInflater;
    public IndexListAdapter(Context context) {
        this.mContext=context;
        mInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getItemCount() {
        return menus.length;
    }

    @Override
    public void onBindViewHolder(AdapterHolder holder, int position) {
        holder.tv_title.setText(menus[position]);
    }

    @Override
    public AdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=mInflater.inflate(R.layout.index_banner_list_item,null);
        //view.setBackgroundColor(Color.RED);
        AdapterHolder viewHolder=new AdapterHolder(view);
        return viewHolder;
    }

    class AdapterHolder extends RecyclerView.ViewHolder{
        TextView tv_title;
        public AdapterHolder(View itemView) {
            super(itemView);
            tv_title=(TextView) itemView.findViewById(R.id.tv_title);
        }

    }
}
