package com.yang.designsupportdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.Snackbar, R.id.TabLayout, R.id.TextInputLayout, R.id.CoordinatorLayout,
            R.id.CollapsingToolbarLayout})
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
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
