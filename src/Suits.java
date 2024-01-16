public enum Suits {
    Hearts,
    Diamonds,
    Clubs,
    Spades;
    
    public static String[] names() {
        Suits[] suits = values();
        String[] names = new String[suits.length];
    
        for (int i = 0; i < suits.length; i++) {
            names[i] = suits[i].name();
        }
    
        return names;
    }
}
