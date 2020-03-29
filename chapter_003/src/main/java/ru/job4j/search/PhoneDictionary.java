package ru.job4j.search;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                ArrayList<String> list = new ArrayList<>();
                list.add(person.getSurname());
                list.add(person.getAddress());
                list.add(person.getName());
                list.add(person.getPhone());
                return list.contains(key);
            }
        };
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
