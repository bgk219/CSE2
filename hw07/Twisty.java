/*
Benjamin Kim
Professor Chen
CSE2
hw07

Write a program that adjusts the shape and length
of a specified pattern according to user input.
*/

import java.util.Scanner;

public class Twisty {
        public static void main(String [] args) {
  
//Use the scanner to capture inputs.
Scanner myScanner = new Scanner(System.in);

//Create a variable for "length"
System.out.println("Please enter an integer for the Length:");
int length = myScanner.nextInt();

//create a variable for "width"
System.out.println("Please enter an integer for the Width:");
int width = myScanner.nextInt();
  
 
//Validate the input, ask the user for another input if inavid.
//Inputs must be integers with values between 0 and 80.
//Inputs for width may not be larger than inputs for length.
boolean acceptable = false;
while (!acceptable) {
    if( length>0 && length<80 && width<length) {
        acceptable = true;
        }   //end of if 
    else {
        System.out.println("Error, please enter a positive integer less than 80. Width must be less than Length. Please run the program again.");
        acceptable = true;    
    } //end of else
} //end of while



for(int i=0; i<width; i++) {
    boolean twist = false;
    int counter = length;
    while(counter >= 0) { 
        for(int j=0; j<width; j++){
            if( (i == j % width) && twist == false ) {
            System.out.print("#");
            counter--;
            } //end of if
            else if( (width - (j % width) - 1 == i) && twist == false) {
            System.out.print("/");
            counter--;
            } //end of else if
            else if ((i == j % width) && twist == true){
            System.out.print("\\");
            counter--;
          } // end of else if
            else if ((width - (j % width) - 1 == i) && twist == true) {
            System.out.print("#");
            counter--;
            }// end of else if
            else{
            System.out.print(" ");
            counter--;
         }
     
        
      }//end of 2nd for
      twist = !twist;
    
    } //end of while
      System.out.println("");

}//end of for







/*
//Create a twisting pattern
System.out.println("");
for(int i=0; i<length; i++){
    for(int j=0; j<length; j++){
        if(i == j) {
            System.out.print("X");
        }//end of if statement
        else if(length - 1 - i == j) {
            System.out.print("O");
        }//end of else if statement
        else {
            System.out.print("*");
        }//end of else statement

        
    } //end of nested for loop
    System.out.println("");
} //end of first for loop

    }   //end of else statement
} //end of while loop

*/
  
  
  
  
  
  
  
  
  
  
  
  
            
        } //end of main method
} //end of class