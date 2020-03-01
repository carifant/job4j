package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("Вывожу хранящиеся заявки");
        Item[] item = tracker.findAll();
        for (Item x : item) {
            System.out.println(x.getName() + " - " + x.getId());
        }
        return true;
    }
}