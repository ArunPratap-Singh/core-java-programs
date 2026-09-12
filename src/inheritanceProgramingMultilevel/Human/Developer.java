package inheritanceProgramingMultilevel.Human;

public class Developer extends Employee{
	
	String programmingLanguage;
    String developmentType;
    
    Developer(){
    	
    }

    Developer(String name, int age, String gender, String city, int employeeId, double salary, String programmingLanguage, String developmentType) {

        super(name, age, gender, city, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
        this.developmentType = developmentType;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nProgrammingLanguage is: " + programmingLanguage + "\nDevelopmentType is: " + developmentType;
    } 

}
