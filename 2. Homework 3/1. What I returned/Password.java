import java.util.Scanner;

public class Password{

    /*(1 point| COMPLETE) Create a private static default password variable and set
      it to Def@u1tPa$$w0rd which meets the standards of accepted password*/

    private static final String PASSWORD="Def@u1tPa$$w0rd";

    //(1 point| COMPLETE) Create a private statice int length of the password and set to 8.

    private static final int LENGTH=8;

    // Private settings that should be met for each password instance /objects
    //(1 point) Create a private variable to store the number of symbols
    //(1 point) Create a private variable to store the number of capital letters
    //(1 point) Create a private variable to store the number of lower case letters
    //(1 point) Create a private variable to store the number of digits
    //(1 point) Create a private variable to store the password

    private int noOfSymbol=0,noOfCapital=0,noOfLowerCase=0,noOfDigits=0;
    private String password="";

    /** (6 points) Create the default constuctor, set the default required number
        for capital and lowercase letters, symbols, digits to 1
        set the password variable to the default password
    */

    Password()
    {
        noOfCapital=1;
        noOfDigits=1;
        noOfLowerCase=1;
        noOfSymbol=1;
        password=PASSWORD;
    }

    /** (6 points) Create an overloaded constructor, that takes
        number of ( symbols, capital letters, small letters, digits)
        these will be considered settings for initializing an instance of
        the password set the global private variables (also known as data fields)
        to the passed in arguments*/

    Password(int cap,int dig, int lower, int symb)
    {

        noOfCapital=cap;
        noOfDigits=dig;
        noOfLowerCase=lower;
        noOfSymbol=symb;
        password=PASSWORD;
    }

    /**(3 points) Create a method that takes a string password and check if
       it is equal to the length specified then return true, false if not */

    public boolean validLength(String pass)
    {
        if (pass.length()>=LENGTH)
            return true;
        else
            return false;
    }

    /**(10 points) Create a method that takes a string password,
       the method checks if the password has at least the
       required number of symbols and return true, false if not */

    public boolean validSymbol(String pass)
    {
        // Declare a counter variable
        int count=0;
        // Loop through the length of the password
        for(int i=0;i<pass.length();i++){
        // Using the Ascii table, check each index if in the range [32-47] or increment the count
            if ((pass.charAt(i)>=32 && pass.charAt(i)<=47)||(pass.charAt(i)>=58 && pass.charAt(i)<=64) )
                count++;
        }
        // Once you've counted the required number, set answer to true and break
        // Return the answer
        if(count>=noOfSymbol)
            return true;
        else
            return false;
    }
    /**Create a method that takes a string password,
      the method checks if the password has at least the
      required number of digits and return true, false if not
      the style if this method will be similar to the previous method
      use the range in the Ascii table [48-57] for digits*/

    public boolean validDigits(String pass)
    {
        // Declare a counter variable
        int count=0;
        // Loop through the length of the password
        for(int i=0;i<pass.length();i++){
        // Using the Ascii table, check each index if in the range [48-57] or increment the count
            if ((pass.charAt(i)>=48 && pass.charAt(i)<=57) )
                count++;
        }
        // Once you counted the required number, set answer to true and break
        // Return the answer
        if(count>=noOfDigits)
            return true;
        else
            return false;
        }

    /**Create a method that takes a string password,
      the method checks if the password has at least the
      required number of digits and return true, false if not
      the style if this method will be similar to the previous method
      use the range in the Ascii table [65-90] for digits*/

    public boolean validCapital(String pass)
    {
        // Declare a counter variable
        int count=0;
        // Loop through the length of the password
        for(int i=0;i<pass.length();i++){
        // Using the Ascii table, check each index if in the range [65-90] or increment the count
            if ((pass.charAt(i)>=65 && pass.charAt(i)<=90) )
                count++;
        }
        // Once you counted the required number, set answer to true and break
        // Return the answer
        if(count>=noOfCapital)
            return true;
            else{
            return false;
            }
        }

    /**Create a method that takes a string password ,
    * the method checks if the password has at least the
    * required number of lowercase letters and return true, false if not
    * the style of this method will be similar to the previous method
    * use the range in the Ascii table [97 -122] for lowercase letters
    */

    public boolean validLower(String pass)
    {
         // Declare a counter variable
        int count=0;
        // Loop through the length of the password
        for(int i=0;i<pass.length();i++){
        // Using the Ascii table, check each index if in the range [97-122] or increment the count
            if ((pass.charAt(i)>=97 && pass.charAt(i)<=122) )
                count++;
        }
        // Once you've counted the required number, set answer to true and break
        // Return the answer
        if(count>=noOfLowerCase)
            return true;
        else
            return false;
        }

    /**(2 points) create a getter method to retuen the password*/

    public String getPassword() {
        return password;
    }

    /** Create a setter method to set the password*/
    public void setPassword( ){
        // Declare a String to hold a password
        String pass;

        // Declare a scanner object to receive a password from the keyboard
        Scanner input=new Scanner(System.in);
        // Declare a boolean variable to be set whenever a password meets the settings.
        boolean flag=true;
        // Loop until the user provides a correct password
        while(flag){
            // prompt the user to enter the password , specify the requirements
            System.out.print("Enter the password: ");
            // scan the next line and store in the String holding the password
            pass=input.nextLine();

            /* If the password provided is not equal to the length required,
           then print out an error message*/
            if(pass.length()<LENGTH)
                System.out.println("The password length is too short");
            /* Else if the password doesn't have the required number of capital letters
            then print out a message*/
            else if(!validCapital(pass))
                System.out.println("The password doesn't contain the required no of Capital letters");
            /* Else if the password doesn't have the required number of lowercase letters
            then print out a message*/
            else if(!validLower(pass))
                System.out.println("The password doesn't contain the required no of lower case letters");
            /* Else if the password doesn't have the required number of symbols
            then print out a message*/
            else if(!validSymbol(pass))
                System.out.println("The password doesn't contain the required no of symbols");
            /* If the password doesn't have the required number of digits
            then print out a message*/
            else if(!validDigits(pass))
                System.out.println("The password doesn't contain the required no of digits");
            /* Else , password provided is correct
                set the global variable password to the new qualified password
                set the flag to false, to stop iterations
            */
            else{
                password=pass;
                flag=false;
            }
        }
    }
    /**
     * create the main method
     */
    public static void main(String[] args) {
        //Declare an instance of Password using the default constructor
        Password pw=new Password();
        // print out the password, using the getter method
        System.out.println(pw.getPassword());
        // What is the default password ?..................
        //default password is "Def@u1tPa$$w0rd"
        // Use the setter method to set a password
        pw.setPassword();
        // Print out the password using the getter method
        System.out.println(pw.getPassword());
        /*Declare an instance of the password using the overloaded constructor, the settings for new password object are:
        (2 Captial letters,2 Lowercase letters, 2 Symbols , 2 Numbers)*/
        Password pwd=new Password(2, 2, 2, 2);
        // Set the password using the setter method.
        pw.setPassword();
        // Print out the password using the getter method
        System.out.println(pw.getPassword());
    }
}
