package conditionalstatements;

public class ifElseIfLadder {

	public static void main(String[] args) {
		
		int marks= 85;
		
		if (marks>=90) {
			System.out.println("Grade A");
		} 
		else if (marks >=80) {
			System.out.println ("Grade B");
		}
		else {
			System.out.println ("Grade C");
		}

		int temp = 15;
		
		if (temp < 0) {
			System.out.println("It's Freezing");
		}
		else if (temp < 20) {
			System.out.println ("It's very Cold");
		}
		else {
			System.out.println("It's warm");
		}
		
		
		int day = 7;
		
		if (day == 6) {
			System.out.println("Today is Saturday");
		}
		else if (day == 7) {
			System.out.println("Today is Sunday");
		}
		else {
			System.out.println("Today is not weekend");
		}
	}

}
