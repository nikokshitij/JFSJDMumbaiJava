import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Creating HashSet and adding elements

        HashSet<String> set = new HashSet<String>();

        set.add("Ravi");

        set.add("Vijay");

        set.add("Ravi");
        set.add("Ajay");
        // Traversing elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
