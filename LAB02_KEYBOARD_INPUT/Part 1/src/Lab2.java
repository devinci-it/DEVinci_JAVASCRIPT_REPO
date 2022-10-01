import java.util.Scanner;

/*
 * De Torres, Vincent S.
 * 14 February 2019
 * CIS 111
 * 
 * LAB Assignment # 2 (Part 1)
 */

public class Lab2 {

	public static void main(String[] args) {
	
		
	Scanner keyboard = new Scanner (System.in);
	
		System.out.println ("Provide the following information:");
		
		System.out.println ("Name");
		
		System.out.print ("	First Name:");
		String firstName = keyboard.nextLine();
		
		System.out.print ("	Middle Name:");
		String midName = keyboard.nextLine();
		
		System.out.print ("	Last Name:");
		String lastName = keyboard.nextLine();
		
		System.out.println ("Address");
			System.out.print ("		House Number:");
			int houseNmbr = keyboard.nextInt();
			
			keyboard.nextLine();
			System.out.print ("		Street:");
			String strtName = keyboard.nextLine();
			
			System.out.print ("		City:");
			String cityName = keyboard.nextLine();
			
			System.out.print ("		State:");
			String stateName = keyboard.nextLine();
			
			System.out.print ("		Zip Code");
			int zipCode = keyboard.nextInt();
			
			
			System.out.print ("\n Telephone #: ");
			long telophneNum = keyboard.nextLong();
		
		System.out.println (" ");
		System.out.println ("Name: " + firstName + " " + midName + " " + lastName);
		System.out.println ("Adress: " + houseNmbr + " " + strtName + " " + cityName + ", " + stateName + " "+  zipCode );
		System.out.println ("Telephone Number:  " + telophneNum  );

		

	}

}
