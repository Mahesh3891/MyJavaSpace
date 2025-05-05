package inheritanceExample1;

public class LogicTest extends TestCase {			// Child class

	public void execute() {
		System.out.println("Child: Executing Login Test: Verifying user Login Functionality");
	}
	
	public void validateLoginSuccess() {
		System.out.println("Child: Validating that login was succesfully");
	}
	
}
