package com.techelevator.inventory;

import com.techelevator.items.Item;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<String, Item> items;

    public Inventory() {
        InventoryReader reader = new MemoryInventoryReader();
        items = reader.read();
    }

    public Map<String, Item> getItems() {
        return items;
    }

    public void remove(Item item) {

    }
}
