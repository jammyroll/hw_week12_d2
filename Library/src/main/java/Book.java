public class Book {

    private String Title;
    private String Author;
    private String Genre;

    public Book(String author, String title, String genre){
        this.Author=author;
        this.Title=title;
        this.Genre=genre;

    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

}
