package inheritancenew;

public class TestClass {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
			//ani.parentAge;							// Variables should be used - like print etc.,
			//ani.parentGender;						// Called as compile type error
			//ani.childAge;
			//ani.childGender;
		
			System.out.println(ani.parentAge);
			//System.out.println(ani.parentGender);
			//System.out.println(ani.childAge);		// Parent Type (Class) Object cannot access Child class members 
			//System.out.println(ani.childGender);	// Ex: Parent cannot have access to Child property
		
			ani.sleep();
			ani.jump();
			//ani.eat();								// Parent Type (Class) Object cannot access Child class members
			//ani.bite();
		
			//System.out.println("Dog Class: " + childLocVariable);		// Local variables of other class cannot be accessed. 
			//System.out.println("Animal class: " + localVar);
			
		Dog dg = new Dog();		// created an object using constructor of a class "Dog" which is held by RV dg of type "Dog"
		
			//dg.parentAge;
			//dg.parentGender;						// Compile type error - Marked with red underline marking
			//dg.childAge;
			//dg.childGender;
		
			System.out.println(dg.parentAge);		// Child Object can access parent members 
			//System.out.println(dg.parentGender);	// Child have access to parent property
			System.out.println(dg.childAge);
			System.out.println(dg.childGender);

			dg.sleep();								// Child have access to both child and parent property
			dg.jump();
			dg.eat();
			dg.bite();
			

		Animal ani01 = new Dog();					// Parent on left , Child on right - Only possible combination
			//ani01.parentAge;						// ani01 is a RV of type Animal which is holding an object of Dog
			//ani01.parentGender;						// Parent is holding a child
			//ani01.childAge;
			//ani01.childGender;
	
			System.out.println(ani01.parentAge);
			//System.out.println(ani01.parentGender);
			//System.out.println(ani01.childAge);
			//System.out.println(ani01.childGender);
	
			ani01.sleep();
			ani01.jump();
			//ani01.eat();
			//ani01.bite();
		
		
		//Dog dg01 = new Animal();				// Not possible combination. Parent cannot be on right and vice versa
												// Child cannot hold a parent
				
		
		
	}

}
