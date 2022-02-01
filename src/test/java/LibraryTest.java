import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(5);
        book1 = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
        book2 = new Book("Harry Potter", "JK Rowling", "Fantasy");
        book3 = new Book("It", "Stephen King", "Horror");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void cannotAddBookIfLibraryFull(){
        Library fullLibrary = new Library(1);
        fullLibrary.addBook(book1);
        fullLibrary.addBook(book2);
        assertEquals(1, fullLibrary.getBookCount());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getBookCount());
    }

}
