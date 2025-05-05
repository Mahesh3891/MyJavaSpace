package inheritanceExample1;

public class TestRunning {						//Main class to run the test
	
	public static void main(String[] args) {
		
		LogicTest test = new LogicTest();		
		
		test.setup();
		test.execute();
		test.validateLoginSuccess();
		test.teardown();

	}

}
