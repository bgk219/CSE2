//Benjamin Kim
//Professor Chen
//CSE2
//9/18/15
//lab04

//write a program that will pick a random card from a deck.

//define a class
public class cardGenerator{

//add main method
    public static void main(String[] args) {

//Generate a random number        
int cardNumber=(int)(Math.random()*(52))+1;        

//make card suits a variable
String cardSuit;

//match random numbers with a card suit and "name" (7, Jack, Ace, etc.)
if (cardNumber>0 && cardNumber<=13) {
    cardSuit="diamond";
}
if (cardNumber>13 && cardNumber<=26) {
    cardSuit="club";
}
if (cardNumber>26 && cardNumber<=39) {
    cardSuit="heart";
}
if (cardNumber>39 && cardNumber<=52) {
    cardSuit="spade";
}

System.out.println(cardSuit);



//print the ramdomly generaged number
System.out.println(cardNumber);
        
        
        
        
        
    } //end of main method

} //end of class
