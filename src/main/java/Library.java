import java.util.ArrayList;

public class Library {

    private ArrayList<Book> listOfBooks;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        listOfBooks = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.listOfBooks.size();
    }

    public void addBook(Book book1) {
        if (this.hasSpace()) this.listOfBooks.add(book1);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean hasSpace(){
        return this.capacity > this.listOfBooks.size();
    }

    public Book removeBook(Book book) {
        int indexToRemove = listOfBooks.indexOf(book);
        return listOfBooks.remove(indexToRemove);
    }
}
