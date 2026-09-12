package immutableClassProgram;

public final class Movie {

	private final int movieId;
	private final String movieName;
	private final String director;
	private final String actor;
	private final double budget;
	private final String language;
	private final String genre;

	Movie(int movieId, String movieName, String director, String actor, double budget, String language, String genre) {

		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.actor = actor;
		this.budget = budget;
		this.language = language;
		this.genre = genre;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getDirector() {
		return director;
	}

	public String getActor() {
		return actor;
	}

	public double getBudget() {
		return budget;
	}

	public String getLanguage() {
		return language;
	}

	public String getGenre() {
		return genre;
	}

}
