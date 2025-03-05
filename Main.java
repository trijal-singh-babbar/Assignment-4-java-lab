// Main.java

// Trijal Singh Babbar
// Aiml B3
// PRN: 23070126137

class Main
{
	public static void main(String args[])
	{
		Deck d = new Deck();
		System.out.println("----------Create Deck--------");
		d.createDeck();
		System.out.println("----------Print Deck---------");
		d.displayDeck();
		System.out.println("---------Shuffled Deck--------");
		d.shuffleDeck();
		d.displayDeck();
		System.out.println("--------Random 2 Cards--------");
		d.randomCards();
		System.out.println("--------Distribute cards for game to 3 players----------");
		d.cardPlayers();
		System.out.println("--------Search for a Card----------");
        d.searchCard("A", "Spades"); // Example: Searching for Ace of Spades
		System.out.println("--------Compare Two Cards----------");
        Card card1 = new Card("K", "Hearts");
        Card card2 = new Card("K", "Diamonds");
        d.compareCard(card1, card2); // Example: Comparing two Kings
	}
}