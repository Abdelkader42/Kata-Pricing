package entity;

enum Measurment {
    Weight, Unit
}
public class Product {
    String name;
    Measurment measurment;

    public Product() {
    }

    public Product(String name, Measurment measurment) {
        this.name = name;
        this.measurment = measurment;
    }

    public String getName() {
        return name;
    }

    public Measurment getMeasurment() {
        return measurment;
    }
}
