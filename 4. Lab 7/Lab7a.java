// Lab 7a
// Harley Combest
// 60787

import java.util.*;

public class Lab7a{

        public static void main(String args[]){

                ArrayList<Double> list = createSquaresList(10);
                printList(list);
                removeElement(list, 4);
                printList(list);swapElements(list, 2, 6);
                printList(list);
                double max = getMaxValue(list);
                double ave = getAverage(list);

                // Print the max and average
                System.out.println(max);
                System.out.println(ave);

                int idx1;
            idx1 = linearSearch(list, 4);
                int idx2 = linearSearch(list, 75);

                // Print the two indices
                System.out.println(idx1);
                System.out.println(idx2);

        }

        public static ArrayList<Double> createSquaresList(int n)
        {
                // Create an ArrayList with the squares of n numbers, 0 to n-1
                // Return the ArrayList
                ArrayList<Double> nSquares = new ArrayList<Double>();
                for(int i = 0; i <=n-1; i++){
                        double squaresN = 0;
                        squaresN = i*i;
                        nSquares.add(squaresN);
                }
                return nSquares;
        }

        public static double getMaxValue(ArrayList<Double> list)
        {
                double maxVal = 0.0;
                  for(int i = 0; i<list.size();i++){
                        System.out.println(list.get(i));
                        if(maxVal < list.get(i)){
                        maxVal=list.get(i);
                }
                return maxVal;
        }

    public static double getAverage(ArrayList<Double> list)
        {
                double totalVal = 0.0;
                double avgVal = 0.0;
                for (int i=0; i<list.size(); i++){
                        totalVal+=list.get(i);
                }
                avgVal = totalVal/list.size();
                avgVal = (double) Math.round(avgVal*100)/100;
                return avgVal;
        }

        public static void removeElement(ArrayList<Double> list, int index)
        {
                // Remove the specified element.
                for(int i = 0; i<list.size(); i++){
                        if(i == index){
                                list.remove(index);
                                break;
                        }
                }
        }

        public static void swapElements(ArrayList<Double> list, int a, int b)
        {
                // Write code that swaps elements a and b of the ArrayList
                // Hint: you need a temporary variable.
                double tempVar = 0.0;
                double varOne = list.get(a);
                double varTwo = list.get(b);
                tempVar = varOne;
                varOne = varTwo;
                varTwo = tempVar;
                list.set(a, varOne);
                list.set(b, varTwo);
        }

        public static int linearSearch(ArrayList<Double> list, double val){

                // Use a linear search to find the index of a particular value.
                // Return that index, or -1 if the value is not found.
                // Do not use list.indexOf(val)
                int inDex = 0;
                for (int i=0; i<list.size(); i++){
                        if(val == list.get(i)){
                                inDex = i;
                                break;
                        }
                        else{
                           inDex=-1;
                        }
                }
                return inDex;

        }

        public static void printList(ArrayList<Double> list){

                // Print out the number of the list on one line, separated by
                // a comma and space, with a newline at the end.
                for(int i = 0; i<list.size(); i++){
                        System.out.println(list.get(i)+ ", \n");
                }
        }
    }



