package inheritanceProgramingHierarchialInheritance.Employee;

public class Tester extends Employee{
	
	    String testingType;
	    String tool;
	    
	    Tester(){
	    	
	    }

	    Tester(String name, int employeeId, double salary, String testingType, String tool) {

	        super(name, employeeId, salary);
	        this.testingType = testingType;
	        this.tool = tool;
	    }

	    @Override
	    public String toString() {
	        return super.toString() +  "\n Testing Type is: " + testingType +  "\nTool is: " + tool +"\n==================================";
	    }
	

}
