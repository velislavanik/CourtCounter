package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTreePoints(View v){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPoints(View v){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addAPoint(View v){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTreePointsB(View v){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsB(View v){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addAPointB(View v){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View v){
        scoreTeamB=0;
        scoreTeamA=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
