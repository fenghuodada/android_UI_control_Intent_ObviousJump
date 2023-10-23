package com.example.test_listview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public void outto(View view) {
        AlertDialog alertDialog;
        AlertDialog.Builder builder=new AlertDialog.Builder(this)
                .setTitle("退出对话框")
                .setIcon(R.drawable.man_head1)
                .setMessage("是否退出应用")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        MainActivity.this.finish();
                        Log.d("back","成功");
                    }
                })
                .setNegativeButton("退出", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        alertDialog=builder.create();
        alertDialog.show();
    }

    public void into(View view) {
        Intent intent=new Intent(MainActivity.this,Choose.class);
        startActivity(intent);
    }
}