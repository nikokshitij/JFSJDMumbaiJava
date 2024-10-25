import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) {
        List<Category> categoryList = new ArrayList<>();

        Category c1 = new Category(1, "Education");
        Category c2 = new Category(2, "Sport");
        Category c3 = new Category(3, "Drama");
        Category c4 = new Category(4, "Cultural");

        categoryList.add(c1);
        categoryList.add(c2);
        categoryList.add(c3);
        categoryList.add(c4);

        Scanner sc = new Scanner(System.in);

        while (true) {
            printDetails(categoryList);

            System.out.println("Categories to choose from");
            System.out.println("Choose a Categories and enter your ID");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the book details(ISBN, Book Name, Author):");
            String input = sc.nextLine();

            StringTokenizer  st = new StringTokenizer(input,",");

            String isbn = st.nextToken();
            String bname = st.nextToken();
            String author = st.nextToken();

            Category tempobj = categoryList.get(id - 1);
            tempobj.add_category(new Book(isbn, bname, author));

            System.out.println("After adding the new book:");
            printDetails(categoryList);

        }
    }

    public static void printDetails(List<Category> categoryList) {
        for (Category category : categoryList) {
            System.out.println("*****************************");
            System.out.println(category);
            System.out.println("*****************************");
        }
    }
}