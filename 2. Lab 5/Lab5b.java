// Lab 5b // Harley Combest
// 60787

import java.util.*;

public class Lab5b{

        public static void main(String [] args){

                double [] a = {1, 0, 0};
                double [] b = {0, 1, 1};
                double [] c = {1, 1, 1};
                double [] d = {0, 0, 1};

               // double ab = Math.sqrt(
                     //   (a[0] - b[0]) * (a[0] - b[0]) +
                      //  (a[1] - b[1]) * (a[1] - b[1]) +
                      //  (a[2] - b[2]) * (a[2] - b[2]) );

               // double ac = Math.sqrt(
                  //      (a[0] - c[0]) * (a[0] - c[0]) +
                    //    (a[1] - c[1]) * (a[1] - c[1]) +
                      //  (a[2] - c[2]) * (a[2] - c[2]) );

                //double ad = Math.sqrt(
                  //      (a[0] - d[0]) * (a[0] - c[0]) +
                    //    (a[1] - d[1]) * (a[1] - d[1]) +
                      //  (a[2] - d[2]) * (a[2] - d[2]) );

		double ab = calDis( a, b)  ;

                System.out.println("ab=" + ab);

	
	}

	public static double calDis(  double[] a, double[] b)

		{
			return(Math.sqrt( ( a[0]-b[0] )*( a[0] - b[0] ) + ( a[1] - b[1] )*( a[1] - b[1]) + ( a[2] - b[2] )*( a[2]-b[2] ) ) ); 


		}

}


