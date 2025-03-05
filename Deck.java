// Deck.java

import java.util.*;
class Deck
{
	ArrayList<Card> deck;
	
	public Deck()
	{
		deck = new ArrayList<>();
	}
	
	public void createDeck()
	{
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
		
		for(String rank : ranks)
		{
			for(String suit : suits)
			{
				deck.add(new Card(rank, suit));
			}
		}
	}
	
	public void displayDeck()
	{
		for(Card card : deck)
		{
			System.out.println(card);
		}
	}
	
	public void shuffleDeck()
	{
		Collections.shuffle(deck);
	}
	
	// method to select 2 cards at random 
}