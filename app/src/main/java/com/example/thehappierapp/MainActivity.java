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

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String button1;
    private String button2;
    private String button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.easy);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Task> list;
                try {
                    list = Task.filter("easy");
                } catch (Exception e) {
                    throw new RuntimeException();
                }
                button1 = list.get(1).task;
                Button buttonChoice1 = (Button) findViewById(R.id.button_choice1);
                buttonChoice1.setText(button1);
                button2 = list.get(2).task;
                Button buttonChoice2 = (Button) findViewById(R.id.button_choice2);
                buttonChoice2.setText(button2);
                button3 = list.get(3).task;
                Button buttonChoice3 = (Button) findViewById(R.id.button_choice3);
                buttonChoice3.setText(button3);
                MainActivity.this.startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

        btn = findViewById(R.id.medium);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Task> list;
                try {
                    list = Task.filter("medium");
                } catch (Exception e) {
                    throw new RuntimeException();
                }
                button1 = list.get(1).task;
                Button buttonChoice1 = (Button) findViewById(R.id.button_choice1);
                buttonChoice1.setText(button1);
                button2 = list.get(2).task;
                Button buttonChoice2 = (Button) findViewById(R.id.button_choice2);
                buttonChoice2.setText(button2);
                button3 = list.get(3).task;
                Button buttonChoice3 = (Button) findViewById(R.id.button_choice3);
                buttonChoice3.setText(button3);
                startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

        btn = findViewById(R.id.hard);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<Task> list;
                try {
                    list = Task.filter("hard");
                } catch (Exception e) {
                    throw new RuntimeException();
                }
                button1 = list.get(1).task;
                Button buttonChoice1 = (Button) findViewById(R.id.button_choice1);
                buttonChoice1.setText(button1);
                button2 = list.get(2).task;
                Button buttonChoice2 = (Button) findViewById(R.id.button_choice2);
                buttonChoice2.setText(button2);
                button3 = list.get(3).task;
                Button buttonChoice3 = (Button) findViewById(R.id.button_choice3);
                buttonChoice3.setText(button3);
                startActivity(new Intent(MainActivity.this, DailyChoicesActivity.class));
            }
        });

    }
}
