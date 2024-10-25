public class Book {

    private String isbn;
    private String bname;
    private String author;

    public Book(String isbn, String bname, String author) {
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getBname() {
        return bname;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", bname=" + bname + ", author=" + author + "]";
    }

}
