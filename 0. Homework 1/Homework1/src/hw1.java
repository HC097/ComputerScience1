public class hw1 {
    public static void main(String [] args){
     
        String First = "harley";
        int Age= 18;
            char C = 99;
        char middleName = C;
        double Score = 50.00;
        String arr [];
        arr=new String[4];
        arr[0]=First;
        arr[1]=Integer.toString(Age);
        arr[2]=Character.toString(middleName);
        arr[3]=Double.toString(Score);
        
       
       
     
    
        System.out.print(First +" \t "+ Age);
        System.out.print("\n" + " " + First + "," + Age + "\n");
        System.out.println(First + "\t" + "Age=" + Age + "," + " " + "Score=" + Score);
        System.out.printf("\n%S %c,%d\t'%5.2f'", First, middleName, Age, Score);
        System.out.printf("\n%s %C,%-3d\t'%-10.3f\t'", First, middleName, Age, Score);
                
        System.out.printf("\n%S %s", arr[0], arr[2]);
        System.out.printf("\n%1.1f", Double.valueOf(arr[3]));
        
    
    
    
    
    
    
    
    
        
    }
}