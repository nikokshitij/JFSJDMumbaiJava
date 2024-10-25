import java.util.List;
import java.util.ArrayList;

public class Category {

    private int id;
    private String Cname;
    private List<Book> cbookList;

    public Category(int id, String cname) {
        this.id = id;
        this.Cname = cname;
        this.cbookList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getCname() {
        return Cname;
    }

    public List<Book> getCbookList() {
        return cbookList;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", Cname=" + Cname + ", cbookList=" + cbookList + "]";
    }

    public void add_category(Book b) {
        this.cbookList.add(b);
    }

    public void addBook(Book book) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addBook'");
    }

}
