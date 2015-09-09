//Benjamin Kim 
//hw01
//Arithmetic Java Program
//
// first compile the program
//      javac Arithmetic.javac
// run the program
//      java Arithmetic//

// define a class
public class Arithmetic{

// add main method
    public static void main(String[] args) {
        
//Compute the total cost of each kind of item; sales tax for that total cost
//Compute the total cost of purchases (before tax)
//Compute the total actually paid for the transaction (including sales tax)

//PA sales tax of 6%
double taxPercent=0.06;

//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//('$' is part of the variable name)
double sockCost$=2.58;
//total cost of socks (before tax)
double totalSockCost$=nSocks*sockCost$;
//total sales tax for socks
double taxSocks$=((int)((totalSockCost$*taxPercent)*100)/100.0);

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;
//total cost of drinking glasses (before tax)
double totalGlassCost$=nGlasses*glassCost$;
//total sales tax for drinking glasses
double taxGlass$=((int)((totalGlassCost$*taxPercent)*100)/100.0);

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
//total cost of 1 box of envelopes (before tax)
double totalEnvelopeCost$=nEnvelopes*envelopeCost$;
//total sales tax for envelopes
double taxEnvelope$=((int)((totalEnvelopeCost$*taxPercent)*100)/100.0);

//total cost of purchase (before tax)
double subTotalPurchase$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$);

//total cost of purchase (after tax)
double totalPurchase$=((int)((subTotalPurchase$+taxSocks$+taxGlass$+taxEnvelope$)*100)/100.00);


//print:
//the items being bought
//how many of the given item is being bought
//cost per item (before tax)

System.out.println("Items being bought are:");
System.out.println("3 socks ($2.58 each)");
System.out.println("6 drinking glasses ($2.29 each)");
System.out.println("1 box of envelopes ($3.25 each)");
System.out.println("                      ");
System.out.println("Sales tax for PA is 6%");
System.out.println("total sales tax for socks is"+ "$"+taxSocks$);
System.out.println("total sales tax for drinking glasses is"+ "$"+taxGlass$);
System.out.println("total sales tax for envelopes is"+ "$"+taxEnvelope$);
System.out.println("Before tax, total costs of each type of item:");
System.out.println("$"+totalSockCost$+ "for socks");
System.out.println("$"+totalGlassCost$+ "for drinking glasses");
System.out.println("$"+totalEnvelopeCost$+ "for envelopes");
System.out.println("sub total of purchase is"+ "$"+subTotalPurchase$);
System.out.println("total sales tax of purchase is"+ "$"+(taxSocks$+taxGlass$+taxEnvelope$));
System.out.println("total cost of purchase is"+ "$"+totalPurchase$);
    }
}