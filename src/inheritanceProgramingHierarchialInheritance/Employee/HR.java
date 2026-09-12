package inheritanceProgramingHierarchialInheritance.Employee;

public class HR extends Employee{
	
	    int employeesHandled;
	    String recruitmentArea;
	    
	    HR(){
	    	
	    }

	    HR(String name, int employeeId, double salary, int employeesHandled, String recruitmentArea) {

	        super(name, employeeId, salary);
	        this.employeesHandled = employeesHandled;
	        this.recruitmentArea = recruitmentArea;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nEmployees Handled is: " + employeesHandled + "\nRecruitment Area is: " + recruitmentArea+"\n==========================";
	    }
	

}
