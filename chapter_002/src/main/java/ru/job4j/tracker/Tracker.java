package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Tracker {
    private List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        for (int index = 0; index < items.size(); index++) {
            Item name = items.get(index);
            if (name.getName().equals(key)) {
                list.add(name);
            }
        }
        return list;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }


    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(String id, Item item) {
        boolean b = false;
        int i = indexOf(id);
        if (i != -1) {
            items.add(i, item);
            items.get(i).setId(id);
            b = true;
        }
        return b;
    }

    public boolean delete(String id) {
        boolean b = false;
        int i = indexOf(id);
        if (i != -1) {
            items.remove(i);
            b = true;
        }
        return b;
    }
}

