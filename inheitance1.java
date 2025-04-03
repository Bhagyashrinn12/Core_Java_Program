package ANP_D0453;

//parent class 
class Vehicle{
	
	//Attributes
	String brand ="Toyota";
	String model="Corolla";
	int year=2023;

	// Method to drive
	public void drive()
	{
		System.out.println("This " +brand+" "+model+" "+year+  " is driving. " );
	}
}

//child class
class Car extends Vehicle{

	//Additional attribute 
	String color="Gray";

	//Method to honk
	public void honk()
	{
		System.out.println( "The " +color + " " +brand+ " " +model+ "honks.");
	}

}


public class InheritanceEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of the car class
				Car obj = new Car();
				// Call both the drive and honk methods
				obj.drive();
				obj.honk();

			}

		}

//output

/*
 * 
 * This Toyota Corolla 2023 is driving. 
The Gray Toyota Corollahonks.

*/    