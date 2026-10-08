package abstraction.Animals;

public class Lion extends Animal {

	String prideName;
	String territory;
	String foodType;
	String huntingStyle;
	boolean kingOfJungle;

	Lion() {
		
	}

	Lion(int animalId, String animalName, String animalType, int age, String gender, double weight, String color,
			String habitat, String prideName, String territory, String foodType, String huntingStyle,
			boolean kingOfJungle) {

		super(animalId, animalName, animalType, age, gender, weight, color, habitat);

		this.prideName = prideName;
		this.territory = territory;
		this.foodType = foodType;
		this.huntingStyle = huntingStyle;
		this.kingOfJungle = kingOfJungle;
	}

	@Override
	public void eat() {
		System.out.println("Lion eats meat.");
	}

	@Override
	public void sound() {
		System.out.println("Lion roars.");
	}

	
	public void hunt() {
		System.out.println("Lion is hunting.");
	}

	@Override
	public String toString() {

		return "Lion [animalId=" + animalId + ", animalName=" + animalName + ", animalType=" + animalType + ", age="
				+ age + ", gender=" + gender + ", weight=" + weight + ", color=" + color + ", habitat=" + habitat
				+ ", prideName=" + prideName + ", territory=" + territory + ", foodType=" + foodType + ", huntingStyle="
				+ huntingStyle + ", kingOfJungle=" + kingOfJungle + "]";
	}
}
