public class Game {

    public String title, version;
    public Player player;
    public GameObject[][] playboard = new GameObject[10][10];
    long latestGameObjectId;

    public Game(String title, String version) {
        this.title = title;
        this.version = version;
        
        // erzeuge Spieler-Objekt:
        this.player = new Player(latestGameObjectId++, 5, 5);
        this.generateRandomWorld();
    }

    public void generateRandomWorld() {
        for(int i = 0; i < playboard.length; i++) {
            for(int j = 0; j < playboard[0].length; j++) {
                int rnd = (int) (Math.random() * 20);
                if(rnd >= 15 && rnd < 19) {
                    playboard[i][j] = new Obstacle(latestGameObjectId++, i, j);
                } else if(rnd == 19 && Math.abs(i - player.x) > 2 && Math.abs(j - player.y) > 2){ 
                    playboard[i][j] = new Enemy(latestGameObjectId++, i, j);
                } else {
                    playboard[i][j] = null;
                }
            }
        }

        // spawn the player in the center:
        playboard[player.x][player.y] = player;
    }

    public void printPlayboard() {
        for(int i = 0; i < playboard.length; i++) {
            for(int j = 0; j < playboard[0].length; j++) {
                if(playboard[i][j] != null)
                    playboard[i][j].print();
                else System.out.print(' ');    
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Game game = new Game("Random Game", "1.0");
        game.printPlayboard();
    }
}