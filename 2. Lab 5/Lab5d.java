// Lab5d
// Harley Combest
// 60787

import java.util.*;

public class Lab5d
{
	public static void processLine(String line){



        }




	public static void processLine(String line)
        {
                // Scan the input
                Scanner scan = new Scanner(System.in);

                // Process each line separately
                // If the next token is a double, assume there is an inputline
                while (scan.hasNextDouble())
                {
                        //Get a line from the input
                        String line = scan.nextLine();

                        // Create a scanner for the line of input you have read
                        Scanner lineScan = new Scanner(line).useDelimiter("\\s");

                        // Write a while loop that will sum all of the
                        // double values on the line (hint: create double
                        // variables called "sum", "product", and "count".
                        // Set sum and count to 0, and product to 1.
                        // Then read as many double values
                        // as you can using the while loop When you read
                        // a number, add it to sum, multiply product by it,
                        // and add 1 to count.

                        double sum = 0,product = 1,count = 0,average;
                        try{

                        while (lineScan.hasNext())
                        {
                                double value = lineScan.nextDouble();
                                sum = sum + value;
                                product = product*value;
                                count = count +1;
                        }

                        // Compute the average by dividing the sum by count
                        average = sum/count;



                        // Print out the sum, product, and average on one line
                        System.out.println("Sum = "+ sum + "Product= "+ product + "average= " +average);
                        }
                                catch(Exception e)
                        {


                	}
        	}
	}

}
