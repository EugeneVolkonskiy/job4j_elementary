package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to312then6dot0827() {
        Point a = new Point(4, 6);
        Point b = new Point(3, 12);
        double expected = 6.0827;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3221to6517then33dot2415() {
        Point a = new Point(32, 21);
        Point b = new Point(65, 17);
        double expected = 33.2415;
        double out = a.distance(b);
        assertEquals(expected, out, 0.01);
    }
}