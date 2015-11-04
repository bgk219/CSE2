/*
Benjamin Kim
Professor Chen
CSE2
11/3/16
hw10

Write a program that prints all the cards of a traditional poker deck. Then, 
shuffle the whole deck. Then print out the cards in the deck (all shuffled).
Then pick out a hand (pick randomly 5 cards of deck) and print them out.
*/

public class Shuffling{
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    System.out.println("Initial deck order:");
    for (int i=0; i<52; i++){
      cards[i]=rankNames[i%13]+suitNames[i/13];
     System.out.print(cards[i]+" ");
    }
    shuffle(cards);
    System.out.println(" ");
    System.out.println("Deck order after shuffling: ");
    printArray(cards);
    hand = randomizeHand(cards);
    System.out.println(" ");
    System.out.println("Randomized Hand:");
    printArray(hand);
    }//end of main method


//Take an array of Strings and print out each element
public static void printArray( String[] list) {
    for(int j=0; j<list.length; j++) {
        System.out.print(list[j] + " ");
    }//end of for loop
}//end of printArray method


//Shuffles the elements of the subjected array
public static void shuffle( String[] list) {
    for(int k=0; k<list.length; k++) {
        //find random members inside subjected array
        int target = (int) (list.length*Math.random() );
        //swap the chosem members
        String temp = list[target];
        list[target] = list[k];
        list[k] = temp;
    }//end of for loop
}//end of shuffle method


//
public static String[] randomizeHand(String[] list) {
    String[] list2 = new String[5];
    for(int x=0; x<5; x++){
        int ranNum = (int) (Math.random()*52);
        
        list2[x] = list[ranNum];
    }//end of for loop
    return list2;
}//end of randomizeHand method

}//end of class


















