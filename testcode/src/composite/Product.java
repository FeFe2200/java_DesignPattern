package composite;

public class Product extends ProductCategory{
    public Product(int id, String name, int price){
        super(id, name, price);
    }

    @Override
    public void addProduct(ProductCategory product) {
    }

    @Override
    public void removeProduct(ProductCategory product) {
    }

    @Override
    public int getCount() {
        return 1;
    }

    public String getName() {
        return name;
    }

    public int getPrice(){
        return price;
    }
    public int getId() {
        return id;
    }

}
