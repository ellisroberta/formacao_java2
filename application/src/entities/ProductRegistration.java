package entities;

import java.util.ArrayList;
import java.util.List;

public class ProductRegistration implements ProductInterface {
    private List<Product> products;

    public ProductRegistration() {
        this.products = new ArrayList<>();
    }

    @Override
    public void registerProduct(Product product) {
        products.add(product);
        System.out.println("Product registered successfully: " + product.details());
    }

    public List<Product> getProducts() {
        return products;
    }
}
