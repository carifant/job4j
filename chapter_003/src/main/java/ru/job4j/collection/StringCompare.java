package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int index = Math.min(left.length(), right.length());
        for (int i = 0; i < index; i++) {
            char temp = left.charAt(i);
            char temp2 = right.charAt(i);
            rsl = Character.compare(temp, temp2);
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            if (left.length() != right.length()) {
                rsl = left.length() > right.length() ? 1 : -1;
            }
        }
        return rsl;
    }
}