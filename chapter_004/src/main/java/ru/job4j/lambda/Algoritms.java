package ru.job4j.lambda;

import java.lang.reflect.Array;

public class Algoritms {


    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 11, 378, 22, 56, 23, 43454, -3, 34, 223};
// сортировка выборкой
        for (int i = 0; i < arr.length; i++) {
            int min = 300000000;
            int index = 0;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
// бинарный поиск элемента
        int guess = 43454;
        int low = 0;
        int high = arr.length - 1;
        int middle = 0;
        while (low <= high) {
            middle = (low + high) / 2;
            if (guess == arr[middle]) {
                System.out.println("вы угадали, загаданное число" + " " + guess);
                break;
            } else if (guess > arr[middle]) {
                low = middle + 1;
            } else if (guess < arr[middle]) {
                high = middle - 1;
            }
            System.out.println("новая попытка");
        }


    }
}
