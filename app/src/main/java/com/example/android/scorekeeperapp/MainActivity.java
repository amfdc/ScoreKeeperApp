package com.example.android.scorekeeperapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    /**
     * GLOBAL VARIABLES
     * Declaration and initialization.
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int penaltyTeamA = 0;
    int penaltyTeamB = 0;
    int offsideTeamA = 0;
    int offsideTeamB = 0;
    int faultTeamA = 0;
    int faultTeamB = 0;
    int yellowCardTeamA = 0;
    int yellowCardTeamB = 0;
    int redCardTeamA = 0;
    int redCardTeamB = 0;

    /**
     * SAVE INSTANCE OF SCORES
     * Method to save the state of the views
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("saveScoreTeamA", scoreTeamA);
        outState.putInt("saveScoreTeamB", scoreTeamB);
        outState.putInt("savePenaltyTeamA", penaltyTeamA);
        outState.putInt("savePenaltyTeamB", penaltyTeamB);
        outState.putInt("saveOffsideTeamA", offsideTeamA);
        outState.putInt("saveOffsideTeamB", offsideTeamB);
        outState.putInt("saveFaultTeamA", faultTeamA);
        outState.putInt("saveFaultTeamB", faultTeamB);
        outState.putInt("saveYellowCardTeamA", yellowCardTeamA);
        outState.putInt("saveYellowCardTeamB", yellowCardTeamB);
        outState.putInt("saveRedCardTeamA", redCardTeamA);
        outState.putInt("saveRedCardTeamB", redCardTeamB);
    }

    /**
     * RESTORE SAVED INSTANCE OF SCORES
     * Method to restore the saved state of the views
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("saveScoreTeamA");
        scoreTeamB = savedInstanceState.getInt("saveScoreTeamB");
        penaltyTeamA = savedInstanceState.getInt("savePenaltyTeamA");
        penaltyTeamB = savedInstanceState.getInt("savePenaltyTeamB");
        offsideTeamA = savedInstanceState.getInt("saveOffsideTeamA");
        offsideTeamB = savedInstanceState.getInt("saveOffsideTeamB");
        faultTeamA = savedInstanceState.getInt("saveFaultTeamA");
        faultTeamB = savedInstanceState.getInt("saveFaultTeamB");
        yellowCardTeamA = savedInstanceState.getInt("saveYellowCardTeamA");
        yellowCardTeamB = savedInstanceState.getInt("saveYellowCardTeamB");
        redCardTeamA = savedInstanceState.getInt("saveRedCardTeamA");
        redCardTeamB = savedInstanceState.getInt("saveRedCardTeamB");
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);
        displayOffsideForTeamA(offsideTeamA);
        displayOffsideForTeamB(offsideTeamB);
        displayFaultForTeamA(faultTeamA);
        displayFaultForTeamB(faultTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * ON CREATE
     * Method to create the Activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * TEAM A GOALS
     * Increase the score for Team A by 1 goal.
     */
    public void addGoalForTeamA(View v) {
        scoreTeamA++;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM A PENALTIES
     * Increase the penalties for Team A by 1 goal in favour.
     */
    public void addPenaltyForTeamA(View v) {
        penaltyTeamA++;
        displayPenaltyForTeamA(penaltyTeamA);
    }

    /**
     * Displays the given penalties for Team A.
     */
    public void displayPenaltyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM A OFFSIDES
     * Increase the offside situations for Team A by 1.
     */
    public void addOffsideForTeamA(View v) {
        offsideTeamA++;
        displayOffsideForTeamA(offsideTeamA);
    }

    /**
     * Displays the given offside situations for Team A.
     */
    public void displayOffsideForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_offside);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM A FAULTS
     * Increase the faults for Team A by 1.
     */
    public void addFaultForTeamA(View v) {
        faultTeamA++;
        displayFaultForTeamA(faultTeamA);
    }

    /**
     * Displays the given faults for Team A.
     */
    public void displayFaultForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fault);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM A YELLOW CARDS
     * Increase the yellow cards for Team A by 1.
     */
    public void addYellowCardForTeamA(View v) {
        yellowCardTeamA++;
        displayYellowCardForTeamA(yellowCardTeamA);
    }

    /**
     * Displays the given yellow cards for Team A.
     */
    public void displayYellowCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM A RED CARDS
     * Increase the red cards for Team A by 1.
     */
    public void addRedCardForTeamA(View v) {
        redCardTeamA++;
        displayRedCardForTeamA(redCardTeamA);
    }

    /**
     * Displays the given red cards for Team A.
     */
    public void displayRedCardForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B
     * Increase the score for Team B by 1 goal.
     */
    public void addGoalForTeamB(View v) {
        scoreTeamB++;
        displayScoreForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B PENALTIES
     * Increase the penalties for Team B by 1 goal in favour.
     */
    public void addPenaltyForTeamB(View v) {
        penaltyTeamB++;
        displayPenaltyForTeamB(penaltyTeamB);
    }

    /**
     * Displays the given penalties for Team B.
     */
    public void displayPenaltyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_penalty);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B OFFSIDES
     * Increase the offside situations for Team B by 1.
     */
    public void addOffsideForTeamB(View v) {
        offsideTeamB++;
        displayOffsideForTeamB(offsideTeamB);
    }

    /**
     * Displays the given offside situations for Team B.
     */
    public void displayOffsideForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_offside);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B FAULTS
     * Increase the faults for Team B by 1.
     */
    public void addFaultForTeamB(View v) {
        faultTeamB++;
        displayFaultForTeamB(faultTeamB);
    }

    /**
     * Displays the given faults for Team B.
     */
    public void displayFaultForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fault);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B YELLOW CARDS
     * Increase the yellow cards for Team B by 1.
     */
    public void addYellowCardForTeamB(View v) {
        yellowCardTeamB++;
        displayYellowCardForTeamB(yellowCardTeamB);
    }

    /**
     * Displays the given yellow cards for Team B.
     */
    public void displayYellowCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * TEAM B RED CARDS
     * Increase the red cards for Team B by 1.
     */
    public void addRedCardForTeamB(View v) {
        redCardTeamB++;
        displayRedCardForTeamB(redCardTeamB);
    }

    /**
     * Displays the given red cards for Team B.
     */
    public void displayRedCardForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * RESET
     * Reset the score for Team A and B to zero.
     */
    public void resetAllMetrics(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        penaltyTeamA = 0;
        penaltyTeamB = 0;
        offsideTeamA = 0;
        offsideTeamB = 0;
        faultTeamA = 0;
        faultTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayPenaltyForTeamA(penaltyTeamA);
        displayPenaltyForTeamB(penaltyTeamB);
        displayOffsideForTeamA(offsideTeamA);
        displayOffsideForTeamB(offsideTeamB);
        displayFaultForTeamA(faultTeamA);
        displayFaultForTeamB(faultTeamB);
        displayYellowCardForTeamA(yellowCardTeamA);
        displayYellowCardForTeamB(yellowCardTeamB);
        displayRedCardForTeamA(redCardTeamA);
        displayRedCardForTeamB(redCardTeamB);
    }

}