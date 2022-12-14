package org.example;



public class GroceryItem {

    private String name;
    private String department;
    private double price;

    public String getDepartment() {

        return department;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {

        return price;
    }

    public GroceryItem(String name, String department, double price) {
        this.name = name;
        this.department = department;
        this.price = price;
    }


    public void applySale(double salePercentage) {

        this.price -= this.price*salePercentage;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", price=" + price +
                '}';
    }
}
