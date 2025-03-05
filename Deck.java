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
	
	public void randomCards()
	{
		int i=0;
		for(Card card : deck)
		{
			i++;
			System.out.println(card);
			if(i==2)
			{
				break;
			}
		}
	}
	
	public void cardPlayers()
	{
		ArrayList<Card> a = new ArrayList<>();
		ArrayList<Card> b = new ArrayList<>();
		ArrayList<Card> c = new ArrayList<>();
		
		int i = 0;
		
		for(Card card : deck)
		{
			i++;
			if(i<5)
			{
				a.add(card);
			}
			else if(i>=5 && i<10)
			{
				b.add(card);
			}
			else if (i>=10 && i<15)
			{
				c.add(card);
			}
			else
			{
				break;
			}
		}
		
		System.out.println("Cards with player A");
		for(Card card : a)
		{
			System.out.println(card);
		}
		
		System.out.println("Cards with player B");
		for(Card card : b)
		{
			System.out.println(card);
		}
		
		System.out.println("Cards with player C");
		for(Card card : c)
		{
			System.out.println(card);
		}
		
		public boolean findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equals(rank) && card.suit.equals(suit)) {
                System.out.println("Card found: " + card);
                return true;
            }
        }
        System.out.println("Card not found.");
        return false;
    }
	}
}