package com.example.administrator.recyclerview_01.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.administrator.recyclerview_01.R;
import com.example.administrator.recyclerview_01.model.GoodsBean;
import com.example.administrator.recyclerview_01.model.IModelImpl;
import com.example.administrator.recyclerview_01.presenter.IPresenterImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity implements IMainView {

    private RecyclerView recy;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
        initView();
    }

    private void initDate() {
        IPresenterImpl iPresenter=new IPresenterImpl();
        iPresenter.GetDate(new IModelImpl(),this);
    }

    private void initView() {
        recy = findViewById(R.id.recy);
    }

    @Override
    public void ShowGoods(List<GoodsBean.DataBean> list) {
        Log.d(TAG, "ShowGoods: ++++++++++++++成功"+list.size());

    }
}
