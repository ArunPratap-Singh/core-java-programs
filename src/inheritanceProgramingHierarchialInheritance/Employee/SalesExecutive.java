package inheritanceProgramingHierarchialInheritance.Employee;

public class SalesExecutive extends Employee{
	
	    double salesTarget;
	    String region;
	    
	    SalesExecutive(){
	    	
	    }

	    SalesExecutive(String name, int employeeId, double salary, double salesTarget, String region) {

	        super(name, employeeId, salary);
	        this.salesTarget = salesTarget;
	        this.region = region;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nSales Target is: " + salesTarget + "\nRegion is: " + region+"\n================================";
	    }
	

}
