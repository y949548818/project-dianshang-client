package com.qh.project_dianshang_client;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dxjia.library.ImageTextButton;
import com.qh.project_dianshang_client.adapter.MainViewPagerAdapter;
import com.qh.project_dianshang_client.fragment.ClassifyFragment;
import com.qh.project_dianshang_client.fragment.DiscoverFragment;
import com.qh.project_dianshang_client.fragment.IndexFragment;
import com.qh.project_dianshang_client.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

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
        initViewPager();
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
     * 初始化ViewPager
     */
    public void initViewPager(){
        List<Fragment>fragments=new ArrayList<>();
        fragments.add(new IndexFragment());
        fragments.add(new ClassifyFragment());
        fragments.add(new DiscoverFragment());
        fragments.add(new MineFragment());

        MainViewPagerAdapter adapter=new MainViewPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             * 记录上一次的位置
             */
            int lastIndex=-1;
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            /**
             * 改变icon的背景色
             * @param position
             */
            private void changeIconBackgroundColor(int position){
                switch (position){
                    case 0:
                        btn_index.setBackgroundColor(getResources().getColor(R.color.tabbedSelectedIconBackground));
                        break;
                    case 1:
                        btn_classify.setBackgroundColor(getResources().getColor(R.color.tabbedSelectedIconBackground));
                        break;
                    case 2:
                        btn_discover.setBackgroundColor(getResources().getColor(R.color.tabbedSelectedIconBackground));
                        break;
                    case 3:
                        btn_mine.setBackgroundColor(getResources().getColor(R.color.tabbedSelectedIconBackground));
                        break;
                }
                if(lastIndex!=-1){
                    switch (lastIndex){
                        case 0:
                            btn_index.setBackgroundColor(getResources().getColor(R.color.tabbedIconBackground));
                            break;
                        case 1:
                            btn_classify.setBackgroundColor(getResources().getColor(R.color.tabbedIconBackground));
                            break;
                        case 2:
                            btn_discover.setBackgroundColor(getResources().getColor(R.color.tabbedIconBackground));
                            break;
                        case 3:
                            btn_mine.setBackgroundColor(getResources().getColor(R.color.tabbedIconBackground));
                            break;
                    }
                }
                lastIndex=position;
            }
            @Override
            public void onPageSelected(int position) {
                changeIconBackgroundColor(position);
                //Toast.makeText(MainActivity.this,position+"",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    /**
     * 为对象添加监听器
     */
    public void initListener(){
        btn_index.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
                viewPager.setCurrentItem(0);
            }
        });

        btn_classify.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
                viewPager.setCurrentItem(1);
            }
        });

        btn_discover.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
                viewPager.setCurrentItem(2);
            }
        });
        btn_mine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"mine",Toast.LENGTH_LONG).show();
                viewPager.setCurrentItem(3);
            }
        });
    }
}
