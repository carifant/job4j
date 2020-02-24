package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int count = 11;
        Scanner input = new Scanner(System.in);

        while (count > 0) {
            System.out.println("Заберите от одной до трех спичек.");
            int i = Integer.valueOf(input.nextInt());
            count = count - i;
            System.out.println("Осталось " + count + " спичек.");
        }
    }
}
