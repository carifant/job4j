package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


public class LambdaFunction {

    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (Double i = (double) start; i < end; i++) {
            result.add(func.apply(i));
        }
        return result;
    }
}


