package abstraction.Employee;

public class Manager extends Employee {

	int teamSize;
	String projectName;
	String managementLevel;
	String responsibility;
	double bonus;

	Manager() {

	}

	Manager(int employeeId, String employeeName, String department, String designation, int age, String gender,
			String email, String phone, String location, double experience, int teamSize, String projectName,
			String managementLevel, String responsibility, double bonus) {

		super(employeeId, employeeName, department, designation, age, gender, email, phone, location, experience);

		this.teamSize = teamSize;
		this.projectName = projectName;
		this.managementLevel = managementLevel;
		this.responsibility = responsibility;
		this.bonus = bonus;
	}

	
	@Override
	public double calculateSalary() {

		double basicSalary = 90000;

		return basicSalary + bonus;
	}

	
	@Override
	public void displayDetails() {

		System.out.println("Employee Id is : " + employeeId);
		System.out.println("Employee Name is : " + employeeName);
		System.out.println("Department is : " + department);
		System.out.println("Designation is : " + designation);
		System.out.println("Age is : " + age);
		System.out.println("Gender is : " + gender);
		System.out.println("Email is : " + email);
		System.out.println("Phone is : " + phone);
		System.out.println("Location is : " + location);
		System.out.println("Experience is : " + experience);
		System.out.println("Team Size is : " + teamSize);
		System.out.println("Project Name is : " + projectName);
		System.out.println("Management Level is : " + managementLevel);
		System.out.println("Responsibility is : " + responsibility);
		System.out.println("Bonus is : " + bonus);
		System.out.println("Salary is : " + calculateSalary());
	}

	@Override
	public String toString() {

		return "Manager [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", designation=" + designation + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", location=" + location + ", experience=" + experience + ", teamSize="
				+ teamSize + ", projectName=" + projectName + ", managementLevel=" + managementLevel
				+ ", responsibility=" + responsibility + ", bonus=" + bonus + "]";
	}
}
