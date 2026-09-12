package inheritanceProgramingMultilevel.Organization;

public class Company extends Organization{
	
	    String companyName;
	    int companyId;
	    
	    Company(){
	    	
	    }

	    Company(String organizationName, String headquarters, String companyName, int companyId) {

	        super(organizationName, headquarters);
	        this.companyName = companyName;
	        this.companyId = companyId;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nCompanyName is: " + companyName + "\nCompanyId is: " + companyId;
	    }
	

}
