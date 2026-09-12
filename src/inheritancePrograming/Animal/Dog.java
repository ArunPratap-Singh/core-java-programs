package inheritancePrograming.Animal;

public class Dog extends Animal{
	
	String breed;
    String owner;
    boolean vaccinated;
    
    Dog(){
    	
    }

    Dog(String animalName, int age, String color, String food, String breed, String owner, boolean vaccinated) {

        super(animalName, age, color, food);
        this.breed = breed;
        this.owner = owner;
        this.vaccinated = vaccinated;
    }
    
    public String toString() {
    	return super.toString()+"Breed is: " +breed+"\nOwner is: " +owner+"\nVaccinated is: " +vaccinated+"\n========================";
    }

}
