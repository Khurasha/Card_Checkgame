/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 *@ Shabd khurana
 *@StudentId - 991701128
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        Scanner  Sk = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        System.out.println("Enter the card number :");
        int cardnumb = Sk.nextInt();
        System.out.println("Enter the suits");
        String Sutiss = Sk.next();
        
        boolean Checker = false;

        for ( Card Cardgame : magicHand) {
            if ( Cardgame.getValue() == cardnumb && Cardgame.getSuit().equals(Sutiss)) {
                Checker = true;
                break;
            }
        }

        if (Checker) {
            System.out.println("The card is present in the array");
        } else {
            System.out.println("The card is not present in the array");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
