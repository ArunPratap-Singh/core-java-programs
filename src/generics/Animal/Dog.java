package generics.Animal;

public class Dog extends PetAnimal{
	
	private String breed;
    private boolean trained;
    
    Dog(){
    	
    }

    public Dog(String name, String color, int age, String ownerName, String petType, String breed, boolean trained) {

        super(name, color, age, ownerName, petType);
        this.breed = breed;
        this.trained = trained;
    }

    public String toString() {
        
    	return super.toString()+"\nBreed is: " +breed+"\nTrained is: " +trained;
    }	
}
