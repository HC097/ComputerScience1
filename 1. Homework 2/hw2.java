//import java.util.Scanner;

public class hw2{
    
    public static String completeNameCapital= completeNameCapitalvar();
    public static String first_name= "Harley";
    public static String middle_name= "C";
    public static String last_name= "Combest";
    
    
    
    private static double[] glob = anArray();

    public static double Mean= glob[0];
    public static double Median = glob[1];
    public static double Mode = glob[2];
    
    
/** */
        public static void main(String [] args){

        myInfo();
        int a=4;
        int b=3;
        mySum(a,b);
        //mySum(b);
        
        int c = 4;
        int d = myPower(c);
        //System.out.println(d);
        
        String officialName = fullName();
        //System.out.println(officialName);
        
        int age = 18;
        String gender = "Male";
        fullName(age, gender);
    
        
        int ageTwo = age;
        System.out.println(ageTwo);
        //The value did not change because Java is pass by value
        
        callMethod();
          
        }

/** */ 
        public static void myInfo(){

                System.out.println("Harley, Combest, 60787");
        }

/** */        
        public static void mySum(int a, int b ){

                System.out.println( a + b );
        }
        
/** */ 
        public static int myPower(int c){

                //Scanner input = new Scanner(System.in);
                //c = input.nextInt();
                return(c*c);

        }
        
/** */       
        public static String fullName(){
        
            String firstName = "Harley";
            String middleName = "C";
            String lastName = "Combest";
            String fullName = firstName + middleName + lastName;
            
        return fullName;
        }
        
/** */         
        public static void fullName(int age, String gender){
            
            
            System.out.printf("%4d", age);
            System.out.printf("\t%S", gender);
        }

/** */
        public int fullName(int ageTwo){
        
            return ageTwo+=10;
            
        }
        
/** */
    public static String completeNameCapitalvar(){
                  
          return fullName().toUpperCase();
                    
        }
    
/** */    
    public static void randomvar(){
    
        String toUpperCaseone = first_name.toUpperCase();
        String toUpperCasetwo = middle_name.toUpperCase();
        String toUpperCasethree = last_name.toUpperCase();
    
    }

/** */    
    public static double[] theArray(){
        
        int arr[]={1,1,3,4,5,6,7,8,9,10};
        double mean = 5.5;
        double median = 5.5;
        double mode = 1;
        double all[]={mean, median, mode};
        
        return all;          
    
    }
 
/** */
    public static double[] anArray(){
        
        double arr[]= {1.1, 1.1 , 2.3 ,3.4 ,5.6 ,7.8 ,8.9 ,9.1, 10.11, 11.12};
        double mean = 6.263;
        double median = 6.7;
        double mode = 1.1;
        double[] bew={mean, median, mode};
        return bew;
    }
    
/** */    
     public static void callMethod(){
        
        completeNameCapitalvar();
        randomvar();
        theArray();
        anArray();
        
     
   
     }
     
/** Q13) I saw a list of summaries: one for fields, one for constructors and one for methods. These contained most everything I've typed in this assignment */
     
    }


//myPower(c);
       // hw2 c = new  hw2();
       // c.myPower();
//Scanner input = new Scanner(System.in);
                //c = input.nextInt();
