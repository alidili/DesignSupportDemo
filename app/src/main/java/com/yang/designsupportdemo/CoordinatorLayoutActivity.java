package com.yang.designsupportdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yangle on 2016/7/5.
 */
public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Bind(R.id.recycler_view)
    RecyclerView recyclerView;

    private List<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout);
        ButterKnife.bind(this);

        initData();
    }

    private void initData() {
        data = new ArrayList<>();
        for (int i = 'A'; i <= 'Z'; i++) {
            data.add("" + (char) i);
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ListAdapter());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));
    }

    class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

        @Override
        public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            ListViewHolder holder = new ListViewHolder(
                    LayoutInflater.from(CoordinatorLayoutActivity.this).inflate(R.layout.adapter_list, parent, false));
            return holder;
        }

        @Override
        public void onBindViewHolder(ListViewHolder holder, int position) {
            holder.tv_number.setText(data.get(position));
        }

        @Override
        public int getItemCount() {
            return data.size();
        }

        class ListViewHolder extends RecyclerView.ViewHolder {
            TextView tv_number;

            public ListViewHolder(View view) {
                super(view);
                tv_number = (TextView) view.findViewById(R.id.tv_number);
            }
        }
    }
}
