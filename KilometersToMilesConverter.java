// Program to convert distance in kilometers to miles

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create KilometersToMilesConverter class to convert the distance
public class KilometersToMilesConverter {
	public static void main(String[] args) {
		// Create a variable km to store value of distance in kilometers
                double km;

		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter the distance in kilometers
        	System.out.println("Enter the distance in kilometers: ");

		// Use Scanner object to take user input for km
		km = sc.nextDouble();

		// Create a variable miles to convert the distance using the conversion factor ( 1 mile = 1.6 km )
		double miles = km / 1.6;

		// Print the converted distance
		System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
	}
}
