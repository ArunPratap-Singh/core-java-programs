package inheritancePrograming.Animal;

public class Animal {
	
	    String animalName;
	    int age;
	    String color;
	    String food;
	    
	    Animal(){
	    	
	    }	

	    Animal(String animalName, int age, String color, String food) {

	        this.animalName = animalName;
	        this.age = age;
	        this.color = color;
	        this.food = food;
	    }

	    public String toString() {
	    	
	    	return "AnimalName is: " +animalName+"\nAge is: " +age+"\n Color is: " +color+"\nFood is: " +food+"\n=========================";
	    }

}
