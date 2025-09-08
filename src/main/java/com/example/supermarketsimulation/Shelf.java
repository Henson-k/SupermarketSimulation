package com.example.supermarketsimulation;

import javafx.fxml.FXML;

public class Shelf {
    private String shelfName;
    private String shelfProduct;

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

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }
    public void setShelfProduct(String shelfProduct) {
        this.shelfProduct = shelfProduct;
    }

}
