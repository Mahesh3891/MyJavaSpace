package overloading;

public class Overload {

	static String name = "Mahesh";			
	
	public static int add(int a, int b) {									// Parameterized
		int sum = a+b;
		return sum;
	}
	
	public static int add(int a, int b, int c) {									
		int sum1 = a+b+c;
		return sum1;
	}

	public static int add(int a, int b, String c) {									
		return 2;
	}
	
	public static int add(String a, int b, int c) {									
		return 3;
	}
	
	public static int add(String a, int b, String c) {									
		return 4;
	}
	
	public static int sub(int a, int b ) {		// this is not method overloading as the method names are 
		int sub = a-b;							//different when compare to "add" - with same data type 
		return sub;								//and parameters a,b	
	}

	public static String sub(int a, String b ) {		 
		return " ABC";									
	}
		
}

// The ways we can achieve Overloading
// 1. Keep the total number of parameter different for the method
// 2. Keep the type of the parameter different
// 3. Keep the order of parameter different

// Condition for Method overloading is the method names should be same - in this case it is "add".
// They should be in the same class