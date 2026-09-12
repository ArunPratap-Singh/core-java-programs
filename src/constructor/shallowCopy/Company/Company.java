package constructor.shallowCopy.Company;

	public class Company {

	    String companyName;
	    String industry;
	    int employees;
	    String location;
	    Manager m;

	    Company() {
	    }

	    Company(String companyName, String industry, int employees, String location, Manager m) {
	        this.companyName = companyName;
	        this.industry = industry;
	        this.employees = employees;
	        this.location = location;
	        this.m = m;
	    }

	    Company(Company c) {
	        this.companyName = c.companyName;
	        this.industry = c.industry;
	        this.employees = c.employees;
	        this.location = c.location;
	        this.m = c.m;
	    }

	    public String toString() {
	        return "CompanyName is: " + companyName + "\nIndustry is: " + industry + "\nEmployees are: " + employees + "\nLocation is: " + location + "\nManager is: " + m + "\n========================";
	    }
	

}
