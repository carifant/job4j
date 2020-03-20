package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityUp() {
        Comparator<Job> cmpNamePriority = new JobUpByName().thenComparing(new JobUpByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> temp = new JobDescByName();
        int rsl = temp.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorUpByName() {
        Comparator<Job> temp = new JobUpByName();
        int rsl = temp.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorUpByPriority() {
        Comparator<Job> temp = new JobUpByPriority();
        int rsl = temp.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> temp = new JobDescByPriority();
        int rsl = temp.compare(new Job("Impl task", 0), new Job("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
}