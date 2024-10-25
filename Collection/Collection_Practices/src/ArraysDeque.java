import java.util.*;

public class ArraysDeque {
    public class TestJavaCollection6 {
        public static void main(String[] args) {
            // Creating Deque and adding elements
            Deque<String> deque = new ArrayDeque<String>();
            deque.add("Harshal");
            deque.add("Karan");
            deque.add("Sumit");
            // Traversing elements
            for (String str : deque) {
                System.out.println(str);
            }
        }
    }

}