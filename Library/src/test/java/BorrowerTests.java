import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTests {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before() {
        library = new Library();
        book = new Book("Jamie", "How to Java", "education");
        library.addNewBook(book);
        borrower=new Borrower();
    }

    @Test
    public void checkBooksBorrowerHas() {
        assertEquals(0, borrower.booksOutOfLibrary());
    }
    @Test
    public void checkBookOut(){
        borrower.checkBookOut(book);
        library.checkBookOut(book);
        assertEquals(1,borrower.booksOutOfLibrary());
        assertEquals(0,library.booksInStock());
    }
    @Test
    public void returnBook(){
        borrower.returnBook(book);
        library.addNewBook(book);
        assertEquals(0,borrower.booksOutOfLibrary());
    }
}
