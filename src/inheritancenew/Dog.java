package inheritancenew;

public class Dog extends Animal {
	
	int childAge = 10;
	String childGender = "Female";
	
	public void eat() {
		String childLocVariable = "I am child local variable"; 	// Local Variable - valid for this method only
		System.out.println("Dog eats");
		System.out.println("Animal class: " + parentAge);
		System.out.println(childLocVariable);		
		//System.out.println("Animal class: " + parentGender);
		//System.out.println("Animal class: " + localVar);		// local variable cannot be accessible
		//bite();
		//sleep();
		//jump();
	}
	
	public void bite() {
		System.out.println("Dog bites");
		System.out.println("Animal class: " + parentAge);
		//System.out.println("Animal class: " + parentGender);	// Private to Animal Class only
		System.out.println("Animal class: " + parentGender1);
		//eat();
		//sleep();						// Child can access both child and parent members
		//jump();							// Members here are both variable and method	
	}
}
