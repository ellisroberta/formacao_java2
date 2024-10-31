package entities;

public class FoodProduct extends Product {
    private String expirationDate;

    public FoodProduct(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public String details() {
        return String.format("Food Product: %s, Expiration Date: %s, Price: %.2f", getName(), expirationDate, getPrice());
    }
}
