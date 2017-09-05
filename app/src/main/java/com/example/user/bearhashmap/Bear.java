package com.example.user.bearhashmap;

/**
 * Created by user on 05/09/2017.
 */
import java.util.*;

public class Bear {
    private String name;
    private HashMap<String, Integer> journal;
    private ArrayList<Salmon> belly;


    public Bear(){
        this.belly = new ArrayList<>();
        this.journal = new HashMap<>();
        journal.put("monday", 0);
        journal.put("tuesday", 0);
        journal.put("wednesday", 0);
        journal.put("thursday", 0);
        journal.put("friday", 0);
        journal.put("saturday", 0);
        journal.put("sunday", 0);
    }

    public String getName() {
        return name;
    }

    public int foodCount(){
        return belly.size();
    }


    public HashMap<String, Integer> getJournal() {
        return journal;
    }

    public void eat(Salmon salmon, String dayEaten){
        belly.add(salmon);
        addEntry(dayEaten);
    }

    public int checkJournal(String weekday){
        return journal.get(weekday);
    }

    public void addEntry(String dayOfWeek){
        journal.put(dayOfWeek, journal.get(dayOfWeek) +1);
    }

    public void newWeek(){
        journal.put("monday", 0);
        journal.put("tuesday", 0);
        journal.put("wednesday", 0);
        journal.put("thursday", 0);
        journal.put("friday", 0);
        journal.put("saturday", 0);
        journal.put("sunday", 0);
    }

}