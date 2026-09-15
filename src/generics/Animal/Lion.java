package generics.Animal;

public class Lion extends WildAnimal{
	
	    private String prideName;
	    private double weight;
	    
	    Lion(){
	    	
	    }	

	    public Lion(String name, String color, int age, String habitat, String foodType, String prideName, double weight) {

	        super(name, color, age, habitat, foodType);
	        this.prideName = prideName;
	        this.weight = weight;
	    }

	    public String toString() {
	        return super.toString()+"\nPrideName is: " +prideName+"\nWeight is: " +weight; 
	    }
	

}
