import java.util.*;
public class PrioritysQueue {
    public static void main(String args[]){  
        PriorityQueue<String> queue=new PriorityQueue<String>();  
        queue.add("Harshal Uikey");  
        queue.add("Sumit Sundergiri");  
        queue.add("PrashantKatre");  
        queue.add("Manoj"); 
     
        System.out.println("head:"+queue.element());  
        System.out.println("head:"+queue.peek()); 
        System.out.println("---------------------------------");  
        System.out.println("iterating the queue elements:"); 
        Iterator itr=queue.iterator();  
        while(itr.hasNext()){  
        System.out.println(itr.next());  
        }  
        queue.remove();  
        queue.poll();  
        System.out.println("---------------------------------"); 
        System.out.println("after removing two elements:");  
        Iterator<String> itr2=queue.iterator();  
        while(itr2.hasNext()){  
        System.out.println(itr2.next());  
        }  
        }  
        
    
}
