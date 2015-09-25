//Benjamin Kim
//Professor Chen
//CSE2
//9/22/15
//hw04

//Write a program that randomly generates 5 cards
//and names the poker hand those 5 cards form.

//define a class
public class PokerHandCheck{

//add main method
    public static void main(String[] args) {

//fill the user with suspense
System.out.println("Your five random cards are:");
        
//Generate first random number
int cardNumber1=(int)(Math.random()*(52))+1;

//make card suits a variable
String cardSuit1="";

//make card identity a variable and use % to determine if the
//card is a 3, 4, 5, king, ace, ect.
int cardVal1 = cardNumber1%13;
String cardID1="";

switch(cardVal1){
    case 0:
        cardID1 = "the Ace";
        break;
    case 1:
        cardID1 = "the 2";
        break;
     case 2:;
        cardID1 = "the 3";
        break;
     case 3:
        cardID1 = "the 4";
        break;
     case 4:
        cardID1 = "the 5";
        break;
     case 5:
        cardID1 = "the 6";
        break;
     case 6:
        cardID1 = "the 7";
        break;
     case 7:
        cardID1 = "the 8";
        break;
     case 8:
        cardID1 = "the 9";
        break;
     case 9:
        cardID1 = "the 10";
        break;
     case 10:
        cardID1 = "the Jack";
        break;
     case 11:
        cardID1 = "the Queen";
        break;
     case 12:
        cardID1 = "the King";
        break;
}


//match random numbers with a card suit
if (cardNumber1>0 && cardNumber1<=13) {
    cardSuit1=" of diamonds";
}
if (cardNumber1>13 && cardNumber1<=26) {
    cardSuit1=" of clubs";
}
if (cardNumber1>26 && cardNumber1<=39) {
    cardSuit1=" of hearts";
}
if (cardNumber1>39 && cardNumber1<=52) {
    cardSuit1=" of spades";
}

System.out.println(cardID1+cardSuit1);

//Generate a second random number
int cardNumber2=(int)(Math.random()*(52))+1;

//make card suits a variable
String cardSuit2="";

//make card identity a variable and use % to determine if the
//card is a 3, 4, 5, king, ace, ect.
int cardVal2 = cardNumber2%13;
String cardID2="";

switch(cardVal2){
    case 0:
        cardID2 = "the Ace";
        break;
    case 1:
        cardID2 = "the 2";
        break;
     case 2:;
        cardID2 = "the 3";
        break;
     case 3:
        cardID2 = "the 4";
        break;
     case 4:
        cardID2 = "the 5";
        break;
     case 5:
        cardID2 = "the 6";
        break;
     case 6:
        cardID2 = "the 7";
        break;
     case 7:
        cardID2 = "the 8";
        break;
     case 8:
        cardID2 = "the 9";
        break;
     case 9:
        cardID2 = "the 10";
        break;
     case 10:
        cardID2 = "the Jack";
        break;
     case 11:
        cardID2 = "the Queen";
        break;
     case 12:
        cardID2 = "the King";
        break;
}


//match random numbers with a card suit
if (cardNumber2>0 && cardNumber2<=13) {
    cardSuit2=" of diamonds";
}
if (cardNumber2>13 && cardNumber2<=26) {
    cardSuit2=" of clubs";
}
if (cardNumber2>26 && cardNumber2<=39) {
    cardSuit2=" of hearts";
}
if (cardNumber2>39 && cardNumber2<=52) {
    cardSuit2=" of spades";
}

System.out.println(cardID2+cardSuit2);

//Generate a third random number
int cardNumber3=(int)(Math.random()*(52))+1;

//make card suits a variable
String cardSuit3="";

//make card identity a variable and use % to determine if the
//card is a 3, 4, 5, king, ace, ect.
int cardVal3 = cardNumber3%13;
String cardID3="";

switch(cardVal3){
    case 0:
        cardID3 = "the Ace";
        break;
    case 1:
        cardID3 = "the 2";
        break;
     case 2:;
        cardID3 = "the 3";
        break;
     case 3:
        cardID3 = "the 4";
        break;
     case 4:
        cardID3 = "the 5";
        break;
     case 5:
        cardID3 = "the 6";
        break;
     case 6:
        cardID3 = "the 7";
        break;
     case 7:
        cardID3 = "the 8";
        break;
     case 8:
        cardID3 = "the 9";
        break;
     case 9:
        cardID3 = "the 10";
        break;
     case 10:
        cardID3 = "the Jack";
        break;
     case 11:
        cardID3 = "the Queen";
        break;
     case 12:
        cardID3 = "the King";
        break;
}


//match random numbers with a card suit
if (cardNumber3>0 && cardNumber3<=13) {
    cardSuit3=" of diamonds";
}
if (cardNumber3>13 && cardNumber3<=26) {
    cardSuit3=" of clubs";
}
if (cardNumber3>26 && cardNumber3<=39) {
    cardSuit3=" of hearts";
}
if (cardNumber3>39 && cardNumber3<=52) {
    cardSuit3=" of spades";
}

System.out.println(cardID3+cardSuit3);

//Generate a fourth random number
int cardNumber4=(int)(Math.random()*(52))+1;

//make card suits a variable
String cardSuit4="";

//make card identity a variable and use % to determine if the
//card is a 3, 4, 5, king, ace, ect.
int cardVal4 = cardNumber4%13;
String cardID4="";

switch(cardVal4){
    case 0:
        cardID4 = "the Ace";
        break;
    case 1:
        cardID4 = "the 2";
        break;
     case 2:;
        cardID4 = "the 3";
        break;
     case 3:
        cardID4 = "the 4";
        break;
     case 4:
        cardID4 = "the 5";
        break;
     case 5:
        cardID4 = "the 6";
        break;
     case 6:
        cardID4 = "the 7";
        break;
     case 7:
        cardID4 = "the 8";
        break;
     case 8:
        cardID4 = "the 9";
        break;
     case 9:
        cardID4 = "the 10";
        break;
     case 10:
        cardID4 = "the Jack";
        break;
     case 11:
        cardID4 = "the Queen";
        break;
     case 12:
        cardID4 = "the King";
        break;
}


//match random numbers with a card suit
if (cardNumber4>0 && cardNumber4<=13) {
    cardSuit4=" of diamonds";
}
if (cardNumber4>13 && cardNumber4<=26) {
    cardSuit4=" of clubs";
}
if (cardNumber4>26 && cardNumber4<=39) {
    cardSuit4=" of hearts";
}
if (cardNumber4>39 && cardNumber4<=52) {
    cardSuit4=" of spades";
}

System.out.println(cardID4+cardSuit4);

//Generate a fifth random number
int cardNumber5=(int)(Math.random()*(52))+1;

//make card suits a variable
String cardSuit5="";

//make card identity a variable and use % to determine if the
//card is a 3, 4, 5, king, ace, ect.
int cardVal5 = cardNumber5%13;
String cardID5="";

switch(cardVal5){
    case 0:
        cardID5 = "the Ace";
        break;
    case 1:
        cardID5 = "the 2";
        break;
     case 2:;
        cardID5 = "the 3";
        break;
     case 3:
        cardID5 = "the 4";
        break;
     case 4:
        cardID5 = "the 5";
        break;
     case 5:
        cardID5 = "the 6";
        break;
     case 6:
        cardID5 = "the 7";
        break;
     case 7:
        cardID5 = "the 8";
        break;
     case 8:
        cardID5 = "the 9";
        break;
     case 9:
        cardID5 = "the 10";
        break;
     case 10:
        cardID5 = "the Jack";
        break;
     case 11:
        cardID5 = "the Queen";
        break;
     case 12:
        cardID5 = "the King";
        break;
}


//match random numbers with a card suit
if (cardNumber5>0 && cardNumber5<=13) {
    cardSuit5=" of diamonds";
}
if (cardNumber5>13 && cardNumber5<=26) {
    cardSuit5=" of clubs";
}
if (cardNumber5>26 && cardNumber5<=39) {
    cardSuit5=" of hearts";
}
if (cardNumber5>39 && cardNumber5<=52) {
    cardSuit5=" of spades";
}

System.out.println(cardID5+cardSuit5);

//Determine the "type" of poker hand
if (   cardNumber1 != cardNumber2 && cardNumber1 != cardNumber3 
    && cardNumber1 != cardNumber4 && cardNumber1 != cardNumber5
    && cardNumber2 != cardNumber3 && cardNumber2 != cardNumber4 
    && cardNumber2 != cardNumber5 && cardNumber3 != cardNumber4 
    && cardNumber3 != cardNumber5 && cardNumber4 != cardNumber5) {
    System.out.println("you drew a high card");
}

else if (   cardNumber1 != cardNumber2 || cardNumber1 != cardNumber3 
    && cardNumber1 != cardNumber4 || cardNumber1 != cardNumber5
    && cardNumber2 != cardNumber3 || cardNumber2 != cardNumber4 
    && cardNumber2 != cardNumber5 || cardNumber3 != cardNumber4 
    && cardNumber3 != cardNumber5 || cardNumber4 != cardNumber5) {
    System.out.println("you drew a hand better than high card");
}

//Sorry for the poor quality, I ran out of time.

    }//end of main method
}//end of class