package inheritance;

public class Labrador extends Dog{			// Labrador will have access to its own method as well as Dog method as well as Animal method.
											// Animla becomes grand parent of Labrador : Labrador becomes child of a child
	
	public void jump() {
		System.out.println("Labrador Jumps");
		
	}

}

//Java does not allow multiple inheritance classes
// This creates a diamond problem 
//Ex: Kia class has "Honk" method ; Motorbike class has "Honk" method
// Void main 
// Bajaj has an Object  -- Bajaj bj = new Bajaj();
// bj.honk(); 	-- Kia and Motorbike both has honk, and don't know what to call.'