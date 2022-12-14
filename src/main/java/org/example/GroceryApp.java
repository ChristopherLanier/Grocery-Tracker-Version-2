package org.example;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class GroceryApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GroceryList myGroceryList = new GroceryList();

        GroceryItem vitamins = new GroceryItem("Vitamins", "Pharmacy", 5);
        GroceryItem milk = new GroceryItem("Milk", "Dairy", 4);
        GroceryItem creamer = new GroceryItem("creamer", "Dairy", 2);

        myGroceryList.addItem(vitamins);
        myGroceryList.addItem(milk);
        myGroceryList.addItem(creamer);

        System.out.println("Welcome to GroceryTracker");
        System.out.println("Press 1 to see the items on your list");
        System.out.println("Press 2 to add an item to your list");
        System.out.println("Press 3 to remove an item from your list");
        System.out.println("Press 4 to make items go on sale");
        System.out.println("Press 5 to exit");
        String userChoice = input.nextLine();

        while (!userChoice.equals("5")) {
            if (userChoice.equals("1")) {
                System.out.println(myGroceryList.getAllItems());
            } else if (userChoice.equals("2")) {
                System.out.println("Enter the name of the item");
                String itemToAddName = input.nextLine();
                System.out.println("Enter the department");
                String itemToAddDepartment = input.nextLine();
                System.out.println("Enter the price");
                double itemToAddPrice = input.nextDouble();
                GroceryItem itemToAdd = new GroceryItem(itemToAddName, itemToAddDepartment, itemToAddPrice);
                myGroceryList.addItem(itemToAdd);
                input.nextLine();
            } else if (userChoice.equals("3")) {
                System.out.println("Enter the name of the item");
                String itemToRemoveName = input.nextLine();
                myGroceryList.removeItem(itemToRemoveName);
            } else if (userChoice.equals("4")) {
                System.out.println("Enter the department");
                String department = input.nextLine();
                System.out.println("Enter the sale percentage as a decimal");
                double salePercentage = input.nextDouble();
                myGroceryList.applySale(department, salePercentage);
                input.nextLine();
            } else {
                System.out.println("Invalid option try again...");
            }
            System.out.println("Welcome to GroceryTracker");
            System.out.println("Press 1 to see the items on your list");
            System.out.println("Press 2 to add an item to your list");
            System.out.println("Press 3 to remove an item from your list");
            System.out.println("Press 4 to make items go on sale");
            System.out.println("Press 5 to exit");
            userChoice = input.nextLine();
        }
        System.out.println("Thank you for using GroceryTracker");
    }
}