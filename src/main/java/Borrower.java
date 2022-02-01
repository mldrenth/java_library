import java.util.ArrayList;

public class Borrower {

    ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public int getCollectionCount() {
        return this.collection.size();
    }

    public void addToCollection(Book book){
        this.collection.add(book);
    }

    public void borrow(Library library, Book book) {
        Book bookToBorrow = library.removeBook(book);
        this.collection.add(bookToBorrow);
        library.updateOverview(book);
    }
}
