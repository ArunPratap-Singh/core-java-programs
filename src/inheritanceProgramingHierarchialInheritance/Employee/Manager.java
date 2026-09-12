package inheritanceProgramingHierarchialInheritance.Employee;

public class Manager extends Employee{
	
	    int teamSize;
	    String department;
	    
	    Manager(){
	    	
	    }

	    Manager(String name, int employeeId, double salary, int teamSize, String department) {

	        super(name, employeeId, salary);
	        this.teamSize = teamSize;
	        this.department = department;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nTeam Size is: " + teamSize + "\nDepartment is: " + department+"\n===========================";
	    }
	

}
