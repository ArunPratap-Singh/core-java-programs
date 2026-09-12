package classOrabstractclassOrinterface;

public abstract class Animal {
	double weight;
	int age;
	double height;
	
	Animal(){
		
	}
	
	Animal(double weight, int age, double height){
		
		this.weight = weight;
		this.age = age;
		this.height = height;
	}
	
	public abstract void makeSound();
		
	
	
	public String toString() {
		return "Weight is: " +weight+"\tAge is: " +age+"\tHeight is: " +height;
	}
	

}
