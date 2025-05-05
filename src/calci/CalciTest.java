package calci;

public class CalciTest {

	public static void main(String[] args) {
		
		Calculator calci = new Calculator();			//Reference variable = calci in Object
		calci.add();
		calci.add(10,10);								// Should match the signature of the method: Name of the method (add) + the variables it is taking 	
		calci.add(20, 10);
		calci.subtract(20,20);
		calci.multiply(10,2);
		calci.divide(20,10);

		String myName = Calculator.name;
			System.out.println(myName);					// QQQ: what happens if I use variable "name" instead of "myName"
			
		int finalsum = calci.add(10, 10, 10);			// Unit Testing used by Developers
		if (finalsum == 30) {
			System.out.println ("Pass");
		}
		else {
			System.out.println ("Fail");
		}
		
		//int finalsub = calci.subtract(40,20,10);		// warning comes when using static
		int finalsub = Calculator.subtract(40,20,10);	// do not use the name of the reference variable,.. 
		if (finalsub == 30) {							// .. use the name of the class directly
			System.out.println ("Pass");				// 
		}
		else {
			System.out.println ("Fail");
		}
	}

}


// values 10 and 10 are called arguments
// a and b are parameters in method


// when ever we call the method (Say add), we have to make sure the no of arguments we 
// are using should match with the parameters (a, b) used in the method add.

//compile the code, test the code, package the code, deploy the code
// Build is nothing but new version of the software
// Build has new code changes of a story or a defect fix

// Can I use an object (or Ref Variable) to access a static member (variable or method)
// Answer - Yes, we can but it gives warning message just like above when using "calci"

// We use static very less, as it consumes lot of memory.