package inheritancePrograming.Employee;

public class Developer extends Employee{
	
	    String programmingLanguage;
	    String projectName;

	    Developer(String employeeName, int employeeId, double salary, String department, String companyName, String programmingLanguage, String projectName) {

	        super(employeeName, employeeId, salary, department, companyName);
	        this.programmingLanguage = programmingLanguage;
	        this.projectName = projectName;
	    }

	    @Override
	    public String toString() {

	        return super.toString()+"\nProgrammingLanguage is: " +programmingLanguage+"\nProjectName is: " +projectName+"\n==========================";
	    }

}
 