package inheritanceProgramingMultilevel.Organization;

public class Organization {
	
	    String organizationName;
	    String headquarters;
	    
	    Organization(){
	    	
	    }

	    Organization(String organizationName, String headquarters) {
	    	
	        this.organizationName = organizationName;
	        this.headquarters = headquarters;
	    }

	    @Override
	    public String toString() {
	        return "OrganizationName is: " + organizationName + "\nHeadquarters is: " + headquarters;
	    }
	

}
