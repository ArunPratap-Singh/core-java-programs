package abstractmethod;

public abstract class PetAnimal extends Animal{
	
	String ownername;
	int age;
	String vaccinated;
	
	PetAnimal(){
		
	}
	
	PetAnimal(String name, int price, double weight, String ownername, int age, String vaccinated){
		
		super(name,price,weight);
		this.ownername = ownername;
		this.age = age;
		this.vaccinated = vaccinated;
	}
	
	@Override
	public  abstract void run();
	
	@Override
	public abstract void makeSound();
	
	@Override
	public abstract void walk();
	
	@Override
	public abstract void eat();
	
	@Override
	public String toString() {
		return super.toString()+"Ownername is: " +ownername+"\tAge is: " +age+"\tVaccinated is: " +vaccinated;
	}
	
	
	

}
