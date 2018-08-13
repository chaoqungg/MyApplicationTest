package com.example.zcq.myapplicationtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class GridviewActivity extends Activity {


    int i;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.girdview);
        //绑定GridView
        GridView gridView=(GridView)findViewById(R.id.girdview);
        //gridView.setVerticalSpacing(10);

        //生成数组，传入数据
        ArrayList<HashMap<String,Object>> lstImageItem =new ArrayList<HashMap<String, Object>>();
        for (i=0;i<200;i++){
            HashMap<String,Object> map =new HashMap<String, Object>();
            map.put("ItemImage"+i,R.drawable.dian2);
            lstImageItem.add(map);
        }

        //生成适配器
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,
                                                    lstImageItem,
                                                    R.layout.gridview_item,
                                                    new String[]{"ItemImage"+i},
                                                    new int[]{R.id.ItemImage});
        //添加消息显示
        gridView.setAdapter(simpleAdapter);
    }
}








