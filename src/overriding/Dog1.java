package overriding;

public class Dog1 extends Animal1 {		// inheritance

	public void sound() {						// Overriding
		System.out.println("Dog barks");
	}
		
	public void sound(String abc) {				// Not overriding
		System.out.println("Dog barks");		// as parameters are not same
	}
	
	public void smell() {
		System.out.println("Dog smells");
	}
	
	public void bite() {
		System.out.println("Dog bites");
	}
	
}


// if we are trying to override a static method in a child class java does not allow that.
// ex: Static method "sound" in parent class "Animal1" - Non static method "sound" in child
// class "Dog1"