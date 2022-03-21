package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2To1Then3() {
        int a = 3;
        int b = 2;
        int c = 1;
        int result = Max.max(a, b, c);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void whenMax4To3To2To1Then4() {
        int a = 4;
        int b = 3;
        int c = 2;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 4;
        assertEquals(result, expected);
    }
}
