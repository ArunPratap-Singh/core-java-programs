package constructor.deepCopy.Company;

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

	    //deep copy
	    Company(Company c) {
	        this.companyName = c.companyName;
	        this.industry = c.industry;
	        this.employees = c.employees;
	        this.location = c.location;
	        this.m = new Manager();
	        this.m.age = c.m.age;
	        this.m.department = c.m.department;
	        this.m.gender = c.m.gender;
	        this.m.managerId = c.m.managerId;
	        this.m.managerName = c.m.managerName;
	        this.m.salary = c.m.salary;
	    }

	    public String toString() {
	        return "CompanyName is: " + companyName + "\nIndustry is: " + industry + "\nEmployees are: " + employees + "\nLocation is: " + location + "\nManager is: " + m + "\n========================";
	    }
	

}
