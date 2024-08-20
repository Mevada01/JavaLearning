package Module2;

public class OOPSFirstQue {

    // Method to print the area of a square
    public void printArea(double side) {
        double area = side * side;
        System.out.println("The area of the square with side " + side + " is: " + area);
    }

    // Method to print the area of a rectangle
    public void printArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("The area of the rectangle with length " + length + " and breadth " + breadth + " is: " + area);
    }

    // Main method to test the AreaCalculator class
    public static void main(String[] args) {
        // Create an instance of the OOPSFirstQue class
    	OOPSFirstQue calculator = new OOPSFirstQue();
        
        // Print the area of a square
        calculator.printArea(5.0); // side of the square
        
        // Print the area of a rectangle
        calculator.printArea(4.0, 6.0); // length and breadth of the rectangle
    }
}
