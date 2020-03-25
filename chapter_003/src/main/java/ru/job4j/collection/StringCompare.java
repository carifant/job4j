package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int index = Math.min(left.length(), right.length());
        for (int i = 0; i < index; i++) {
            rsl = Character.compare(left.charAt(i), right.charAt(i));
            if (rsl != 0) {
                break;
            }
        }
        return rsl == 0 && left.length() != right.length() ? left.length() > right.length() ? 1 : -1 : rsl;
    }
}


