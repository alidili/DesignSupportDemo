package com.yang.designsupportdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yangle on 2016/7/28.
 */
public class TextInputLayoutActivity extends AppCompatActivity {

    @Bind(R.id.layout_account)
    TextInputLayout layoutAccount;
    @Bind(R.id.layout_password)
    TextInputLayout layoutPassword;

    private EditText mAccount;
    private EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textinput_layout);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        //设置提示文字
        layoutAccount.setHint("Username");
        layoutPassword.setHint("Password");

        //通过getEditText()方法来获取EditText控件
        mAccount = layoutAccount.getEditText();
        mPassword = layoutPassword.getEditText();

        mAccount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s.length() > 5) {
                    //显示错误提示
                    layoutAccount.setError("Username Error");
                    layoutAccount.setErrorEnabled(true);
                } else {
                    layoutAccount.setErrorEnabled(false);
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        InputMethodManager inputMethodManager = (InputMethodManager) this.getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(mAccount.getWindowToken(), 0);
        inputMethodManager.hideSoftInputFromWindow(mPassword.getWindowToken(), 0);
        return super.onTouchEvent(event);
    }
}
