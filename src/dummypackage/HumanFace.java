package dummypackage;

public class HumanFace {
	
	String eyes;											// Instance Variables
	String nose;
	String ears;
	String mounth;

	public void watch() {
		System.out.println("watch");
	}
	public void smell() {
		System.out.println("smell");
	}
	public void hear() {
		System.out.println("hear");
	}
	public void eat() {
		System.out.println("eat");
	}
	
	public static void main(String[] args) {
		
	HumanFace hf = new HumanFace();									// new HumanFace() - Object (Right part)
																	// hf - reference variable
	hf.watch();														// datatype of hf = HumanFace (left)
	hf.smell();														// Humanface() - Construct	- Right
	hf.hear();
	hf.eat();
	//hf.ears();													// cannot use this as Variable "ears" is not used anywhere else, so is the error
	System.out.println (hf.ears);									// Here i am using it in Print statement.
	}

}

// Notes
// Variable / Methods = Member
//If you want to access the member of the class, we need an object of that class. Other way is to make the method static to access in the Static Main method.
// hf is a variable of type HumanFace which is holder the object of HumanFace.
// if you want to access the variable, we need to use it.

//Line 25 - i am creating an object of HumanFace using HumanFace() constructor and this object is held in the reference variable hf of type HumanFace (Left)