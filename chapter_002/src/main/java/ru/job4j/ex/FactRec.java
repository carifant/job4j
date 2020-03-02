package ru.job4j.ex;

public class FactRec {
    public static int calc(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = calc(-3);
        System.out.println(rsl);
    }
}

