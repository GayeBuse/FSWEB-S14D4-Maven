package org.example.model;

public class Bread extends ProductForSale {
    private String brand;
    public Bread(String type, int price, String description) {
        super(type, price, description);
        this.brand=brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public void showDetails(){
        System.out.println("Brand Details:");
        System.out.println("Type:"+getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Name: " + getBrand()  );
    }
}
