//Benjamin Kim
//Professor Chen
//CSE2
//9/11/15
//lab03

//Use "if" statements to divide a check between friends.

//Import the Scanner class
import java.util.Scanner;

// define a class
public class Check{
    // main method required for every Java program
    public static void main(String[] args) {
        
// Use the Scanner class to obtain from the user the original cost of the check,
// the percentage tip they wish to pay,
// and the number of ways the check will be split.
//
// Then determine how much each person in the group needs to spend
// in order to pay the check.

//Declare an instance of the Scanner object and call the Scanner constructor.
Scanner myScanner=new Scanner(System.in);

//prompt user for the original cost of the check.
System.out.print("Enter the original cost of the check in the form xx.xx:");

//Accept user input.
double checkCost=myScanner.nextDouble();

//Prompt user for the tip percentage that they wish to pay and accept the input.
System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
double tipPercent=myScanner.nextDouble();
tipPercent /=100;  //We want to convert the percentage into a decimal value.

//Prompt the user for the number of ways to divide the check (the number of friends at dinner)
System.out.print("Enter the number of people who went to dinner:");
int numPeople=myScanner.nextInt();

//Cost of the entire dinner.
double totalCost;

//Cost of the dinner per person
double costPerPerson;

int dollars,  //whole dollar amount of cost
dimes, pennies;//for storing digits to the right of the decimal point for the cost$

//total dinner cost calculations
totalCost=checkCost*(1+tipPercent);

//total dinner cost per person calculations
costPerPerson=totalCost/numPeople;
//get the whole amount, 
//dropping decimal fraction 
dollars=(int) costPerPerson;
//get dimes amount, e.g.,
//(int) (6.73*10) % 10->67 % 10-> 7
//Where the % (mod) operator returns the remainder
//after the division: 583 % 100-> 83, 27 % 5-> 2
dimes=(int)(costPerPerson*10)%10;
pennies=(int)(costPerPerson*100)%10;
System.out.println("Each person in the group owes $"+dollars+"."+dimes+pennies);



    }  //end of main method
}  //end of class