package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(3, calculator.add(1, 2));
        assertEquals(0, calculator.add(1, -1));
        assertNotEquals(25, calculator.add(4, 6));

    }

    @Test
    public void minus() throws Exception  {
        Calculator calculator = new Calculator();

        assertEquals (3, calculator.minus(5,2));
        assertEquals (0, calculator.minus(1,1));
        assertNotEquals(25,calculator.minus(4,6));

    }

    @Test
    public void divide() throws Exception  {
        Calculator calculator = new Calculator();

        assertEquals (3, calculator.divide(6,2));
        assertEquals (2, calculator.divide(2,1));
        assertNotEquals(25,calculator.divide(12,6));

    }

    @Test
    public void multiply() throws Exception  {
        Calculator calculator = new Calculator();

        assertEquals (4, calculator.multiply(2,2));
        assertEquals (0, calculator.multiply(1,0));
        assertNotEquals(25,calculator.multiply(4,6));

    }

}