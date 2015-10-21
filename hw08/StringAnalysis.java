/*
Benjamin Kim
Professor Chen
CSE2
hw08 String Analysis

Write a program that can process a string by examining all the characters or 
just a specified number of characters in the string and determining if they 
are letters.
*/

//import scanner
import java.util.Scanner;

public class StringAnalysis {
    
    public static boolean myString(String input) {
        
        for(int i=0; i<input.length(); i++){
            
            if(Character.isLetter( input.charAt(i) ) == true ) {
                System.out.println("input is valid");
            }
            else {
                System.out.println("input is invalid");
            } //end of else
        } //end of for
        return true;
    }   //end of method 1
   
    public static boolean myString(String input, int x) {
        if(x > input.length()){
            x = input.length();
        }
        for(int i=0; i<x; i++) {
            if(Character.isLetter( input.charAt(i) ) == true ) {
                System.out.println("input is valid");
            }
            else {
                System.out.println("input is invalid");
            } //end of else
        } //end of for
        return true;
    } //end of method 2

    public static void main(String[] args) {
    
        //prompt user
        System.out.println("Would you like to check the entire string (enter 'x' if yes) or just a certain number of characters (if yes enter 'y')? ");
        Scanner myScanner = new Scanner(System.in);
        String userInput = myScanner.next();
        boolean result = false;
        if(userInput .equals("x")) {
            System.out.println("What is the String you'd like to analyze?");
            String thisString = myScanner.next();
            result = myString(thisString);
        } //end of if
        else if(userInput .equals("y")) {
            System.out.println("what is the String you'd like to analyze?");
            String thisString2 = myScanner.next();
            System.out.println("how many characters would you like to check?");
            int thisMany = myScanner.nextInt();
           result = myString(thisString2, thisMany);
        } //end of else if
    } //end of main method
} //end of class

















