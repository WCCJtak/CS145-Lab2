import java.security.SecureRandom;

public class DeckOfCards {   
   private static String[] FACES = Faces.names();
   private static String[] SUITS = Suits.names();

   private static final int NUMBER_OF_CARDS = FACES.length * SUITS.length;
   private static final SecureRandom secureRandom = new SecureRandom();
   public Card[] deck = new Card[NUMBER_OF_CARDS];
   private int deckIndex = NUMBER_OF_CARDS; // virtual index of the deck.

   public DeckOfCards() {   
      int cardIndex = 0;
      while(cardIndex < NUMBER_OF_CARDS) {
         String face = FACES[cardIndex%FACES.length];
         String suit = SUITS[cardIndex/FACES.length];
         deck[cardIndex] = new Card(suit, face);
         cardIndex++;
      }
   }

   public void shuffle() {
      deckIndex = NUMBER_OF_CARDS; // initialize on shuffle
      int cardIndex = 0;
      while(cardIndex < NUMBER_OF_CARDS) {
         int randomIndex = secureRandom.nextInt(NUMBER_OF_CARDS);
         Card currentCard = deck[cardIndex];
         Card cardToSwap = deck[randomIndex];
         deck[randomIndex] = currentCard;
         deck[cardIndex] = cardToSwap;
         cardIndex++;
      }
   } 

   public Card dealCard() {
      if (deckIndex > 0) {
         deckIndex--;
         return deck[deckIndex];
      } 
      return null;
   } 
} 
