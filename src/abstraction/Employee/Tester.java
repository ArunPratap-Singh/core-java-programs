package abstraction.Employee;

public class Tester extends Employee {

	String testingType;
	String automationTool;
	String projectName;
	int testCasesExecuted;
	double bonus;

	Tester() {

	}

	Tester(int employeeId, String employeeName, String department, String designation, int age, String gender,
			String email, String phone, String location, double experience, String testingType, String automationTool,
			String projectName, int testCasesExecuted, double bonus) {

		super(employeeId, employeeName, department, designation, age, gender, email, phone, location, experience);

		this.testingType = testingType;
		this.automationTool = automationTool;
		this.projectName = projectName;
		this.testCasesExecuted = testCasesExecuted;
		this.bonus = bonus;
	}

	
	@Override
	public double calculateSalary() {

		double basicSalary = 50000;

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
		System.out.println("Testing Type is : " + testingType);
		System.out.println("Automation Tool is : " + automationTool);
		System.out.println("Project Name is : " + projectName);
		System.out.println("Test Cases Executed is : " + testCasesExecuted);
		System.out.println("Bonus is : " + bonus);
		System.out.println("Salary is : " + calculateSalary());
	}

	
	@Override
	public String toString() {

		return "Tester [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ ", designation=" + designation + ", age=" + age + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + ", location=" + location + ", experience=" + experience + ", testingType="
				+ testingType + ", automationTool=" + automationTool + ", projectName=" + projectName
				+ ", testCasesExecuted=" + testCasesExecuted + ", bonus=" + bonus + "]";
	}
}
