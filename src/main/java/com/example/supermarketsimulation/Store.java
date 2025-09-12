package com.example.supermarketsimulation;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Shelf> shelves = new ArrayList<>();


    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }
    public List<Shelf> getShelves() {
        return shelves;
    }
}
