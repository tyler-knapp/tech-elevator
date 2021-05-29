package com.techelevator;

import com.techelevator.inventory.Inventory;
import com.techelevator.items.Item;

import java.util.Map;

public class Store {

    private Inventory inventory = new Inventory();

    public Map<String, Item> getInventory() {
        return inventory.getItems();
    }
}
