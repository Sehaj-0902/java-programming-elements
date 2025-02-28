// Program to create a basic calculator for addition, subtraction, multiplication, and division

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create BasicCalculator class to perform arithmetic operations
public class BasicCalculator {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.println("Enter the first number: ");
		// Create a variable num1 to store value of first number
		double num1 = sc.nextDouble();

		// Prompt the user to enter the second number
		System.out.println("Enter the second number: ");
		// Create a variable num2 to store value of second number
		double num2 = sc.nextDouble();

		// Create add, subtract, multiply, divide variables to perform arithmetic operations
		double add = num1 + num2;
		double subtract = num1 - num2;
		double multiply = num1 * num2;
		double divide = num1 / num2;

		// Print the result
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + " , " + subtract + " , " + multiply + " , and " + divide);
	}
}
