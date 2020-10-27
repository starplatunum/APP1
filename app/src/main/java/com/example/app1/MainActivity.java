package com.example.app1;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void dol(View view) {
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        int oldScore = Integer.parseInt(teamAScore.getText().toString());//原先的分数
        int score = Integer.parseInt(view.getTag().toString());//本次应获得的分数
        teamAScore.setText("" + (score + oldScore));
    }





}