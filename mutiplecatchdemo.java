package ANP_D0453;

/*Write a program demonstrating multiple catch statements and finally block*/

public class mutiplecatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            // Block of code that might throw multiple exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[5];  // This will throw ArrayIndexOutOfBoundsException
            int num1 = 10, num2 = 0;
            int divisionResult = num1 / num2;  // This will throw ArithmeticException
        }
        // Catching different exceptions separately
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
        // Catching any other exceptions that might occur
        catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
        // Finally block will always execute, regardless of whether an exception occurred or not
        finally {
            System.out.println("This is the 'finally' block. It always executes.");
        }

        System.out.println("Program continues after exception handling.");

	}

}


 
 /*
  * Output
  * Error: Array index is out of bounds.
  * This is the 'finally' block. It always executes.
  * Program continues after exception handling.
  * */
  