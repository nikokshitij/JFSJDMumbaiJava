import java.util.*;;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Harshal");
        al.add("Sumit");
        al.add("Manoj");
        al.add("Prashant");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
