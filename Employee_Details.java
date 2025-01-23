// Write a Java program to take Employee id,name,address & salary from user and display on to screen.

import java.util.Scanner;

public class EmployeeDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get employee ID from the user
        System.out.print("Enter Employee ID: ");
        int employeeId = scanner.nextInt();

        // Consume the newline character left by nextInt()
        scanner.nextLine(); 

        // Get employee name from the user
        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        // Get employee address from the user
        System.out.print("Enter Employee Address: ");
        String employeeAddress = scanner.nextLine();

        // Get employee salary from the user
        System.out.print("Enter Employee Salary: ");
        double employeeSalary = scanner.nextDouble();

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("Employee Salary: " + employeeSalary);

        scanner.close();
    }
}

/*Enter Employee ID: 450
Enter Employee Name: Sonakshi
Enter Employee Address: 123 Daji peth,solapur
Enter Employee Salary: 50000.0

Employee Details:
Employee ID: 450
Employee Name: Sonakshi
Employee Address: 123 Daji peth,solapur
Employee Salary: 50000.0*/

