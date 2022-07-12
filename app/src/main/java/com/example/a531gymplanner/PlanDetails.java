package com.example.a531gymplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class PlanDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_details);

        int weekPlan = getIntent().getExtras().getInt("weekPlan");
        switch(weekPlan){
            case 1:
                week1();
                break;
            case 2:
                week2();
                break;
            case 3:
                week3();
                break;
            case 4:
                deload();
                break;

        }
    }

    private void week1(){
        TextView squatPlanDetails = findViewById(R.id.squatPlanDetails);
        TextView benchPlanDetails = findViewById(R.id.benchPlanDetails);
        TextView deadliftPlanDetails = findViewById(R.id.deadliftPlanDetails);
        TextView squatPlanText = findViewById(R.id.squatPlanText);
        TextView benchPlanText = findViewById(R.id.benchPlanText);
        TextView deadliftPlanText = findViewById(R.id.deadliftPlanText);
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        double squatMax50 = calculateWeight(0.5, squatMax);
        double squatMax60 = calculateWeight(0.6, squatMax);
        double squatMax65 = calculateWeight(0.65, squatMax);
        double squatMax75 = calculateWeight(0.75, squatMax);
        double squatMax85 = calculateWeight(0.85, squatMax);

        double benchMax50 = calculateWeight(0.5, benchMax);
        double benchMax60 = calculateWeight(0.6, benchMax);
        double benchMax65 = calculateWeight(0.65, benchMax);
        double benchMax75 = calculateWeight(0.75, benchMax);
        double benchMax85 = calculateWeight(0.85, benchMax);

        double deadliftMax50 = calculateWeight(0.5, deadliftMax);
        double deadliftMax60 = calculateWeight(0.6, deadliftMax);
        double deadliftMax65 = calculateWeight(0.65, deadliftMax);
        double deadliftMax75 = calculateWeight(0.75, deadliftMax);
        double deadliftMax85 = calculateWeight(0.85, deadliftMax);

        // put numbers on screen
        String squatText = "5x "+(int)squatMax50+"\n3x "+(int)squatMax60+"\n5x "+(int)squatMax65+"\n5x "+(int)squatMax75+"\n5x "+(int)squatMax85+"\n5+ "+(int)squatMax65;
        squatPlanDetails.setText(squatText);

        String benchText = "5x "+(int)benchMax50+"\n3x "+(int)benchMax60+"\n5x "+(int)benchMax65+"\n5x "+(int)benchMax75+"\n5x "+(int)benchMax85+"\n5+ "+(int)benchMax65;
        benchPlanDetails.setText(benchText);

        String deadliftText = "5x "+(int)deadliftMax50+"\n3x "+(int)deadliftMax60+"\n5x "+(int)deadliftMax65+"\n5x "+(int)deadliftMax75+"\n5x "+(int)deadliftMax85+"\n5+ "+(int)deadliftMax65;
        deadliftPlanDetails.setText(deadliftText);

        //put max on screen too
        squatPlanText.setText("Squat Plan: "+squatMax);
        benchPlanText.setText("Bench Plan: "+benchMax);
        deadliftPlanText.setText("Deadlift Plan: "+deadliftMax);

    }
    private void week2(){
        TextView squatPlanDetails = findViewById(R.id.squatPlanDetails);
        TextView benchPlanDetails = findViewById(R.id.benchPlanDetails);
        TextView deadliftPlanDetails = findViewById(R.id.deadliftPlanDetails);
        TextView squatPlanText = findViewById(R.id.squatPlanText);
        TextView benchPlanText = findViewById(R.id.benchPlanText);
        TextView deadliftPlanText = findViewById(R.id.deadliftPlanText);
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        double squatMax50 = calculateWeight(0.5, squatMax);
        double squatMax60 = calculateWeight(0.6, squatMax);
        double squatMax70 = calculateWeight(0.7, squatMax);
        double squatMax80 = calculateWeight(0.8, squatMax);
        double squatMax90 = calculateWeight(0.9, squatMax);

        double benchMax50 = calculateWeight(0.5, benchMax);
        double benchMax60 = calculateWeight(0.6, benchMax);
        double benchMax70 = calculateWeight(0.7, benchMax);
        double benchMax80 = calculateWeight(0.8, benchMax);
        double benchMax90 = calculateWeight(0.9, benchMax);

        double deadliftMax50 = calculateWeight(0.5, deadliftMax);
        double deadliftMax60 = calculateWeight(0.6, deadliftMax);
        double deadliftMax70 = calculateWeight(0.7, deadliftMax);
        double deadliftMax80 = calculateWeight(0.8, deadliftMax);
        double deadliftMax90 = calculateWeight(0.9, deadliftMax);




        // put numbers on screen
        String squatText = "5x "+(int)squatMax50+"\n3x "+(int) squatMax60+"\n3x "+(int)squatMax70+"\n3x "+(int)squatMax80+"\n3x "+(int)squatMax90+"\n5+ "+(int)squatMax70;
        squatPlanDetails.setText(squatText);

        String benchText = "5x "+(int)benchMax50+"\n3x "+(int)benchMax60+"\n3x "+(int) benchMax70+"\n3x "+(int)benchMax80+"\n3x "+(int)benchMax90+"\n5+ "+(int)benchMax70;
        benchPlanDetails.setText(benchText);

        String deadliftText = "5x "+(int)deadliftMax50+"\n3x "+(int)deadliftMax60+"\n3x "+(int)deadliftMax70+"\n3x "+(int)deadliftMax80+"\n3x "+(int)deadliftMax90+"\n5+ "+(int)deadliftMax70;
        deadliftPlanDetails.setText(deadliftText);

        //put max on screen too
        squatPlanText.setText("Squat Plan: "+squatMax);
        benchPlanText.setText("Bench Plan: "+benchMax);
        deadliftPlanText.setText("Deadlift Plan: "+deadliftMax);
    }
    private void week3(){
        TextView squatPlanDetails = findViewById(R.id.squatPlanDetails);
        TextView benchPlanDetails = findViewById(R.id.benchPlanDetails);
        TextView deadliftPlanDetails = findViewById(R.id.deadliftPlanDetails);
        TextView squatPlanText = findViewById(R.id.squatPlanText);
        TextView benchPlanText = findViewById(R.id.benchPlanText);
        TextView deadliftPlanText = findViewById(R.id.deadliftPlanText);
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        double squatMax50 = calculateWeight(0.5, squatMax);
        double squatMax60 = calculateWeight(0.6, squatMax);
        double squatMax75 = calculateWeight(0.75, squatMax);
        double squatMax85 = calculateWeight(0.85, squatMax);
        double squatMax95 = calculateWeight(0.95, squatMax);

        double benchMax50 = calculateWeight(0.5, benchMax);
        double benchMax60 = calculateWeight(0.6, benchMax);
        double benchMax75 = calculateWeight(0.75, benchMax);
        double benchMax85 = calculateWeight(0.85, benchMax);
        double benchMax95 = calculateWeight(0.95, benchMax);

        double deadliftMax50 = calculateWeight(0.5, deadliftMax);
        double deadliftMax60 = calculateWeight(0.6, deadliftMax);
        double deadliftMax75 = calculateWeight(0.75, deadliftMax);
        double deadliftMax85 = calculateWeight(0.85, deadliftMax);
        double deadliftMax95 = calculateWeight(0.95, deadliftMax);

        // put numbers on screen
        String squatText = "5x "+(int)squatMax50+"\n5x "+(int)squatMax60+"\n5x "+(int)squatMax75+"\n3x "+(int)squatMax85+"\n1x "+(int)squatMax95+"\n5+ "+(int)squatMax75;
        squatPlanDetails.setText(squatText);

        String benchText = "5x "+(int)benchMax50+"\n5x "+(int)benchMax60+"\n5x "+(int)benchMax75+"\n3x "+(int)benchMax85+"\n1x "+(int)benchMax95+"\n5+ "+(int)benchMax75;
        benchPlanDetails.setText(benchText);

        String deadliftText = "5x "+(int)deadliftMax50+"\n5x "+(int)deadliftMax60+"\n5x "+(int)deadliftMax75+"\n3x "+(int)deadliftMax85+"\n1x "+(int)deadliftMax95+"\n5+ "+(int)deadliftMax75;
        deadliftPlanDetails.setText(deadliftText);

        //put max on screen too
        squatPlanText.setText("Squat Plan: "+squatMax);
        benchPlanText.setText("Bench Plan: "+benchMax);
        deadliftPlanText.setText("Deadlift Plan: "+deadliftMax);

    }
    private void deload(){
        TextView squatPlanDetails = findViewById(R.id.squatPlanDetails);
        TextView benchPlanDetails = findViewById(R.id.benchPlanDetails);
        TextView deadliftPlanDetails = findViewById(R.id.deadliftPlanDetails);
        TextView squatPlanText = findViewById(R.id.squatPlanText);
        TextView benchPlanText = findViewById(R.id.benchPlanText);
        TextView deadliftPlanText = findViewById(R.id.deadliftPlanText);
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        double squatMax50 = calculateWeight(0.5, squatMax);
        double squatMax65 = calculateWeight(0.65, squatMax);

        double benchMax50 = calculateWeight(0.5, benchMax);
        double benchMax65 = calculateWeight(0.65, benchMax);

        double deadliftMax50 = calculateWeight(0.5, deadliftMax);
        double deadliftMax65 = calculateWeight(0.65, deadliftMax);

        // put numbers on screen
        String squatText = "5x "+(int)squatMax50+"\n5x "+(int)squatMax65;
        squatPlanDetails.setText(squatText);

        String benchText = "5x "+(int)benchMax50+"\n5x "+(int)benchMax65;
        benchPlanDetails.setText(benchText);

        String deadliftText = "5x "+(int)deadliftMax50+"\n5x "+(int)deadliftMax65;
        deadliftPlanDetails.setText(deadliftText);

        //put max on screen too
        squatPlanText.setText("Squat Plan: "+squatMax);
        benchPlanText.setText("Bench Plan: "+benchMax);
        deadliftPlanText.setText("Deadlift Plan: "+deadliftMax);


    }

    double calculateWeight(double percentage, float liftMax){
        return liftMax*percentage*0.9;
    }

}