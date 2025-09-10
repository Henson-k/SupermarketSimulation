package com.example.supermarketsimulation;

import javafx.fxml.FXML;

public class Shelf {
    private String shelfName;
    private String shelfProduct;
    private int quantity;
    public Shelf(String shelfName, String shelfProduct, int quantity) {}

    public Shelf(String shelfName, String shelfProduct) {
        this.shelfName = shelfName;
        this.shelfProduct = shelfProduct;
    }
    public String getShelfName() {
        return shelfName;
    }
    public String getShelfProduct() {
        return shelfProduct;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }
    public void setShelfProduct(String shelfProduct) {
        this.shelfProduct = shelfProduct;
    }
    public void setQuantity(int quantity) {}



}
