package com.example.administrator.recyclerview_01.http;

public interface GoodsListener {

    void GoodsSuccess(String json);

    void GoodsError(String error);
}
