package com.example.v8t5;

public class Receipt {

    private String name;
    private String manufacturer;
    private double total_energy;
    private float price;
    private String volume;

    public Receipt(String n, float p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getEnergy(){
        return total_energy;
    }

    public String getSize() {
        return volume;
    }

    public float getCost() {
        return price;
    }

}
