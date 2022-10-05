/* Vincent De Torres
 * Ramez Haddad
 * 
 * CIS 111
 * 21 February 2019
 * 
 *Lab Assignment 3 (Extra Credit) - Alphabetically arrange user-inputed names.   
 *				 				Displaying '*' for similar names
 *
 *PSEUDOCODE 
 *	a. 
 *	  firstCase: name1 should go first on the list (nameOne is less than both names)
 *			a.1 start comparing name 2 and name 3
 *			possibilities 
 *				( < 0 )  : name 2 should come before name 3 
 *				( > 0 )  : name 3 should come before name 2
 *				( == 0 ) : order of name 2 and name 3 doesn't matter (put '*')
 *			additional possibilities
 *				( nameOne == nameTwo ) && ( nameOne < nameThree )
 *				( nameOne == nameThree) && ( nameOne < nameTwo )
 *				( nameOne == nameTwo) && (nameTwo == nameThree )
 *
 *	b. secondCase: name2 should go first on the list (nameTwo is less than both names)
 *		b.1 start comparing name 1 and name 3
 *			possibilities 
 *				( < 0 )  : name 1 should come before name 3 
 *				( > 0 )  : name 3 should come before name 1
 *				( == 0 ) : order of name 1 and name 3 doesn't matter (put '*')
 *			additional possibilities
 *				( nameTwo == nameOne ) && ( nameTwo < nameThree )
 *				( nameTwo == nameThree) && ( nameTwo < nameTwo )

 *	c. thirdCase: name3 should go first on the list (nameThree is less than both names)
 *		c.1 start comparing name 1 and name 2
 *			possibilities 
 *				( < 0 )  : name 1 should come before name 2 
 *				( > 0 )  : name 2 should come before name 1
 *				( == 0 ) : order of name 1 and name 2 doesn't matter (put '*')
 *			additional possibilities
 *				( nameThree == nameOne ) && ( nameThree < nameTwo)
 *				( nameThree == nameTwo) && ( nameThree < nameOne )
 * 
 */


import java.util.Scanner;
import javax.swing.JOptionPane;

public class labThreeExtraCredit {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
			String nameOne;
			String nameTwo;
			String nameThree;
			
			System.out.print("Input Name 1: ");
			nameOne = keyboard.next();
			
			System.out.print("Input Name 2: ");
			nameTwo = keyboard.next();
			
			System.out.print("Input Name 3: ");
			nameThree = keyboard.next();
			
			// name 1 is less than both	names
				
			if ( ( (nameOne.compareToIgnoreCase(nameTwo)< 0 ) || (nameOne.compareToIgnoreCase(nameTwo) == 0 ) )&&
				((nameOne.compareToIgnoreCase(nameThree) < 0 ) || (nameOne.compareToIgnoreCase(nameThree) == 0 )) )
				{
				System.out.println("\nNames are arranged alphabetically as follows: " );
				
					//compare name 2 and 3
					if ( ( nameTwo.compareToIgnoreCase(nameThree) < 0 ) && ( nameOne.compareToIgnoreCase(nameTwo) != 0 ) ) {
						System.out.println ("	" + nameOne);
						System.out.println ("	" + nameTwo);
						System.out.println ("	" + nameThree);
					}
					
					else if ( (nameTwo.compareToIgnoreCase(nameThree) > 0) && ( nameOne.compareToIgnoreCase(nameThree) != 0 ) ) {
						System.out.println ("	" + nameOne);
						System.out.println ("	" + nameThree);
						System.out.println ("	" + nameTwo);
					}
					
					/*cases where name 1 and name 2 are the same but both less than name 3  OR
					 name 1 and name 3 are the same but both less than name 2 */
				
					else if ((nameOne.compareToIgnoreCase(nameTwo) == 0) && (nameOne.compareToIgnoreCase(nameThree) < 0)) {
						System.out.println ("	" + nameOne + " *");
						System.out.println ("	" + nameTwo + " *");
						System.out.println ("	" + nameThree );
					}
					
					else if ((nameOne.compareToIgnoreCase(nameThree) == 0) && (nameOne.compareToIgnoreCase(nameTwo) < 0)){
						System.out.println ("	" + nameOne + " *");
						System.out.println ("	" + nameThree + " *");
						System.out.println ("	" + nameTwo );
					}
					else if ((nameTwo.compareToIgnoreCase(nameThree) == 0) && (nameTwo.compareToIgnoreCase(nameOne) > 0)){
						System.out.println ("	" + nameOne);
						System.out.println ("	" + nameThree + " *");
						System.out.println ("	" + nameTwo + " *");
					}
					
					else {
						System.out.println ("	" + nameOne+ " *" );
						System.out.println ("	" + nameThree + " *");
						System.out.println ("	" + nameTwo + " *");
					}
					
				}
			
			
			// name 2 is less than both names
			
			else if  (( (nameTwo.compareToIgnoreCase(nameOne) < 0 ) || (nameTwo.compareToIgnoreCase(nameOne) == 0)) &&
					  ( (nameTwo.compareToIgnoreCase(nameThree) < 0 ) || (nameTwo.compareToIgnoreCase(nameThree) == 0 )) )
			   {
				System.out.println("\nNames are arranged alphabetically as follows: " );
				
				
				//compare name 1 and 3
				if ( ( nameOne.compareToIgnoreCase(nameThree) < 0 ) && (nameTwo.compareToIgnoreCase(nameOne) != 0 ) ) {
					System.out.println ("	" + nameTwo);
					System.out.println ("	" + nameOne);
					System.out.println ("	" + nameThree);
				}
				
				else if ( (nameOne.compareToIgnoreCase(nameThree) > 0) && (nameTwo.compareToIgnoreCase(nameThree) != 0 ) ) {
					System.out.println ("	" + nameTwo);
					System.out.println ("	" + nameThree);
					System.out.println ("	" + nameOne);
				}
			
				/*cases where name 2 and name 1 are the same but both less than name 3  OR
				 name 2 and name 3 are the same but both less than name 1 */
				
				else if ((nameTwo.compareToIgnoreCase(nameOne) == 0) && (nameTwo.compareToIgnoreCase(nameThree) < 0)) {
					System.out.println ("	" + nameTwo+ " *");
					System.out.println ("	" + nameOne + " *");
					System.out.println ("	" + nameThree );
				}

				else if ((nameTwo.compareToIgnoreCase(nameThree) == 0) && (nameTwo.compareToIgnoreCase(nameOne) < 0)){
					System.out.println ("	" + nameTwo + " *");
					System.out.println ("	" + nameThree + " *");
					System.out.println ("	" + nameOne );
				}
			   
				else {
					System.out.println ("	" + nameTwo);
					System.out.println ("	" + nameThree + "*");
					System.out.println ("	" + nameOne + "*");
				}
				
			   }
			//name 3 is less than both names
		
				else if  (( (nameThree.compareToIgnoreCase(nameOne) < 0 ) || (nameThree.compareToIgnoreCase(nameOne) == 0)) &&
					  ( (nameThree.compareToIgnoreCase(nameTwo) < 0 ) || (nameThree.compareToIgnoreCase(nameTwo) == 0 )) )
			   {
				System.out.println("\nNames are arranged alphabetically as follows: " );
				
				
				//compare name 1 and 2
				if ( ( nameOne.compareToIgnoreCase(nameTwo) < 0 ) && (nameThree.compareToIgnoreCase(nameOne) != 0 ) ) {
					System.out.println ("	" + nameThree);
					System.out.println ("	" + nameOne);
					System.out.println ("	" + nameTwo);
				}
				
				else if ( (nameOne.compareToIgnoreCase(nameTwo) > 0) && (nameThree.compareToIgnoreCase(nameTwo) != 0 ) ) {
					System.out.println ("	" + nameThree);
					System.out.println ("	" + nameTwo);
					System.out.println ("	" + nameOne);
				}
			
				/*cases where name 3 and name 1 are the same but both less than name 3  OR
				 name 3 and name 2 are the same but both less than name 1 */
				
				else if ((nameThree.compareToIgnoreCase(nameOne) == 0) && (nameThree.compareToIgnoreCase(nameTwo) < 0)) {
					System.out.println ("	" + nameThree+ " *");
					System.out.println ("	" + nameOne + " *");
					System.out.println ("	" + nameTwo );
				}

				else if ((nameThree.compareToIgnoreCase(nameTwo) == 0) && (nameThree.compareToIgnoreCase(nameOne) < 0)){
					System.out.println ("	" + nameThree+ " *");
					System.out.println ("	" + nameTwo+ " *");
					System.out.println ("	" + nameOne );
				}
			   
				else {
					System.out.println ("	" + nameThree);
					System.out.println ("	" + nameTwo + "*");
					System.out.println ("	" + nameOne + "*");
				}
				
			   }
			
	

	}

}
