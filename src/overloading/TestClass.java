package overloading;

public class TestClass {

public static void main(String[] args) {
		
		Overload overloadTest = new Overload();			
		
		int finalnum = Overload.add(10, 10);
		finalnum = Overload.add(10, 20, 30);
		finalnum = Overload.add(10, 20, "A");
		//finalnum = Overload.add("A", "B", "C");		// There is no Method
		
		finalnum = Overload.sub(20, 10);
		String finalnum1 = Overload.sub(20, "A");
		
	}	
}


//Edge cases
//Change the return type - we can achieve method overloading
