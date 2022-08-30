package composite;

import java.util.ArrayList;
import java.util.List;

public class Category extends ProductCategory{
    private List<ProductCategory> components = new ArrayList<ProductCategory>();
    public Category(int id, String name, int price){
        super(id, name, price);
    }

    @Override
    public void addProduct(ProductCategory product) {
        components.add(product);
    }

    @Override
    public void removeProduct(ProductCategory product) {
        components.remove(product);
    }

    @Override
    public int getCount() {
        return components.size();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        int totalPrice = 0;

        for (ProductCategory c: components) {
            totalPrice += c.getPrice();
        }
        return totalPrice;
    }

    @Override
    public int getId() {
        return 0;
    }
}
