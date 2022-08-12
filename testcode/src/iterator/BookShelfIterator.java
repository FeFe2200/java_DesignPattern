package iterator;

public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf temp){
        this.bookShelf = temp;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getIndexBook(index);
        index++;
        return book;
    }
}
