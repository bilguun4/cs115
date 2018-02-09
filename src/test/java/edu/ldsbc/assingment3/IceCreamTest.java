package edu.ldsbc.assingment3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class IceCreamTest {
    @Test
    public void calculateItemCost() {
        IceCream iceCream = (new IceCream("Strawberry Ice Cream", 145));
        assertEquals(145, iceCream.calculateItemCost());

    }

}