package Module2;

import java.util.Scanner;

public class ForthQustion {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Initialize variables for sum and average
	        int sum = 0;
	        double average;

	        // Prompt the user to input 5 numbers and calculate the sum
	        System.out.println("Please enter 5 numbers:");

	        for (int i = 1; i <= 5; i++) {
	            System.out.print("Enter number " + i + ": ");
	            int number = scanner.nextInt();
	            sum += number;  // Add the input number to sum
	        }

	        // Calculate the average
	        average = (double) sum / 5;

	        // Close the scanner
	        scanner.close();

	        // Display the results
	        System.out.println("Sum of the numbers: " + sum);
	        System.out.println("Average of the numbers: " + average);
	    }
}
