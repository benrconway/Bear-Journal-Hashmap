package com.example.user.bearhashmap;

/**
 * Created by user on 05/09/2017.
 */
import java.util.*;

public class Bear {
    private HashMap<String, Integer> journal;
    private ArrayList<Salmon> belly;


    public Bear(){
        this.belly = new ArrayList<>();
        this.journal = new HashMap<>();
        this.newWeek();
    }

    public int foodCount(){
        return belly.size();
    }

    public void eat(Salmon salmon, String dayEaten){
        belly.add(salmon);
        addToEntry(dayEaten);

        // if (!journal.containsKey(day)){
        // int newCount = journal.get(day) + 1;
        // journal.put(day, newCount);
        // }
    }

    public int checkJournal(String weekday){
        return journal.get(weekday);
    }

    public void addToEntry(String dayOfWeek){
        journal.put(dayOfWeek, journal.get(dayOfWeek) +1);
    }

    public void newWeek(){
        journal.clear(); //To be sure that it will clear and restart//
        journal.put("monday", 0);
        journal.put("tuesday", 0);
        journal.put("wednesday", 0);
        journal.put("thursday", 0);
        journal.put("friday", 0);
        journal.put("saturday", 0);
        journal.put("sunday", 0);
    }
// Iterating over the hashmap.
//    public void resetJournal(){
//        for (String day: journal.keySet()){
//            journal.put(day, 0);
//        }
//    }
}