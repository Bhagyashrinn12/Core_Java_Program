package ANP_D0453;
//parent class
class Person{
	String name;
	int age;

//construtor
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
//method
	public void speak() {
		System.out.println(name+" is speaking.");
	}
}

//child class
 class Student extends Person{
	 String grade;

//contructor
	 
	 public Student(String name,int age,String grade) {
		 super(name,age);
		 this.grade=grade;
		 
	 }
	 
//Additional method
	 public void study() {
		 System.out.println(name+ " is studying in grade" + grade+".");
	 }

}
 
 
//main class to execute the code 
public class InheritaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("shweta",20," s");
	
//call the speak method
		student.speak();
		student.study();
		
}
}


//OUTPUT

/*

*shweta is speaking.
shweta is studying in grade s.

*/