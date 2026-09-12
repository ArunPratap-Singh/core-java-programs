package constructor.shallowCopy.Game;

public class Game {
	
	    String gameName;
	    String gameType;
	    int price;
	    String platform;
	    Player p;

	    Game() {
	    }

	    Game(String gameName, String gameType, int price, String platform, Player p) {

	        this.gameName = gameName;
	        this.gameType = gameType;
	        this.price = price;
	        this.platform = platform;
	        this.p = p;
	    }

	    // Shallow Copy Constructor
	    Game(Game g) {

	        this.gameName = g.gameName;
	        this.gameType = g.gameType;
	        this.price = g.price;
	        this.platform = g.platform;
	        this.p = g.p;
	    }

	    public String toString() {

	        return "GameName is: " + gameName + "\nGameType is: " + gameType + "\nPrice is: " + price + "\nPlatform is: " + platform + "\nP is: " + p  + "\n========================";
	    }
	

}
