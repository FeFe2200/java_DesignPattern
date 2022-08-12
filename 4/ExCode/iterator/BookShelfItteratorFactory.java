package iterator;

public class BookShelfItteratorFactory extends Factory {

    @Override
    protected Iterator createProduct(Aggregate list, int type) {
        if (type == 0) {
            return new BookShelfIterator((BookShelf) list);
        } else if (type ==1) {
            return new BookShelfReverseIterator((BookShelf) list);
        }
        return null;
    }
}
