package com.example.thehappierapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Complete extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent = getIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complete);

        TextView text = (TextView) findViewById(R.id.placeholder);
        text.setText(DailyChoicesActivity.task.getTask() + "\n" + DailyChoicesActivity.task.getTip());

        Button btn = findViewById(R.id.completeButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.progress ++;
                startActivity(new Intent(Complete.this, MainActivity.class));
            }
        });

        btn = findViewById(R.id.changeTextButton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Complete.this, DailyChoicesActivity.class));
            }
        });
    }
}