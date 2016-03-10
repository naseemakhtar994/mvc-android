package com.pacific.example.mvc.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pacific.example.adapter.QuickAdapter2;
import com.pacific.example.bean.MenuBean;
import com.pacific.example.mvc.model.NavigationModel;
import com.pacific.example.mvc.view.NavigationView;
import com.pacific.example.R;
import com.pacific.mvc.Fragment;

public class NavigationFragment extends Fragment<NavigationModel> {

    public static NavigationFragment newInstance() {
        NavigationFragment fragment = new NavigationFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        mvcModel = new NavigationModel(new NavigationView(this));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_navigation, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        mvcModel.setViewVisible(true);
    }

    @Override
    public void onPause() {
        super.onPause();
        mvcModel.setViewVisible(false);
    }

    public QuickAdapter2<MenuBean> getQuickAdapter() {
        return mvcModel.getQuickAdapter();
    }

    public void loadMenu() {
        mvcModel.loadMenu();
    }
}