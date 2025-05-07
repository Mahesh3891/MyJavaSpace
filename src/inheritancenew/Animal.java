package inheritancenew;

public class Animal {
	
	public int parentAge = 33;								// Public - Access Modifier - Any class anywhere
	private String parentGender = "Male";					// Private - Within same class only
	String parentGender1 = "Male1";							// Default - with in the package (overridenew)	
	
	public void sleep() {
		String localVar = "I am Local Variable";			// Local Variable - valid for this method only
		System.out.println ("Animal sleeps");
		System.out.println("Animal class: " + parentAge);
		System.out.println("Animal class: " + parentGender);
		System.out.println(localVar);						// Variables should be used
		//jump();
		//eat();												//Parent cannot access child Methods
		//bite();												
		//System.out.println("Dog Class: " + childAge);		//Parent cannot access child variables
		//System.out.println("Dog Class: " + childGender);
	}
	
	public void jump () {
		System.out.println ("Animal jumps");
		System.out.println("Animal class:" + parentAge);
		System.out.println("Animal class:" + parentGender);
		//sleep(); 
		//eat();
		//bite();
		//System.out.println("Dog Class: " + childAge);
		//System.out.println("Dog Class: " + childGender);
		//System.out.println("Dog Class: " + childLocVariable);	// Local variable of other method/class cannot 
																// be accessable
	}

}
