package com.izaanschool.ifelse;

// InventoryItem - A class representing an inventory item with properties like name, quantity, and location.
// Declare the Class Name: InventoryItem
public class InventoryItem {

    // Declare Main Method
    public static void main(String[] args) {
        // Print Hello From InventoryItem Class!

        // Declaring variables and initializing it with a value
        int quantity = 5;

        // Declare if-else Conditions:  using integer
        if(quantity < 10){
            // Code to execute if condition is true
            System.out.println("Inventory Items  has to be less  than 10!");
        }else{
            // Code to execute if condition is false
            System.out.println("Inventory Items are now : "+quantity);
        }


    }
}