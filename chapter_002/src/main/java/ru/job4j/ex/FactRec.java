package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int i;
        if (n == 0 || n == 1) {
            i = 1;
        } else {
            i = n * n;
        }
        return i;
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}

