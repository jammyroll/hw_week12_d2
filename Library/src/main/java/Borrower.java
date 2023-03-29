import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower(){
        this.books=new ArrayList<>();
    }


    public int booksOutOfLibrary() {
        return this.books.size();
    }

    public void checkBookOut(Book book) {
        books.add(book);
    }

    public void returnBook(Book book) {
        books.remove(book);
    }
}
