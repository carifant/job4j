package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        String x;
        for (int i = 0; i < value.length; i++) {
            x = value[i];
            if (x.equals(key)) {
                System.out.println("Элемент найден");
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не был найден в массиве");

        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] names = {"Василий", "Дмитрий", "Александр"};
        try {
            indexOf(names, "Вадим");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}