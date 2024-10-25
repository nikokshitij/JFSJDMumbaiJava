import java.util.*;

public class Vectors {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();  //A Vector is a dynamic array that automatically grows in size when needed.

        v.add("Aniket");
        v.add("Gaurav");
        v.add("Harshal");
        v.add("Tejas");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}