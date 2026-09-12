package contructor.ConstructorChaining;

public class Birds {
	
	    String name;
	    int age;
	    String species;
	    String color;
	    double weight;
	    long wingspan;
	    String habitat;
	    String food;

	    Birds(String name, int age, String species, String color, double weight, long wingspan, String habitat, String food) {

	        this.name = name;
	        this.age = age;
	        this.species = species;
	        this.color = color;
	        this.weight = weight;
	        this.wingspan = wingspan;
	        this.habitat = habitat;
	        this.food = food;
	    }

	    Birds() {
	    }

	    Birds(String name) {
	        this.name = name;
	    }

	    Birds(String name, int age) {
	        this(name);
	        this.age = age;
	    }

	    Birds(String name, int age, String species) {
	        this(name, age);
	        this.species = species;
	    }

	    Birds(String name, int age, String species, String color) {
	        this(name, age, species);
	        this.color = color;
	    }

	    Birds(String name, int age, String species, String color, double weight) {
	        this(name, age, species, color);
	        this.weight = weight;
	    }

	    Birds(String name, int age, String species, String color, double weight, long wingspan) {
	        this(name, age, species, color, weight);
	        this.wingspan = wingspan;
	    }

	    Birds(int age, String name, String species, String color, double weight, long wingspan, String habitat) {
	        this(name, age, species, color, weight, wingspan);
	        this.habitat = habitat;
	    }

	    Birds(int age, String name, String species, String color, double weight, long wingspan, String habitat, String food) {
	        this(age, name, species, color, weight, wingspan, habitat);
	        this.food = food;
	    }

	    public String toString() {

	        return "Name is: " + name + "\tAge is: " + age + "\tSpecies is: " + species + "\tColor is: " + color + "\nWeight is: " + weight + "\tWingspan is: " + wingspan + "\tHabitat is: " + habitat + "\tFood is: " + food + "\n===============================================";
	    }
	

}
