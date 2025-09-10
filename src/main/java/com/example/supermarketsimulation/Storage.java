package com.example.supermarketsimulation;

public class Storage {
    public int quantity;
    public String Product;

    Storage(int quantity, String Product) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getProduct() {
        return Product;
    }
    public void setProduct(String product) {
        this.Product = product;
    }
}
