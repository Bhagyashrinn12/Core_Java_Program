// Write a program to check leap year using if else. How to check whether a given year is a leap year or not
package ANP_D0453;

import java.util.Scanner;

public class LeapYearChecker {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter a year
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Check if the year is a leap year using if-else statements
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		// Close the scanner to release resources
		scanner.close();
	}
}

/* Output:Enter a year: 2025
2025 is not a leap year. 
Enter a year: 2024
2024 is a leap year.*/