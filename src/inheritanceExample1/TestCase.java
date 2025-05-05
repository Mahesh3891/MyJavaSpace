package inheritanceExample1;

public class TestCase {					// Parent class
	
	public void setup() {
		System.out.println("Parent: Setting up the Test Environment");
	}
	
	public void execute() {
		System.out.println("Parent: Executing the test...");
	}
	
	public void teardown() {
		System.out.println("Parent: Cleaning up after the test...");
	}
}
