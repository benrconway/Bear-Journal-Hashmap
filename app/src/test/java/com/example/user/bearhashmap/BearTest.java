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
        bear = new Bear("Yogi");
        salmon = new Salmon();
    }

    @Test
    public void testBearHasName(){
        assertEquals("Yogi", bear.getName());
    }

    @Test
    public void testBellyEmpty(){
        assertEquals(0, bear.foodCount());
    }

    @Test
    public void testCanEatSalmon(){
        bear.eat(salmon, "Monday");
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void testCanMakeJournalEntry(){
        bear.eat(salmon, "Monday");
        assertEquals("Monday", )

    }
}


