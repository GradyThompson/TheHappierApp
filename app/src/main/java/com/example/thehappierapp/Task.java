package com.example.thehappierapp;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Task {
    String tip;
    String task;
    static String jsonFile = "app/questions.json";
    public static Map<Integer, List<String>> easyMap = new HashMap<>();
    public static Map<Integer, List<String>> mediumMap = new HashMap<>();
    public static Map<Integer, List<String>> hardMap = new HashMap<>();
    public static int easyIndex = 0;
    public static int mediumIndex = 0;
    public static int hardIndex = 0;

    public void makeMaps() {
        List<String> list1 = new ArrayList<>();
        list1.add("Hug someone in need");
        list1.add("Make sure you know the person first ;)");
        easyMap.put(1,list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Buy the person behind you in line a coffee");
        list2.add( "Buy yourself one too!");
        mediumMap.put(1,list2);
        List<String> list3 = new ArrayList<>();
        list3.add("Call someone you haven't spoken to in a while");
        list3.add( "Call back in an hour if they don't pick up the first time");
        hardMap.put(1,list3);
        List<String> list4 = new ArrayList<>();
        list4.add("Compliment a stranger");
        list4.add( "Is it their smile? Their top? Their aura?");
        mediumMap.put(2,list4);
        List<String> list5 = new ArrayList<>();
        list5.add("Text your best friend how much they mean to you");
        list5.add("Add a heart emoji if you're really feeling it");
        mediumMap.put(3,list5);
        List<String> list6 = new ArrayList<>();
        list6.add( "Spend 10 minutes meditating today");
        list6.add( "Look for an app or YouTube video if you need guidance");
        hardMap.put(2,list6);
        List<String> list7 = new ArrayList<>();
        list7.add("Hold a door open for someone today");
        list7.add("Bonus points if you smile :)");
        easyMap.put(2,list7);
        List<String> list8 = new ArrayList<>();
        list8.add("Tell a stranger to have a great day");
        list8.add("In line at the grocery store? Sitting next to someone on a bus?");
        mediumMap.put(4,list8);
        List<String> list9 = new ArrayList<>();
        list9.add( "Leave a large tip");
        list9.add("20%???? 25%???");
        mediumMap.put(5,list9);
        List<String> list10 = new ArrayList<>();
        list10.add("Leave a large tip accompanied by a nice note or conversation");
        list10.add("Make your server feel appreciated");
        hardMap.put(3,list10);
        List<String> list11 = new ArrayList<>();
        list11.add("Offer to do an errand for a friend in need");
        list11.add("Basically be Cinderella for an hour or two");
        hardMap.put(4,list11);
        List<String> list12 = new ArrayList<>();
        list12.add( "Make a donation in honour of someone important to you");
        list12.add( "$5-10 is enough :)");
        mediumMap.put(6,list12);
        List<String> list13 = new ArrayList<>();
        list13.add( "Help a stranger carry something");
        list13.add( "A grocery bag? A heavy box?");
        easyMap.put(3,list13);
        List<String> list14 = new ArrayList<>();
        list14.add("Give up your seat on the bus");
        list14.add("Look for someone who might need it");
        mediumMap.put(7,list14);
        List<String> list15 = new ArrayList<>();
        list15.add("Bake for a friend in need");
        list15.add("Chocolate chip cookies sound good!");
        hardMap.put(5,list15);
        List<String> list16 = new ArrayList<>();
        list16.add("Go for coffee with a friend");
        list16.add("Bonus if you pay for their coffee too");
        easyMap.put(4,list16);
        List<String> list17 = new ArrayList<>();
        list17.add("Call a relative you haven't spoken to in a while");
        list17.add("Ask about their day and update them on any exciting news in your life");
        easyMap.put(5,list17);
        
    }

    public Task(String difficulty) {
        Map<Integer, List<String>> map;
        makeMaps();
        int index = 0;
       if (difficulty.equals("easy")) {
           map = easyMap;
           if(easyIndex >= easyMap.size()) {
               easyIndex = 0;
           }
           index = ++easyIndex;
       } else if(difficulty.equals("medium")) {
           if(mediumIndex >= mediumMap.size()) {
               mediumIndex = 0;
           }
           map = mediumMap;
           index = ++mediumIndex;
       } else {
           map = hardMap;
           if(hardIndex >= hardMap.size()) {
               hardIndex = 0;
           }
           index = ++hardIndex;
       }
       int length = map.size();
     //  Random value = new Random(length);
       int value = (int)Math.random()%length + 1;
       //int val = value.nextInt(length);
       List<String> taskMap = map.get(index);
       this.task = taskMap.get(0);
       this.tip = taskMap.get(1);
    }

/*
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
    }*/


    public String getTask() {
        return this.task;
    }


    public String getTip() {
        return this.tip;
    }


}
