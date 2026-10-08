package abstraction.Animals;

public abstract class Animal {

	int animalId;
	String animalName;
	String animalType;
	int age;
	String gender;
	double weight;
	String color;
	String habitat;

	Animal() {

	}

	Animal(int animalId, String animalName, String animalType, int age, String gender, double weight, String color, String habitat) {

		this.animalId = animalId;
		this.animalName = animalName;
		this.animalType = animalType;
		this.age = age;
		this.gender = gender;
		this.weight = weight;
		this.color = color;
		this.habitat = habitat;
	}

	
	public abstract void eat();

	public abstract void sound();

	
	@Override
	public String toString() {

		return "Animal [animalId=" + animalId + ", animalName=" + animalName + ", animalType=" + animalType + ", age="
				+ age + ", gender=" + gender + ", weight=" + weight + ", color=" + color + ", habitat=" + habitat + "]";
	}
}
