package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point point = new Point(1, 3);
        Point point2 = new Point(4, 2);
        Point point3 = new Point(4, 3);
        Triangle t = new Triangle(point, point2, point3);
       double result = t.area(t);
        assertThat(result, is(1.5000000000000007));
    }

    @Test
    public void whenNotExist() {
        Point point = new Point(10, 1);
        Point point2 = new Point(1, 2);
        Point point3 = new Point(1, 2);
        Triangle t = new Triangle(point, point2, point3);
        double result = t.area(t);
        assertThat(result, is(-1.0));
    }
}