package com.example.supermarketsimulation;


import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import java.util.*;


public class HelloController {
    @FXML
    private Pane rootPane;

    @FXML
    private Circle waypoint1;

    //Shelf's rectangles
    @FXML private Rectangle appleShelf;
    @FXML private Rectangle batteriesShelf;
    @FXML private Rectangle chipsShelf;
    @FXML private Rectangle pizzaShelf;
    @FXML private Rectangle coca_colaShelf;
    @FXML private Rectangle magazineShelf;
    @FXML private Rectangle soapShelf;

    private Store store;

    private CustomerManager customerManager;


    @FXML
    public void initialize() {
        CustomerManager customerManager = new CustomerManager(this);
        customerManager.spawnCustomer();
    }

    public Pane getRootPane() {
        return rootPane;
    }
    public Circle getWaypoint1() {
        return waypoint1;
    }
}
