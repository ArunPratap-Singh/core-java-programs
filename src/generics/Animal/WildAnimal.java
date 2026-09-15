package generics.Animal;

public class WildAnimal extends Animal{
	
	 private String habitat;
	    private String foodType;
	    
	    WildAnimal(){
	    	
	    }

	    public WildAnimal(String name, String color, int age, String habitat, String foodType) {

	        super(name, color, age);
	        this.habitat = habitat;
	        this.foodType = foodType;
	    }

	    public String toString() {
	       return super.toString()+"\nHabitat is: " +habitat+"\nFoodType is: " +foodType;
	    }

}
