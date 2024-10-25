class Book {
    private String isbn;
    private String name;
    private String author;

    public Book(String isbn, String name, String author) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book [ISBN=" + isbn + ", Name=" + name + ", Author=" + author + "]";
    }
}
