package inheritancePrograming.Person;

public class Person {
	
	    String personName;
	    int age;
	    String gender;
	    String city;
	    
	    Person(){
	    	
	    }

	    Person(String personName, int age, String gender, String city) {

	        this.personName = personName;
	        this.age = age;
	        this.gender = gender;
	        this.city = city;
	    }
	    
	    public String toString() {
	    	return "PersonName is: " +personName+"\nAge is: " +age+"\nGender is: " +gender+"\nCity is: " +city+"\n========================";
	    }

}
