package ru.job4j.test;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void sectionsGroping() {
        Set<String> units = new HashSet<>(Set.of("Плавание", "бег", "коньки"));
        Set<String> units2 = new HashSet<>(Set.of("Плавание", "бег", "бильярд"));
        Set<String> units3 = new HashSet<>(Set.of("шахматы", "конный спорт"));
        List<Student> students = new ArrayList<Student>(List.of(new Student("Vasia", units)
                , new Student("Alex", units2)
                , new Student("Oleg", units3)));

        Map<String, Set<String>> result = Group.sections(students);
        Map<String, Set<String>> is = new HashMap<String, Set<String>>(Map.of("Плавание", Set.of("Vasia", "Alex")
                , "бег", Set.of("Vasia", "Alex")
                , "коньки", Set.of("Vasia")
                , "бильярд", Set.of("Alex")
                , "шахматы", Set.of("Oleg")
                , "конный спорт", Set.of("Oleg")));
        assertThat(result, is(is));
    }
}