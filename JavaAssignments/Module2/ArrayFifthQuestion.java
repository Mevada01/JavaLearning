package Module2;
import java.util.Scanner;

public class ArrayFifthQuestion {
	 // Function to calculate the length of a string without using inbuilt functions
    public static int calculateLength(String str) {
        int length = 0;
        // Initialize an index to traverse the string
        int index = 0;

        // Loop until we reach the end of the string
        while (true) {
            try {
                // Attempt to access each character by index
                char c = str.charAt(index);
                length++;
                index++;
            } catch (StringIndexOutOfBoundsException e) {
                // Catch exception when index is out of bounds (end of string)
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Calculate and print the length of the string
        int length = calculateLength(inputString);
        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}
