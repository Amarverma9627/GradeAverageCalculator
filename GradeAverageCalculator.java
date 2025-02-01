import java.util.Scanner;

public class GradeAverageCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of grades
        System.out.print("Enter the number of grades: ");
        int numGrades = scanner.nextInt();

        // Create an array to store the grades
        double[] grades = new double[numGrades];
        double sum = 0;

        // Loop to input each grade
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();  // Read the grade
            sum += grades[i];  // Add the grade to the sum
        }

        // Calculate the average
        double average = sum / numGrades;

        // Display the average grade
        System.out.println("The average grade is: " + average);

        // Close the scanner
        scanner.close();
    }
}
