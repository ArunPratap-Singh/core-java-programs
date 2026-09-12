package inheritanceProgramingMultilevel.Organization;

public class Department extends Company{
	
	    String departmentName;
	    String departmentLocation;
	    
	    Department(){
	    	
	    }

	    Department(String organizationName, String headquarters, String companyName, int companyId, String departmentName, String departmentLocation) {

	        super(organizationName, headquarters, companyName, companyId);
	        this.departmentName = departmentName;
	        this.departmentLocation = departmentLocation;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nDepartmentName is: " + departmentName + "\nDepartmentLocation is: " + departmentLocation;
	    }
	

}
