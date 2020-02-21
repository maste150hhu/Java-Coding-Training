public class Game {

    // ! Definiiere die Instanzvariablen und schreibe einen Konstruktor!


    public void generateRandomWorld() {

        // Laufe iterativ in beide Richtungen über das playboard
        for(int i = 0; i < playboard.length; i++) {

            for(int j = 0; j < playboard[0].length; j++) {
                // Lasse den Zufall entscheiden, ob an einer Position ein Spieler, ein Hindernis
                // oder ein Gegner erscheint
                int rnd = (int) (Math.random() * 20);
                if(rnd >= 15 && rnd < 19) {
                    // !Füge ein Obstacle ein!
                } else if(rnd == 19 && Math.abs(i - player.getX()) > 2 && Math.abs(j - player.getY()) > 2){ 
                    // !Füge einen Enemy ein!
                } else {
                    // !Setze ein freies Feld!
                }
            }
        }

        // !spawn the player in the center!
    }

    // Diese Methode soll das Spielfeld in der Konsole ausgeben
    public void printPlayboard() {
        for(int i = 0; i < playboard.length; i++) {
            for(int j = 0; j < playboard[0].length; j++) {
                // !Gebe entweder die Texture oder ein Leerzeichen aus!
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // !Erzeuge eine Instanz von Game und gebe einmal das Spielfeld aus!
    }
}
