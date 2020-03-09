package ru.job4j.tracker;

import org.junit.Test;

import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        Item item = new Item("Fix PC");
        Tracker tracker = new Tracker();
        tracker.add(item);
        List<Item> items = tracker.findAll();
        String created = items.get(0).getName();
        Item expected = new Item("Fix PC");
        assertThat(created, is(expected.getName()));
    }

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("item 1");
        tracker.add(item);
        String answers = item.getId();
        Item item2 = new Item("new item");
        tracker.replace(answers, item2);
        Item replaced = tracker.findById(item.getId());
        assertThat(replaced.getName(), is("new item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("old item");
        tracker.add(item);
        String answers = item.getId();
        tracker.delete(answers);
        Item deleted = tracker.findById(item.getId());
        assertThat(deleted, is(nullValue()));
    }

    @Test
    public void whenExit() {
        ArrayList<String> list = new ArrayList<>();
        list.add("0");
        StubInput input = new StubInput(list);
        StubAction action = new StubAction();
        List<UserAction> actions = new ArrayList<>();
        actions.add(action);
        new StartUI().init(input, new Tracker(), actions);
        assertThat(action.isCall(), is(true));
    }

    @Test
    public void whenPrtMenu() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        List<String> list = new ArrayList<>();
        list.add("0");
        List<UserAction> actions = new ArrayList<>();
        StubAction action = new StubAction();
        actions.add(action);
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInput input = new StubInput(
                list);

      new StartUI().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu.")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
