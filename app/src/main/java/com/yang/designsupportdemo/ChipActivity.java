package com.yang.designsupportdemo;

import android.os.Bundle;
import android.support.design.chip.Chip;
import android.support.design.chip.ChipGroup;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by yangle on 2018/6/15.
 */

public class ChipActivity extends AppCompatActivity {

    @BindView(R.id.chip_group)
    ChipGroup chipGroup;
    @BindView(R.id.chip_close)
    Chip chipClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip);
        ButterKnife.bind(this);

        chipGroup.setOnCheckedChangeListener(new ChipGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(ChipGroup chipGroup, int i) {
                Chip chip = chipGroup.findViewById(i);
                Toast.makeText(ChipActivity.this, chip.getChipText(), Toast.LENGTH_SHORT).show();
            }
        });

        chipClose.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chipGroup.removeView(view);
            }
        });
    }
}
