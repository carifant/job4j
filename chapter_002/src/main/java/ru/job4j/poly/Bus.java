package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("I am going");
    }

    @Override
    public void passengers(int count) {
        int passengers = count;
    }

    @Override
    public int fill(int quantity) {
        int price = 42;
        return quantity * price;
    }
}
