import java.util.*;
public class binarySearch {

    public static void binary_Search(int array[], int key, int end, int begin){
        
        while (begin<=end) 
        {
            int mid=(begin+end)/2;
            if(array[mid]==key) 
            {
            
            }
            
        }
        

    }

    public static void main(String[] args) {
        int[] array = { 2,49,50,75,80,81,85};
        int key = 75;
        int begin=0, end=array.length-1;
        binary_Search(array, key, end, begin);

         
        
    }
    
}
