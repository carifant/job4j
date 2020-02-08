package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class FindLoopTest {

        @Test
        public void whenArrayHas5Then0() {
            FindLoop find = new FindLoop();
            int[] input = new int[] {5, 10, 3};
            int value = 5;
            int result = find.indexOf(input, value);
            int expect = 0;
            assertThat(result, is(expect));
        }

        @Test
        public void whenArrayHas7Then0() {
            FindLoop find = new FindLoop();
            int[] input = new int[] {5, 10, 3, 7};
            int value = 7;
            int result = find.indexOf(input, value);
            int expect = 3;
            assertThat(result, is(expect));
        }

        @Test
        public void whenArrayHas9Then0() {
            FindLoop find = new FindLoop();
            int[] input = new int[] {5, 10, 3, 7};
            int value = 9;
            int result = find.indexOf(input, value);
            int expect = -1;
            assertThat(result, is(expect));
        }

        @Test
        public void whenFind3() {
            int[] input = new int[] {5, 2, 10, 2, 4};
            int value = 2;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexOf(input, value, start, finish);
            int expect = 3;
            assertThat(result, is(expect));
        }
        @Test
        public void whenFind6() {
            int[] input = new int[] {5, 2, 10, 2, 4};
            int value = 6;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexOf(input, value, start, finish);
            int expect = -1;
            assertThat(result, is(expect));
        }
        @Test
        public void whenFind13() {
            int[] input = new int[] {5, 2, 10, 2, 4, 5, 7, 13, 42};
            int value = 13;
            int start = 2;
            int finish = 8;
            int result = FindLoop.indexOf(input, value, start, finish);
            int expect = 7;
            assertThat(result, is(expect));
        }
}
