package Module2;

public class ArraySecondQuestion {
	 public static int findSecondMax(int[] numbers) {
	        // Initialize the maximum and second maximum to minimum possible values
	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;

	        // Traverse through the array
	        for (int num : numbers) {
	            if (num > max) {
	                // Update second max before updating max
	                secondMax = max;
	                max = num;
	            } else if (num > secondMax && num < max) {
	                // Update second max if num is between max and secondMax
	                secondMax = num;
	            }
	        }

	        // Check if we have a valid second maximum
	        if (secondMax == Integer.MIN_VALUE) {
	            throw new IllegalArgumentException("Array must have at least two distinct elements.");
	        }

	        return secondMax;
	    }

	    public static void main(String[] args) {
	        // Define an array of integers
	        int[] array = {5, 3, 9, 1, 7, 6, 8};

	        try {
	            // Call the findSecondMax function and store the result
	            int secondMaxNumber = findSecondMax(array);

	            // Print the second maximum number
	            System.out.println("The second maximum number in the array is: " + secondMaxNumber);
	        } catch (IllegalArgumentException e) {
	            // Handle the case where there's no valid second maximum
	            System.err.println(e.getMessage());
	        }
	    }
}
