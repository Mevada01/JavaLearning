package Module2;

import java.util.Scanner;

public class SecondQustion {
	public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a single character
        System.out.print("Enter a single character: ");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Validate the input
        if (input.length() != 1) {
            System.out.println("Error: You must enter exactly one character.");
            return;
        }

        char character = input.charAt(0);

        // Check if the character is a letter
        if (!Character.isLetter(character)) {
            System.out.println("Error: You must enter a letter.");
            return;
        }

        // Check if the character is a vowel or consonant
        char lowerChar = Character.toLowerCase(character);
        if (lowerChar == 'a' || lowerChar == 'e' || lowerChar == 'i' || lowerChar == 'o' || lowerChar == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
