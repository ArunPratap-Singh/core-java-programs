package constructor.deepCopy.Company;

public class Manager {
	
	    int managerId;
	    String managerName;
	    int age;
	    String gender;
	    String department;
	    double salary;

	    Manager() {
	    }

	    Manager(int managerId, String managerName, int age, String gender, String department, double salary) {

	        this.managerId = managerId;
	        this.managerName = managerName;
	        this.age = age;
	        this.gender = gender;
	        this.department = department;
	        this.salary = salary;
	    }

	    public String toString() {
	        return "ManagerId is: " + managerId + "\nManagerName is: " + managerName + "\nAge is: " + age + "\nGender is: " + gender + "\nDepartment is: " + department + "\nSalary is: " + salary;
	    }
	

}
