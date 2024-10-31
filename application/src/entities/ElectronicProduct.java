package entities;

public class ElectronicProduct extends Product {
    private String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String details() {
        return String.format("Electronic Product: %s, Brand: %s, Price: %.2f", getName(), brand, getPrice());
    }
}
