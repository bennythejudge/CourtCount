package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3TeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void add2ForTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void add1ForTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }

    public void add3PointsB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void submitCommand2B(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void submitCommand1B(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
