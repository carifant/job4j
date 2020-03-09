package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> item = tracker.findAll();
        for (Item x : item) {
            System.out.println(x.getName() + " " + x.getId());
        }
        return true;
    }
}