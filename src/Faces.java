public enum Faces {
    Ace,
    Deuce,
    Three,
    Four,
    Five,
    Six,      
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King;

    public static String[] names() {
        Faces[] faces = values();
        String[] names = new String[faces.length];
        for (int i = 0; i < faces.length; i++) {
            names[i] = faces[i].name();
        }
        return names;
    }
}