package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public  void manWeight() {
        int in = 183;
        double expected = 95.44999999999999;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);


    }

    @Test
    public  void womanWeight() {
        int in = 168;
        double expected = 66.69999999999999;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);


    }

}
