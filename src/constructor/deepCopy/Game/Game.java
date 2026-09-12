package constructor.deepCopy.Game;

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

	    // deep Copy Constructor
	    Game(Game g) {

	        this.gameName = g.gameName;
	        this.gameType = g.gameType;
	        this.price = g.price;
	        this.platform = g.platform;
	        this.p = new Player();
	        this.p.age = g.p.age;
	        this.p.country = g.p.country;
	        this.p.playerId = g.p.playerId;
	        this.p.playerName = g.p.playerName;
	        this.p.ranking = g.p.ranking;
	        this.p.team = g.p.team;
	    }

	    public String toString() {

	        return "GameName is: " + gameName + "\nGameType is: " + gameType + "\nPrice is: " + price + "\nPlatform is: " + platform + "\nP is: " + p  + "\n========================";
	    }
	

}
