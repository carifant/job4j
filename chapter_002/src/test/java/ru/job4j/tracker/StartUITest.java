package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenAddItem() {
        Item item = new Item("Fix PC");
        Tracker tracker = new Tracker();
        tracker.add(item);
        Item[] items = tracker.findAll();
        String created = items[0].getName();
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
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] { action });
        assertThat(action.isCall(), is(true));
    }
}
