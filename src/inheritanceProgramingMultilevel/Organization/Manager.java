package inheritanceProgramingMultilevel.Organization;

public class Manager extends Employee{

	    String teamName;
	    int teamSize;
	    
	    Manager(){
	    	
	    }

	    Manager(String organizationName, String headquarters, String companyName, int companyId, String departmentName, String departmentLocation, int employeeId, String employeeName, double salary, String teamName, int teamSize) {

	        super(organizationName, headquarters, companyName, companyId, departmentName, departmentLocation, employeeId, employeeName, salary);
	        this.teamName = teamName;
	        this.teamSize = teamSize;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nTeamName is: " + teamName + "\nTeamSize is: " + teamSize;
	    }
	

}
