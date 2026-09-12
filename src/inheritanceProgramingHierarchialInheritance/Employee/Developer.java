package inheritanceProgramingHierarchialInheritance.Employee;

public class Developer extends Employee{
	
	    String programmingLanguage;
	    String project;
	    
	    Developer(){
	    	
	    }

	    Developer(String name, int employeeId, double salary, String programmingLanguage, String project) {

	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	        this.project = project;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nProgramming Language is: " + programmingLanguage + "\nProject is: " + project+"\n============================";
	    }
	

}
