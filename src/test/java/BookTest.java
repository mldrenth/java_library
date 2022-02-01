import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Lord of the Rings", "JRR Tolkien", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Lord of the Rings", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("JRR Tolkien", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }



}
