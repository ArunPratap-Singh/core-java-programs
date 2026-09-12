package inheritanceProgramingMultilevel.Organization;

public class Director extends SeniorManager{
	
	    String region;
	    double annualBudget;
	    
	    Director(){
	    	
	    }

	    Director(String organizationName, String headquarters, String companyName, int companyId, String departmentName, String departmentLocation, int employeeId, String employeeName, double salary, String teamName, int teamSize, int experience, String specialization, String region, double annualBudget) {

	        super(organizationName, headquarters, companyName, companyId, departmentName, departmentLocation, employeeId, employeeName, salary, teamName, teamSize, experience, specialization);
	        this.region = region;
	        this.annualBudget = annualBudget;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nRegion is: " + region + "\nAnnualBudget is: " + annualBudget +"\n============================";
	    }
	

}
