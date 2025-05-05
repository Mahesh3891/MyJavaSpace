package conditionalstatements;											// Package conditionalstatements

public class ifElseMethod {												// Class ifElseMethod

	public String checkDay(String day) {								// Method checkday - Calling Method from Main Method
		
		String result = "Anyday";										// Instance Variable
		
		if (day == "Sunday") {											// Start of If-Else Block
			System.out.println("Method: Today is Sunday");
			result = "Sunday";											
		}
		else if (day == "Monday") {
			System.out.println("Method: Today is Monday");
			result = "Monday";
		}
		else if (day == "Tuesday") {
			System.out.println("Method: Today is Tuesday");
			result = "Tuesday";
		}
		else if (day == "Wednesday") {
			System.out.println("Method: Today is Wednesday");
			result = "Wednesday";
		}
		else if (day == "Thursday") {
			System.out.println("Method: Today is Thursday");
			result = "Thursday";
		}
		else if (day == "Friday") {
			System.out.println("Method: Today is Friday");
			result = "Friday";
		}
		else if (day == "Saturday") {
			System.out.println("Method: Today is Saturday");
			result = "Saturday";
		}
		
		return result;
	}
	
		public static void main(String[] args) {							// Main Method
		
		ifElseMethod ifelsetest = new ifElseMethod();						//Object with reference Variable ifelsetest
		String finalResult = ifelsetest.checkDay ("Friday");
		
		System.out.println("If Else Practice Final Result executed from the Main class and data processed via Object:" + finalResult);
		
	}

}
