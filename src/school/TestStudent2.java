package school;

public class TestStudent2 {

	public static void main(String[] args) {
		
		Student stu = new Student();					// Object ; Ref Variable: Stu
		stu.name = "Mahesh";							// Name of the Student 1
		stu.rollNumber = 504;							// Roll Number of Student 1
		//stu.schoolName = "Naagarjuna High School";	
																									
		String result = stu.getStudentDetails(stu);		// Takes all these data from object to class "Student"	
		System.out.println (result);
		
		int totalMarks = stu.totalMarks(10, 20, 30);	// argument data is taken to method totalMarks in class Student,... 
		System.out.println(totalMarks);					// ... calculates the total and returns the output to totalMarks and prints the data

		//Student stu2 = new Student();
		stu.name = "Sandhya";
		stu.rollNumber = 405;
		//stu.schoolName = "Amala High School";			//Do not try to change the static variable data when it should be fixed	
		
		String result2 = stu.getStudentDetails(stu);
		System.out.println(result2);
		
		totalMarks = stu.totalMarks(30, 40, 50);
		System.out.println(totalMarks);
		
		Student stu3 = new Student();
		System.out.println(stu3.schoolName);
	}

}
