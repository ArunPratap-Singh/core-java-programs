package inheritanceProgramingMultilevel.Organization;

public class SeniorManager extends Manager{
	
	    int experience;
	    String specialization;
	    
	    SeniorManager(){
	    	
	    }	

	    SeniorManager(String organizationName, String headquarters, String companyName, int companyId, String departmentName, String departmentLocation, int employeeId, String employeeName, double salary, String teamName, int teamSize, int experience, String specialization) {

	        super(organizationName, headquarters, companyName, companyId, departmentName, departmentLocation, employeeId, employeeName, salary, teamName, teamSize);
	        this.experience = experience;
	        this.specialization = specialization;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nExperience is: " + experience + " years " + "\nSpecialization is: " + specialization;
	    }
	

}
