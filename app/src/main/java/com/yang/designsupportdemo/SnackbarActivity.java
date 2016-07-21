package com.yang.designsupportdemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yangle on 2016/7/18.
 */
public class SnackbarActivity extends AppCompatActivity {

    @Bind(R.id.btnFloatingAction)
    FloatingActionButton btnFloatingAction;
    @Bind(R.id.layoutRoot)
    CoordinatorLayout layoutRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnFloatingAction)
    public void onClick(View v) {
        Snackbar snackbar = Snackbar.make(v, "Snackbar", Snackbar.LENGTH_LONG)
                .setAction("确定", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO
                    }
                });
        //设置提示文字颜色
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) snackbar.getView();
        ((TextView) snackbarLayout.findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#FFFFFF"));
        snackbar.show();
    }
}
