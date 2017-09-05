package com.example.user.bearhashmap;

/**
 * Created by user on 05/09/2017.
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class BearTest {

    Bear bear;
    Salmon salmon;

    @Before
    public void before() {
        bear = new Bear();
        salmon = new Salmon();
    }

    @Test
    public void testBellyEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void testCanEatSalmon(){
        bear.eat(salmon, "monday");
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void bearHasWeekDayMap(){
        assertEquals(0, bear.checkJournal("monday") );
    }

    @Test
    public void testCanMakeJournalEntry(){
        bear.eat(salmon, "monday");
        assertEquals(1, bear.checkJournal("monday"));
    }

    @Test
    public void testMakesManyEntries(){
        bear.eat(salmon, "monday");
        bear.eat(salmon, "monday");
        bear.eat(salmon, "wednesday");
        bear.eat(salmon, "thursday");
        assertEquals(2, bear.checkJournal("monday"));
        assertEquals(1, bear.checkJournal("wednesday"));
        assertEquals(1, bear.checkJournal("thursday"));
    }

    @Test
    public void testNewWeek(){
        bear.eat(salmon, "monday");
        bear.eat(salmon, "wednesday");
        bear.eat(salmon, "thursday");
        bear.newWeek();
        assertEquals(0, bear.checkJournal("monday"));
        assertEquals(0, bear.checkJournal("wednesday"));
        assertEquals(0, bear.checkJournal("thursday"));
    }
}


