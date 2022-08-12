package iterator;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.iterator(0);
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }

        Iterator reit = bookShelf.iterator(1);
        while (reit.hasNext()) {
            Book book = (Book)reit.next();
            System.out.println("" + book.getName());
        }
    }
}
