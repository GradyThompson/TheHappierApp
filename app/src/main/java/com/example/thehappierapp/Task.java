package com.example.thehappierapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Task {
    String tip;
    String level;
    String task;
    boolean complete;
    static String jsonFile = "app/questions.json";

    public Task(String task, String level, String tip, boolean complete) {
        this.task = task;
        this.level = level;
        this.tip = tip;
        this.complete = false;
    }

    public static List<Task> getTaskList() throws JSONException {
        JSONObject reader = new JSONObject(jsonFile);
        List<Task> taskList = new ArrayList<>();
        JSONArray taskArray = reader.getJSONArray("array");
        for (int i = 0; i < taskArray.length(); i++) {
            JSONObject event = taskArray.getJSONObject(i);
            String tip = event.get("tip").toString();
            String level = event.get("level").toString();
            String task = event.get("task").toString();
            boolean complete = event.get("complete").equals(true);

            taskList.add(new Task(task, level, tip, complete));
        }
        return taskList;
    }

    public static List<Task> filter(String level) throws JSONException {
        List<Task> generalTasks = getTaskList();
        generalTasks.stream()
                .filter(x -> x.getLevel().equals(level) && !x.isCompleted())
                .limit(3);

        return generalTasks;
    }


    public String getTask() {
        return this.task;
    }

    public String getLevel() {
        return this.level;
    }

    public String getTip() {
        return this.tip;
    }

    public boolean isCompleted() {
        return this.complete;
    }

}
