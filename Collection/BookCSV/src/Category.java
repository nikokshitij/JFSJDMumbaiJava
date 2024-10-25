import java.util.List;
import java.util.ArrayList;

class Category {
    private int id;
    private String name;
    private List<Book> books;

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void add_category(Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category: " + name + "\n");
        for (Book book : books) {
            sb.append("  ").append(book).append("\n");
        }
        return sb.toString();
    }
}
