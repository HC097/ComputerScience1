// Lab 8b
// Harley Combest
// 60787
public class Lab8b{
  public static final int SIZE = 10;
  public static void main(String[] args){
    int table[][] = new int[SIZE][];
    for (int r=0;r<table.length; r++) {
        // Set table[r] to a new array of int with
        // size r+1.
        table[r]=new int[r+1];

    }

        // Write code that fills in the array with
        // a subtraction table, so that table[r][c] = r-c.
        // Hint: Use a nested loop, and make
        // sure the inner loop iterates goes from 0
        // to the length of the row: table[r].length
        for(int j=0; j<table.length; j++){

                for(int i=0; i<table[j].length; i++){

                table[j][i]=j-i;
                }
        }

        // Iterate over the table, printing each value
        // so that columns align (hint: use a nested loop,
        // and printf)
        for(int j=0; j<table.length;j++){
                System.out.println();
                for(int i=0;i<table[j].length;i++){

                        System.out.printf("%d,", table[j][i]);
                }
        }

    }
}

