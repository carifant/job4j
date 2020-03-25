package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] temp = o1.split("/");
        String[] temp2 = o2.split("/");
        int result = temp2[0].compareTo(temp[0]);
        if (result == 0) {
            result = o1.compareTo(o2);
        }
        return result;
    }
}