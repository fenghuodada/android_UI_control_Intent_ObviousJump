package com.example.test_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {


    private Context context_item;
    private List<Itemdate> dated;
    private LayoutInflater item_layoutclass;
    public  MyAdapter(Context content,List<Itemdate> date){
        this.context_item=content;
        this.dated=date;
        item_layoutclass=LayoutInflater.from(context_item);
    }
    @Override
    public int getCount() {
        return dated.size();
    }

    @Override
    public Object getItem(int i) {
        return dated.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        //对视图的处理
        ViewHolder viewHolder= new ViewHolder();
        if (convertView == null) {
            convertView=item_layoutclass.inflate(R.layout.item_myadapter_list,viewGroup,false);
            ImageView imageView_first=convertView.findViewById(R.id.image_item_base_1);
            ImageView imageView_second=convertView.findViewById(R.id.image_item_base_2);
            TextView title_first=convertView.findViewById(R.id.item_title_base_1);
            TextView title_second=convertView.findViewById(R.id.item_title_base_2);

            viewHolder.imageView_first=imageView_first;
            viewHolder.imageView_second=imageView_second;
            viewHolder.title_first=title_first;
            viewHolder.title_second=title_second;
            convertView.setTag(viewHolder);
        }else{
            viewHolder= (ViewHolder) convertView.getTag();
        }
        Itemdate itemdate=dated.get(i);
        //数据匹配
        viewHolder.imageView_first.setImageResource(itemdate.getImageFirst());
        viewHolder.imageView_second.setImageResource(itemdate.getImageSecond());
        viewHolder.title_first.setText(itemdate.getTitle());
        viewHolder.title_second.setText(itemdate.getTitleSecond());
        return convertView;
    }

     class ViewHolder{
        ImageView imageView_first;
        ImageView imageView_second;
        TextView title_first;
        TextView title_second;

    }
}
