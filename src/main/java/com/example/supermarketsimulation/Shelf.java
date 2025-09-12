package com.example.supermarketsimulation;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.shape.Rectangle;

public class Shelf {
    private int id;
    private Product product;
    private Rectangle node;
    public static String[] existingGroceries = {
            "apple", "pizza", "chips", "coca_cola", "batteries", "magazines", "soap"
    };

    public Shelf(int id, Product product, Rectangle node) {
        this.id = id;
        this.product = product;
        this.node = node;
    }
    public int getId() {
        return id;
    }
    public Product getProduct() {
        return product;
    }
    public Rectangle getNode() {
        return node;
    }



}
