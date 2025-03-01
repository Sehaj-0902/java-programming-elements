// Program to perform integer operations

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create IntOperation class to perform integer operations
public class IntOperation {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of a
        System.out.print("Enter the value of a: ");

        // Create a variable a to store the first integer
        int a = scanner.nextInt();

        // Prompt the user to enter the value of b
        System.out.print("Enter the value of b: ");

        // Create a variable b to store the second integer
        int b = scanner.nextInt();

        // Prompt the user to enter the value of c
        System.out.print("Enter the value of c: ");

        // Create a variable c to store the third integer
        int c = scanner.nextInt();

        // Compute the first integer operation: a + b * c
        int result1 = a + b * c;

        // Compute the second integer operation: a * b + c
        int result2 = a * b + c;

        // Compute the third integer operation: c + a / b
        int result3 = c + a / b;

        // Compute the fourth integer operation: a % b + c
        int result4 = a % b + c;

        // Print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
    }
}
