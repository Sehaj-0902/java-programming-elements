// Program to create a basic calculator for addition, subtraction, multiplication, and division

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create ArithmeticCalculator class to perform arithmetic operations
public class ArithmeticCalculator {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the first number
		System.out.println("Enter the first number: ");

		// Create a variable number1 to store value of first number
		double number1 = sc.nextDouble();

		// Prompt the user to enter the second number
		System.out.println("Enter the second number: ");

		// Create a variable number2 to store value of second number
		double number2 = sc.nextDouble();

		// Create add, subtract, multiply, divide variables to perform arithmetic operations
		double add = number1 + number2;
		double subtract = number1 - number2;
		double multiply = number1 * number2;
		double divide = number1 / number2;

		// Print the result
		System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + add + " , " + subtract + " , " + multiply + " , and " + divide);
	}
}
