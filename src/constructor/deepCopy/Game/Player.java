package constructor.deepCopy.Game;

public class Player {
	
	    int playerId;
	    String playerName;
	    int age;
	    String country;
	    double ranking;
	    String team;

	    Player() {
	    }

	    Player(int playerId, String playerName, int age, String country, double ranking, String team) {

	        this.playerId = playerId;
	        this.playerName = playerName;
	        this.age = age;
	        this.country = country;
	        this.ranking = ranking;
	        this.team = team;
	    }

	    public String toString() {

	        return "PlayerId is: " + playerId + "\nPlayerName is: " + playerName + "\nAge is: " + age + "\nCountry is: " + country + "\nRanking is: " + ranking + "\nTeam is: " + team;
	    }
	

}
