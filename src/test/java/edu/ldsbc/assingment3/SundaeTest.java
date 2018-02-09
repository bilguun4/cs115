package edu.ldsbc.assingment3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class SundaeTest {
    @Test
    public void calculateItemCost() {
        Sundae sundae = (new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
        assertEquals(155, sundae.calculateItemCost());

    }

}