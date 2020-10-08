package com.example.app1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;

public class RateListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


        ArrayList<HashMap<String, String>> li = new ArrayList<>();
        for (String i : com.example.rateexchange.MainActivity.money.keySet()) {
            HashMap<String, String> map = new HashMap<>();
            map.put("title", i);
            map.put("detail", String.valueOf(com.example.rateexchange.MainActivity.money.get(i)));
            li.add(map);
        }
        //ListAdapter adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,new ArrayList<String>(MainActivity.rate.keySet()));
        ListView lv = (ListView) findViewById(R.id.mylist);
        //lv.setAdapter(new SimpleAdapter(this, li, R.layout.activity_list, new String[]{"title", "detail"}, new int[]{R.id.title, R.id.detail}));
        myAdapter ma = new myAdapter(this, R.layout.activity_list, li);
        lv.setAdapter(ma);
        lv.setOnItemClickListener(ma);
        lv.setOnItemLongClickListener(ma);
        //lv.setEmptyView();
    }
}

