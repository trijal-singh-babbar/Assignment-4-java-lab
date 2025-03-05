# Card Deck Simulation

## Overview
This Java project simulates a deck of playing cards. It provides functionalities to create, shuffle, display, search, and compare cards, as well as distribute them among players. The project consists of three main classes:

1. `Card.java` - Represents an individual playing card.
2. `Deck.java` - Manages the deck of cards and various operations on them.
3. `Main.java` - Contains the main method to demonstrate deck operations.

---

## Files and Class Descriptions

### 1. `Card.java`
This class represents a single playing card with a rank and a suit.

#### **Methods:**
- `Card(String rank, String suit)`: Constructor to initialize a card with a given rank and suit.
- `toString()`: Returns a string representation of the card (e.g., "Ace of Spades").

---

### 2. `Deck.java`
This class manages a deck of 52 playing cards and provides functionalities such as shuffling, displaying, searching, and comparing cards.

#### **Methods:**
- `Deck()`: Constructor that initializes an empty deck.
- `createDeck()`: Creates a standard 52-card deck with ranks (2-A) and suits (Spades, Hearts, Diamonds, Clubs).
- `displayDeck()`: Displays all the cards in the deck.
- `shuffleDeck()`: Randomly shuffles the deck.
- `randomCards()`: Selects and prints two random cards from the deck.
- `cardPlayers()`: Distributes cards among three players (A, B, and C) and displays them.
- `findCard(String rank, String suit)`: Searches for a specific card in the deck and returns `true` if found, otherwise `false`.
- `compareCard(Card card1, Card card2)`: Compares two cards based on rank and returns `true` if they have the same rank, otherwise `false`.

---

### 3. `Main.java`
This class contains the main method to demonstrate the functionalities of the deck.

#### **Main Execution Flow:**
1. Creates a new deck.
2. Displays the deck before and after shuffling.
3. Draws two random cards.
4. Distributes cards among three players.
5. Searches for a specific card (e.g., Ace of Spades).
6. Compares two cards to check if they have the same rank.

---

## How to Run the Project

1. **Compile the files:**
   ```sh
   javac Main.java
   ```

2. **Run the program:**
   ```sh
   java Main
   ```

---


