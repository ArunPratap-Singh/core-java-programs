package inheritanceProgramingMultilevel.Human;

public class Human {

	    String name;
	    int age;
	    
	    Human(){
	    	
	    }

	    Human(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Name is: " + name + "\nage is: " + age;
	    }
	
}
