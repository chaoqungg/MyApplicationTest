package com.example.zcq.myapplicationtest.Test;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.zcq.myapplicationtest.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class testList1 extends Activity {


    List<HashMap<String,Object>> data;
    private final String TITLE = "title";
    private final String IMAGE0 = "image0";
    private final String IMAGE1 = "image1";
    private final String IMAGE2 = "image2";
    private final String IMAGE3 = "image3";
    private final String IMAGE4 = "image4";




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_list1);

        ListView listView=findViewById(R.id.test1);


        initData();

        SimpleAdapter simpleAdapter=new SimpleAdapter(
                testList1.this,
                data,
                R.layout.test_list_item1,
                new String[]{TITLE,IMAGE0,IMAGE1,IMAGE2,IMAGE3,IMAGE4},
                new int[]{R.id.text,R.id.dian0,R.id.dian1,R.id.dian2,R.id.dian3,R.id.dian4}
        );
        listView.setAdapter(simpleAdapter);


        }

    public void initData() {
         data=new ArrayList<HashMap<String, Object>>();

         for(int i=0;i<=9;i++){
            HashMap<String,Object>mapItem =new HashMap<String, Object>();
            mapItem.put(TITLE,i);
            mapItem.put(IMAGE0,R.drawable.dian2);
            mapItem.put(IMAGE1,R.drawable.dian2);
            mapItem.put(IMAGE2,R.drawable.dian2);
            mapItem.put(IMAGE3,R.drawable.dian2);
            mapItem.put(IMAGE4,R.drawable.dian2);
            data.add(mapItem);
         }

    }
}
