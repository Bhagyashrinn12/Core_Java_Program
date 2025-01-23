// write a program to find the perimeter of the square

import java.util.Scanner;

public class SquarePerimeter {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side of the square
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();

        // Calculate the perimeter of the square
        double perimeter = 4 * side;

        // Display the calculated perimeter
        System.out.println("Perimeter of the square: " + perimeter);

        // Close the scanner to release resources
        scanner.close();
    }
}


/* Output: Enter the side of the square: 6
Perimeter of the square: 24.0
*/







