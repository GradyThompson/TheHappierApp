package com.example.thehappierapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DailyChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_choices_menu);

        Button btn = findViewById(R.id.button_choice1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_choice2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_choice3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_no_task);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });
    }
}
