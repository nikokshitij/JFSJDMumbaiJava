/* Create a new Java class that will have the following functionality:

1)Name should be CalculatorBrain
2)Implement a function for each aritmetic operation
-Addition
-Subtraction
-Multiplication
-Division
3)Add some code to the main method to invoke the aritmetic functions defined and verify it works as expected.
 */
package Loops;

public class CalculatorBrain {

        public static void main(String[] args) {
        
        CalculatorBrain calculator = new CalculatorBrain();

        
        int add = calculator.add(10, 5);
        int sub = calculator.subtract(10, 5);
        int mul = calculator.multiply(10, 5);
        double div = calculator.divide(10, 5);
        double divResult = calculator.divide(10, 0); // To test division by zero

        
        System.out.println("Addition: 10 + 5 = " + add);
        System.out.println("Subtraction: 10 - 5 = " + sub);
        System.out.println("Multiplication: 10 * 5 = " + mul);
        System.out.println("Division: 10 / 5 = " + div);
        System.out.println("Division by zero: " + divResult);
    }

    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }
        return (double) a / b;
    }
}

