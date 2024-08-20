package Module2;

import java.util.Scanner;

public class ArraySixQuestion {
	 // Function to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        // Iterate from the end of the string to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Reverse the string
        String reversed = reverseString(str);
        // Compare the original string with the reversed string
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        boolean palindrome = isPalindrome(inputString);

        // Output results
        System.out.println("Reversed string: " + reverseString(inputString));
        if (palindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
