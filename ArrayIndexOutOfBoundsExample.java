package ANP_D0453;

/*
 * Write a program using exception handling to handle array index out of bounds
 */

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempting to access an index that is out of bounds
            System.out.println("Element at index 10: " + numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Error: Index out of bounds! Please check the array size.");
        }

        System.out.println("Program continues to run...");

	}

}
/*Output
 * Error: Index out of bounds! Please check the array size.
 *  Program continues to run...
 * 
 */
