package ArraysDemo;

public class Arrayslearn {
    public static void main(String[] args) {
        int[] A1 = new int[6];

        // Corrected for loop to initialize array
        for (int i = 0; i < A1.length; i++) {
            int y = i + 20 * 200;  // Calculation for each element
            A1[i] = y;             // Assign value to array element
        }

     
        for (int i = 0; i < A1.length; i++) {
            System.out.println(A1[i]);  
        }

        
        System.out.println(A1);  

          // Creating arrays with 10 to 80 elements each
          byte[] anArrayOfBytes = new byte[10];
          short[] anArrayOfShorts = new short[20];
          long[] anArrayOfLongs = new long[30];
          float[] anArrayOfFloats = new float[40];
          double[] anArrayOfDoubles = new double[500];
          boolean[] anArrayOfBooleans = new boolean[60];
          char[] anArrayOfChars = new char[70];
          String[] anArrayOfStrings = new String[80];
  
         
          System.out.println("Byte Array Length: " + anArrayOfBytes.length);
          System.out.println("Short Array Length: " + anArrayOfShorts.length);
          System.out.println("Long Array Length: " + anArrayOfLongs.length);
          System.out.println("Float Array Length: " + anArrayOfFloats.length);
          System.out.println("Double Array Length: " + anArrayOfDoubles.length);
          System.out.println("Boolean Array Length: " + anArrayOfBooleans.length);
          System.out.println("Char Array Length: " + anArrayOfChars.length);
          System.out.println("String Array Length: " + anArrayOfStrings.length);
    }
}
