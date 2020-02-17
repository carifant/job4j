package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int iLeft = 0;
        int iRight = 0;
        while (iLeft + iRight < rsl.length) {
            if (iLeft == left.length) {
                rsl[index] = right[iRight++];
                index++;
                continue;
            }
            if (iRight == right.length) {
                rsl[index] = left[iLeft++];
                index++;
                continue;
            }
            if (left[iLeft] < right[iRight]) {
                rsl[index] = left[iLeft++];
            } else {
                rsl[index] = right[iRight++];
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
