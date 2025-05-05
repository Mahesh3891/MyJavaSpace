package inheritance;				// Multi Level Inheritance

public class TestClassNew {

	public static void main(String[] args) {
		System.out.println("-- Multi Level Inheritance --");
		//Animal ani01 = new Labrador();		// Lab is held by Animal - 
		Dog ani02 = new Labrador();
		ani02.sleep();							//Dog can access Animal class
		ani02.bite();
		//ani02.jump();							// Not possible - Dog cannot access Labrador
	}

}
