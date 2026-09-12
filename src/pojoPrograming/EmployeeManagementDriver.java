package pojoPrograming;

public class EmployeeManagementDriver {

	public static void main(String[] args) {
		
		System.out.println("===============================Main Method Starts====================================");
		
		EmployeeManagement e1 = new EmployeeManagement(101, "Mohan Singh", 28, "Male", 65000.00, "IT", "Software Engineer", "mohan@gmail.com", 9876543210L, "Lucknow", 5, 2021, "Permanent");
		EmployeeManagement e2 = new EmployeeManagement(102, "Rohan Kumar", 30, "Male", 82000.00, "Automation Testing", "Senior Test Engineer", "rohan@gmail.com", 9876543211L, "Noida", 7, 2019, "Permanent");
		EmployeeManagement e3 = new EmployeeManagement(103, "Sohan Sharma", 27, "Male", 58000.00, "Development", "Java Developer", "sohan@gmail.com", 9876543212L, "Delhi", 4, 2022, "Permanent");
		EmployeeManagement e4 = new EmployeeManagement(104, "Rahul Verma", 32, "Male", 95000.00, "HR", "HR Manager", "rahul@gmail.com", 9876543213L, "Mumbai", 9, 2017, "Permanent");
		EmployeeManagement e5 = new EmployeeManagement(105, "Shyam Gupta", 26, "Male", 52000.00, "Finance", "Accountant", "shyam@gmail.com", 9876543214L, "Pune", 3, 2023, "Contract");
		EmployeeManagement e6 = new EmployeeManagement(106, "Manoj Singh", 35, "Male", 110000.00, "IT", "Technical Lead", "manoj@gmail.com", 9876543215L, "Bengaluru", 12, 2014, "Permanent");
		EmployeeManagement e7 = new EmployeeManagement(107, "Akash Kumar", 29, "Male", 70000.00, "DevOps", "DevOps Engineer", "akash@gmail.com", 9876543216L, "Hyderabad", 6, 2020, "Permanent");
		EmployeeManagement e8 = new EmployeeManagement(108, "Samarth Singh", 31, "Male", 88000.00, "Database", "Database Administrator", "samarth@gmail.com", 9876543217L, "Chennai", 8, 2018, "Permanent");
		EmployeeManagement e9 = new EmployeeManagement(109, "Abhishek Kumar", 25, "Male", 48000.00, "Support", "Technical Support Engineer", "abhishek@gmail.com", 9876543218L, "Gurugram", 2, 2024, "Contract");
		EmployeeManagement e10 = new EmployeeManagement(110, "Karan Singh", 33, "Male", 102000.00, "Management", "Project Manager", "karan@gmail.com", 9876543219L, "Ahmedabad", 10, 2016, "Permanent");
		
				
		System.out.println("=========================Employee Management Details 1=========================");

		System.out.println("Object Reference is: " + e1);
		System.out.println("Employee ID is: " + e1.getEmployeeID());
		System.out.println("Employee Name is: " + e1.getEmployeeName());
		System.out.println("Age is: " + e1.getAge());
		System.out.println("Gender is: " + e1.getGender());
		System.out.println("Salary is: " + e1.getSalary());
		System.out.println("Department is: " + e1.getDepartment());
		System.out.println("Designation is: " + e1.getDesignation());
		System.out.println("Email is: " + e1.getEmail());
		System.out.println("Contact is: " + e1.getContact());
		System.out.println("Address is: " + e1.getAddress());
		System.out.println("Experience is: " + e1.getExperience() + " years");
		System.out.println("Joining Year is: " + e1.getJoiningYear());
		System.out.println("Employment Status is: " + e1.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 2=========================");

		System.out.println("Object Reference is: " + e2);
		System.out.println("Employee ID is: " + e2.getEmployeeID());
		System.out.println("Employee Name is: " + e2.getEmployeeName());
		System.out.println("Age is: " + e2.getAge());
		System.out.println("Gender is: " + e2.getGender());
		System.out.println("Salary is: " + e2.getSalary());
		System.out.println("Department is: " + e2.getDepartment());
		System.out.println("Designation is: " + e2.getDesignation());
		System.out.println("Email is: " + e2.getEmail());
		System.out.println("Contact is: " + e2.getContact());
		System.out.println("Address is: " + e2.getAddress());
		System.out.println("Experience is: " + e2.getExperience() + " years");
		System.out.println("Joining Year is: " + e2.getJoiningYear());
		System.out.println("Employment Status is: " + e2.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 3=========================");

		System.out.println("Object Reference is: " + e3);
		System.out.println("Employee ID is: " + e3.getEmployeeID());
		System.out.println("Employee Name is: " + e3.getEmployeeName());
		System.out.println("Age is: " + e3.getAge());
		System.out.println("Gender is: " + e3.getGender());
		System.out.println("Salary is: " + e3.getSalary());
		System.out.println("Department is: " + e3.getDepartment());
		System.out.println("Designation is: " + e3.getDesignation());
		System.out.println("Email is: " + e3.getEmail());
		System.out.println("Contact is: " + e3.getContact());
		System.out.println("Address is: " + e3.getAddress());
		System.out.println("Experience is: " + e3.getExperience() + " years");
		System.out.println("Joining Year is: " + e3.getJoiningYear());
		System.out.println("Employment Status is: " + e3.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 4=========================");

		System.out.println("Object Reference is: " + e4);
		System.out.println("Employee ID is: " + e4.getEmployeeID());
		System.out.println("Employee Name is: " + e4.getEmployeeName());
		System.out.println("Age is: " + e4.getAge());
		System.out.println("Gender is: " + e4.getGender());
		System.out.println("Salary is: " + e4.getSalary());
		System.out.println("Department is: " + e4.getDepartment());
		System.out.println("Designation is: " + e4.getDesignation());
		System.out.println("Email is: " + e4.getEmail());
		System.out.println("Contact is: " + e4.getContact());
		System.out.println("Address is: " + e4.getAddress());
		System.out.println("Experience is: " + e4.getExperience() + " years");
		System.out.println("Joining Year is: " + e4.getJoiningYear());
		System.out.println("Employment Status is: " + e4.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 5=========================");

		System.out.println("Object Reference is: " + e5);
		System.out.println("Employee ID is: " + e5.getEmployeeID());
		System.out.println("Employee Name is: " + e5.getEmployeeName());
		System.out.println("Age is: " + e5.getAge());
		System.out.println("Gender is: " + e5.getGender());
		System.out.println("Salary is: " + e5.getSalary());
		System.out.println("Department is: " + e5.getDepartment());
		System.out.println("Designation is: " + e5.getDesignation());
		System.out.println("Email is: " + e5.getEmail());
		System.out.println("Contact is: " + e5.getContact());
		System.out.println("Address is: " + e5.getAddress());
		System.out.println("Experience is: " + e5.getExperience() + " years");
		System.out.println("Joining Year is: " + e5.getJoiningYear());
		System.out.println("Employment Status is: " + e5.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 6=========================");

		System.out.println("Object Reference is: " + e6);
		System.out.println("Employee ID is: " + e6.getEmployeeID());
		System.out.println("Employee Name is: " + e6.getEmployeeName());
		System.out.println("Age is: " + e6.getAge());
		System.out.println("Gender is: " + e6.getGender());
		System.out.println("Salary is: " + e6.getSalary());
		System.out.println("Department is: " + e6.getDepartment());
		System.out.println("Designation is: " + e6.getDesignation());
		System.out.println("Email is: " + e6.getEmail());
		System.out.println("Contact is: " + e6.getContact());
		System.out.println("Address is: " + e6.getAddress());
		System.out.println("Experience is: " + e6.getExperience() + " years");
		System.out.println("Joining Year is: " + e6.getJoiningYear());
		System.out.println("Employment Status is: " + e6.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 7=========================");

		System.out.println("Object Reference is: " + e7);
		System.out.println("Employee ID is: " + e7.getEmployeeID());
		System.out.println("Employee Name is: " + e7.getEmployeeName());
		System.out.println("Age is: " + e7.getAge());
		System.out.println("Gender is: " + e7.getGender());
		System.out.println("Salary is: " + e7.getSalary());
		System.out.println("Department is: " + e7.getDepartment());
		System.out.println("Designation is: " + e7.getDesignation());
		System.out.println("Email is: " + e7.getEmail());
		System.out.println("Contact is: " + e7.getContact());
		System.out.println("Address is: " + e7.getAddress());
		System.out.println("Experience is: " + e7.getExperience() + " years");
		System.out.println("Joining Year is: " + e7.getJoiningYear());
		System.out.println("Employment Status is: " + e7.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 8=========================");

		System.out.println("Object Reference is: " + e8);
		System.out.println("Employee ID is: " + e8.getEmployeeID());
		System.out.println("Employee Name is: " + e8.getEmployeeName());
		System.out.println("Age is: " + e8.getAge());
		System.out.println("Gender is: " + e8.getGender());
		System.out.println("Salary is: " + e8.getSalary());
		System.out.println("Department is: " + e8.getDepartment());
		System.out.println("Designation is: " + e8.getDesignation());
		System.out.println("Email is: " + e8.getEmail());
		System.out.println("Contact is: " + e8.getContact());
		System.out.println("Address is: " + e8.getAddress());
		System.out.println("Experience is: " + e8.getExperience() + " years");
		System.out.println("Joining Year is: " + e8.getJoiningYear());
		System.out.println("Employment Status is: " + e8.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 9=========================");

		System.out.println("Object Reference is: " + e9);
		System.out.println("Employee ID is: " + e9.getEmployeeID());
		System.out.println("Employee Name is: " + e9.getEmployeeName());
		System.out.println("Age is: " + e9.getAge());
		System.out.println("Gender is: " + e9.getGender());
		System.out.println("Salary is: " + e9.getSalary());
		System.out.println("Department is: " + e9.getDepartment());
		System.out.println("Designation is: " + e9.getDesignation());
		System.out.println("Email is: " + e9.getEmail());
		System.out.println("Contact is: " + e9.getContact());
		System.out.println("Address is: " + e9.getAddress());
		System.out.println("Experience is: " + e9.getExperience() + " years");
		System.out.println("Joining Year is: " + e9.getJoiningYear());
		System.out.println("Employment Status is: " + e9.getEmploymentStatus());


		System.out.println("=========================Employee Management Details 10=========================");

		System.out.println("Object Reference is: " + e10);
		System.out.println("Employee ID is: " + e10.getEmployeeID());
		System.out.println("Employee Name is: " + e10.getEmployeeName());
		System.out.println("Age is: " + e10.getAge());
		System.out.println("Gender is: " + e10.getGender());
		System.out.println("Salary is: " + e10.getSalary());
		System.out.println("Department is: " + e10.getDepartment());
		System.out.println("Designation is: " + e10.getDesignation());
		System.out.println("Email is: " + e10.getEmail());
		System.out.println("Contact is: " + e10.getContact());
		System.out.println("Address is: " + e10.getAddress());
		System.out.println("Experience is: " + e10.getExperience() + " years");
		System.out.println("Joining Year is: " + e10.getJoiningYear());
		System.out.println("Employment Status is: " + e10.getEmploymentStatus());
		
		System.out.println("================================Main Method Ends=========================================");
		
	}

}
