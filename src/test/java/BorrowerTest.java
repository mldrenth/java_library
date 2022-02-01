import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(5);
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.getCollectionCount());
    }

    @Test
    public void canBorrowBook(){
        library.addBook(book);
        borrower.borrow(library, book);
        assertEquals(1, borrower.getCollectionCount());
        assertEquals(0, library.getBookCount());
    }


}
