package org.example.model;

public class Chocolate extends ProductForSale {
    private String chocolate;
    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.chocolate=chocolate;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
    @Override
    public void showDetails(){
        System.out.println("Chocolate Details:");
        System.out.println("Type:"+getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Name: " + getChocolate());
    }
}
