//Benjamin Kim
//Professor Chen
//CSE2
//9/15/15
//hw03 timer

//Use current time and dinner time to 
//calculate time remaining before dinner.

//Import the Scanner class
import java.util.Scanner;

//define a class
public class Timer{
    //main method required for everey java program
    public static void main(String[] args) {

//Use the scanner class to obtain the current time
//and dinner time from the user.
Scanner myScanner=new Scanner(System.in);

//Prompt the user for entering the current time
System.out.println("Enter the current time in the form HHMM");

//Accept user input.
int currentTime=myScanner.nextInt();

//Prompt the user for entering the dinner time.
System.out.println("Enter the dinner time in the form HHMM");

//Accept user input.
int dinnerTime=myScanner.nextInt();

//remaining time
int remainingTime;

//Calculate remaining time by subtracting current time from dinner time.
remainingTime=dinnerTime-currentTime;

//print the completed calculations
System.out.println("the amount of time remaining (in the form of HHMM) is"+remainingTime);
    
        
    } //end of main method
} //end of class