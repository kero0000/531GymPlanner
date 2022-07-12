package com.example.a531gymplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewPlan extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_plan);

        Button week1, week2, week3, deload, nextcycle, prevcycle;
        week1 = findViewById(R.id.week1);
        week2 = findViewById(R.id.week2);
        week3 = findViewById(R.id.week3);
        deload = findViewById(R.id.deload);
        nextcycle = findViewById(R.id.nextcycle);
        prevcycle = findViewById(R.id.prevcycle);

        week1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPlan.this, PlanDetails.class);
                intent.putExtra("weekPlan", 1);
                startActivity(intent);
            }
        });
        week2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPlan.this, PlanDetails.class);
                intent.putExtra("weekPlan", 2);
                startActivity(intent);
            }
        });
        week3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPlan.this, PlanDetails.class);
                intent.putExtra("weekPlan", 3);
                startActivity(intent);
            }
        });
        deload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ViewPlan.this, PlanDetails.class);
                intent.putExtra("weekPlan", 4);
                startActivity(intent);
            }
        });
        nextcycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextCycle();
                Toast.makeText(ViewPlan.this, "Good Job! On to the next cycle!", Toast.LENGTH_SHORT).show();
            }
        });

        prevcycle.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prevCycle();
                Toast.makeText(ViewPlan.this, "Previous cycle", Toast.LENGTH_SHORT).show();
            }
        }));

    }

    private void nextCycle() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        squatMax += 5;
        benchMax += 5;
        deadliftMax += 5;

        editor.putFloat("squatMax", squatMax);
        editor.putFloat("benchMax", benchMax);
        editor.putFloat("deadliftMax", deadliftMax);

        editor.apply();
    }

    private void prevCycle() {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = prefs.edit();

        float squatMax = prefs.getFloat("squatMax", 0);
        float benchMax = prefs.getFloat("benchMax", 0);
        float deadliftMax = prefs.getFloat("deadliftMax", 0);

        squatMax -= 5;
        benchMax -= 5;
        deadliftMax -= 5;

        editor.putFloat("squatMax", squatMax);
        editor.putFloat("benchMax", benchMax);
        editor.putFloat("deadliftMax", deadliftMax);

        editor.apply();
    }

}
