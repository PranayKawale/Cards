package com.bridgelabz;

public class DeckOfCards {
	int[] deck = new int [52];
	private int rank, suit;
	private static String[] suits = { "hearts", "spades", "diamonds", "clubs" };

	private static String[] ranks  = {  "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" ,"Ace"};

	public DeckOfCards(int suit, int rank)

	{
		this.rank=rank;
		this.suit=suit;
	}

	public @Override String toString()
	{
		return ranks[rank] + " of " + suits[suit];
	}



	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;

	}
	
}
