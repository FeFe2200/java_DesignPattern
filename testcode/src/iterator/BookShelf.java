package iterator;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int maxCount;
    private int index = 0;

    public BookShelf(int num){
        this.maxCount = num;
        this.books = new Book[this.maxCount];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Iterator iterator(int type) {
        Factory factory = new BookShelfItteratorFactory();
        return factory.createProduct(this, type);
    }

    public int getLength()
    {
        return index;
    }

    public Book getIndexBook(int num){
        if (num >= this.maxCount)
            return null;
        return books[num];
    }

    public void appendBook(Book book){
        this.books[index] = book;
        index++;
    }

}
