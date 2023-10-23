package com.example.test_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }
    public void Array_list(View view){
        Intent intent=new Intent(Choose.this,TextList.class);
        startActivity(intent);
        Log.d("Array_list","succed");
    }
    public void Simple(View view){
        Intent intent=new Intent(Choose.this,SimpleList.class);
        startActivity(intent);
        Log.d("Simple","succed");
    }
    public void Base(View view){
        Intent intent=new Intent(Choose.this,BaseList.class);
        startActivity(intent);
        Log.d("Base","succed");
    }

    public void login(View view) {
        Intent intent=new Intent(Choose.this,Login.class);
        startActivity(intent);
        Log.d("login","succed");
    }
}