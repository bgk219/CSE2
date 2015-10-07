/* Benjamin Kim
Professor Chen
CSE2
10/6/15
hw 06

Create a program that prompts you to input the expenses
for each day of the week for one week. With this 
input, the program will print a simple bar 
graph/visualization that represents your weekly 
expenses, using horizontal bars made of the 
* character. */ 


//Import the Scanner class
import java.util.Scanner;

public class BarGraph {
    public static void main(String [] args) {
        
//Use the scanner class to obtain values for the week's expenses
Scanner myScanner=new Scanner(System.in);

//Prompt the user for entering the values and
//Accept user input
//for Sunday
System.out.println("Enter Sunday's expenses");
double Sunday=myScanner.nextDouble();
for( int i=0; i<Sunday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Monday
System.out.println("Enter Monday's expenses");
double Monday=myScanner.nextDouble();
for( int i=0; i<Monday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Tuesday
System.out.println("Enter Tuesday's expenses");
double Tuesday=myScanner.nextDouble();
for( int i=0; i<Tuesday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Wednesday
System.out.println("Enter Wednesday's expenses");
double Wednesday=myScanner.nextDouble();
for( int i=0; i<Wednesday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Thursday
System.out.println("Enter Thursday's expenses");
double Thursday=myScanner.nextDouble();
for( int i=0; i<Thursday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Friday
System.out.println("Enter Friday's expenses");
double Friday=myScanner.nextDouble();
for( int i=0; i<Friday; i++) {
    System.out.print("*");
}
System.out.println("");

//for Saturday
System.out.println("Enter Saturday's expenses");
double Saturday=myScanner.nextDouble();
for( int i=0; i<Saturday; i++) {
    System.out.print("*");
}
System.out.println("");

//Calculate average weekly expense
double weeklyExpense= Sunday + Monday + Tuesday + Wednesday + Thursday + Friday + Saturday;

//Calculate average daily expense
double dailyExpense= weeklyExpense/7;
System.out.println("Your average daily expenses are: $"+ ((double)((int)(dailyExpense*100)))/100);

//predict future week(s) expenses (within a range of +/- 20% of previous week's expenses)
double range=((double)Math.random()*20)/100;
int coinToss=(int)Math.random()*100;
if( coinToss >= 50 ) {
    double futureWeek= weeklyExpense + weeklyExpense*range;
    double expense4= ((double)((int)((futureWeek*52*4)*100)))/100;
    
    System.out.println("Estimated expenditure for 4 years: $" + expense4);
}
else if (coinToss <= 100 ) {
    double futureWeek= weeklyExpense - weeklyExpense*range;
    double expense4= ((double)((int)((futureWeek*52*4)*100)))/100;
    System.out.println("Estimated expenditure for 4 years: $" + expense4);
}

   
   
   
   
   
   
   
   
   
   
   
   
   
   
    } //end of main method
} //end of class