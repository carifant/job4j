package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class LambdaFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        LambdaFunction lambdaFunction = new LambdaFunction();
        List<Double> result = lambdaFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadroFunctionThenQuadroResults() {
        LambdaFunction lambdaFunction = new LambdaFunction();
        List<Double> result = lambdaFunction.diapason(2, 4, x -> 2 * Math.pow(x, 2) + 2 * x + 2);
        List<Double> expected = Arrays.asList(14D, 26D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenThirdFunctionThenThirdResults() {
        LambdaFunction lambdaFunction = new LambdaFunction();
        List<Double> result = lambdaFunction.diapason(2, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D);
        assertThat(result, is(expected));
    }

}