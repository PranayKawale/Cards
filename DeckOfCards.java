package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
* The DeckOfCards program 
* simply  initialise the deck of cards game.
*
* @author  Pranay Kawale
* @version 1.0
* @since   2021-08-26 
*/

public class DeckOfCards {
	 Scanner input=new Scanner(System.in);
	    //creating Arraylist
	    ArrayList<String> cardCollection = new ArrayList<>();
	    /*
	    In this I have created String type array of Suits and Ranks to store value.
	     */
	    public static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};


	    public void initializeCards() {
	        
	    
	        int totalCards = suits.length * ranks.length;
	        System.out.println("Total no of card is : " + totalCards);
	        for (int i = 0; i < suits.length; i++) {
	            for (int j = 0; j < ranks.length; j++) {
	                cardCollection.add(suits[i]+ranks[j]); //storing elements into arraylist
	            }
	        }
	        System.out.println("Cards are: "+ cardCollection);
	    }

	    public void noOfPlayer(){
	        System.out.println("enter the no. of player : ");
	        int noOfPlayer=input.nextInt();
	        if (noOfPlayer>=2 && noOfPlayer<=4){
	            System.out.println(noOfPlayer+"players will play the game");
	        }
	        else
	            System.out.println("min 2 and max 4 players can play the game");
	    }
	    public static void main(String[] args) {
	        System.out.println("Welcome to decks of card problem");
	        DeckOfCards deckOfCardMain = new DeckOfCards();
	        deckOfCardMain.initializeCards();
	        deckOfCardMain.noOfPlayer();
	    }
	}