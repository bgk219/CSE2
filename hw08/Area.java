/*
Benjamin Kim
Professor Chen
CSE2
hw08 String Analysis

Write a program that can calculate the area of three different shapes; a 
rectangle, a triangle and a circle.
*/

//import scanner
import java.util.Scanner;

public class Area {
    
    //create a method that calculates the area of a rectangle
    public static double rectangleArea(double width, double height) {
        return width*height;
    } //end of rectangleArea method
    
    //create a method that calculates the area of a triangle
    public static double triangleArea(double base, double height) {
        return (base*height)/2;
    } //end of triangleArea method
    
    //create a method that calculates the area of a circle
    public static double circleArea ( double radius) {
        return (radius*radius)*3.14159;
    } //end of circleArea method

    //create a method that checks the input
    public static String getValid() {
        boolean valid = false;
        Scanner myScanner = new Scanner(System.in);
        while(!valid) {
             //prompt user to enter input & accept input
            System.out.println("Would you like to find the area of a 'rectangle','triangle', or a 'circle'?");           
            String choice = myScanner.next();
            if(choice .equals("rectangle") || choice .equals("triangle") || choice .equals("circle")) {
                valid = true;
                return choice;
            } //end of if
            else {
                System.out.println("invalid input");
            } //end of else
        }//end of while
        return "notgonnahappen";
    } //end of check method

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String shape = getValid();
        
        //Present the appropriate area value
        if( shape .equals("rectangle")) {
            System.out.println("Enter the width of the rectangle.");
            double width = myScanner.nextDouble();
            System.out.println("Enter the height of the rectangle.");
            double height = myScanner.nextDouble();
            System.out.println("The area of the rectange is " + rectangleArea(width, height));
        } //end of "rectangle" if
        else if( shape .equals("triangle")) {
            System.out.println("Enter the value of the base of the triangle.");
            double base = myScanner.nextDouble();
            System.out.println("Enter the height of the triangle.");
            double height = myScanner.nextDouble();
            System.out.println("the area of the triangle is " + triangleArea(base, height));
        } //end of triangle else if
        else if( shape .equals("circle")) {
            System.out.println("Enter the value of the radius of the cirlce.");
            double radius = myScanner.nextDouble();
            System.out.println("The area of the circle is " + circleArea(radius));
        } //end of "circle" else if
        
    } //end of main method
} //end of class
























