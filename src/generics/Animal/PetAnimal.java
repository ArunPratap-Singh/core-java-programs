package generics.Animal;

public class PetAnimal extends Animal{
	
	    private String ownerName;
	    private String petType;
	    
	    PetAnimal(){
	    	
	    }

	    public PetAnimal(String name, String color, int age, String ownerName, String petType) {

	        super(name, color, age);
	        this.ownerName = ownerName;
	        this.petType = petType;
	    }

	    public String toString() {
	       return super.toString()+"\nOwnerName is: " +ownerName+"\nPetType is: " +petType; 
	    }
	

}
