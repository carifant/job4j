package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public  static int euroToRuble(int value) {
        return value * 70;
    }

    public  static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);
        int dollar = rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");

        int in3 = 10;
        int expected3 = 700;
        int out3 = euroToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("10 euro are 700. Test result : " + passed3);
        int rubles1 = euroToRuble(10);
        System.out.println("10 euro are " + rubles1 + " rubles.");

        int in4 = 9;
        int expected4 = 540;
        int out4 = dollarToRuble(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("9 dollars are 540. Test result : " + passed4);
        int rubles2 = dollarToRuble(9);
        System.out.println("9 dollar are " + rubles2 + " rubles.");
    }
}
