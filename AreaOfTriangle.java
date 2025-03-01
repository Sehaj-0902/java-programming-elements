// Program to calculate area of a triangle in square inches and square centimeters

//Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create AreaOfTriangle class to calculate area of triangle
public class AreaOfTriangle {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the base of triangle
		System.out.println("Enter the base of triangle: ");

		// Create a variable base to store value of base
		double base = sc.nextDouble();

		// Prompt the user to enter the height of triangle
		System.out.println("Enter the height of triangle: ");

		// Create a variable height to store value of height
		double height = sc.nextDouble();

		// Create a variable areaInInches to calculate and store value of area in square inches
		double areaInInches = 0.5 * base * height;

		// Create a variable areaInCm to convert area from square inches to square centimeters (1 inch = 2.54 cm, 1 sq inch = 2.54*2.54 sq cm)
        	double areaInCm = areaInInches * 2.54 * 2.54;

		// Print the converted area
		System.out.println("The area of triangle with base " + base + " and " + height + " in square inches is " + String.format("%.2f", areaInInches) + " and in square centimeters is " + String.format("%.2f", areaInCm)); 
	}
}

