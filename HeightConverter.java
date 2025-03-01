// Program to convert height in centimeters to feet and inches

// Import Scanner class from java.util package to take user input
import java.util.Scanner;

// Create HeightConverter class to convert height
public class HeightConverter {
        public static void main(String[] args) {
                //Create a Scanner object to read input from the console
                Scanner  sc = new Scanner(System.in);

                // Prompt the user to enter the height
                System.out.println("Enter your height in centimeters: ");

                // Create a variable heightInCm to store value of height in cm
                double heightInCm = sc.nextDouble();

                // Create a variable heightInInches to calculate and store value of height in inches
                double heightInInches = (heightInCm / 2.54) % 12;

                // Create a variable heightInFeet to calculate and store value of height in feet
                int heightInFeet = (int) (heightInCm / 2.54) / 12;

                System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + String.format("%.2f", heightInInches));
        }
}
