public class lab1       // class 
{ 
	
public static void main(String[] args)   // main method 
{ 

                                                                                         //PART 1//   
    
    
// A) "//" Tells the computer that you're commenting.
   
 //B) Declared variables of all primitive data types in Java. 

    
    byte byteValariable=20;
    short shortVariable=22;
    int a;
    a =2;
    long d;
    d=234234123;
    float floatVariable = 3.77f;
    double doubleVariable=23.44;
    char charVariable='a';
    Boolean b =true;
    Boolean c =false;
    String name="java";
    
 //C) Declared and intialized a constant variable
 
 final int e;
 e=157;
 
 //D) Added an int to a double, and printed the result.
  // By doing this, I have used implicit casting.
  
    System.out.println(a+doubleVariable);
    
 //E) Printed the result as an int data type and, thus, used explicit casting.
 
    System.out.println((int)(a+doubleVariable));
    
 //F) Did the operation "3.3+2.3", and I explicitly cast it to an int data type.
 
    System.out.print((int)(3.3+2.3));
    
    
 //G) Divide byte =2 by a float = 3.3, casted it to a byte, and printed the result.
 
    byte J;
    J=2;
    float K;
    K=(float) 3.3;
    System.out.println((byte)(J/K));
    
 //H) Declared char ch=65; I, then, printed it out.
    // The value A was printed out and this is becuase, on the ASCII table,
    // 65 = A and ch=65.

    char ch=65;
    System.out.println(ch);
                                                                                   //PART TWO//

    
	//public static void main(String[] args) {

           // char a = 65;
          //System.out.println(a);     // what is printed out?
    
          //The value A from the ASCII Table is printed out.

          // char b = '?';
         // System.out.println((int)b);// what is printed out?
    
         //The value 63 is printed out.

           // char c = 'ص';
         //System.out.println((int)c);// what is printed out?

         //The value 1589 is printed out.



         //char d = -2; // provide an error , why?
    
         //It provides an error because there is no negative value on the ASCII Table.

         //byte var1 = 127;
        // byte var2 = 128; // provide an error, why?
    
   //It provides an error because byte has a positive range from 0 to 127.
    
    
   // short var3 = 32767;
   // var3 += 1; // provide an error, why?
    
   //It provides an error because short has a positive range from 0 to 32767.
   
   
   
//short var4 = 32768; // provide an error, why?

    //It provides an error because short has a positive range from 0 to 32767.

    // System.out.print(23 +"abc"); // what is the result?
    
    //The result is 23abc.
    
                                                                                       
//}



                                                                                        //PART THREE//



//Boolean a=true, b=false; 
//System.out.print( !a && !b || b); 

//A) The statement false was printed.

//System.out.print(1.3>=2);

//B) The statement false was printed.

//C)

//String str1="1234";

//int c =Integer.parseInt(str1);

//double d=Double.parseDouble(str1);

//D)

//int z=2;
//long y=3;
//float x=4;
//double w=5;
//byte v=6;

//char u='A';
//Boolean t=true, s=false;
//String r="Good Day Sir.";

                                                                                        //PART 4//

//Test non-century years here.
float q = (float)2000;
System.out.print(q/=4);
//If an even qoutient is given, then the year is a leap year.

System.out.print("\n");

//However, if the year is a centenial year, then it mustn't be divisible by 400 in order for it to be a leap year.
//Test century years here.
float p = (float)2000  ;

System.out.print(p/=400);

System.out.print("\n");

// Non-century years (centenial years) must meet qualification 1. 
// Centenial years must meet both qualifications.
//1.even, no decimals
//2.no decimals


//










}

}// end of the class 






