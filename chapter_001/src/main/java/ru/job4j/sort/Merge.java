package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int numOfLeft = 0;
        int numOfRight = 0;
        if (left.length == 0) {
            for (int i = 0; i < right.length; i++) {
                rsl[i] = right[i];
            }
            return rsl;
        } else if (right.length == 0) {
            for (int i = 0; i < left.length; i++) {
                rsl[i] = left[i];
            }
            return rsl;
        }
        while (index < rsl.length) {
            if (left[numOfLeft] < right[numOfRight]) {
                rsl[index] = left[numOfLeft];
                numOfLeft++;
                if (numOfLeft == left.length) {
                    for (int i = numOfRight; i < right.length; i++) {
                        rsl[index + 1] = right[i];
                        index++;
                    }
                    break;
                }
            } else {
                rsl[index] = right[numOfRight];
                numOfRight++;
                if (numOfRight == right.length) {
                    for (int i = numOfLeft; i < left.length; i++) {
                        rsl[index + 1] = left[i];
                        index++;
                        break;
                    }
                }
            }
            index++;
        }
        return rsl;
    }


    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
