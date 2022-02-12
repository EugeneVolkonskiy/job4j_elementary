package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
    double expected = 2;
    int x1 = 0;
    int x2 = 0;
    int y1 = 2;
    int y2 = 0;
    double out = Point.distance(x1, y1, x2, y2);
    assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46to312then6dot0827() {
        double expected = 6.0827;
        int x1 = 4;
        int x2 = 3;
        int y1 = 6;
        int y2 = 12;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3221to6517then33dot2415() {
        double expected = 33.2415;
        int x1 = 32;
        int x2 = 65;
        int y1 = 21;
        int y2 = 17;
        double out = Point.distance(x1, y1, x2, y2);
        assertEquals(expected, out, 0.01);
    }
}