// Program to calculate discounted student fee

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create DiscountedFeeCalculator class to calculate discounted amount and discounted fee
public class DiscountedFeeCalculator {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner sc = new Scanner(System.in);

		// Prompt the user to enter student fee
        	System.out.println("Enter the Student fee: ");

		// Create a variable fee to store value of course fee
		int fee = sc.nextInt();

                // Prompt the user to enter university discount
                System.out.println("Enter the University Discount: ");

		// Create a variable discountPercent to store value of discount percentage
		int discountPercent = sc.nextInt();

		// Create a variable discount to calculate and store value of discounted amount
		int discount = fee * discountPercent / 100 ;

		// Create a variable discountedFee to calculate and store value of discounted fee
		int discountedFee = fee - discount;

		// Print the calculated discounted amount and discounted fee
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
