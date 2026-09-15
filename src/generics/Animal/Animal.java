package generics.Animal;

public class Animal {
	
	    private String name;
	    private String color;
	    private int age;
	    
	    Animal(){
	    	
	    }

	    public Animal(String name, String color, int age) {
	        this.name = name;
	        this.color = color;
	        this.age = age;
	    }

	    public String toString() { 
	        return "Name is: " +name+"\nColor is: " +color+"\nAge is: " +age;
	    }
	

}
