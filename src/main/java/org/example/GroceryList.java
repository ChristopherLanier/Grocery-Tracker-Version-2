package org.example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GroceryList {

    Map<String, GroceryItem> groceryList = new HashMap<>();


    public void addItem(GroceryItem itemToAdd ) {
        groceryList.put(itemToAdd.getName(), itemToAdd);
    }

    public GroceryItem findItem(String itemName) {
        return groceryList.get(itemName);
    }


    public Collection<GroceryItem> getAllItems() {
        return groceryList.values();
    }


    public void removeItem(String itemToRemoveName) {
        groceryList.remove(itemToRemoveName);
    }

    public void applySale(String department, double salePercentage) {
        for(GroceryItem item : groceryList.values()){
            if(item.getDepartment().equals(department)){
               item.applySale(salePercentage);
            }
        }
    }
}
