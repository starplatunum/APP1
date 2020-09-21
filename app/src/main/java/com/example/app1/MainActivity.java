package com.example.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_court_counter);

    }

    public void jumpBasketballCourtCounter(View view) {   //跳转篮球计分器页面
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, BasketballCourtCounterActivity.class);
        startActivity(intent);
    }
}