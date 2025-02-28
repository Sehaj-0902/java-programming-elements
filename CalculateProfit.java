// Program to calculate the profit in number and percentage based on the cost price and selling price

// Create CalculateProfit class to calculate profit
public class CalculateProfit {
	public static void main(String[] args) {
		// Create a variable costPrice to store value of cost pice
		int costPrice = 129;

		// Create a variable sellingPrice to store value of selling pice
		int sellingPrice = 191;

		// Create a variable profit to calculate and store value of profit
		int profit = sellingPrice - costPrice;

		// Create a variable profitPercent to calculate and store value of profit percentage
		int profitPercent = (profit * 100) / costPrice;

		// Print the calculates profit and profit percentage
		System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
	}
}
