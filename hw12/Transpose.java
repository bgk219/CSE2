/*
Benjamin Kim
Professor Chen
CSE2
11/17/15

hw12

Write a program that transposes a random 2D rectangular array
and a user inputted 2D rectangular array
*/
import java.util.Scanner;
public class Transpose {
    
    public static void randomMatrix() {
        Scanner myScanner = new Scanner(System.in);
        //Prompt the user for width and height inputs
        System.out.println("Please enter an integer value for the array's width.");
        int width = myScanner.nextInt();
        System.out.println("Please enter an integer value for the array's height.");
        int height = myScanner.nextInt();
        
        //create a 2D array
        int[][] array = new int[height][width];
        for(int a=0; a<array.length; a++){
            for(int b=0; b<array[a].length; b++){
                array[a][b]=(int)(Math.random()*21)-10;
            }//end of (nested) for loop
        }//end of for loop
    System.out.println("Here is the entered array:");
    printMatrix(array);
    System.out.println("");
    trasposeArray(array);
    System.out.println("Here is the transposed array:");
    printMatrix(array);
    }//end of randomMatrix method
    
    public static void printMatrix(int[][] TDarray) {
        for(int i=0; i<TDarray.length; i++){
           for(int j=0; j<TDarray[i].length; j++){
                System.out.print(TDarray[i][j] + " ");
           }//end of for loop (nested)
        System.out.println("");
        }//end of for loop
    }//end of printMatrix method
    
    public static int[][] trasposeArray(int[][] array) {
        int temp = 0;
        for(int x=0; x<array.length; x++) {
            for (int y=0; y<array[x].length; y++) {
                temp = array[x][y];
                array[x][y] = array[y][x];
                array[y][x] = temp;
            }//end of nested for loop
        }//end of for loop
    return array;
    }//end of transposeArray method
    
    public static void main(String[] args) {
      randomMatrix();
      
    }//end of main method
    
    
    
    
    
    
}//end of class