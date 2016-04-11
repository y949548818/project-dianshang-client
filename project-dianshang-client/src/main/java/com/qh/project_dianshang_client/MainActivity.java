package com.qh.project_dianshang_client;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dxjia.library.ImageTextButton;

public class MainActivity extends AppCompatActivity {


    /**
     * 分类
     */
    ImageTextButton btn_classify;
    /**
     * 我的
     */
    ImageTextButton btn_mine;
    /**
     * 发现
     */
    ImageTextButton btn_discover;
    /**
     * 首页
     */
    ImageTextButton btn_index;

    /**
     * 主体
     */
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initListener();
    }

    /**
     * 变量赋值
     */
    private void init() {
        btn_classify=(ImageTextButton) findViewById(R.id.btn_classify);
        btn_mine=(ImageTextButton) findViewById(R.id.btn_mine);
        btn_discover=(ImageTextButton) findViewById(R.id.btn_discover);
        btn_index=(ImageTextButton) findViewById(R.id.btn_index);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
    }

    /**
     * 为对象添加监听器
     */
    public void initListener(){
        btn_mine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
            }
        });
        btn_mine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
            }
        });
        btn_mine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
            }
        });
        btn_mine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
            }
        });
    }
}
