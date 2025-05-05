package calci;

public class Calculator {					// Calculator is a class and also called as type
	
	static String name = "Mahesh";			// use a static variable to test the static nature in the main method when used
	
	public void add() {												// Non Parameterized
		System.out.println ("Addition result is: " + (20+30)); 
	}
	
	public void add(int a, int b) {									// Parameterized
		System.out.println ("Addition result is: " + (a+b));		
	}
	
	public int add(int a, int b, int c) {							// Parameterized with 3 parameters a,b,c
			int sum = (a+b+c);	
		return sum;
	}
	public void subtract(int a, int b) {
		System.out.println ("Substraction result is: " + (a-b));
	}
	
	public static int subtract(int a, int b, int c) {				// use of static
		int sub = (a-b-c);
		return sub;
	}
	
	public void multiply (int a, int b) {
		System.out.println ("Subration result is: " + (a * b));
	}
	public void divide (int a, int b) {
		System.out.println("Division result is: " + (a/b));
	}
}


// Term "void" used in this method will not return any value from the 
// results obtained from the arguments (eg: 10, 10 in add) used in the object "calci"

// In order the store the result we need to use data type like int, string etc and use
// a key word return at the end of the method.