import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Jamie", "How to Java", "education");
        library.addNewBook(book);
        borrower=new Borrower();    }
    @Test
    public void checkBooksInLibrary(){
        assertEquals(0,library.booksInStock());
    }
    @Test
    public void addNewBook(){
        library.addNewBook(book);
        library.addNewBook(book);
        library.addNewBook(book);
        assertEquals(2,library.booksInStock());
    }
}
