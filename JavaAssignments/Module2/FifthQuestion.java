package Module2;

public class FifthQuestion {
	public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Outer loop to handle the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after printing all numbers for the current row
            System.out.println();
        }
    }
}
