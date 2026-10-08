package project1;

public class Person {

	private int playerId;
	private String name;
	private int age;
	private String country;

	private int totalRaces;
	private int wins;
	private int losses;
	private int totalScore;

	public Person(int playerId, String name, int age, String country) {

		this.playerId = playerId;
		this.name = name;
		this.age = age;
		this.country = country;

		this.totalRaces = 0;
		this.wins = 0;
		this.losses = 0;
		this.totalScore = 0;
	}

	public void playRace() {
		totalRaces++;
	}

	public void recordWin(int score) {
		wins++;
		totalScore += score;
	}

	public void recordLoss(int score) {
		losses++;
		totalScore += score;
	}

	public double getWinPercentage() {

		if (totalRaces == 0) {
			return 0;
		}

		return ((double) wins / totalRaces) * 100;
	}

	public String getName() {
		return name;
	}

	public int getPlayerId() {
		return playerId;
	}

	public int getTotalRaces() {
		return totalRaces;
	}

	public int getWins() {
		return wins;
	}

	public int getLosses() {
		return losses;
	}

	public int getTotalScore() {
		return totalScore;
	}

	@Override
	public String toString() {

		return "\n========== PLAYER PROFILE ==========" + "\nPlayer ID : " + playerId + "\nName : " + name + "\nAge : "
				+ age + "\nCountry : " + country + "\nTotal Races : " + totalRaces + "\nWins : " + wins + "\nLosses : "
				+ losses + "\nTotal Score : " + totalScore + "\nWin Percentage : "
				+ String.format("%.2f", getWinPercentage()) + "%" + "\n====================================";
	}
}