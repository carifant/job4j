package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }

    public static void main(String[] args) {
        Product[] products = new Product[4];
        Product bread = new Product("bread", 10);
        Product egg = new Product("egg", 19);
        Product milk = new Product("milk", 5);
        Product meat = new Product("meat", 4);
        products[0] = bread;
        products[1] = egg;
        products[2] = milk;
        products[3] = meat;

        for (Product x : products) {
            if (x != null) {
                System.out.println(x.getName() + " - " + x.getCount());
            }
        }

        System.out.println();
        Shop s = new Shop();
        s.delete(products, 1);
        for (Product x : products) {
            if (x != null) {
                System.out.println(x.getName() + " - " + x.getCount());
            } else {
                System.out.println("null");
            }
        }
    }
}
