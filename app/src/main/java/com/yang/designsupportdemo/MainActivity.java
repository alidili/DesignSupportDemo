package com.yang.designsupportdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 主页
 * Created by yangle on 2017/8/14.
 * <p>
 * Website：http://www.yangle.tech
 * GitHub：https://github.com/alidili
 * CSDN：http://blog.csdn.net/kong_gu_you_lan
 * JianShu：http://www.jianshu.com/u/34ece31cd6eb
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Snackbar, R.id.TabLayout, R.id.TextInputLayout, R.id.CoordinatorLayout,
            R.id.CollapsingToolbarLayout, R.id.MaterialButton, R.id.Chip, R.id.MaterialCardView,
            R.id.BottomAppBar})
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.Snackbar:
                intent = new Intent(this, SnackbarActivity.class);
                break;

            case R.id.TabLayout:
                intent = new Intent(this, TabLayoutActivity.class);
                break;

            case R.id.TextInputLayout:
                intent = new Intent(this, TextInputLayoutActivity.class);
                break;

            case R.id.CoordinatorLayout:
                intent = new Intent(this, CoordinatorLayoutActivity.class);
                break;

            case R.id.CollapsingToolbarLayout:
                intent = new Intent(this, CollapsingToolbarLayoutActivity.class);
                break;

            case R.id.MaterialButton:
                intent = new Intent(this, MaterialButtonActivity.class);
                break;

            case R.id.Chip:
                intent = new Intent(this, ChipActivity.class);
                break;

            case R.id.MaterialCardView:
                intent = new Intent(this, MaterialCardViewActivity.class);
                break;

            case R.id.BottomAppBar:
                intent = new Intent(this, BottomAppBarActivity.class);
                break;

            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
