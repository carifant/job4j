package ru.job4j.streams;

import org.junit.Test;
import ru.job4j.lambda.LambdaFunction;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void whenArrayReMake() {
        Integer[][] array = {{-9, 1, 0}, {4, 1, 1}, {-2, 2, -1}};
        List<Integer> result = new Matrix().reMakeArraysToList(array);
        List<Integer> expected = Arrays.asList(-9, 1, 0, 4, 1, 1, -2, 2, -1);
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayReMake2() {
        Integer[][] array = {{-9, 1, 0}, {0, 0, 0}};
        List<Integer> result = new Matrix().reMakeArraysToList(array);
        List<Integer> expected = Arrays.asList(-9, 1, 0, 0, 0, 0);
        assertThat(result, is(expected));
    }
}