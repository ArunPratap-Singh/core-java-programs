package inheritanceProgramingHierarchialInheritance.Employee;

public class Accountant extends Employee{
	
	    String accountingSoftware;
	    String qualification;
	    
	    Accountant(){
	    	
	    }	

	    Accountant(String name, int employeeId, double salary, String accountingSoftware, String qualification) {

	        super(name, employeeId, salary);
 	        this.accountingSoftware = accountingSoftware;
	        this.qualification = qualification;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nAccounting Software is: " + accountingSoftware + "\nQualification is: " + qualification+"\n=============================";
	    }
	

}
