// Program to distribute pens among students and find the number of remaining pens after distribution

// Create PenDistribution class to equally distribute pens among the students
public class PenDistribution {
	public static void main(String[] args) {
		// Create a variable totalPens to store value of total number of pens
		int totalPens = 14;

		// Create a variable numberOfStudents to store value of total number of students
		int numberOfStudents = 3;

		// Create a variable pensPerStudent to calculate and store value of number of pens each student gets
		int pensPerStudent = totalPens / numberOfStudents;

		// Create a variable remainingPens to calculate and store value of number of pens remaining
		int remainingPens = totalPens % numberOfStudents;

		// Print the calculated pens per student and remaining number of pens
		System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
	}
}
