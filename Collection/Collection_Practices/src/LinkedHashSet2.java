import java.util.*;;

public class LinkedHashSet2 {
    public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("Harshal");  
set.add("Sumit");  
set.add("Manoj");  
set.add("Harshal");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  

    
}
