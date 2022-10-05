/* Vincent De Torres
 * 
 * CIS 111
 * 21 February 2019
 * 
 * Calculate bill base on package type and hours used.  
 * Recommends better package type base on usage.
 *
 *PSEUDOCODE 
 *
 *	STEPS 
 *		1. Take the package letter
 *		2. Take the monthly usage
 * 	
 * Possible out comes
 * 
 * 	a. User input Package A
 *		a.1 Check if the usage (in hours) is greater than 10 [min hour]
 *			if so...
 *				a.1.1 Compute the additional payment per hour (( number of hours - 10 ) * $2.00 ))
 *				a.1.2 Compute the total amount ($12.95 + excess usage payment [a.1.1])
 *			else...
 *				b.1.1 Display the base pay ( $ 12.95 ) 
 *		
 *		
 *		a.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 *																						could be saving) 
 *			a.2.1 if usage is >= 13 but < 17	- recommend Package B
 *			a.2.2 if usage is >= 17				- recommend Package C
 *
 *
 *	b. User input Package B
 *		b.1 Check if the usage (in hours) is greater than 30 [ minimum hour]
 *			if so...
 *				b.1.1 Compute the additional payment per hour (( number of hours - 30 ) * $1.00 ))
 *				b.1.2 Compute the total amount ($17.95 + excess usage payment [b.1.1])
 *			else...
 *				b.1.1 Display the base pay ( $ 17.95 ) 
 *		
 *		
 *		b.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 *																						could be saving) 
 *			b.2.1 if usage is >= 1 but < 12 	- recommend Package A
 *			b.2.2 if usage is >= 38 			- recommend Package C
 *
 * c. User input Package C
 *		c.1 Check if the usage (in hours) is greater than 0 
 *			if so...
 *				c.1.1 Display base pay  ($25.95)
 *			else...
 *				c.1.2 Display error message 
 *		
 *		
 *		c.2 Check if there is a better PACKAGE SUBSCRIPTION to recommend base on usage (solve how much the user 
 *																						could be saving) 
 *			b.2.1 if usage is >= 1 but <= 12 	- recommend Package A
 *			b.2.2 if usage is >= 13 but <=37 	- recommend Package B
 *
 * d. User input neither of the three packages
 *		d.1 Display error message
 *	 
 */

import java.util.Scanner;
import javax.swing.JOptionPane;
public class labAssign3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
	String packageLetter;
	int numHours;
	double totalAmnt;
	int addHour;
	double basePay;
	String savings$;
			
			System.out.print("Package Purchased : ");
				packageLetter = keyboard.next();
				
			System.out.print("Monthly Usage (Hours) : ");
				numHours = keyboard.nextInt();
			
		// if user is using package 'a'
		if ( packageLetter.equals("a") ||  packageLetter.equals("A")){
			
			basePay = 12.95;
			
			if (numHours > 10)  { 	//executes when user put more than 10 hours			
				addHour = (numHours - 10);
				totalAmnt = ( basePay + ( addHour * 2) );
				 
				System.out.println ( "\nTotal Bill: " + "$" + totalAmnt);
				
					if ( (numHours >=13) && (numHours < 17) ) {  //recommend Package B (compute savings by subtracting the total amount to the base pay of Package B [17.95] since its less than Package B threshold)
						savings$ = String.format ( "%5.2f", (totalAmnt - 17.95)); 
						JOptionPane.showMessageDialog(null, "Base on your monthly usage we recommend a better package for you. \nYou could save $" + savings$ + " if you upgrade to PACKAGE B!");
					}
					
					else if ( (numHours >=17) ) { 			//recommend Package C  (compute savings by subtracting the total amount to the base pay of Package C [25.95] since its less than Package C threshold)
						savings$ = String.format ( "%5.2f", (totalAmnt - 25.95)); 
						JOptionPane.showMessageDialog(null, "Your usage is too high for this package, we recommend getting the unlimited package. You could save $" + savings$ + " if you upgrade to PACKAGE C!");
					}
					
					else { //no recommendation
						JOptionPane.showMessageDialog(null, "Thank You for your Payment!");
					}
			}
				
				else if ((numHours > 0) && (numHours <=10)) {  //less than 10 just pay the base amount
					System.out.println("\nTotal Bill: " + "$" + basePay);
					JOptionPane.showMessageDialog(null, "Thank You for your Payment!");
				}
			
				else { //executes when user put less or equal to 0 hours 
					JOptionPane.showMessageDialog(null, "Input VALID number of hours!");
				}
			}
	
	// if user is using package 'b'
		else if ( packageLetter.equals("b") ||  packageLetter.equals("B") )
			{
			
				if (numHours > 30)   // solve for additional payment per hour
				{
								
					addHour = (numHours - 30);
					basePay = 17.95;
					totalAmnt = ( basePay + ( addHour * 1) );
					 
					System.out.println ( "\nTotal Bill " + "$" + totalAmnt);	

						if ( (numHours >38) ) { // recommend the Package C  (solve the savings by subtracting the total amount to $25.95 [base pay for package C] ) 
							savings$ = String.format ( "%5.2f", (totalAmnt - 25.95)); 
							JOptionPane.showMessageDialog(null, "Your usage is too high for this package, we recommend getting the unlimited package.You could save $" + savings$ + " if you upgrade to PACKAGE C!");
						}
						
						else if ( (numHours >= 31) && (numHours <= 37) ){  //no recommendation
							JOptionPane.showMessageDialog(null, "Thank You for your Payment!");
						}
						
						
						else { // package b and package c  equal price intersection
							JOptionPane.showMessageDialog(null, "Get an unlimited usage with the same price you are paying, upgrade to PACKAGE C");
						}
					}		
				
			
					
				else if ( (numHours > 0) && (numHours <=30) )  //less than 30 just pay the base amount
				{
						basePay = 17.95;
						System.out.println("\nTotal Bill: " + "$" + basePay);
						
						
						if ( (numHours >=1) && (numHours <= 10) ) { // recommend the Package A (compute savings by simply subtracting the base pay with $12.95 [base pay of package A])
							savings$ = String.format ( "%5.2f", (basePay - 12.95)); 
							JOptionPane.showMessageDialog(null, "Your usage is too low for this package. You could save $" + savings$ + " if you downgrade to PACKAGE A!");
						}
						
						else if ((numHours == 11) || (numHours ==12)) { // recommend the Package A (compute savings by subtracting base pay [$ 17.95] to the total if Package A was applied )
							double pckA = ((numHours - 10 )* 2);
							savings$ = String.format ( "%5.2f", (basePay - (12.95 + pckA))); 
							JOptionPane.showMessageDialog(null, "Your usage is too low for this package. You could save $" + savings$ + " if you downgrade to PACKAGE A!");
						}
						
						else { //no recommendation 
							JOptionPane.showMessageDialog(null, "Thank You for your Payment!");
						}
			
				}	
				
				else { //handle invalid numHours
					JOptionPane.showMessageDialog(null, "Input VALID number of hours!");
				}
			}
	
	// if user is using package 'c'
		else if ( packageLetter.equals("c")||  packageLetter.equals("C") )
			{
			 if (numHours > 0)  { // valid numHours
					totalAmnt = (25.95);
					System.out.println("\nTotal Bill " +  "$" + " " +  totalAmnt);
			
						
					if ( (numHours >=1) && numHours <=12 ) { //recommend Package A
								if ((numHours >=1) && (numHours<=10)) {  // (compute savings by simply subtracting the base pay with $12.95 [base pay of package A])
									savings$ = String.format ( "%5.2f", (25.95 - 12.95)); 		
								}
								else {                                  // (compute savings by subtracting base pay [$ 25.95] to the total if Package A was applied )
									double pckA = ((numHours - 10) * 2 );
									savings$ = String.format ( "%5.2f", (25.95 - (12.95 + pckA ))); 	
								}
								JOptionPane.showMessageDialog(null, "Your usage is too low for this package. You could save $" + savings$ + " if you downgrade to PACKAGE A!");
						}
								
						
					else if ( (numHours >= 13) && (numHours <= 37) ){  //recommend Package B
							if ( (numHours >= 13) && (numHours <= 30) ){ // (compute savings by simply subtracting the base pay with $17.95 [base pay of package B])
								savings$ = String.format ( "%5.2f", ( 25.95 - 17.95)); 
							}
							else {										// (compute savings by subtracting base pay [$ 25.95] to the total if Package B was applied )
								double pckB = ((numHours - 30) * 1 );
								savings$ = String.format ( "%5.2f", (25.95 - (17.95+ pckB )));
							}
							JOptionPane.showMessageDialog(null, "You could be saving more ! Base on your usage we recommend downgrading to PACKAGE B and save $" + savings$ +".");
						}
						
						
					else { // no recommendation
							JOptionPane.showMessageDialog(null, "Thank You for your Payment!");
						}
				}
				
			  else { // invalid numHours
						JOptionPane.showMessageDialog(null, "Input VALID number of hours!");
					 }
			}
	
	// If User input package other than (A, B, C, a, b, c)
		else {
			JOptionPane.showMessageDialog(null, "Input VALID subscription package!");
		
		}
					
			
}
}		
		
			
