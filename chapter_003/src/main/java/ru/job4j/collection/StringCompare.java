package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int index = left.length() + right.length();
        for (int i = 0; i < index; i++) {
            if (i == left.length() && i == right.length()) {
                break;
            }
            if (i == left.length()) {
                rsl = -1;
                break;
            }
            if (i == right.length()) {
                rsl = 1;
                break;
            }
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
        return rsl;
    }
}