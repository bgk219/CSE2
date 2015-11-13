/*
Benjamin Kim
Professor Chen
CSE2
11/10/15

hw10

Write a program that shows the inner-workings of a linear search through an 
array. Use an array consisting of user inputs (representing student grades)
*/

import java.util.Scanner;

public class CSE2Linear {
    
    public static void main(String[] args) {
        //Set up a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Prompt the user for 15 array inputs
        System.out.println("Please enter the grades for 15 CSE2 students in ascending order:");
        System.out.println("");
        int[] grades = new int[15];
        for(int i=0; i<15; i++) {
            grades[i] = myScanner.nextInt();
            //Error #1, user inputs must be integers
            if(grades[i] != (int)grades[i]){
                System.out.println("ERROR! CSE2 studnets can only recieve whole numbers as grades.");
                break;
            }
            //Error #2, integers must be <100 && >0
            if(grades[i] > 100 || grades[i] < 0) {
                System.out.println("ERROR! CSE2 students can only recieve grades from 0 to 100.");
                break;
            }
            //Error #3, integers must be entered in ascending order
            if(i>1 && grades[i-1] > grades[i]){
                System.out.println("ERROR! Grades must be entered in ascending order.");
                break;
            }
            
        }//end of for loop
    
        //present the user with the array they have created
        System.out.println("The following grades have been entered: ");
        System.out.println("");
        for(int j=0; j<15; j++){
            System.out.print(grades[j] + " ");
        }//end of for loop
        
        //perform a binary search
        binarySearch(grades);
        
        //perform a linear search after shuffling the array
        scramble(grades);
        linearSearch(grades);
    

    }//end of main method
    
    //method that shuffles the elements of the subjected array
    public static void scramble( int[] list) {
        for(int k=0; k<list.length; k++) {
            //find random members inside subjected array
            int target = (int) (list.length*Math.random() );
            //swap the chosen members
            int temp = list[target];
            list[target] = list[k];
            list[k] = temp;
        }//end of for loop
        System.out.println("Here is the array after scrambling:");
        for(int w=0; w<15; w++){
            System.out.print(list[w] + " ");
        }//end of for loop
    }//end of shuffle method

        //method that performs a binary search
    public static void binarySearch( int[] list) {
        Scanner myScanner3 = new Scanner(System.in);
        int low = 0;
        int high = list.length;
        //Prompt the user to search for a grade in the array
        System.out.println("Enter a grade you want to search for in the array:");
        System.out.println("");
        int target1 = myScanner3.nextInt();
        int counter = 0;
        while(low <= high){
            int median = (int)((low + high)/2); 
            if(list[median] < target1) {
                low = median + 1;
            }
            else if(list[median] > target1){
                high = median - 1;
            }
            else if(list[median] == target1){
                System.out.println(target1 + " was found after " + counter + " iterations.");   
                break;
            }
            else{
                System.out.println(target1 + " was not found after" + counter + " iterations");
                break;
            }
            counter ++;
        }//end of while
    }//end of binarySearch method

    //method that performs a linear search
    public static void linearSearch( int[] list) {
        Scanner myScanner2 = new Scanner(System.in);
        //Prompt the user to search for a grade in the array
        System.out.println("Enter a grade you want to search for in the array:");
        int target = myScanner2.nextInt();
        boolean targetFound = false;
        for(int x=0; x<15; x++) {
            if(list[x] == target) {
                System.out.println("The grade " + target + " was found after " + x + " iterations.");
                targetFound = true;
                break;
                }//end of if statement
        }//end of for loop
        
        while(targetFound == false) {
                System.out.println("The grade " + target + " was not found after 15 iterations");
                break;
            }//end of else statement
    }//end of linearSearch metnod

}//end of class

