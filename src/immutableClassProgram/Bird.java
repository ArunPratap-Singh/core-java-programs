package immutableClassProgram;

public final class Bird {
	
	 	private final int birdId;
	    private final String birdName;
	    private final String species;
	    private final String color;
	    private final double weight;
	    private final String habitat;
	    private final String food;

	    Bird(int birdId, String birdName, String species, String color, double weight, String habitat, String food) {

	        this.birdId = birdId;
	        this.birdName = birdName;
	        this.species = species;
	        this.color = color;
	        this.weight = weight;
	        this.habitat = habitat;
	        this.food = food;
	    }

	    public int getBirdId() {
	        return birdId;
	    }

	    public String getBirdName() {
	        return birdName;
	    }

	    public String getSpecies() {
	        return species;
	    }

	    public String getColor() {
	        return color;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public String getHabitat() {
	        return habitat;
	    }

	    public String getFood() {
	        return food;
	    }
	

}
