package dummypackage;

public class MySecondClass {
		
	int age = 23;											// Instance Variable
	static String country = "India";						// Static Variable 
	static String Vpuram = "Vanasthalipuram";
	
	public static void place() {							// Static Method
		String place1 = "Hyderabad";						// Local Variable - can be accessed only in the method
		//System.out.println("My age is " + age);			// Non static variable cannot be accessed by static method
		System.out.println ("I live in " + place1);
		System.out.println ("Stays at " + Vpuram);			// non local static variable can be accessed
	}

	public void district() {								// Non Static Method
		System.out.println("Ranga Reddy");
	}
	
	public void street() {									// Method
		//int age = 23;
		System.out.println("Age " +age);					// Variable Age is accessed in non static method
		System.out.println("Vanasthalipuram");
		System.out.println (country);
		place();
		district();
	}
	
	
	public static void main(String[] args) 	{				// Main Method - Execution starts at main method
		System.out.println ("Mahesh");						// Direct Print
		place();											// Method (place) called in the main method. + Static Method only can be used in main method.
		System.out.println(country);						// Static variable is accessed
		//street();											// Cannot access a non static method.
	}
}

// ****** Notes *****
// A non static method can access a Static Method and non static methods + static variables
// A static method can access only static method (* there is something more)