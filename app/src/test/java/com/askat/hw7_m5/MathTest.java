package com.askat.hw7_m5;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {

   Math math;

    @Before
    public void setUp() {
        math = new Math();
    }

    @Test
    public void simpleAdd() {
        assertEquals("4", math.add("2", "2"));
    }

    @Test
    public void AddWithSpaces() {
        assertEquals("4", math.add("2", "2      "));
    }

    @Test
    public void AddWithLetters() {
        assertEquals("Буквы вводить нельзя!", math.add( "2", "2aksmcsjvndkjvn"));
    }

    @Test
    public void AddWithMinus() {
        assertEquals("Отрицательные числа нельзя!", math.add("2", "-2"));
    }

    @Test
    public void AddWithNull() {
        assertEquals("Пустоту скидывать нельзя", math.add("2", null));
    }

    @Test
    public void simpleDivide(){
        assertEquals("2", math.divide("6", "3"));
    }

    @Test
    public void divideZero(){
        assertEquals("На ноль делить нельзя!", math.divide( "6", "0"));
    }

    @Test
    public void divideSpaces() {
        assertEquals("2", math.divide("6", "3      "));
    }

    @Test
    public void divideLetters() {
        assertEquals("Буквы вводить нельзя!", math.divide("2", "2aksmcsjvndkjvn"));
    }

    @Test
    public void divideMinus() {
        assertEquals("Отрицательные числа нельзя!", math.divide("2", "-2"));
    }

    @Test
    public void divideNull() {
        assertEquals("Пустоту скидывать нельзя", math.divide("2", null));
    }

    @After
    public void detach() {
        math = null;
    }
}
