package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int index = Math.min(left.length(), right.length());
        for (int i = 0; i < index; i++) {
            int temp = left.charAt(i);
            int temp2 = right.charAt(i);
            if (temp > temp2) {
                rsl = 1;
                break;
            } else if (temp < temp2) {
                rsl = -1;
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