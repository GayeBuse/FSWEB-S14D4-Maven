package org.example.model;

public class Coke extends ProductForSale {
    private String coke;
    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.coke=coke;

    }

    public String getCoke() {
        return coke;
    }

    public void setCoke(String coke) {
        this.coke = coke;
    }
    @Override
    public void showDetails(){
        System.out.println("Coke Details:");
        System.out.println("Type:"+getType());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Name: " +getCoke() );
    }
}
