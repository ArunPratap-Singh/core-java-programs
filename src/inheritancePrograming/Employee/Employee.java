package inheritancePrograming.Employee;

public class Employee {
	
	    String employeeName;
	    int employeeId;
	    double salary;
	    String department;
	    String companyName;
	    
	    Employee(){
	    	
	    }	

	    Employee(String employeeName, int employeeId, double salary, String department, String companyName) {

	        this.employeeName = employeeName;
	        this.employeeId = employeeId;
	        this.salary = salary;
	        this.department = department;
	        this.companyName = companyName;
	    }

	    @Override
	    public String toString() {

	        return "EmployeeName is: " +employeeName+"\nEmployeeID is: " +employeeId+"\nSalary is: " +salary+"\nSalary is: " +salary+"\nDepartment is: " +department+"\nCompany Name is: " +companyName+"\n===========================";
	
	    }
}	    
	    
	