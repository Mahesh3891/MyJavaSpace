package dummypackage;

public class MyFirstClass {
	//Instance Variable - because these are within the "Class" and outside "Methods"
	String Name = "Mahesh";
	int age = 23;
	double length = 123.45;
	//Static Variable
	static String Country;
	//Method
	public static void jump() {
		//Local variables - within methods
		//String City;
		System.out.println ("I want to jump high");
	}
	public void eat() {
		//Local variables - within methods
		//int distance; System.out.println ("I want to eat Biryani");
		System.out.println ("I want to eat Biryani");
	}
	
	//Java Main Method
	public static void main(String[] args) {
		String Name1= "Mahesh Kumar Gubbala";
		System.out.println ("My name is " + Name1 );
		jump();
		//eat();
		System.out.println ('A' + 1);
		System.out.println ('A');
	}

}
