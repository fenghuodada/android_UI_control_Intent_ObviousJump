package com.example.test_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BaseList extends AppCompatActivity {

    //创建数据源
    private List<Itemdate> date;
    //创建视图list
    private ListView listView;
    //创建适配器
     MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_list);
        //实例化数据
        InitDate();
        //Date();
        //实例化视图
        InitList();
        //实例化适配器
        myAdapter=new MyAdapter(BaseList.this,date);
        //配置适配器
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Itemdate item_date=date.get(i);
                Toast.makeText(BaseList.this,"成功获取名字"+item_date.getTitle(),Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Itemdate item_date=date.get(i);
                Toast.makeText(BaseList.this, "成功获取标题"+item_date.getTitleSecond(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }

    private void InitList() {
        listView=findViewById(R.id.list_base);
    }

    private void Date(){
        date=new ArrayList<>();
        Itemdate itemdate=new Itemdate();
        itemdate.setTitle("renren");
        itemdate.setTitleSecond("df");
        itemdate.setImageFirst(R.drawable.test1);
        itemdate.setImageSecond(R.drawable.test2);

        Itemdate itemdate_2=new Itemdate();
        itemdate_2.setTitle("renren");
        itemdate_2.setTitleSecond("df");
        itemdate_2.setImageFirst(R.drawable.test1);
        itemdate_2.setImageSecond(R.drawable.test2);


        Itemdate itemdate_3=new Itemdate();
        itemdate_3.setTitle("renren");
        itemdate_3.setTitleSecond("df");
        itemdate_3.setImageFirst(R.drawable.test1);
        itemdate_3.setImageSecond(R.drawable.test2);

        Itemdate itemdate_4=new Itemdate();
        itemdate_4.setTitle("renren");
        itemdate_4.setTitleSecond("df");
        itemdate_4.setImageFirst(R.drawable.test1);
        itemdate_4.setImageSecond(R.drawable.test2);

        Itemdate itemdate_5=new Itemdate();
        itemdate_5.setTitle("renren");
        itemdate_5.setTitleSecond("df");
        itemdate_5.setImageFirst(R.drawable.test1);
        itemdate_5.setImageSecond(R.drawable.test2);

        Itemdate itemdate_6=new Itemdate();
        itemdate_6.setTitle("renren");
        itemdate_6.setTitleSecond("df");
        itemdate_6.setImageFirst(R.drawable.test1);
        itemdate_6.setImageSecond(R.drawable.test2);


        date.add(itemdate);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);


    }

    private void InitDate() {
        date=new ArrayList<>();
        Itemdate itemdate_1=new Itemdate();
        itemdate_1.setImageFirst(R.drawable.test1);
        itemdate_1.setImageSecond(R.drawable.test3);
        itemdate_1.setTitle("name1");
        itemdate_1.setTitleSecond("我们的故事");
        date=new ArrayList<>();
        Itemdate itemdate_2=new Itemdate();
        itemdate_2.setImageFirst(R.drawable.test3);
        itemdate_2.setImageSecond(R.drawable.test4);
        itemdate_2.setTitle("name2");
        itemdate_2.setTitleSecond("人生的简要");
        date=new ArrayList<>();
        Itemdate itemdate_3=new Itemdate();
        itemdate_3.setImageFirst(R.drawable.test4);
        itemdate_3.setImageSecond(R.drawable.test5);
        itemdate_3.setTitle("name3");
        itemdate_3.setTitleSecond("我们的故事");
        date=new ArrayList<>();
        Itemdate itemdate_4=new Itemdate();
        itemdate_4.setImageFirst(R.drawable.test5);
        itemdate_4.setImageSecond(R.drawable.test1);
        itemdate_4.setTitle("name4");
        itemdate_4.setTitleSecond("星辰路上闪耀的你");
        date=new ArrayList<>();
        Itemdate itemdate_5=new Itemdate();
        itemdate_5.setImageFirst(R.drawable.test5);
        itemdate_5.setImageSecond(R.drawable.test4);
        itemdate_5.setTitle("name5");
        itemdate_5.setTitleSecond("我们的故事");
        date=new ArrayList<>();
        Itemdate itemdate_6=new Itemdate();
        itemdate_6.setImageFirst(R.drawable.test4);
        itemdate_6.setImageSecond(R.drawable.test2);
        itemdate_6.setTitle("name6");
        itemdate_6.setTitleSecond("星辰路上闪耀的你");
        date=new ArrayList<>();
        Itemdate itemdate_7=new Itemdate();
        itemdate_7.setImageFirst(R.drawable.test3);
        itemdate_7.setImageSecond(R.drawable.test5);
        itemdate_7.setTitle("name7");
        itemdate_7.setTitleSecond("我们的故事");
        date=new ArrayList<>();
        Itemdate itemdate_8=new Itemdate();
        itemdate_8.setImageFirst(R.drawable.test4);
        itemdate_8.setImageSecond(R.drawable.test3);
        itemdate_8.setTitle("name8");
        itemdate_8.setTitleSecond("我们相遇的那一瞬间");
        date=new ArrayList<>();
        Itemdate itemdate_9=new Itemdate();
        itemdate_9.setImageFirst(R.drawable.test1);
        itemdate_9.setImageSecond(R.drawable.test3);
        itemdate_9.setTitle("name9");
        itemdate_9.setTitleSecond("星辰路上闪耀的你");


        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_7);
        date.add(itemdate_8);
        date.add(itemdate_9);
        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_8);
        date.add(itemdate_9);
        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_7);
        date.add(itemdate_8);
        date.add(itemdate_9);
        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_8);
        date.add(itemdate_9);
        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_4);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_7);
        date.add(itemdate_8);
        date.add(itemdate_9);
        date.add(itemdate_1);
        date.add(itemdate_2);
        date.add(itemdate_3);
        date.add(itemdate_5);
        date.add(itemdate_6);
        date.add(itemdate_8);
        date.add(itemdate_9);


















    }
}