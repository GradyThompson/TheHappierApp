package com.example.thehappierapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DailyChoicesActivity extends AppCompatActivity {

    private String button1;
    private String button2;
    private String button3;
    public static CharSequence task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_choices_menu);

        List<Task> list;

            Task task1 = new Task(MainActivity.difficulty);
            Task task2 = new Task(MainActivity.difficulty);
            Task task3 = new Task(MainActivity.difficulty);

        button1 = task1.task;
        Button buttonChoice1 = (Button) findViewById(R.id.button_choice1);
        buttonChoice1.setText(button1);
        button2 = task2.task;
        Button buttonChoice2 = (Button) findViewById(R.id.button_choice2);
        buttonChoice2.setText(button2);
        button3 = task3.task;
        Button buttonChoice3 = (Button) findViewById(R.id.button_choice3);
        buttonChoice3.setText(button3);

        final Button finalBtn1 = buttonChoice1;

        buttonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = finalBtn1.getText();
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        final Button finalBtn2 = buttonChoice2;

        buttonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = finalBtn2.getText();
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        final Button finalBtn3 = buttonChoice3;

        buttonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                task = finalBtn3.getText();
                startActivity(new Intent(DailyChoicesActivity.this, Complete.class));
            }
        });

        Button btn = findViewById(R.id.button_no_task);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DailyChoicesActivity.this, MainActivity.class));
            }
        });
    }
}
