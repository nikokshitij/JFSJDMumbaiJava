import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Harshal");// Adding object in arraylist
        list.add("Sumit");
        list.add("Manoj");
        list.add("Prashant");
        // Traversing list through Iterator
        Iterator itr = list.iterator(); // Iterator object (itr) will be used to traverse the list one element at a
                                        // time.
        while (itr.hasNext()) // The hasNext() method checks if there is another element in the list.
        {
            System.out.println(itr.next());
        }
    }
}