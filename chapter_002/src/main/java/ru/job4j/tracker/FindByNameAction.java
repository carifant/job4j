package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Введите имя заявки, которую необходимо найти");
        List<Item> items = tracker.findByName(name);
        for (Item x : items) {
            System.out.println(x.getName() + " " + x.getId());
        }
        return true;
    }
}

