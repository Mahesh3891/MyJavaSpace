package overriding;

public class Animal1 {

	String size;
	String colour;
	String gender;
	int age;
	
	public void hunt() {
		System.out.println("I am in Animal hunt");
	}
	
	public void eat() {
		System.out.println("I am in Animal eat");
	}
	
	public void sleep() {
		System.out.println("I am in Animal sleep");
	}
	
	public void breed() {
		System.out.println("I am in Animal Breed");
	}
	public void sound() {
		System.out.println("I am in Animal sound");
	}
	
}


//Overriding - Overwriting
//Inheritance between the class.

//Example
//Class Dog1 has method "sound"
//Class Animal1 has also method "sound"

//The method "sound" of class "dog"  has overriding the method "sound" of the class "Animal"
//For overriding the methods should be in different class.
// The name and parameter of the method should be same for overriding + diff class
