package com.example.supermarketsimulation;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<String> wishlist = new ArrayList<>();
    private List<Product> items = new ArrayList<>();
    private String containerType; // "basket" or "shopping cart"
    private int maxCapacity;
    private double money;

    Customer(int id, double money) {
        this.id = id;
        this.name = "Customer-" + id;
        this.money = money;
        this.items = new ArrayList<>();
        this.wishlist = new ArrayList<>();
        this.containerType = "basket";
        this.maxCapacity = 15;
    }

    Customer(int id, double money, String containerType) {
        this.id = id;
        this.name = "Customer-" + id;
        this.money = money;
        this.items = new ArrayList<>();
        this.wishlist = new ArrayList<>();
        this.containerType = containerType;
        this.maxCapacity = containerType.equals("shopping cart") ? 50 : 5;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getWishlist() {
        return wishlist;
    }

    public List<Product> getItems() {
        return items;
    }

    public String getContainerType() {
        return containerType;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getCurrentItemCount() {
        return items.size();
    }

    public boolean canAddMoreItems() {
        return items.size() < maxCapacity;
    }

    public double getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWishlist(List<String> wishlist) {
        this.wishlist = wishlist;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public void setContainerType(String containerType) {
        this.containerType = containerType;
        this.maxCapacity = containerType.equals("shopping cart") ? 50 : 5;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}