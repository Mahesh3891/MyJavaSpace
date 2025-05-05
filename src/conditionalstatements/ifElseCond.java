package conditionalstatements;

public class ifElseCond {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		if (x > y) {
			System.out.print("The value x is greater the y");
		}
		else {
			System.out.println("The value x is less than y");
		}
		
		boolean isRainy = true;
		
		if (isRainy) {
			System.out.println("It is raining since morning");
		}
		else {
			System.out.println("It is not raining as expected");
		}
		
		int age = 40;
		
		if (age >= 18) {
			System.out.println("He / She is eligible to vote in the elections");
		}
		else {
			System.out.println(" The eligible age to cast vote is greater the 18 and you are not allowed to cast your vote");
		}
		
		double balance = 1234.00;
		if (balance > 9999) {
			System.out.println("The minimum bank balance is maintained");
		}
		else {
			System.out.println("The minimum bank balance is not maintained, hence a fine of 0.25% charges will be charged");
		}
			
	}

}
