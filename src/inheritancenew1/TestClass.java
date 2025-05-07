package inheritancenew1;

public class TestClass {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
			ani.sleep();
			ani.jump();
			ani.house();
			System.out.println("---------------------------------------------------------------");	
		
		Dog dg = new Dog();		// created an object using constructor of a class "Dog" which is held by RV dg of type "Dog"
			dg.sleep();								// Child have access to both child and parent property
			dg.jump();
			dg.eat();
			dg.bite();
			dg.house();			// from child class
			System.out.println("---------------------------------------------------------------");	
			
		Animal ani01 = new Dog();					// Parent on left , Child on right - Only possible combination
			ani01.sleep();
			ani01.jump();
			ani01.house();
	}

}


// Inheritance
// When parent and child have same method -
// from line 13 and line 21 - Right hand side object will decide which one to call - in this case child house
//                            Left hand side will decide what all things it can access