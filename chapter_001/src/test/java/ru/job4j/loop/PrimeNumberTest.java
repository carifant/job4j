package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when11() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(11);
        assertThat(count, is(5));
    }

    @Test
    public void when2() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(2);
        assertThat(count, is(1));
    }
    @Test
    public void when23() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(23);
        assertThat(count, is(9));
    }
    @Test
    public void when99() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(99);
        assertThat(count, is(25));
    }
}

