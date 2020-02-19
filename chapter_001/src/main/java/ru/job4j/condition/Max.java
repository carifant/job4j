package ru.job4j.condition;

public class Max {


    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int result = max(first, second) > third ? max(first, second) : third;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = max(first, second, third) > fourth ? max(first, second, third) : fourth;
        return result;
    }
}

