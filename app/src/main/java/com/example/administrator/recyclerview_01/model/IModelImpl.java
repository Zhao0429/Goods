package com.example.administrator.recyclerview_01.model;

import com.example.administrator.recyclerview_01.http.GoodsListener;
import com.example.administrator.recyclerview_01.http.OKHttpUtils;

import java.util.Map;

public class IModelImpl implements IModel {
    @Override
    public void GetGoods(String url, Map<String, String> map, final GoodsListener goodsListener) {
        OKHttpUtils okHttpUtils=new OKHttpUtils();
        okHttpUtils.okPost(url,map);
        okHttpUtils.setOnLoginListener(new OKHttpUtils.LoginListener() {
            @Override
            public void loginSuccess(String json) {

                goodsListener.GoodsSuccess(json);
            }

            @Override
            public void loginError(String error) {
                goodsListener.GoodsError(error);
            }
        });
    }
}
