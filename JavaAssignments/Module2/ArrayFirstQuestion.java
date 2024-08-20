package Module2;

public class ArrayFirstQuestion {
	 public static int findMax(int[] numbers) {
	        // Assume the first element is the maximum
	        int max = numbers[0];
	        
	        // Loop through the array to find the maximum number
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }
	        
	        // Return the maximum number found
	        return max;
	    }
	    
	    public static void main(String[] args) {
	        // Define an array of integers
	        int[] array = {5, 3, 9, 1, 7, 6, 8};
	        
	        // Call the findMax function and store the result
	        int maxNumber = findMax(array);
	        
	        // Print the maximum number
	        System.out.println("The maximum number in the array is: " + maxNumber);
	    }
}
