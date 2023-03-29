import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> books;
    private int capacity;


    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 4;
    }

        public int booksInStock() {
        return books.size();
    }

    public void addNewBook(Book book) {
        if (books.size() < capacity) {
            books.add(book);
        }
    }
    public void checkBookOut(Book book){
        books.remove(book);
    }

    public ArrayList<Book> getBookList() {
        return this.books;
    }
}
