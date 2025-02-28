// Program to convert distance from kilometers to miles

// Create KilometersToMiles class to convert the distance
public class KilometersToMiles {
	public static void main(String[] args) {
		// Create a variable kilometers to store value of kilometer distance
		double kilometers = 10.8;

		// Create a variable miles to convert the distance using the conversion factor ( 1 km = 1.6 miles )
		double miles = kilometers * 1.6;

		// Print the converted distance
		System.out.println("The distance " + kilometers + " km in miles is " + miles);
	}
}
