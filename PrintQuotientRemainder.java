// Program to calculate quotient and remainder of two numbers

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create PrintQuotientRemainder class to calculate quotient and remainder
public class PrintQuotientRemainder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter the first number: ");

        // Create a variable number1 to store the first number
        int number1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.println("Enter the second number: ");

        // Create a variable number2 to store the second number
        int number2 = scanner.nextInt();

        // Create a variable quotient to calculate and store the quotient
        int quotient = number1 / number2;

        // Create a variable remainder to calculate and store the remainder
        int remainder = number1 % number2;

        // Print the calculated quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
    }
}
