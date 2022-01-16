package com.example.a531gymplanner;

import androidx.appcompat.app.AppCompatActivity;
import com.example.a531gymplanner.R;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Set1RM extends AppCompatActivity {
    private boolean doubleBackToExitPressedOnce = false, showWarningToast = true;
    Button saveRM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set1_rm);
        SharedPreferences prefs;
        prefs = PreferenceManager.getDefaultSharedPreferences(this);
        saveRM = findViewById(R.id.saveRM);
        saveRM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText squat1RM = findViewById(R.id.squat1RM);
                EditText bench1RM = findViewById(R.id.bench1RM);
                EditText deadlift1RM = findViewById(R.id.deadlift1RM);

                float squatMax = Float.parseFloat(squat1RM.getText().toString()); // must get it as string first then can parse it to double value
                float benchMax = Float.parseFloat(bench1RM.getText().toString());
                float deadliftMax = Float.parseFloat(deadlift1RM.getText().toString());
                SharedPreferences.Editor editor = prefs.edit();
                editor.putFloat("squatMax", squatMax);
                editor.putFloat("benchMax", benchMax);
                editor.putFloat("deadliftMax", deadliftMax);

                editor.apply();

                startActivity(new Intent(Set1RM.this, HomePage.class));
            }
        });

    }

}