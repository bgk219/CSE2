/*
Benjamin Kim
Professor Chen
CSE2
lab07

Develop a program to hide the secret message X in a handful of stars.
*/

import java.util.Scanner;

public class encrypted_x {
    public static void main(String [] args) {
        
//Use the scanner to capture an input.
Scanner myScanner=new Scanner(System.in);
System.out.println("Please enter an integer between 0 and 100");

int input = 0;

//Validate the input, ask the user for another input if invalid.
//loop until a valid input is given.
boolean acceptable = false;
while (!acceptable) {
    if(myScanner.hasNextInt()) {
        input = myScanner.nextInt();
        if(input>0 && input<100) {
        acceptable = true;
    }//end of nested if
    }
    else {
        System.out.println("Error: input must be greater that zero and less that 100");
        System.out.println("Try again: ");
        myScanner.next();
        acceptable = false;
    }//end of else
}

if(input<0) {
    System.out.println("Error: input must be greater that zero and less that 100");
        System.out.println("Try again: ");
}

if(input>100) {
    System.out.println("Error: input must be greater that zero and less that 100");
        System.out.println("Try again: ");
}

//loop until an acceptable input is given.
//reject strings, negatives, and numbers > 100.
System.out.println("");
for(int lineN=0; lineN<input; lineN++) {
    
    for(int posN=0; posN<input; posN++){
       if(lineN == posN){
           System.out.print(" ");
       }
       else if(input -1 - lineN == posN) {
           System.out.print(" ");
       }
       else {
        System.out.print("*");
       }
        
    }//end of inner loop
System.out.println("");
}//end of outer loop

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    } //end of main method
} //end of class