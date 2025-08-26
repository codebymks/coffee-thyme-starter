package ek.ianb.coffeethyme.model;

import java.util.UUID;

public class CoffeeOrder {
    private String coffeeType;
    private String coffeeSize;
    private String milkType;
    private UUID orderId = UUID.randomUUID();

    public CoffeeOrder() {
    }

    public CoffeeOrder(String coffeeType, String coffeeSize, String milkType) {
        this.coffeeType = coffeeType;
        this.coffeeSize = coffeeSize;
        this.milkType = milkType;
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeType(String coffeeType) {
        this.coffeeType = coffeeType;
    }

    public String getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(String coffeeSize) {
        this.coffeeSize = coffeeSize;
    }

    public String getMilkType() {
        return milkType;
    }

    public void setMilkType(String milkType) {
        this.milkType = milkType;
    }

    public UUID getOrderId() {
        return orderId;
    }

}
