package dummypackage;

public class HumanFaceTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanFace hf01	= new HumanFace();
		
		hf01.eat();							// Access Method outside the class
		System.out.println(hf01.ears);		// Access Variable outside method
	
	}

	public void test() {
		HumanFace hf02 = new HumanFace();
		hf02.eat();
		//System.out.println(hf01.ears);	// hf01 is not local variable
		System.out.println(hf02.ears);
	}
	
}


//Notes
// We can access methods within and outside the class
// Eclipse provide us an option to pick the variable,methods from the dropdown called as Intelisence
//Static Main method can access members from another class
// Non static also can access members from another class