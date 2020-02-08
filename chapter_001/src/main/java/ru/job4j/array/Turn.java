package ru.job4j.array;

import org.w3c.dom.ls.LSOutput;

public class Turn {


        public static int[] back(int[] array) {

                for (int i = 0; i < array.length/2; i++) {
                    int temp = array[i];
                    array[i] = array[array.length - i - 1];
                    array[array.length - i - 1] = temp;
            }
            return array;
        }

    }

