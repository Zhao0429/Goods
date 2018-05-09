package com.example.administrator.recyclerview_01.presenter;

import android.util.Log;

import com.example.administrator.recyclerview_01.http.GoodsListener;
import com.example.administrator.recyclerview_01.http.Httpfig;
import com.example.administrator.recyclerview_01.model.GoodsBean;
import com.example.administrator.recyclerview_01.model.IModel;
import com.example.administrator.recyclerview_01.view.IMainView;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IPresenterImpl implements IPresenter{
    private static final String TAG = "IPresenterImpl";
    @Override
    public void GetDate(IModel iModel, final IMainView iMainView) {
        Map<String,String> map=new HashMap<>();
        map.put("pscid","2");
        iModel.GetGoods(Httpfig.Goods_url, map, new GoodsListener() {
            @Override
            public void GoodsSuccess(String json) {
                Gson gson =new Gson();
                GoodsBean goodsBean = gson.fromJson(json, GoodsBean.class);
                List<GoodsBean.DataBean> data = goodsBean.getData();
                iMainView.ShowGoods(data);
            }

            @Override
            public void GoodsError(String error) {
                Log.d(TAG, "GoodsError: 失败++++++++"+error);

            }
        });
    }
}
