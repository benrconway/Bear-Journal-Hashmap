package com.example.user.bearhashmap;

/**
 * Created by user on 05/09/2017.
 */
import java.util.*;

public class Bear {
    private String name;
    private HashMap<String, Salmon> journal;
    private ArrayList<Salmon> belly;



    public Bear(String name){
        this.name = name;
        this.journal = new HashMap<>();
        this.belly = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int foodCount(){
        return belly.size();
    }

    public void eat(Salmon salmon, String dayEaten){
        belly.add(salmon);
        journal.put(dayEaten, salmon);
    }
}
