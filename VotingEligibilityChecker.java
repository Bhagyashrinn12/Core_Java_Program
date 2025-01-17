// Write java program to check  candidate eligible for voting or not
package ANP_D0453;

import java.util.Scanner;

public class VotingEligibilityChecker {

	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter their age
		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		// Check if the user is eligible to vote
		if (age >= 18) {
			System.out.println("You are eligible to vote.");
		} else {
			System.out.println("You are not eligible to vote.");
		}

		// Close the scanner to release resources
		scanner.close();
	}
}

/*Output:Enter your age:17
You are not eligible to vote. 
Enter your age: 21
You are eligible to vote.
 */

