package Module2;

public class SixQuestion {
	 public static void main(String[] args) {
	        int n = 4; // Number of rows
	        int number = 1; // Starting number

	        // Loop through each row
	        for (int i = 1; i <= n; i++) {
	            // Print numbers for each row
	            for (int j = 1; j <= i; j++) {
	                System.out.print(number + " ");
	                number++; // Increment the number
	            }
	            // Move to the next line after each row
	            System.out.println();
	        }
	    }
}
