package contructor.ConstructorOverloading;

public class Animal {
	
	    String name;
	    int age;
	    double weight;
	    String color;
	    String habitat;
	    String food;
	    int legs;

	    Animal() {
	    }

	    Animal(String name) {
	        this.name = name;
	    }

	    Animal(int age) {
	        this.age = age;
	    }

	    Animal(double weight) {
	        this.weight = weight;
	    }

	    Animal(long legs) {
	        this.legs = (int) legs;
	    }

	    Animal(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    Animal(int age, String name) {
	        this.age = age;
	        this.name = name;
	    }

	    Animal(double weight, String color) {
	        this.weight = weight;
	        this.color = color;
	    }

	    Animal(String color, double weight) {
	        this.color = color;
	        this.weight = weight;
	    }

	    Animal(int age, double weight) {
	        this.age = age;
	        this.weight = weight;
	    }

	    Animal(double weight, int age) {
	        this.weight = weight;
	        this.age = age;
	    }

	    Animal(String name, int age, double weight) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	    }

	    Animal(String name, String color, String food) {
	        this.name = name;
	        this.color = color;
	        this.food = food;
	    }

	    Animal(int age, String habitat, int legs) {
	        this.age = age;
	        this.habitat = habitat;
	        this.legs = legs;
	    }

	    Animal(double weight, String color, String habitat) {
	        this.weight = weight;
	        this.color = color;
	        this.habitat = habitat;
	    }

	    Animal(String name, int age, double weight, String color) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.color = color;
	    }

	    Animal(String name, String habitat, String food, int legs) {
	        this.name = name;
	        this.habitat = habitat;
	        this.food = food;
	        this.legs = legs;
	    }

	    Animal(int age, double weight, String color, String food) {
	        this.age = age;
	        this.weight = weight;
	        this.color = color;
	        this.food = food;
	    }

	    Animal(String name, int age, double weight, String color, String habitat) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.color = color;
	        this.habitat = habitat;
	    }

	    Animal(String name, double weight, int age, String food, int legs) {
	        this.name = name;
	        this.weight = weight;
	        this.age = age;
	        this.food = food;
	        this.legs = legs;
	    }

	    Animal(String name, int age, double weight, String color, String habitat, String food) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.color = color;
	        this.habitat = habitat;
	        this.food = food;
	    }

	    Animal(String name, int age, double weight, String color, String habitat, String food, int legs) {
	        this.name = name;
	        this.age = age;
	        this.weight = weight;
	        this.color = color;
	        this.habitat = habitat;
	        this.food = food;
	        this.legs = legs;
	    }

	    public String toString() {

	        return "Name is: " + name + "\nAge is: " + age + "\nWeight is: " + weight + "\nColor is: " + color + "\nHabitat is: " + habitat + "\nFood is: " + food + "\nLegs are: " + legs + "\n==============================";
	    }
	

}
