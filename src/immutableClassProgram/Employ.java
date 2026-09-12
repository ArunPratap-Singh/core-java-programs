package immutableClassProgram;

public final class Employ {
		
	    private final int employeeId;
	    private final String employeeName;
	    private final String department;
	    private final String designation;
	    private final double salary;
	    private final String company;
	    private final String location;

	    Employ(int employeeId, String employeeName, String department, String designation, double salary, String company, String location) {

	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.department = department;
	        this.designation = designation;
	        this.salary = salary;
	        this.company = company;
	        this.location = location;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public String getEmployeeName() {
	        return employeeName;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public String getCompany() {
	        return company;
	    }

	    public String getLocation() {
	        return location;
	    }
	

}
