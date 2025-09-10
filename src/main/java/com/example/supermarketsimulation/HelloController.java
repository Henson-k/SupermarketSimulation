package com.example.supermarketsimulation;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import java.util.*;

public class HelloController {
    @FXML
    private Pane rootPane;

    private int customerCounter = 0;


    @FXML
    public void initialize() {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(5), e -> spawnCustomer())
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();



    }
    public void spawnCustomer() {
        customerCounter++;

        // basket of container
        String[] containerType = {"basket", "shopping cart"};
        Random rand = new Random();
        int n =  rand.nextInt(2);
        String container = containerType[n];

        // Wish list maken voor basket of shopping cart
        String[] Groceries = {"apple", "pizza", "chips", "coca-cola", "batteries", "magazines", "soap" };

        Random rand1 = new Random();
        Random amountItemsBasket = new Random();
        int amountB = amountItemsBasket.nextInt(5);
        List<String> wishList = new ArrayList<>();


        Random amountItemsShoppingCart = new Random();
        int amountSC = amountItemsShoppingCart.nextInt(15);
        //geen lege basket of shopping cart
        if(amountB == 0){
            amountB++;
        }
        if(amountSC == 0){
            amountSC++;
        }

        //Wish list for basket
        if(n == 0){
            for(int i = 0; i < amountB; i++){
                int n1 = rand1.nextInt(7);
                wishList.add(Groceries[n1]);
            }

        }
        //Wish list for shopping cart
        else{
            for(int i = 0; i < amountSC; i++){
                int n1 = rand1.nextInt(7);
                wishList.add(Groceries[n1]);
            }
        }

        Collections.sort(wishList);



        Customer c = new Customer(customerCounter, 1000, container, wishList);

        System.out.println("Customer " + customerCounter + " created" + " , WishList: " + wishList);
        System.out.println("Container type: " + container);

        rootPane.getChildren().add(c.getView());
    }


}
