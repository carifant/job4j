package ru.job4j.collection;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> list = List.of("Petr", "Ivan", "Stepan");
        list.forEach(System.out::println);

    }
}

