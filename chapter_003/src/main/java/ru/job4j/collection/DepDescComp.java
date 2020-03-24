package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] temp = o1.split("/");
        String[] temp2 = o2.split("/");
        int index = Math.min(temp.length, temp2.length);
        int result = temp2[0].compareTo(temp[0]);
        if (result == 0) {
            for (int i = 1; i < index; i++) {
                result = temp[i].compareTo(temp2[i]);
                if (result != 0) {
                    break;
                }
            }
        }
        if (result == 0) {
            if (o1.length() != o2.length()) {
                result = o1.length() > o2.length() ? 1 : -1;


            }
        }
        return result;
    }
}