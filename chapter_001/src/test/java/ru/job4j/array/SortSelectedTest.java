package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void when3Sort() {
        int[] input = new int[] {9,-16, 22};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-16,9,22};
        assertThat(result, is(expect));
    }
    @Test
    public void when5Sort() {
        int[] input = new int[] {2,17,3,9,-3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-3,2,3,9,17};
        assertThat(result, is(expect));
    }
}