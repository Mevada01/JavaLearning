package Module2;

import java.util.Scanner;


public class FirstQustion {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter three numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        // Close the scanner
	        scanner.close();

	        // Determine the greatest number
	        int greatest;
	        if (num1 >= num2 && num1 >= num3) {
	            greatest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            greatest = num2;
	        } else {
	            greatest = num3;
	        }

	        // Print the greatest number
	        System.out.println("The greatest number is: " + greatest);
	    }
}
