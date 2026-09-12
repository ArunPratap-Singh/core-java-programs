package methodChaining;

public class Employ {
	
	private int id;
    private String name;
    private String department;
    private double salary;
    private String designation;
    
    Employ(){
    	
    }
    
    public Employ setID(int id) {
    	this.id = id;
    	return this;
    }
    
    public Employ setName(String name) {
    	this.name = name;
    	return this;
    }
    
    public Employ setDepartment(String department) {
    	this.department = department;
    	return this;
    }
    
    public Employ setSalary(double salary) {
    	this.salary = salary;
    	return this;
    }
    
    public Employ setDesignation(String designation) {
    	this.designation = designation;
    	return this;
    }
    
    public Employ printID() {
    	System.out.println("ID is: " +id);
    	return this;
    }
    
    public Employ printName() {
    	System.out.println("Name is: " +name);
    	return this;
    }
    
    public Employ printDepartment() {
    	System.out.println("Department is: " +department);
    	return this;
    }
    
    public Employ printSalary() {
    	System.out.println("Salary is: " +salary);
    	return this;
    }
    
    public Employ printDesignation() {
    	System.out.println("Designation is: " +designation);
    	return this;
    }
    

}
