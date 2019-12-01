package com.example.thehappierapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.fragment.app.DialogFragment;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String difficulty;
    public static int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.easy);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.streak_bar);
        progressBar.setProgress(progress);
        TextView streaks = (TextView) findViewById(R.id.streak_num);
        String streak;
        if (progress != 1) {
            streak = (progress + " points");
        } else {
            streak = (progress + " point");
        }
        streaks.setText(streak);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficulty = "easy";
                MainActivity.this.startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

        btn = findViewById(R.id.medium);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficulty = "medium";
                startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

        btn = findViewById(R.id.hard);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                difficulty = "hard";
                startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

    }
}
