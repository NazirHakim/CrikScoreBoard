package com.example.nazir.crikscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     *  Display the Given score Of team A
     */
        public void displayForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onerun(View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void tworun(View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void threerun(View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void fourrun(View v){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    public void sixrun(View v){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     *  Display the Given score Of team B
     */
    public void displayForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void onerunb(View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void tworunb(View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void threerunb(View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void fourrunb(View v){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    public void sixrunb(View v){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
 public void reset (View v){
     scoreTeamA = 0;
     scoreTeamB =0;
     displayForTeamA(0);
     displayForTeamB(0);
 }

}
