package Module2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayThirdQuestion {
	 // Function to sort an array in ascending or descending order
    public static void sortArray(Integer[] array, String order) {
        if ("ascending".equalsIgnoreCase(order)) {
            Arrays.sort(array);
        } else if ("descending".equalsIgnoreCase(order)) {
            Arrays.sort(array, Collections.reverseOrder());
        } else {
            System.out.println("Invalid order specified. Please use 'ascending' or 'descending'.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the number of elements for the first array: ");
        int size1 = scanner.nextInt();
        Integer[] array1 = new Integer[size1];
        System.out.println("Enter " + size1 + " integers for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the number of elements for the second array: ");
        int size2 = scanner.nextInt();
        Integer[] array2 = new Integer[size2];
        System.out.println("Enter " + size2 + " integers for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Input for sorting order
        System.out.print("Enter sorting order for the arrays (ascending/descending): ");
        String order = scanner.next();

        // Sort and print the first array
        sortArray(array1, order);
        System.out.println("Sorted first array: " + Arrays.toString(array1));

        // Sort and print the second array
        sortArray(array2, order);
        System.out.println("Sorted second array: " + Arrays.toString(array2));

        scanner.close();
    }
}
