// Program to calculate course fee discount

// Create CourseFeeDiscount class to calculate discounted amount and discounted fee
public class CourseFeeDiscount {
	public static void main(String[] args) {
		// Create a variable fee to store value of course fee
		int fee = 125000;

		// Create a variable discountPercent to store value of discount percentage
		int discountPercent = 10;

		// Create a variable discount to calculate and store value of discounted amount
		int discount = fee * discountPercent / 100 ;

		// Create a variable discountedFee to calculate and store value of discounted fee
		int discountedFee = fee - discount;

		// Print the calculated discounted amount and discounted fee
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
