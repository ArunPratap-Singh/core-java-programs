package inheritanceProgramingMultilevel.Human;

public class Employee extends Person{
	
	int employeeId;
    double salary;
    
    Employee(){
    	
    }

    Employee(String name, int age, String gender, String city, int employeeId, double salary) {
        super(name, age, gender, city);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nEmployeeId is: " + employeeId + "\nSalary is: " + salary;
    }

}
