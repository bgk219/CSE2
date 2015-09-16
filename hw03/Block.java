//Benjamin Kim
//Professor Chen
//CSE2
//9/15/15
//hw03 block

//Use length, width, and height of a block to calculate
//the volume of the block and the surface area.

//Import the Scanner class
import java.util.Scanner;

//define a class
public class Block{
    //main method required for every Java program
    public static void main(String[] args) {

//Use the scanner class to obtain values for
//length, width, and height of the block from the user.
Scanner myScanner=new Scanner(System.in);

//Prompt the user for entering the length
System.out.println("Enter the length of the block");

//Accept user input
double length=myScanner.nextDouble();

//Prompt the user for entering the width
System.out.println("Enter the width of the block");

//Accept user input
double width=myScanner.nextDouble();

//Prompt the user for entering the height
System.out.println("Enter the height of the block");

//Accept user input
double height=myScanner.nextDouble();
    
//Assign volume and surface area as doubles
double volume;
double surfaceArea;

//calculate volume by multiplying length, width, and height
volume= length*width*height;

//calculate surface area by multiplying length and width
surfaceArea=length*width;

//print the completed calculations
System.out.println("the volume of the block is"+volume);
System.out.println("the surface area of the block is"+surfaceArea);


    } //end of main method
} //end of class