package org.example;

public class Motorcycle {

    private String brand;
    private String type;
    private String number;

    public Motorcycle(String brand, String type, String number) {
        this.brand = brand;
        this.type = type;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
