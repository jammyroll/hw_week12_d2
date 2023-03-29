import java.util.HashMap;

public class LibraryHashMap {
    private Library library;
    private Book book;
    private Borrower borrower;

    public static void main(String[] args) {

        Book help=new Book("Jamie","Help","horror");
        Book helpMe = new Book("Jamie","Help me","horror");
        Book smiles = new Book("Jamie","smile","selfHelp");
        Book smiler = new Book("Jamie","smile","selfHarm");

        Library library = new Library();
        library.addNewBook(help);
        library.addNewBook(helpMe);
        library.addNewBook((smiler));
        library.addNewBook(smiles);
        HashMap<String,Book> bookCollection = new HashMap<>();
        for(Book book:  library.getBookList()) {
            String genre = book.getGenre().toString();
            bookCollection.put(genre,book);
        }
        for(Book book : bookCollection.values()){
            System.out.println(book.getGenre());
        }
    }
}
