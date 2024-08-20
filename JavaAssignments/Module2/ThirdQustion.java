package Module2;

import java.util.Scanner;

public class ThirdQustion {
	
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Close the scanner
	        scanner.close();

	        // Check if the year is a leap year
	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	        // Display whether the year is a leap year or not
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	        
	        int number = 1;
	        while (number <= 10) {
	            System.out.println("The Natural Number is..."+number);
	            number++;
	    }
	    }

}
