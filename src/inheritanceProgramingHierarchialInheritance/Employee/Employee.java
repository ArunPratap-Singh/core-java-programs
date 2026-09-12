package inheritanceProgramingHierarchialInheritance.Employee;

public class Employee {
	
	    String name;
	    int employeeId;
	    double salary;
	    
	    Employee(){
	    	
	    }

	    Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Name is: " + name + "\nEmployee ID is: " + employeeId + "\nSalary is: " + salary+"\n============================";
	    }
	

}
