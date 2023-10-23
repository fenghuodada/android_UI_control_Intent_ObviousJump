package com.example.test_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleList extends AppCompatActivity {




    private String title,essay,image;
    int[] images={
            R.drawable.test1,
            R.drawable.test2,
            R.drawable.test3,
            R.drawable.test4,
            R.drawable.test5
    };
    String[] titles={
            "星空不见谁",
            "人生的简要",
            "我们的故事",
            "星辰路上闪耀的你",
            "我们相遇的那一瞬间"
    };
    String[] essays={
        "朋友，你说对时代有信心，但心中常有“两个小人”在斗争，一个叫“梦想还是要有的”，另一个大概是“算了，累觉不爱”。常在自我勉励，也总是自我否定，最希望生活有准心，却常常有心无力。不妨，再回头看看。",
        "100年前，有一本刚刚创刊不久的杂志下了决心搬到北京：将文言改成白话，还采用了新式标点，自此改变一个时代。对，它就是《新青年》。",
        "近40年前，有一位老人坐上日本新干线说，“就感到快，有催人跑的意思”。从此，一个国家在这位总设计师的领航下推进改革开放，拼了命追赶。你应该猜到了，这是中国。如今，它已经来到了世界舞台中央。",
        "如果你还记得高中的政治课本，一定知道社会主要矛盾的定义。今天它的表述变了。中国的主要矛盾已经变成“人民日益增长的美好生活需要和不平衡不充分的发展之间的矛盾”，中国富起来了。这样判断符合我们的常识。新的社会矛盾，是几十年打怪通关后的一扇新大门。这扇门上不仅写着物质文化生活，还写着民主、法治、公平正义、安全、环境，饱蘸着我们更高的期许，绝不是轻轻松松、敲锣打鼓可以跨过。但推开了，就是更美好的生活。",
        "我们无需掩藏个人对美好生活的向往，因为它就是中国梦的重要部分，但同时我们也深知，一只风筝要飞起来，必须站到时代的风口。2020年，中国将全面建成小康，很近了；2035年，中国将基本实现社会主义现代化，一眨眼也能到。那时你几岁？会在做什么？以此倒推，今天的使命是什么？"
    };
    private ListView listView;
    private List<Map<String,Object>> date;
    private SimpleAdapter simpleAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_list);
        InitDate();
        InitAdapter();
        InitListView();
        listView.setAdapter(simpleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String,Object> map=date.get(i);
                //提取数据源中的数据
                String title= (String) map.get("title");
                Toast.makeText(SimpleList.this, "获取了标题："+title, Toast.LENGTH_SHORT).show();
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Map<String,Object> map=date.get(i);
                String eassyed= (String) map.get("essay");
                Toast.makeText(SimpleList.this, "获取了段落："+eassyed, Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    private void InitAdapter() {
        simpleAdapter=new SimpleAdapter(SimpleList.this,date,R.layout.item_simple_layout,new String[]{
                "title","essay","image"
        },new int[]{
                R.id.title,R.id.essay,R.id.image_simple
        });
    }

    private void InitListView() {
        listView=findViewById(R.id.list_simple);
    }

    private void InitDate() {
        date=new ArrayList<>();
        for (int i = 0; i <100; i++) {
            Map<String,Object> map=new HashMap<>();
            map.put("title",titles[i%5]);
            map.put("image",images[i%5]);
            map.put("essay",essays[i%5]);
            date.add(map);
        }
    }
}