class Main {
    public static void main(String[] args) {
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        int index = 1;
        while(true){
            Card card = deck.dealCard();
            if (card == null) {
                break;
            }
            System.out.println(card);
            System.out.println(index);
            index++;
        }
    }
}