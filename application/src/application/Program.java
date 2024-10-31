package application;

import entities.*;

public class Program {
    public static void main(String[] args) {
        ProductRegistration registration = new ProductRegistration();

        ElectronicProduct electronic = new ElectronicProduct("Smartphone", 1200.00, "Samsung");
        FoodProduct food = new FoodProduct("Rice", 20.00, "2023-12-31");
        ClothingProduct clothing = new ClothingProduct("T-Shirt", 40.00, "M");

        registration.registerProduct(electronic);
        registration.registerProduct(food);
        registration.registerProduct(clothing);

        System.out.println("\nRegistered Products:");
        for (Product product : registration.getProducts()) {
            System.out.println(product.details());
        }
    }
}