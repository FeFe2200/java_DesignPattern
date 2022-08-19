package abstractFactory;

public class ProductOracleDao extends ProductDao{
    Product product;

    public void insertProduct(Product temp) {
        product = temp;
    }

    public void updateProduct(Product temp) {
        product = temp;
    }

    public void deleteProduct(Product temp) {
        product = null;
    }
}
