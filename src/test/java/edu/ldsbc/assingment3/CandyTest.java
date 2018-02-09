package edu.ldsbc.assingment3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class CandyTest {

    @Test
    public void calculateItemCost() {
        Candy candy = (new Candy("Gummy Worms", 1.33, 89));
        assertEquals(118, candy.calculateItemCost());

    }
}