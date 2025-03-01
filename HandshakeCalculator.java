// Program to find the maximum number of handshakes among N students

// Import Scanner class to take user input
import java.util.Scanner;

// Create HandshakeCalculator class to calculate the maximum number of handshakes
public class HandshakeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.println("Enter the number of students: ");

        // Create a variable numberOfStudents to store the number of students entered by the user
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the combination formula (n * (n - 1)) / 2
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Print the calculated maximum number of handshakes
        System.out.println("Maximum number of handshakes: " + numberOfHandshakes);
    }
}
