/* Benjamin Kim
Professor Chen
CSE2
10/6/15
hw 06

For 10 digit ISBNs, write a barcode reader program 
that will (1) multiply the first digit by 10, the
second digit by 9, third digit by 8, and continue
decrementing until the 9th digit has been 
multiplied by 2. Then, it (2) finds the summation
of these multiplied numbers and (3) divides them 
by 11. If the remainder is equal to the check 
digit, the barcode is valid, otherwise it is invalid. 
*/

//Import the Scanner class
import.java.util.Scanner;

public class CheckDigit {
    public static void main(String [] args) {
   
   
//Prompt the user for entering the 10 digit ISBN number
System.out.println("Enter a 10 digit ISBN number") 

//Use the scanner class to obtain a 10 digit ISBN number
int ISBN=myScanner.nextInt();

//run a loop through the 10 ISBN digits;
int x=10;
for(ISBN; ISBN>0; x-- ) {
    System.out.println(i*x);
}
   
   
   
   
   
   
   
   
    } //end of main method
} //end of class