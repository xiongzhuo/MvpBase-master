package com.example.qyh.joe.model;

import com.example.qyh.joe.bean.SecondeDataBean;

import java.util.List;

/**
 * Created by admin on 2016/8/11.
 */
public class SecondeModeImpl implements SecondeModel {


    @Override
    public void loadDatas(String url, int type, onLoadDataListener listener) {

    }

    public interface   onLoadDataListener{
        void  onSuccess(List<SecondeDataBean> List);
        void  onfailure(Exception e,String  s);
    }
}
