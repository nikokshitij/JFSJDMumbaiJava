import java.util.*;

public class HashSet1 {
    public class TestJavaCollection7 {
        public static void main(String args[]) {
            // Creating HashSet and adding elements
            HashSet<String> set = new HashSet<String>();
            set.add("Harshal");
            set.add("Vijay");
            set.add("Sumit");
            set.add("Harshal");
            // Traversing elements
            Iterator<String> itr = set.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

}