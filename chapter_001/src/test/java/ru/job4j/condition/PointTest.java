package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point point = new Point(0, 0);
        Point point2 = new Point(0, 2);
        double expected = 2.0;
        double out = point.distance(point2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
