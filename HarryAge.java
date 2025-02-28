// Program to calculate Harry's age in current year, assume the current year is 2024

// Create HarryAge class to calculate Harry's age
public class HarryAge {
	public static void main(String[] args) {
		// Create a variable birthYear to store Harry's birth year
		int birthYear = 2000;

		// Create a variable currentYear to store current year
        	int currentYear = 2024;

		// Create a variable age to calculate Harry's age by subtracting birthYear from currentYear
        	int age = currentYear - birthYear;

		// Print the calculated age
        	System.out.println("Harry's age in 2024 is " + age);
	}
}
