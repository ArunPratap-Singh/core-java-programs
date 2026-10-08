package abstraction.Animals;

public class Dog extends Animal {

	String breed;
	String ownerName;
	String foodType;
	String trainingLevel;
	boolean vaccinated;

	Dog() {

	}

	Dog(int animalId, String animalName, String animalType, int age, String gender, double weight, String color,
			String habitat, String breed, String ownerName, String foodType, String trainingLevel, boolean vaccinated) {

		super(animalId, animalName, animalType, age, gender, weight, color, habitat);

		this.breed = breed;
		this.ownerName = ownerName;
		this.foodType = foodType;
		this.trainingLevel = trainingLevel;
		this.vaccinated = vaccinated;
	}

	@Override
	public void eat() {
		System.out.println("Dog eats meat, bones and dog food.");
	}

	@Override
	public void sound() {
		System.out.println("Dog barks.");
	}

	public void run() {
		System.out.println("Dog is running.");
	}

	@Override
	public String toString() {

		return "Dog [animalId=" + animalId + ", animalName=" + animalName + ", animalType=" + animalType + ", age="
				+ age + ", gender=" + gender + ", weight=" + weight + ", color=" + color + ", habitat=" + habitat
				+ ", breed=" + breed + ", ownerName=" + ownerName + ", foodType=" + foodType + ", trainingLevel="
				+ trainingLevel + ", vaccinated=" + vaccinated + "]";
	}
}
