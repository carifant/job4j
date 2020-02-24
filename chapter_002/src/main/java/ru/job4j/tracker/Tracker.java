package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item name = items[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            Item name = items[index];
            if (name.getName().equals(key)) {
                result[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }

    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            Item x = items[i];
            if (x.getId().equals(id)) {
                return x;
            }
        }
        return null;
    }
}

