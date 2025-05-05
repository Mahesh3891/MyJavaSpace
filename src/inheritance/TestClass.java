package inheritance;

public class TestClass {

	public static void main(String[] args) {
		
	Animal ani = new Animal();					// Right hand side part is called Object
												// Creating an Object with a "new" keyword and using a constructor of Animal Class
												// And this is held by Reference Variable "ani" of Data type Animal (Left side)
	
	ani.eat();									// Parent can access its own property
	//ani.smell();								// Compile time error				
	System.out.println("-------------------------------------------------------------------------------------");
	
	Dog dogRv = new Dog();						//dogRv(Reference Variable) is holding the object of the child class (Dog)
	
		dogRv.smell();							//Child can access its own property
		dogRv.breed();							//Child can also access its parents property
	
		System.out.println("-------------------------------------------------------------------------------------");
	
	Animal ani01 = new Dog();					//used in the real time	; Child is holding a parent: Correct
												// we created an object using constructor of a class "Dog" which is held by the ref. variable ani01 of type Animal
												// Parent on Left : Child on Right side
	//Dog dog01 = new Animal ();				// Compile time error: Not possible; Child cannot hold a parent
	ani01.sleep();
	//ani01.bite();								// Reference Variable can access only those thing which the parent has (own method)
												// Parent(Animal) cannot access child's property (bite)	
	ani01.sound();								// sound is from Dog class, not from Animal's class - Object Dog will decide
	
	System.out.println("-------------------------------------------------------------------------------------");
	
	Animal ani02 = new Animal();
	
	ani02.sleep();
	ani02.sound();
	
	}
	
}

// Parent can access its own property
// Parent cannot have access to child property
// Child have access to its parent property


//Compile time error: We get this error before Running the code
//Run time error: We get this error after running the core

// Line 19 can also be read as: ani01 is a reference variable of type Animal which is holding an object of Dog - Parent can hold Child
