import java.util.Scanner;
/*
 * De Torres, Vincent S.
 * 14 February 2019
 * CIS 111
 * 
 *  - Ask for user name, middle name and last name.
 *  - Program then ask user to yype in test scores.
 * 	- Program prints out fullname and the test scores average.
 */

public class gradeClas {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println ("GRADE CALCULATOR");
		
		System.out.println ("Name");
		
		System.out.print ("	First Name:");
		String firstName = keyboard.nextLine();
		
		System.out.print ("	Middle Name:");
		String midName = keyboard.nextLine();
		
		System.out.print ("	Last Name:");
		String lastName = keyboard.nextLine();
		
		System.out.println ("\n\t Provide the following test scores");
		
		System.out.print ("\n Test # 1 : ");
		double scre1 = keyboard.nextDouble();
		
		System.out.print ("\n Test # 2 : ");
		double scre2 = keyboard.nextDouble();
	
	double avrge = ( ( (scre1 + scre2) /20.0 ) * 100 );
	
	System.out.println ("\nName: " + firstName + " " + midName + " " + lastName);
	System.out.print ("Grade: " + avrge + "%");

	}

}
