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


System.out.println("How many lines will the message be?");
int input = myScanner.nextInt();




/*
//Create an integer to store user input.
int myInt = 0;
*/

//Create a switch to decide if you want to ask (user) again.
boolean acceptable = false;

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