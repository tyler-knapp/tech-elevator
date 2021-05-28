package com.techelevator.inventory;

import com.techelevator.items.Item;

import java.util.Map;

public interface InventoryReader {

    Map<String, Item> read();
}
