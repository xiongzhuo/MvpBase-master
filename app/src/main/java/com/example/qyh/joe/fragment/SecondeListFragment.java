package com.example.qyh.joe.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.qyh.joe.R;
import com.example.qyh.joe.bean.DataBean;
import com.example.qyh.joe.view.FirstView;

import java.util.List;

/**
 * Created by admin on 2016/8/11.
 */
public class SecondeListFragment extends Fragment implements FirstView, View.OnClickListener {

    private RecyclerView recycle_view;
    private SwipeRefreshLayout swipe_refresh_widget;
    private FloatingActionButton fa_firstlist;

    public static SecondeListFragment newInstance(int type) {
        Bundle bundle = new Bundle();
        SecondeListFragment fragment = new SecondeListFragment();
        bundle.putInt("type", type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstlist_fragment, null);
        initView(view);
        return view;
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void addData(List<DataBean> mlist) {

    }

    @Override
    public void showLoadFail() {

    }

    private void initView(View view) {
        recycle_view = (RecyclerView) view.findViewById(R.id.recycle_view);
        swipe_refresh_widget = (SwipeRefreshLayout) view.findViewById(R.id.swipe_refresh_widget);
        fa_firstlist = (FloatingActionButton) view.findViewById(R.id.fa_firstlist);

        fa_firstlist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fa_firstlist:

                break;
        }
    }
}
