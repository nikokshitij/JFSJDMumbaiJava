import java.util.*;;

public class Stacks {

    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();  //A Stack works on the principle of "Last In, First Out" (LIFO), meaning the last element added will be the first one removed.

        stack.push("Aniket");
        stack.push("Gaurav");
        stack.push("Harshal");
        stack.push("Tejas");
        stack.push("Sumit");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
