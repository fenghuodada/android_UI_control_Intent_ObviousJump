package com.example.test_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TextList extends AppCompatActivity {

    //声明数据源
    List<String> date;
    //声明列表视图
    ListView listView;
    //声明适配器
    ArrayAdapter arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_list);

        //实例化数据源
        InitDate();
        //实例化视图
        InitList();
        //实例化适配器
        InitAdapter();
        //为视图配置适配器
        listView.setAdapter(arrayAdapter);
        //设置点击事件
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int posion, long l) {
                String text=date.get(posion);
                Toast.makeText(TextList.this,"点击成功"+text,Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
    public void InitDate(){
        date=new ArrayList<>();
        for (int i = 0; i <100; i++) {
            date.add("第"+(i+1)+"行");
        }
    }
    public void InitList(){
        listView=findViewById(R.id.list_text);
    }
    public void InitAdapter(){
        arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,date);
    }

}