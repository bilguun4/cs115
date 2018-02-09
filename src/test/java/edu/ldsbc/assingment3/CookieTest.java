package edu.ldsbc.assingment3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

public class CookieTest {
    @Test
    public void calculateItemCost() {
        Cookie cookie = (new Cookie("Chocolate Chip Cookies", 4, 399));
        assertEquals(133, cookie.calculateItemCost());

    }

}