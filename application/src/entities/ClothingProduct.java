package entities;

public class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String details() {
        return String.format("Clothing Product: %s, Size: %s, Price: %.2f", getName(), size, getPrice());
    }
}
