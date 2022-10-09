package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22tom22then4() {
        double expected = 4;
        int x1 = 2;
        int y1 = -2;
        int x2 = -2;
        int y2 = -2;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22tom210then8() {
        double expected = 8;
        int x1 = 2;
        int y1 = 2;
        int x2 = 2;
        int y2 = 10;
        double out = new Point(x1, y1).distance(new Point(x2, y2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus2Minus45toMinus200then6dot4() {
        double expected = 6.4;
        int x1 = -2;
        int y1 = -4;
        int z1 = 5;
        int x2 = -2;
        int y2 = 0;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to000then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int z1 = 0;
        int z2 = 0;
        double out = new Point(x1, y1, z1).distance3d(new Point(x2, y2, z2));
        Assert.assertEquals(expected, out, 0.01);
    }
}