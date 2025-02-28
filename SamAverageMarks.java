// Program to calculate Sam's average percent marks in Physics, Chemistry and Maths

// Create SamAverageMarks class to calculate Sam's average percent marks
public class SamAverageMarks {
        public static void main(String[] args) {
                // Create a variable physicsMarks to store Sam's marks in physics
                int physicsMarks = 95;

		// Create a variable chemistryMarks to store Sam's marks in chemistry
                int chemistryMarks = 96;

                // Create a variable mathsMarks to store Sam's marks in maths
                int mathsMarks = 94;

		// Create a variable totalMarks to calculate total marks
                int totalMarks = physicsMarks + chemistryMarks + mathsMarks;

		// Create a variable averagePercent to calculate average percent marks
                int averagePercent = totalMarks * 100 / 300;

		// Print calculated average percent marks
                System.out.println("Sam's average marks in PCM is " + averagePercent);
        }
}
