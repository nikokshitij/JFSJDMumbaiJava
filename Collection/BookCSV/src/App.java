import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Category> cList = new ArrayList<>();
        Category c1 = new Category(1, "Education");
        Category c2 = new Category(2, "Sport");
        Category c3 = new Category(3, "Drama");
        Category c4 = new Category(4, "Cultural");

        cList.add(c1);
        cList.add(c2);
        cList.add(c3);
        cList.add(c4);

        // Load the books from the CSV file
        loadBooksFromCSV("book_csv.csv", cList);

        // Display all categories and books
        printDetail(cList);
    }

    public static void loadBooksFromCSV(String fileName, List<Category> cList) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            int categoryIndex = 0;
            int booksPerCategory = 2; // Assume first 2 entries go to one category, adjust as needed
            int bookCounter = 0;

            while ((line = br.readLine()) != null) {
                // Skip blank lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                // Split the line by commas to extract book details
                String[] details = line.split(",");
                String isbn = details[0].trim();
                String bookName = details[1].trim();
                String author = details[2].trim();

                // Create a new Book object
                Book book = new Book(isbn, bookName, author);

                // Add the book to the current category
                cList.get(categoryIndex).add_category(book);

                bookCounter++;
                // Move to the next category after adding 'booksPerCategory' books
                if (bookCounter == booksPerCategory && categoryIndex < cList.size() - 1) {
                    categoryIndex++;
                    bookCounter = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printDetail(List<?> gli) {
        for (int i = 0; i < gli.size(); i++) {
            System.out.println("*");
            System.out.println(gli.get(i));
            System.out.println("*");
        }
    }
}
