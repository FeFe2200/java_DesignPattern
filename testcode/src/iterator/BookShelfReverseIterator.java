package iterator;

public class BookShelfReverseIterator implements Iterator{
    private BookShelf bookShelf;
    private int index;

    public BookShelfReverseIterator(BookShelf temp){
        this.bookShelf = temp;
        this.index = temp.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        if (index >= 0)
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getIndexBook(index);
        index--;
        return book;
    }
}
