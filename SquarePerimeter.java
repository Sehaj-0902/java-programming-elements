// Program to calculate perimeter of a square

//Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create SquarePerimeter class to calculate the perimeter
public class SquarePerimeter {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the length of square
		System.out.println("Enter the length of square: ");

		// Create a variable length to store value of length
		int length = sc.nextInt();

		// Create a variable perimeter to calculate and store value of perimeter of square
		int perimeter = 4 * length;

		// Print the calculated perimeter
		System.out.println("The length of the side is " + length + " whose perimeter is " + perimeter);
	}
}
