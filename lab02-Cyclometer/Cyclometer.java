// This is Benjamin Kim doing lab02... attempt #1
// Cyclometer Java Program
// Cse 2
// 9/4/15
// Program Purpose: 
// 1. Print the number of minutes for each trip
// 2. Print the number of counts for each trip
// 3. Print the distance of each trip in miles
// 4. Print the distance for the two trips combined

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args)  {

// our input data. Document your variables by placing your
// comments after the "//". State the purpose of each variable.

int secsTrip1=480; //store the # of seconds for trip1 in seconds, integer form
int secsTrip2=3220; //store the # of seconds for trip2 in seconds, integer form
int countsTrip1=1561; //store the # of counts/rotations for trip1, integer form
int countsTrip2=9037; //store the # of counts/rotations for trip2, integer form

double wheelDiameter=27.0,  //store diameter of bicycle Wheel(inches) in decimal form
PI=3.14159, //approximate the value of pi,                 store value in decimal form
feetPerMile=5280, //there are 5280 feet in one mile,       store value in decimal form
inchesPerFoot=12, //there are 12 inches in one foot,       store value in decimal form
secondsPerMinute=60; //There are 60 seconds in one minute, store value in decimal form
double distanceTrip1, distanceTrip2, totalDistance; //create variables for:
//distance of trip 1,
//distance of trip 2,
//total distance (=distanceTrip2 + distanceTrip2)

System.out.println("Trip 1 took " +
    (secsTrip1/secondsPerMinute)+"Minutes and had "+
    countsTrip1+"counts.");
System.out.println("Trip 2 took "+
    (secsTrip2/secondsPerMinute)+" minutes and had"+
    countsTrip2+" counts.");

    //run the calculations; store the values. Document your
    //calculation here. What are you calculating?
    //
    //
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1=inchesPerFoot*feetPerMile; //Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+"miles");

    }  //end of main method
} //end of class