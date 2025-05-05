package loops;

public class ForLoop {

	public static void main(String[] args) {
		// loop - repeat lines of code when a condition is true.
		//int num;			//declaration
		//int num01 = 01;		// initialization	
		int i;
		for(i = 0 ; i < 10 ; i++ ) {							// i can initialize "i" in the for loop as well ==> for (int i=0, i<10, i++);
			System.out.println("Number i is : " + i);
		
		if (i == 2) {
			System.out.println("Breakpoint at i = 2");
			break;												// Break is used to stop the loop
		}		
		}
		
		for (int j = 0; j < 5; j++) {							// for - when you know the iteration count or details (no of times)
			if (j==2) {
				continue;										// Continue is used to skip to the next iteration.
			}
			System.out.println(" Number j is : " + j);
		}
		
		int k = 0;		
		while (k < 3) {											// while - based on condition loop is executed. (Repeat over a condition)
			System.out.println("  Number k is: " +  k );
			k++;	
		}
		
		int l = 0;
		do {
			System.out.println("   Number l is: " + l);			// execute atleast once 
			l++;
		} while (l<3);
	}
}

// initialization
//condition check
// increment / decrement
//i++ => i = i+1   || i-- => i = i-1
//Break is used to stop the loop


