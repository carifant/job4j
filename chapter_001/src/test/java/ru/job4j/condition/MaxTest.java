package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;



public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then1() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }
    @Test
    public void whenMax2equal1() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }
    @Test
    public void whenMax13max3() {
        int result = Max.max(4, 8, 13);
        assertThat(result, is(13));
    }
    @Test
    public void whenMax15max4() {
        int result = Max.max(14, 4, 15, -6);
        assertThat(result, is(15));
    }
}