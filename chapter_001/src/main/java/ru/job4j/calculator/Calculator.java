package ru.job4j.calculator;

/**
 * Класс для вычисления арифмитических операций. + - * /.
 * @author Alexei Katyshev
 * @since 27.01.20
 * @version 1.0
 *
 */

public class Calculator {

    /**
     * Method can add two numbers.
     * @param first - the first number.
     * @param second - the second number.
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Method can divide  numbers.
     * @param first - the first number.
     * @param second - the second number.
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    /**
     * Method can multiply  numbers.
     * @param first - the first number.
     * @param second - the second number.
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    /**
     * Method can subtract  numbers.
     * @param first - the first number.
     * @param second - the second number.
     */
    public static void subtract(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }
    /**
     * main method .
     * @param args - args.
     */
    public static void main(String[] args) {

        add(1,1);
        div(4,2);
        multiply(3,2);
        subtract(19,9);

    }
}
