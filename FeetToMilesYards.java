// Program to convert distance in feet to miles and yards

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create FeetToMilesYards class to convert the distance
public class FeetToMilesYards {
    public static void main(String[] args) {
	// Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in feet
        System.out.print("Enter the distance in feet: ");

	// Create a variable distanceInFeet to store value of distance in feet
        double distanceInFeet = scanner.nextDouble();

        // Create a variable distanceInYards to calculate and store value of distance in yards
        double distanceInYards = distanceInFeet / 3.0; // 1 yard = 3 feet

        // Create a variable distanceInMiles to calculate and store value of distance in miles
        double distanceInMiles = distanceInYards / 1760.0; // 1 mile = 1760 yards

        // Print the converted distance
        System.out.println("The distance in yards is " + String.format("%.2f", distanceInYards) + " while the distance in miles is " + String.format("%.2f", distanceInMiles));
    }
}
