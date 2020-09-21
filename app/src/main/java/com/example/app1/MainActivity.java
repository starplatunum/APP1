package com.example.app1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball_court_counter);

    }
    public void teamA_AddScore(View view) {
        /*
         * Team A加score分
         * @Param oldScore 原成绩
         * @Param score  要加的成绩
         * */
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        int oldScore = Integer.parseInt(teamAScore.getText().toString());
        int score = Integer.parseInt(view.getTag().toString());
        teamAScore.setText("" + (score + oldScore));
    }

    public void teamB_AddScore(View view) {
        /*
         * Team B加score分
         * @Param oldScore 原成绩
         * @Param score  要加的成绩
         * */
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        int oldScore = Integer.parseInt((String) teamBScore.getText());
        int score = Integer.parseInt(view.getTag().toString());
        teamBScore.setText("" + (score + oldScore));
    }

    public void reset(View view) {
        /*
         * 重置比分
         * */
        TextView teamAScore = (TextView) findViewById(R.id.teamAScore);
        TextView teamBScore = (TextView) findViewById(R.id.teamBScore);
        teamAScore.setText("0");
        teamBScore.setText("0");

        /*
         * 发送提示信息
         * */
    }

}