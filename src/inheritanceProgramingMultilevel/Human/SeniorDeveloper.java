package inheritanceProgramingMultilevel.Human;

public class SeniorDeveloper extends Developer{
	
	int experience;
    String specialization;
    
    SeniorDeveloper(){
    	
    }

    SeniorDeveloper(String name, int age, String gender, String city, int employeeId, double salary, String programmingLanguage, String developmentType, int experience, String specialization) {

        super(name, age, gender, city, employeeId, salary, programmingLanguage, developmentType);
        this.experience = experience;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nExperience is: " + experience + " years "+ "\nSpecialization is: " + specialization;
    }

}
