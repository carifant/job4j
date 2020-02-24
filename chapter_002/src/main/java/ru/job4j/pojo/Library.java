package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book book = new Book("World and peace", 1000);
        Book book2 = new Book("Alice", 300);
        Book book3 = new Book("Clean code", 250);
        Book book4 = new Book("The first day", 500);

        Book[] arr = new Book[4];
        arr[0] = book;
        arr[1] = book2;
        arr[2] = book3;
        arr[3] = book4;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " - " + arr[i].getCount());
        }
        System.out.println();
        Book temp = arr[0];
        arr[0] = arr[3];
        arr[3] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " - " + arr[i].getCount());
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals("Clean code")) {
                System.out.println(arr[i].getName() + " - " + arr[i].getCount());
            }
        }
    }

}
