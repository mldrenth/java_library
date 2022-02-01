import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> listOfBooks;
    private HashMap<String, Integer> genreOverview;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.listOfBooks = new ArrayList<Book>();
        this.genreOverview = new HashMap<String, Integer>();
    }

    public int getBookCount() {
        return this.listOfBooks.size();
    }

    public void addBook(Book book) {
        if (this.hasSpace()) this.listOfBooks.add(book);
        updateOverview(book);
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

    public void updateOverview(Book bookToUpdate) {
        int counter = 0;
        String genre = bookToUpdate.getGenre();
        for (Book book : this.listOfBooks){
            if (genre.equals(book.getGenre())) {
                counter++;
            }
        }
        genreOverview.put(genre, counter);

    }

    public int getAmountPerGenre(String genre) {
        return genreOverview.get(genre);
    }

    public HashMap<String, Integer> getOverview() {
        return this.genreOverview;
    }
}
