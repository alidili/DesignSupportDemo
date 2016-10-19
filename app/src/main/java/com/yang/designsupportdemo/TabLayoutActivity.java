package com.yang.designsupportdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yangle on 2016/7/5.
 */
public class TabLayoutActivity extends AppCompatActivity {

    @Bind(R.id.tab)
    TabLayout tab;
    @Bind(R.id.vp_view)
    ViewPager vpView;

    private LayoutInflater layoutInflater;
    //页卡标题集合
    private List<String> titleList = new ArrayList<>();
    //页卡视图
    private View view;
    //页卡视图集合
    private List<View> viewList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        layoutInflater = LayoutInflater.from(this);
        //设置tab模式，当前为系统默认模式
        tab.setTabMode(TabLayout.MODE_SCROLLABLE);

        //添加页卡标题
        titleList.add("标题一");
        titleList.add("标题二");
        titleList.add("标题三");
        titleList.add("标题四");
        titleList.add("标题五");
        titleList.add("标题六");

        for (int i = 0; i <= 5; i++) {
            view = layoutInflater.inflate(R.layout.activity_tab_item, null);
            //添加页卡视图
            viewList.add(view);
            //添加tab选项卡
            tab.addTab(tab.newTab().setText(titleList.get(i)));
        }

        TabAdapter tabAdapter = new TabAdapter(viewList);
        vpView.setAdapter(tabAdapter);
        //将TabLayout和ViewPager关联起来。
        tab.setupWithViewPager(vpView);
        //给Tabs设置适配器
        tab.setTabsFromPagerAdapter(tabAdapter);
    }

    class TabAdapter extends PagerAdapter {
        private List<View> viewList;

        public TabAdapter(List<View> viewList) {
            this.viewList = viewList;
        }

        @Override
        public int getCount() {
            return viewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            //添加页卡
            container.addView(viewList.get(position));
            return viewList.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            //删除页卡
            container.removeView(viewList.get(position));
        }

        @Override
        public CharSequence getPageTitle(int position) {
            //页卡标题
            return titleList.get(position);
        }
    }
}
