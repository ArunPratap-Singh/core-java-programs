package encapsulationsPrograming;

public class Employee {
	
	    private String name;
	    private String employeeid;
	    private String department;
	    private double salary;
	    private double bonus;
	    
	    Employee() {
	    	
	    }	

	    Employee(String name, String employeeid, String department, double salary, double bonus) {

	        this.name = name;
	        this.employeeid = employeeid;
	        this.department = department;
	        this.salary = salary;
	        this.bonus = bonus;
	    }

	    public void setName(String name) {

	        if (name.length() > 3 && name.length() <= 50 && !name.isBlank() && name.matches("[A-Z a-z \s]+"))
	            this.name = name;
	        else
	            System.out.println("Wrong name entered");
	    }

	    public String getName() {
	        return name;
	    }

	    public void setEmployeeID(String employeeid) {

	        if (employeeid.length() > 3 && employeeid.length() <= 20 && !employeeid.isBlank() && employeeid.matches("[A-Z a-z 0-9]+"))
	            this.employeeid = employeeid;
	        else
	            System.out.println("Invalid Employee ID");
	    }

	    public String getEmployeeID() {
	        return employeeid;
	    }

	    public void setDepartment(String department) {

	        if (department.length() > 2 && department.length() <= 30 && !department.isBlank() && department.matches("[A-Z a-z \s]+"))
	            this.department = department;
	        else
	            System.out.println("Wrong Department");
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setSalary(double salary) {

	        if (salary > 0)
	            this.salary = salary;
	        else
	            System.out.println("Wrong salary amount");
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setBonus(double bonus) {

	        if (bonus >= 0)
	            this.bonus = bonus;
	        else
	            System.out.println("Wrong bonus amount");
	    }

	    public double getBonus() {
	        return bonus;
	    }
	

}
