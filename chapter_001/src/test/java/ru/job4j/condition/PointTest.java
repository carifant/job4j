package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int in = 5;
        int in2 = 4;
        int in3 = 1;
        int in4 = 3;
        double expected = 4.123105625617661;
        double out = Point.distance(in, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
