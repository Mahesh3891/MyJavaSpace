package school;

public class TestStudent {

	public static void main(String[] args) {
		
		Student stu = new Student();					// Object ; Ref Variable: Stu
		stu.name = "Mahesh";							// Name of the Student 1
		stu.rollNumber = 504;							// Roll Number of Student 1
		//stu.schoolName = "Naagarjuna High School";	
																									
		String result = stu.getStudentDetails(stu);		// Takes all these data from object to class "Student"	
		System.out.println (result);					// Gets string data from method "Student" to Result Reference Variable
		
		int totalMarks = stu.totalMarks(10, 20, 30);	// argument data is taken to method totalMarks in class Student,... 
		System.out.println(totalMarks);					// ... calculates the total and returns the output to totalMarks and prints the data
	
		Student stu2 = new Student();
		stu2.name = "Sandhya";
		stu2.rollNumber = 405;
		//stu.schoolName = "Amala High School";			//Do not try to change the static variable data when it should be fixed	
		
		String result2 = stu2.getStudentDetails(stu2);
		System.out.println(result2);
		
		int totalMarks2 = stu.totalMarks(30, 40, 50);
		System.out.println(totalMarks2);
		
		Student stu3 = new Student();
		System.out.println(stu3.schoolName);
		
		
	}

}


// if we change the value of the static variable using an object, that object will 
//change the value of the static variable permanently. 

// we need an object to access the member of the class. [Variable and Method = Member]
// ex: in order to access the schoolName (Variable)/totalMarks(method) of the class Student, we need object Stu1/Stu2/Stu3.
