package abstraction.Employee;

public class Developer extends Employee {

	String programmingLanguage;
	String projectName;
	String framework;
	int codingHours;
	double bonus;

	Developer() {

	}

	Developer(int employeeId, String employeeName, String department, String designation, int age, String gender,
			String email, String phone, String location, double experience, String programmingLanguage,
			String projectName, String framework, int codingHours, double bonus) {

		super(employeeId, employeeName, department, designation, age, gender, email, phone, location, experience);

		this.programmingLanguage = programmingLanguage;
		this.projectName = projectName;
		this.framework = framework;
		this.codingHours = codingHours;
		this.bonus = bonus;
	}

	
	@Override
	public double calculateSalary() {

		double basicSalary = 60000;

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
		System.out.println("Programming Language is : " + programmingLanguage);
		System.out.println("Project Name is : " + projectName);
		System.out.println("Framework is : " + framework);
		System.out.println("Coding Hours is : " + codingHours);
		System.out.println("Bonus is : " + bonus);
		System.out.println("Salary is : " + calculateSalary());
	}

	
	@Override
	public String toString() {

		return "Developer [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", designation=" + designation + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", location=" + location + ", experience=" + experience
				+ ", programmingLanguage=" + programmingLanguage + ", projectName=" + projectName + ", framework="
				+ framework + ", codingHours=" + codingHours + ", bonus=" + bonus + "]";
	}
}
