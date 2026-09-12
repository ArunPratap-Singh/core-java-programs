package inheritanceProgramingMultilevel.Organization;

public class Employee extends Department{
	
	    int employeeId;
	    String employeeName;
	    double salary;
	    
	    Employee(){
	    	
	    }

	    Employee(String organizationName, String headquarters, String companyName, int companyId, String departmentName, String departmentLocation, int employeeId, String employeeName, double salary) {

	        super(organizationName, headquarters, companyName, companyId, departmentName, departmentLocation);
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nEmployeeId is: " + employeeId + "\nEmployeeName is: " + employeeName + "\nSalary is: " + salary;
	    }
	
}
