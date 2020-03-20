package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] words = left.split("\\D+");
        String[] words2 = right.split("\\D+");
        int first = Integer.parseInt(words[0]);
        int second = Integer.parseInt(words2[0]);
        return Integer.compare(first, second);

    }
}