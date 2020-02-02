package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow((x2 - x1),2);
        double second = Math.pow((y2 - y1),2);
        return Math.sqrt(first+second);
    }

    public static void main(String[] args) {
        double result = Point.distance(2, 3, 2, 2);
        System.out.println("result (2, 3) to (2, 2) " + result);
        double result2 = Point.distance(5, 4, 1, 3);
        System.out.println("result (5, 4) to (1, 3) " + result2);
        double result3 = Point.distance(3, 1, 3, 3);
        System.out.println("result (3, 1) to (3, 3) " + result3);
    }
}
