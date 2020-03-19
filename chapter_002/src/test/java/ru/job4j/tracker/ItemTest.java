package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenOnAlphabetUp() {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Sergey");
        Item item2 = new Item("Andrey");
        Item item3 = new Item("Vasyliy");
        Item item4 = new Item("Oleg");
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        Collections.sort(items);
        List<Item> items2 = new ArrayList<>();
        items2.add(item2);
        items2.add(item4);
        items2.add(item);
        items2.add(item3);
        assertThat(items, is(items2));
    }

    @Test
    public void whenOnAlphabetDown() {
        List<Item> items = new ArrayList<>();
        Item item = new Item("Sergey");
        Item item2 = new Item("Andrey");
        Item item3 = new Item("Vasyliy");
        Item item4 = new Item("Oleg");
        items.add(item);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        Collections.sort(items, new SortByNameItem());
        List<Item> items2 = new ArrayList<>();
        items2.add(item3);
        items2.add(item);
        items2.add(item4);
        items2.add(item2);
        assertThat(items, is(items2));
    }
}