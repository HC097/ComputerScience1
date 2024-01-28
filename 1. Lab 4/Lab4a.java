// Lab 4a
// Harley Combest
// 60787
// This program will print user's current academic year by the user

import java.util.*;

public class Lab4a
{

	public static void main(String[] args)
	{
		// Declare five String constants, one for each year of possible input

 		final String YEAR1= "freshman";
		final String YEAR2= "sophomore";
		final String YEAR3= "junior"; 
		final String YEAR4= "senior";
		final String YEAR5= "grad";

		// User input for current year
		int academicYear;

		// Create a scanner object to read in data
		Scanner keyboard = new Scanner( System.in);

		// Write code to prompt the user for a year number
		// Then, store the number into academicYear. You may
		// assume that the user will enter a valid number.
		
		System.out.println(" What year, from  1 to 5, of college are you in?  ");
		academicYear = keyboard.nextInt();

		// Write a series of if ... else if ... else statements
		// to print out what year you are based on the int read in. 
		// If a 1 is entered print "Freshman"
		// If a 2 is entered print "Sophomore"
		// If a 3 is entered print "Junior"
		// If a 4 is entered print "Senior"
		// If a 5 is entered print "grad"
		// If something beside those five numbers was entered,
		// Print an error message and quit the program.
		
		if (academicYear == 1)
			System.out.printf("Freshman");
		else if (academicYear == 2)
			System.out.printf("Sophomore");
		else if (academicYear == 3)
			System.out.printf("Junior");
		else if (academicYear == 4)
			System.out.printf("Senior");
		else if (academicYear == 5)
			System.out.printf("grad");
		else
			System.out.printf("ERROR");

	}//End of Main()
}//End of class

