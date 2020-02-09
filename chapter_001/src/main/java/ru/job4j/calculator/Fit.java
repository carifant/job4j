package ru.job4j.calculator;

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }
    //Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.

    //Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.

    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(183);
        System.out.println("The best weight for Man 183 is " + man);
        double woman = womanWeight(168);
        System.out.println("The best weight for Woman 168 is " + woman);
    }
}
