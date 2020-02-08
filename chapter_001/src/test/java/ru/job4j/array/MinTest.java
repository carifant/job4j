package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[]{0, 5, 10}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[]{10, 5, 3}), is(3));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[]{10, 2, 5}), is(2));
    }

    @Test
    public void when72Min() {
        assertThat(Min.findMin(new int[]{10, 2, 5, 44, -3, 0 , -72}), is(-72));
    }

    @Test
    public void when17Min() {
        assertThat(Min.findMin(new int[]{10, 2, 5, 3, 22, -17, 45}), is(-17));
    }
}