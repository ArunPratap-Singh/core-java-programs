package inheritanceProgramingMultilevel.Human;

public class Person extends Human{
	
	String gender;
    String city;
    
    Person(){
    	
    }

    Person(String name, int age, String gender, String city) {
        super(name, age);
        this.gender = gender;
        this.city = city;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nGender is: " + gender + "\nCity is: " + city;
    }

}
