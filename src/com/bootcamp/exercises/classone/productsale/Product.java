package com.bootcamp.exercises.classone.productsale;

public class Product {

    private int id;
    private String name = "";
    private double price = 0.0;

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }


    public Product[] getListProducts() {
        Product[] products = {
                new Product(0, "Feijao", 6.40),
                new Product(1, "Arroz", 4.40),
                new Product(2, "Macarrao", 4.40),
                new Product(3, "Linguica", 3.40)
        };

        return products;
    }

}
