package project1;

public class RaceResult {

	private String playerName;
	private String vehicleName;
	private int score;
	private String result;

	public RaceResult(String playerName, String vehicleName, int score, String result) {

		this.playerName = playerName;
		this.vehicleName = vehicleName;
		this.score = score;
		this.result = result;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {

		return playerName + "\n Vehicle: " + vehicleName + "\n Score: " + score + "\n Result: " + result;
	}
}
