// Program to calculate the total purchase price based on unit price and quantity

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create TotalPrice class to calculate the total price
public class TotalPrice {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the unit price of the item
        System.out.println("Enter the unit price of the item: ");

        // Create a variable unitPrice to store the unit price entered by the user
        double unitPrice = scanner.nextDouble();

        // Prompt the user to enter the quantity of items to be bought
        System.out.println("Enter the quantity to be bought: ");

        // Create a variable quantity to store the quantity entered by the user
        int quantity = scanner.nextInt();

        // Create a variable totalPrice to calculate and store the total price
        double totalPrice = unitPrice * quantity;

        // Print the total purchase price, quantity, and unit price in the specified format
        System.out.println("The total purchase price is INR " + String.format("%.2f", totalPrice) + " if the quantity " + quantity + " and unit price is INR " + String.format("%.2f", unitPrice));
    }
}
