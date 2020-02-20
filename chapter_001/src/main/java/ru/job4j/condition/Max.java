package ru.job4j.condition;

public class Max {


    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = max(first, second);
        return max(temp, third);
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = max(first, second);
        int temp2 = max(third, fourth);
        return max(temp, temp2);
    }
}

