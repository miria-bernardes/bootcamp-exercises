package com.bootcamp.exercises.classone.productsale;

public class Purchase {

    private SelectedProduct products [] = new SelectedProduct[100];
    private int quantity;
    private double amount;

    public SelectedProduct[] getProducts() {
        return products;
    }

    public void setProducts(SelectedProduct[] products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void calcAmount(SelectedProduct selectedProduct) {
        this.amount = this.amount + (selectedProduct.getProduct().getPrice() * selectedProduct.getQuantity());
    }

    public  void addProduct(SelectedProduct product) {
        products[quantity] = product;
        calcAmount(product);
        quantity++;
    }
}
