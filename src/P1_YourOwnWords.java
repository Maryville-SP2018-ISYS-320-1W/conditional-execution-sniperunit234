import java.util.Scanner;

/*
	ISYS 320
	Name(s):
	Date: 
*/

/*  EXAMPLE
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 0 -> TRUE
2, 1, 0 -> FALSE
*/

/* 1. 
-- Your conditional expression
y > z

-- Your test values for x, y, z and do you expect true or false?
1, 2, 3 -> TRUE
3, 2, 1 -> False
*/

/* 2. 
-- Your conditional expression
x < y

-- Your test values for x, y, z and do you expect true or false?
1, 2, 3 -> TRUE
3, 2, 1 -> False
*/

/* 3.  
-- Your conditional expression


-- Your test values for x, y, z and do you expect true or false?

*/

/* 4.  
-- Your conditional expression


-- Your test values for x, y, z and do you expect true or false?

*/

public class P1_YourOwnWords {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Enter test values for x, y, and z, separated by spaces: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Replace the conditional test, x < y below with your conditional expression to verify it is correct
		// using your test values
		if( x < y ) {
			System.out.println("The test was TRUE");
		} else {
			System.out.println("The test was FALSE");
		}

	}

}
