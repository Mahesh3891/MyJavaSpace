package school;

public class Student {

	final static String schoolName = "Karunya University";			// is static, will get over written | if not static, will be static
	static String classTeacher = "Mr. Who";						// alternatively give "final" to block the variable in getting change
	
	String name;
	int rollNumber;
	
	public int totalMarks (int physics, int chemistry, int maths) {				// Method which will return the totalMarks from Main method
		return physics + chemistry + maths;
	}
	
	public String getStudentDetails(Student studentDetails) {				// Student = Class used here 		
																			// Method which will return all the details of student from Main method
		String studentName =studentDetails.name;
		int studentRollNumber = studentDetails.rollNumber;
		String schoolName1 = studentDetails.schoolName;
		
		return "Student Details are: " + studentName + " " + studentRollNumber + " " + schoolName1;
	}
	
}



// Pascal vs Camel Casing
// Camel case:  The first word starts with lowercase and each subsequent words starts with an uppercase letter. Commonly used for naming variables, methods and sometimes parameters
// Pascal case: Every work starts with an uppercase, including the first one. Commonly used for naming classes,interfaces,enums.

// camelCase 	- studentName
// PascalCase	- StudentDetails