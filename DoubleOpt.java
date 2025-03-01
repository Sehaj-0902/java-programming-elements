// Program to perform double operations 

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create DoubleOpt class to perform double operations
public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of a
        System.out.print("Enter the value of a: ");

        // Create a variable a to store the first double
        double a = scanner.nextDouble();

        // Prompt the user to enter the value of b
        System.out.print("Enter the value of b: ");

        // Create a variable b to store the second double
        double b = scanner.nextDouble();

        // Prompt the user to enter the value of c
        System.out.print("Enter the value of c: ");

        // Create a variable c to store the third double
        double c = scanner.nextDouble();

        // Compute the first double operation: a + b * c
        double result1 = a + b * c;

        // Compute the second double operation: a * b + c
        double result2 = a * b + c;

        // Compute the third double operation: c + a / b
        double result3 = c + a / b;

        // Compute the fourth double operation: a % b + c
        double result4 = a % b + c;

        // Print the results of the double operations
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
