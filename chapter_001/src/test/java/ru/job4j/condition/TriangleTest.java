package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point point = new Point(0, 0);
        Point point2 = new Point(0, 2);
        Point point3 = new Point(1, 2);
        Triangle t = new Triangle(point, point2, point3);
        boolean result = t.exist(t);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotExist() {
        Point point = new Point(10, 1);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(1, 2);
        Triangle t = new Triangle(point, point2, point3);
        boolean result = t.exist(t);
        assertThat(result, is(false));
    }
}