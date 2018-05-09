package com.example.administrator.recyclerview_01.model;

import com.example.administrator.recyclerview_01.http.GoodsListener;

import java.util.Map;

public interface IModel {
    void GetGoods(String url, Map<String,String> map, GoodsListener goodsListener);
}
