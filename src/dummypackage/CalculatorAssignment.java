package dummypackage;

public class CalculatorAssignment {										// Java Class with the name CalculatorAssignment

	public void add() {											// Static Method for Addition
		System.out.println(90+110);
	}
	
	public void subtract() {											// Non static for Subtraction
		System.out.println(350-50);
	}
	
	public void multiple() {											// Non static for Multiplication	
		System.out.println(200*2);
	}
	public void division() {											// Non static for Division using fraction numbers	
		System.out.println(1250f/2.5f);	
	}
		
	public static void main(String[] args) {							// Main Method
		
		CalculatorAssignment Cal01 = new CalculatorAssignment();		//Object 
		
		Cal01.add();
		Cal01.subtract();
		Cal01.multiple();
		Cal01.division();
	}
	
	public void test() {
		add();
		subtract();
	}
}
