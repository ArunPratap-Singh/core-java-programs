package abstractmethod;

public abstract class Animal {
	
	String name;
	int price;
	double weight;
	
	Animal(){
		
	}
	
	Animal(String name, int price, double weight){
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public abstract void makeSound();
	
	public abstract void eat();
	
	public abstract void walk();
	
	public abstract void run();
	
	public String toString() {
		return "Name is: " +name+"\tPrice is: " +price+"\tWeight is: " +weight;
	}

}
