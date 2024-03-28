package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Chocolate("Milk Chocolate", 3, "Smooth and creamy");
        products[1] = new Coke("Soda", 2, "Refreshing cola drink");
        products[2] = new Bread("Whole Wheat Bread", 4, "Healthy bread option");

        listProducts(products);

    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println();
        };

    }
}