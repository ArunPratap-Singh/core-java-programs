package abstraction.Employee;

public abstract class Employee {

	int employeeId;
	String employeeName;
	String department;
	String designation;
	int age;
	String gender;
	String email;
	String phone;
	String location;
	double experience;

	Employee() {
	}

	Employee(int employeeId, String employeeName, String department, String designation, int age, String gender,
			String email, String phone, String location, double experience) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		this.designation = designation;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
		this.location = location;
		this.experience = experience;
	}

	
	public abstract double calculateSalary();

	public abstract void displayDetails();

	
	public void work() {
		System.out.println(employeeName + " is working.");
	}

	
	@Override
	public String toString() {

		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", designation=" + designation + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", location=" + location + ", experience=" + experience + "]";
	}
}
