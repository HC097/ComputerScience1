// Lab4b
//Harley Combest
//60787

/* This program will read in from a file a series of numbers in degrees
Celsius, convert them to degree Fahrenheit and print out a table of
those values. The file input is handled using the command line's
redirection mechanism. */

import java.util.Scanner;

public class Lab4b
{
	public static void main(String[] args)
	{
	//Declare variables
	Scanner scan = new Scanner(System.in);

	double degreeCelsius;
	double degreeFahrenhiet;

	//Print to screen the header of the output table
	//as seen in the sample run below.
	//There are two lines in the header.
	//Make sure it has the right spacing to line up with the table.
	System.out.println("Celsius\tFahrenhiet" );


	//Write your loop here
	//We want to loop until there are no more inputs to be read.
		
	while(degreeCelsius != -999.99 )
	{
		//Check to see if the input is a double.
		//If a double read in and store in degreeCelsius.
		//If not a double print an error message and quit.
		if(degreeCelsius instanceof Double)
			degreeCelsius = scan.nextDouble();
		else
		{

			System.out.println("Error");
			System.exit(-1);
		}

		//Convert input degrees Celsius to degrees Fahrenheit
		//and store in degreeFahrenheit.
		//f = c * (9.0/5.0) + 32.0
		degreeFahrenhiet = degreeCelsius * (9.0/5.0) +32.0;



		//Display to the screen the output as shown in the
		//sample run below. Use System.out.printf. Make sure
		//that everything lines up properly.
		System.out.printf("%.2f \t %.2f \n \n ",  degreeCelsius, degreeFahrenheit);


}//End of Loop
	}//End of main method
		}//End class

