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
import java.util.Scanner;

public class CheckDigit {
    public static void main(String [] args) {
  
//Use the scanner class to obtain values for the week's expenses   
Scanner myScanner=new Scanner(System.in);

//Prompt the user for entering the 10 digit ISBN number
System.out.println("Enter a 10 digit ISBN number");

System.out.println("Enter the first digit");
int first = myScanner.nextInt();

System.out.println("Enter the second digit");
int second = myScanner.nextInt();

System.out.println("Enter the third digit");
int third = myScanner.nextInt();

System.out.println("Enter the fourth digit");
int fourth = myScanner.nextInt();

System.out.println("Enter the fifth digit");
int fifth = myScanner.nextInt();

System.out.println("Enter the sixth digit");
int sixth = myScanner.nextInt();

System.out.println("Enter the seventh digit");
int seventh = myScanner.nextInt();

System.out.println("Enter the eighth digit");
int eighth = myScanner.nextInt();

System.out.println("Enter the ninth digit");
int ninth = myScanner.nextInt();

System.out.println("Enter the tenth digit");
int tenth = myScanner.nextInt();

for(int i=10; i>0; i-- ) {
    
    if(i==10) {
        first=first*10;
    }
    if(i==9){
        second=second*9;
    }
    if(i==8) {
        third=third*8;
    }
    if(i==7) {
        fourth=fourth*7;
    }
    if (i==6) {
        fifth=fifth*6;
    }
    if (i==5) {
        sixth=sixth*5;
    }
    if (i==4) {
        seventh=seventh*4;
    }
    if (i==3) {
        eighth=eighth*3;
    }
    if (i==2) {
        ninth=ninth*2;
    }
}
    
//find the summation of all the numbers
int summation= first + second+ third + fourth + fifth + sixth + seventh + eighth + ninth;

//check to see if the barcode is valid or invalid
if (summation % 11 == tenth) {
    System.out.println("the barcode is valid");
}
else {
    System.out.println("the barcode is invalid");
}


/*
//Use the scanner class to obtain a 10 digit ISBN number
int ISBN=myScanner.nextInt();

//run a loop through the 10 ISBN digits;
for(int i=10; i>0; i-- ) {
    
    System.out.println();
}
   
   
   
   
   if(>0 && <10){
    
}
else{
    System.out.println("invalid input")
}
  */ 
   
   
   
   
   
   
    }//end of main method
}//end of class