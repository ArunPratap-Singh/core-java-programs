package abstraction.Animals;

public class Cat extends Animal {

	String breed;
	String ownerName;
	String foodPreference;
	String eyeColor;
	boolean indoor;

	Cat() {
		
	}

	Cat(int animalId, String animalName, String animalType, int age, String gender, double weight, String color,
			String habitat, String breed, String ownerName, String foodPreference, String eyeColor, boolean indoor) {

		super(animalId, animalName, animalType, age, gender, weight, color, habitat);

		this.breed = breed;
		this.ownerName = ownerName;
		this.foodPreference = foodPreference;
		this.eyeColor = eyeColor;
		this.indoor = indoor;
	}

	@Override
	public void eat() {
		System.out.println("Cat eats fish, milk and cat food.");
	}

	@Override
	public void sound() {
		System.out.println("Cat meows.");
	}

	
	public void climb() {
		System.out.println("Cat is climbing.");
	}

	
	@Override
	public String toString() {

		return "Cat [animalId=" + animalId + ", animalName=" + animalName + ", animalType=" + animalType + ", age="
				+ age + ", gender=" + gender + ", weight=" + weight + ", color=" + color + ", habitat=" + habitat
				+ ", breed=" + breed + ", ownerName=" + ownerName + ", foodPreference=" + foodPreference + ", eyeColor="
				+ eyeColor + ", indoor=" + indoor + "]";
	}
}
