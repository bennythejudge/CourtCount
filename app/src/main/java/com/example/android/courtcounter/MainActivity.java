package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitCommand(View view) {
        displayForTeamA(3);
        ((Button) view).getText();
    }

    public void submitCommand2(View view) {
        displayForTeamA(2);
    }

    public void submitCommand1(View view) {
        displayForTeamA(1);
    }

    public void displayForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
}
