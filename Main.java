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
	}
}