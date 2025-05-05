package conditionalstatements;

public class swithBlock {

	public String checkDay(String day) {								// Method checkday
		
		String result = "Anyday";										// Instance Variable
		
		switch (day) {
		
		case "Sunday":{
			System.out.println("Method: Today is Sunday");
			result = "Sunday";
			break;
		}
		case "Monday":{
			System.out.println("Method: Today is Monday");
			result = "Monday";	
			break;
		}
		case "Tuesday":{
			System.out.println("Method: Today is Tuesday");
			result = "Tuesday";
			break;
		}
		case "Wednesday":{
			System.out.println("Method: Today is Wednesday");
			result = "Wednesday";
			break;
		}
		case "Thursday":{
			System.out.println("Method: Today is Thursday");
			result = "Thursday";
			break;
		}
		case "Friday":{
			System.out.println("Method: Today is Friday");
			result = "Friday";
			break;
		}
		
		default:
			System.out.println("Day mentioned is wrong");
		}
		
		return result;
		
	}	
	
	public static void main(String[] args) {
		
		swithBlock se = new swithBlock();
		String switchResult = se.checkDay ("Thursday");
		
		System.out.println("Final Result executed from the Main class and data processed via Object:" + switchResult);
	}

}
