package com.example.thehappierapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DailyChoicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_choices_menu);

        Button btn = findViewById(R.id.button_choice1);
        final Button finalBtn1 = btn;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.placeholder);
                text.setText(finalBtn1.getText());
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_choice2);
        final Button finalBtn2 = btn;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.placeholder);
                text.setText(finalBtn2.getText());
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_choice3);
        final Button finalBtn3 = btn;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = (TextView) findViewById(R.id.placeholder);
                text.setText(finalBtn3.getText());
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        btn = findViewById(R.id.button_no_task);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, MainActivity.class));
            }
        });
    }
}
