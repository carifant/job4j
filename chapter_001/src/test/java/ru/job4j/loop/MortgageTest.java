package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000, 1200, 1);
        assertThat(year, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(100, 120, 50);
        assertThat(year, is(2));
    }
    @Test
    public void when4Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(300, 120, 20);
        assertThat(year, is(4));
    }
    @Test
    public void when5Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(1000000, 300000, 12);
        assertThat(year, is(5));
    }
    @Test
    public void when14Year() {
        Mortgage mortgage = new Mortgage();
        int year = mortgage.year(4000000, 500000, 8);
        assertThat(year, is(14));
    }
}
