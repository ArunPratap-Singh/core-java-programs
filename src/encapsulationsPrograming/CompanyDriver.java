package encapsulationsPrograming;

public class CompanyDriver {

	public static void main(String[] args) {
		
		System.out.println("==================================Main Method Starts=====================================");
		
		Company c1 = new Company("TCS", "Mohan Singh", "EMP101", "IT", 55000.00);
		Company c2 = new Company("Infosys", "Rohan Kumar", "EMP102", "HR", 60000.00);
		Company c3 = new Company("Wipro", "Sohan Sharma", "EMP103", "Finance", 65000.00);
		Company c4 = new Company("HCL Technologies", "Rahul Verma", "EMP104", "Testing", 58000.00);
		Company c5 = new Company("Accenture", "Shyam Gupta", "EMP105", "Marketing", 70000.00);
		Company c6 = new Company("Cognizant", "Manoj Singh", "EMP106", "Development", 75000.00);
		Company c7 = new Company("Capgemini", "Akash Kumar", "EMP107", "Testing", 62000.00);
		Company c8 = new Company("IBM", "Samarth Singh", "EMP108", "Cloud", 85000.00);
		Company c9 = new Company("Microsoft", "Abhishek Kumar", "EMP109", "Security", 95000.00);
		Company c10 = new Company("Amazon", "Karan Singh", "EMP110", "Operations", 90000.00);

		Company c11 = new Company("Google", "Amit Sharma", "EMP111", "Development", 100000.00);
		Company c12 = new Company("Oracle", "Sumit Kumar", "EMP112", "Database", 82000.00);
		Company c13 = new Company("Dell", "Ravi Verma", "EMP113", "Support", 68000.00);
		Company c14 = new Company("HP", "Nitin Gupta", "EMP114", "IT", 61000.00);
		Company c15 = new Company("Tech Mahindra", "Varun Singh", "EMP115", "Testing", 72000.00);
		Company c16 = new Company("Deloitte", "Ankit Kumar", "EMP116", "Finance", 88000.00);
		Company c17 = new Company("Ernst Young", "Deepak Sharma", "EMP117", "Audit", 79000.00);
		Company c18 = new Company("KPMG", "Pankaj Verma", "EMP118", "Consulting", 83000.00);
		Company c19 = new Company("PwC", "Sachin Gupta", "EMP119", "Management", 91000.00);
		Company c20 = new Company("Cisco", "Rakesh Singh", "EMP120", "Networking", 86000.00);

		Company c21 = new Company("Intel", "Vivek Kumar", "EMP121", "Hardware", 77000.00);
		Company c22 = new Company("Adobe", "Gaurav Sharma", "EMP122", "Design", 74000.00);
		Company c23 = new Company("Salesforce", "Harish Verma", "EMP123", "CRM", 93000.00);
		Company c24 = new Company("SAP", "Suresh Kumar", "EMP124", "ERP", 97000.00);
		Company c25 = new Company("VMware", "Mahesh Singh", "EMP125", "Cloud", 89000.00);
		Company c26 = new Company("Siemens", "Yash Gupta", "EMP126", "Engineering", 81000.00);
		Company c27 = new Company("Infosys", "Ayush Sharma", "EMP127", "Development", 69000.00);
		Company c28 = new Company("TCS", "Kunal Kumar", "EMP128", "Testing", 58000.00);
		Company c29 = new Company("Wipro", "Rohit Verma", "EMP129", "Support", 63000.00);
		Company c30 = new Company("HCL Technologies", "Mohit Gupta", "EMP130", "Security", 76000.00);

		Company c31 = new Company("Accenture", "Tarun Singh", "EMP131", "Cloud", 87000.00);
		Company c32 = new Company("Cognizant", "Arjun Kumar", "EMP132", "Development", 78000.00);
		Company c33 = new Company("Capgemini", "Naveen Sharma", "EMP133", "Finance", 71000.00);
		Company c34 = new Company("IBM", "Prakash Verma", "EMP134", "AI", 98000.00);
		Company c35 = new Company("Microsoft", "Shubham Singh", "EMP135", "Azure", 105000.00);
		Company c36 = new Company("Amazon", "Aditya Kumar", "EMP136", "AWS", 99000.00);
		Company c37 = new Company("Google", "Raj Sharma", "EMP137", "AI", 110000.00);
		Company c38 = new Company("Oracle", "Vishal Verma", "EMP138", "Database", 84000.00);
		Company c39 = new Company("Dell", "Dev Kumar", "EMP139", "Hardware", 67000.00);
		Company c40 = new Company("HP", "Rajat Singh", "EMP140", "Support", 59000.00);

		Company c41 = new Company("Tech Mahindra", "Mukul Sharma", "EMP141", "Development", 73000.00);
		Company c42 = new Company("Deloitte", "Ashish Kumar", "EMP142", "Consulting", 92000.00);
		Company c43 = new Company("Cisco", "Lokesh Verma", "EMP143", "Networking", 88000.00);
		Company c44 = new Company("Intel", "Sanjay Gupta", "EMP144", "Hardware", 80000.00);
		Company c45 = new Company("Adobe", "Manish Singh", "EMP145", "Design", 76000.00);
		Company c46 = new Company("Salesforce", "Rishabh Kumar", "EMP146", "CRM", 94000.00);
		Company c47 = new Company("SAP", "Shivam Sharma", "EMP147", "ERP", 90000.00);
		Company c48 = new Company("VMware", "Aman Verma", "EMP148", "Cloud", 85000.00);
		Company c49 = new Company("Siemens", "Neeraj Gupta", "EMP149", "Engineering", 78000.00);
		Company c50 = new Company("TCS", "Varun Singh", "EMP150", "IT", 65000.00);
		
		
		System.out.println("=========================Company Employee Details 1===========================");
		System.out.println("Object Reference is: " + c1);
		System.out.println("Company Name is: " + c1.getCompanyName());
		System.out.println("Employee Name is: " + c1.getEmployeeName());
		System.out.println("Employee ID is: " + c1.getEmployeeID());
		System.out.println("Department is: " + c1.getDepartment());
		System.out.println("Salary is: " + c1.getSalary());
		
		
		System.out.println("=========================Company Employee Details 2===========================");
		System.out.println("Object Reference is: " + c2);
		System.out.println("Company Name is: " + c2.getCompanyName());
		System.out.println("Employee Name is: " + c2.getEmployeeName());
		System.out.println("Employee ID is: " + c2.getEmployeeID());
		System.out.println("Department is: " + c2.getDepartment());
		System.out.println("Salary is: " + c2.getSalary());

		System.out.println("=========================Company Employee Details 3===========================");
		System.out.println("Object Reference is: " + c3);
		System.out.println("Company Name is: " + c3.getCompanyName());
		System.out.println("Employee Name is: " + c3.getEmployeeName());
		System.out.println("Employee ID is: " + c3.getEmployeeID());
		System.out.println("Department is: " + c3.getDepartment());
		System.out.println("Salary is: " + c3.getSalary());

		System.out.println("=========================Company Employee Details 4===========================");
		System.out.println("Object Reference is: " + c4);
		System.out.println("Company Name is: " + c4.getCompanyName());
		System.out.println("Employee Name is: " + c4.getEmployeeName());
		System.out.println("Employee ID is: " + c4.getEmployeeID());
		System.out.println("Department is: " + c4.getDepartment());
		System.out.println("Salary is: " + c4.getSalary());

		System.out.println("=========================Company Employee Details 5===========================");
		System.out.println("Object Reference is: " + c5);
		System.out.println("Company Name is: " + c5.getCompanyName());
		System.out.println("Employee Name is: " + c5.getEmployeeName());
		System.out.println("Employee ID is: " + c5.getEmployeeID());
		System.out.println("Department is: " + c5.getDepartment());
		System.out.println("Salary is: " + c5.getSalary());

		System.out.println("=========================Company Employee Details 6===========================");
		System.out.println("Object Reference is: " + c6);
		System.out.println("Company Name is: " + c6.getCompanyName());
		System.out.println("Employee Name is: " + c6.getEmployeeName());
		System.out.println("Employee ID is: " + c6.getEmployeeID());
		System.out.println("Department is: " + c6.getDepartment());
		System.out.println("Salary is: " + c6.getSalary());

		System.out.println("=========================Company Employee Details 7===========================");
		System.out.println("Object Reference is: " + c7);
		System.out.println("Company Name is: " + c7.getCompanyName());
		System.out.println("Employee Name is: " + c7.getEmployeeName());
		System.out.println("Employee ID is: " + c7.getEmployeeID());
		System.out.println("Department is: " + c7.getDepartment());
		System.out.println("Salary is: " + c7.getSalary());

		System.out.println("=========================Company Employee Details 8===========================");
		System.out.println("Object Reference is: " + c8);
		System.out.println("Company Name is: " + c8.getCompanyName());
		System.out.println("Employee Name is: " + c8.getEmployeeName());
		System.out.println("Employee ID is: " + c8.getEmployeeID());
		System.out.println("Department is: " + c8.getDepartment());
		System.out.println("Salary is: " + c8.getSalary());

		System.out.println("=========================Company Employee Details 9===========================");
		System.out.println("Object Reference is: " + c9);
		System.out.println("Company Name is: " + c9.getCompanyName());
		System.out.println("Employee Name is: " + c9.getEmployeeName());
		System.out.println("Employee ID is: " + c9.getEmployeeID());
		System.out.println("Department is: " + c9.getDepartment());
		System.out.println("Salary is: " + c9.getSalary());

		System.out.println("=========================Company Employee Details 10===========================");
		System.out.println("Object Reference is: " + c10);
		System.out.println("Company Name is: " + c10.getCompanyName());
		System.out.println("Employee Name is: " + c10.getEmployeeName());
		System.out.println("Employee ID is: " + c10.getEmployeeID());
		System.out.println("Department is: " + c10.getDepartment());
		System.out.println("Salary is: " + c10.getSalary());

		System.out.println("=========================Company Employee Details 11===========================");
		System.out.println("Object Reference is: " + c11);
		System.out.println("Company Name is: " + c11.getCompanyName());
		System.out.println("Employee Name is: " + c11.getEmployeeName());
		System.out.println("Employee ID is: " + c11.getEmployeeID());
		System.out.println("Department is: " + c11.getDepartment());
		System.out.println("Salary is: " + c11.getSalary());

		System.out.println("=========================Company Employee Details 12===========================");
		System.out.println("Object Reference is: " + c12);
		System.out.println("Company Name is: " + c12.getCompanyName());
		System.out.println("Employee Name is: " + c12.getEmployeeName());
		System.out.println("Employee ID is: " + c12.getEmployeeID());
		System.out.println("Department is: " + c12.getDepartment());
		System.out.println("Salary is: " + c12.getSalary());

		System.out.println("=========================Company Employee Details 13===========================");
		System.out.println("Object Reference is: " + c13);
		System.out.println("Company Name is: " + c13.getCompanyName());
		System.out.println("Employee Name is: " + c13.getEmployeeName());
		System.out.println("Employee ID is: " + c13.getEmployeeID());
		System.out.println("Department is: " + c13.getDepartment());
		System.out.println("Salary is: " + c13.getSalary());

		System.out.println("=========================Company Employee Details 14===========================");
		System.out.println("Object Reference is: " + c14);
		System.out.println("Company Name is: " + c14.getCompanyName());
		System.out.println("Employee Name is: " + c14.getEmployeeName());
		System.out.println("Employee ID is: " + c14.getEmployeeID());
		System.out.println("Department is: " + c14.getDepartment());
		System.out.println("Salary is: " + c14.getSalary());

		System.out.println("=========================Company Employee Details 15===========================");
		System.out.println("Object Reference is: " + c15);
		System.out.println("Company Name is: " + c15.getCompanyName());
		System.out.println("Employee Name is: " + c15.getEmployeeName());
		System.out.println("Employee ID is: " + c15.getEmployeeID());
		System.out.println("Department is: " + c15.getDepartment());
		System.out.println("Salary is: " + c15.getSalary());

		System.out.println("=========================Company Employee Details 16===========================");
		System.out.println("Object Reference is: " + c16);
		System.out.println("Company Name is: " + c16.getCompanyName());
		System.out.println("Employee Name is: " + c16.getEmployeeName());
		System.out.println("Employee ID is: " + c16.getEmployeeID());
		System.out.println("Department is: " + c16.getDepartment());
		System.out.println("Salary is: " + c16.getSalary());

		System.out.println("=========================Company Employee Details 17===========================");
		System.out.println("Object Reference is: " + c17);
		System.out.println("Company Name is: " + c17.getCompanyName());
		System.out.println("Employee Name is: " + c17.getEmployeeName());
		System.out.println("Employee ID is: " + c17.getEmployeeID());
		System.out.println("Department is: " + c17.getDepartment());
		System.out.println("Salary is: " + c17.getSalary());

		System.out.println("=========================Company Employee Details 18===========================");
		System.out.println("Object Reference is: " + c18);
		System.out.println("Company Name is: " + c18.getCompanyName());
		System.out.println("Employee Name is: " + c18.getEmployeeName());
		System.out.println("Employee ID is: " + c18.getEmployeeID());
		System.out.println("Department is: " + c18.getDepartment());
		System.out.println("Salary is: " + c18.getSalary());

		System.out.println("=========================Company Employee Details 19===========================");
		System.out.println("Object Reference is: " + c19);
		System.out.println("Company Name is: " + c19.getCompanyName());
		System.out.println("Employee Name is: " + c19.getEmployeeName());
		System.out.println("Employee ID is: " + c19.getEmployeeID());
		System.out.println("Department is: " + c19.getDepartment());
		System.out.println("Salary is: " + c19.getSalary());

		System.out.println("=========================Company Employee Details 20===========================");
		System.out.println("Object Reference is: " + c20);
		System.out.println("Company Name is: " + c20.getCompanyName());
		System.out.println("Employee Name is: " + c20.getEmployeeName());
		System.out.println("Employee ID is: " + c20.getEmployeeID());
		System.out.println("Department is: " + c20.getDepartment());
		System.out.println("Salary is: " + c20.getSalary());

		System.out.println("=========================Company Employee Details 21===========================");
		System.out.println("Object Reference is: " + c21);
		System.out.println("Company Name is: " + c21.getCompanyName());
		System.out.println("Employee Name is: " + c21.getEmployeeName());
		System.out.println("Employee ID is: " + c21.getEmployeeID());
		System.out.println("Department is: " + c21.getDepartment());
		System.out.println("Salary is: " + c21.getSalary());

		System.out.println("=========================Company Employee Details 22===========================");
		System.out.println("Object Reference is: " + c22);
		System.out.println("Company Name is: " + c22.getCompanyName());
		System.out.println("Employee Name is: " + c22.getEmployeeName());
		System.out.println("Employee ID is: " + c22.getEmployeeID());
		System.out.println("Department is: " + c22.getDepartment());
		System.out.println("Salary is: " + c22.getSalary());

		System.out.println("=========================Company Employee Details 23===========================");
		System.out.println("Object Reference is: " + c23);
		System.out.println("Company Name is: " + c23.getCompanyName());
		System.out.println("Employee Name is: " + c23.getEmployeeName());
		System.out.println("Employee ID is: " + c23.getEmployeeID());
		System.out.println("Department is: " + c23.getDepartment());
		System.out.println("Salary is: " + c23.getSalary());

		System.out.println("=========================Company Employee Details 24===========================");
		System.out.println("Object Reference is: " + c24);
		System.out.println("Company Name is: " + c24.getCompanyName());
		System.out.println("Employee Name is: " + c24.getEmployeeName());
		System.out.println("Employee ID is: " + c24.getEmployeeID());
		System.out.println("Department is: " + c24.getDepartment());
		System.out.println("Salary is: " + c24.getSalary());

		System.out.println("=========================Company Employee Details 25===========================");
		System.out.println("Object Reference is: " + c25);
		System.out.println("Company Name is: " + c25.getCompanyName());
		System.out.println("Employee Name is: " + c25.getEmployeeName());
		System.out.println("Employee ID is: " + c25.getEmployeeID());
		System.out.println("Department is: " + c25.getDepartment());
		System.out.println("Salary is: " + c25.getSalary());

		System.out.println("=========================Company Employee Details 26===========================");
		System.out.println("Object Reference is: " + c26);
		System.out.println("Company Name is: " + c26.getCompanyName());
		System.out.println("Employee Name is: " + c26.getEmployeeName());
		System.out.println("Employee ID is: " + c26.getEmployeeID());
		System.out.println("Department is: " + c26.getDepartment());
		System.out.println("Salary is: " + c26.getSalary());

		System.out.println("=========================Company Employee Details 27===========================");
		System.out.println("Object Reference is: " + c27);
		System.out.println("Company Name is: " + c27.getCompanyName());
		System.out.println("Employee Name is: " + c27.getEmployeeName());
		System.out.println("Employee ID is: " + c27.getEmployeeID());
		System.out.println("Department is: " + c27.getDepartment());
		System.out.println("Salary is: " + c27.getSalary());

		System.out.println("=========================Company Employee Details 28===========================");
		System.out.println("Object Reference is: " + c28);
		System.out.println("Company Name is: " + c28.getCompanyName());
		System.out.println("Employee Name is: " + c28.getEmployeeName());
		System.out.println("Employee ID is: " + c28.getEmployeeID());
		System.out.println("Department is: " + c28.getDepartment());
		System.out.println("Salary is: " + c28.getSalary());

		System.out.println("=========================Company Employee Details 29===========================");
		System.out.println("Object Reference is: " + c29);
		System.out.println("Company Name is: " + c29.getCompanyName());
		System.out.println("Employee Name is: " + c29.getEmployeeName());
		System.out.println("Employee ID is: " + c29.getEmployeeID());
		System.out.println("Department is: " + c29.getDepartment());
		System.out.println("Salary is: " + c29.getSalary());

		System.out.println("=========================Company Employee Details 30===========================");
		System.out.println("Object Reference is: " + c30);
		System.out.println("Company Name is: " + c30.getCompanyName());
		System.out.println("Employee Name is: " + c30.getEmployeeName());
		System.out.println("Employee ID is: " + c30.getEmployeeID());
		System.out.println("Department is: " + c30.getDepartment());
		System.out.println("Salary is: " + c30.getSalary());

		System.out.println("=========================Company Employee Details 31===========================");
		System.out.println("Object Reference is: " + c31);
		System.out.println("Company Name is: " + c31.getCompanyName());
		System.out.println("Employee Name is: " + c31.getEmployeeName());
		System.out.println("Employee ID is: " + c31.getEmployeeID());
		System.out.println("Department is: " + c31.getDepartment());
		System.out.println("Salary is: " + c31.getSalary());

		System.out.println("=========================Company Employee Details 32===========================");
		System.out.println("Object Reference is: " + c32);
		System.out.println("Company Name is: " + c32.getCompanyName());
		System.out.println("Employee Name is: " + c32.getEmployeeName());
		System.out.println("Employee ID is: " + c32.getEmployeeID());
		System.out.println("Department is: " + c32.getDepartment());
		System.out.println("Salary is: " + c32.getSalary());

		System.out.println("=========================Company Employee Details 33===========================");
		System.out.println("Object Reference is: " + c33);
		System.out.println("Company Name is: " + c33.getCompanyName());
		System.out.println("Employee Name is: " + c33.getEmployeeName());
		System.out.println("Employee ID is: " + c33.getEmployeeID());
		System.out.println("Department is: " + c33.getDepartment());
		System.out.println("Salary is: " + c33.getSalary());

		System.out.println("=========================Company Employee Details 34===========================");
		System.out.println("Object Reference is: " + c34);
		System.out.println("Company Name is: " + c34.getCompanyName());
		System.out.println("Employee Name is: " + c34.getEmployeeName());
		System.out.println("Employee ID is: " + c34.getEmployeeID());
		System.out.println("Department is: " + c34.getDepartment());
		System.out.println("Salary is: " + c34.getSalary());

		System.out.println("=========================Company Employee Details 35===========================");
		System.out.println("Object Reference is: " + c35);
		System.out.println("Company Name is: " + c35.getCompanyName());
		System.out.println("Employee Name is: " + c35.getEmployeeName());
		System.out.println("Employee ID is: " + c35.getEmployeeID());
		System.out.println("Department is: " + c35.getDepartment());
		System.out.println("Salary is: " + c35.getSalary());

		System.out.println("=========================Company Employee Details 36===========================");
		System.out.println("Object Reference is: " + c36);
		System.out.println("Company Name is: " + c36.getCompanyName());
		System.out.println("Employee Name is: " + c36.getEmployeeName());
		System.out.println("Employee ID is: " + c36.getEmployeeID());
		System.out.println("Department is: " + c36.getDepartment());
		System.out.println("Salary is: " + c36.getSalary());

		System.out.println("=========================Company Employee Details 37===========================");
		System.out.println("Object Reference is: " + c37);
		System.out.println("Company Name is: " + c37.getCompanyName());
		System.out.println("Employee Name is: " + c37.getEmployeeName());
		System.out.println("Employee ID is: " + c37.getEmployeeID());
		System.out.println("Department is: " + c37.getDepartment());
		System.out.println("Salary is: " + c37.getSalary());

		System.out.println("=========================Company Employee Details 38===========================");
		System.out.println("Object Reference is: " + c38);
		System.out.println("Company Name is: " + c38.getCompanyName());
		System.out.println("Employee Name is: " + c38.getEmployeeName());
		System.out.println("Employee ID is: " + c38.getEmployeeID());
		System.out.println("Department is: " + c38.getDepartment());
		System.out.println("Salary is: " + c38.getSalary());

		System.out.println("=========================Company Employee Details 39===========================");
		System.out.println("Object Reference is: " + c39);
		System.out.println("Company Name is: " + c39.getCompanyName());
		System.out.println("Employee Name is: " + c39.getEmployeeName());
		System.out.println("Employee ID is: " + c39.getEmployeeID());
		System.out.println("Department is: " + c39.getDepartment());
		System.out.println("Salary is: " + c39.getSalary());

		System.out.println("=========================Company Employee Details 40===========================");
		System.out.println("Object Reference is: " + c40);
		System.out.println("Company Name is: " + c40.getCompanyName());
		System.out.println("Employee Name is: " + c40.getEmployeeName());
		System.out.println("Employee ID is: " + c40.getEmployeeID());
		System.out.println("Department is: " + c40.getDepartment());
		System.out.println("Salary is: " + c40.getSalary());

		System.out.println("=========================Company Employee Details 41===========================");
		System.out.println("Object Reference is: " + c41);
		System.out.println("Company Name is: " + c41.getCompanyName());
		System.out.println("Employee Name is: " + c41.getEmployeeName());
		System.out.println("Employee ID is: " + c41.getEmployeeID());
		System.out.println("Department is: " + c41.getDepartment());
		System.out.println("Salary is: " + c41.getSalary());

		System.out.println("=========================Company Employee Details 42===========================");
		System.out.println("Object Reference is: " + c42);
		System.out.println("Company Name is: " + c42.getCompanyName());
		System.out.println("Employee Name is: " + c42.getEmployeeName());
		System.out.println("Employee ID is: " + c42.getEmployeeID());
		System.out.println("Department is: " + c42.getDepartment());
		System.out.println("Salary is: " + c42.getSalary());

		System.out.println("=========================Company Employee Details 43===========================");
		System.out.println("Object Reference is: " + c43);
		System.out.println("Company Name is: " + c43.getCompanyName());
		System.out.println("Employee Name is: " + c43.getEmployeeName());
		System.out.println("Employee ID is: " + c43.getEmployeeID());
		System.out.println("Department is: " + c43.getDepartment());
		System.out.println("Salary is: " + c43.getSalary());

		System.out.println("=========================Company Employee Details 44===========================");
		System.out.println("Object Reference is: " + c44);
		System.out.println("Company Name is: " + c44.getCompanyName());
		System.out.println("Employee Name is: " + c44.getEmployeeName());
		System.out.println("Employee ID is: " + c44.getEmployeeID());
		System.out.println("Department is: " + c44.getDepartment());
		System.out.println("Salary is: " + c44.getSalary());

		System.out.println("=========================Company Employee Details 45===========================");
		System.out.println("Object Reference is: " + c45);
		System.out.println("Company Name is: " + c45.getCompanyName());
		System.out.println("Employee Name is: " + c45.getEmployeeName());
		System.out.println("Employee ID is: " + c45.getEmployeeID());
		System.out.println("Department is: " + c45.getDepartment());
		System.out.println("Salary is: " + c45.getSalary());

		System.out.println("=========================Company Employee Details 46===========================");
		System.out.println("Object Reference is: " + c46);
		System.out.println("Company Name is: " + c46.getCompanyName());
		System.out.println("Employee Name is: " + c46.getEmployeeName());
		System.out.println("Employee ID is: " + c46.getEmployeeID());
		System.out.println("Department is: " + c46.getDepartment());
		System.out.println("Salary is: " + c46.getSalary());

		System.out.println("=========================Company Employee Details 47===========================");
		System.out.println("Object Reference is: " + c47);
		System.out.println("Company Name is: " + c47.getCompanyName());
		System.out.println("Employee Name is: " + c47.getEmployeeName());
		System.out.println("Employee ID is: " + c47.getEmployeeID());
		System.out.println("Department is: " + c47.getDepartment());
		System.out.println("Salary is: " + c47.getSalary());

		System.out.println("=========================Company Employee Details 48===========================");
		System.out.println("Object Reference is: " + c48);
		System.out.println("Company Name is: " + c48.getCompanyName());
		System.out.println("Employee Name is: " + c48.getEmployeeName());
		System.out.println("Employee ID is: " + c48.getEmployeeID());
		System.out.println("Department is: " + c48.getDepartment());
		System.out.println("Salary is: " + c48.getSalary());

		System.out.println("=========================Company Employee Details 49===========================");
		System.out.println("Object Reference is: " + c49);
		System.out.println("Company Name is: " + c49.getCompanyName());
		System.out.println("Employee Name is: " + c49.getEmployeeName());
		System.out.println("Employee ID is: " + c49.getEmployeeID());
		System.out.println("Department is: " + c49.getDepartment());
		System.out.println("Salary is: " + c49.getSalary());

		System.out.println("=========================Company Employee Details 50===========================");
		System.out.println("Object Reference is: " + c50);
		System.out.println("Company Name is: " + c50.getCompanyName());
		System.out.println("Employee Name is: " + c50.getEmployeeName());
		System.out.println("Employee ID is: " + c50.getEmployeeID());
		System.out.println("Department is: " + c50.getDepartment());
		System.out.println("Salary is: " + c50.getSalary());
		
		System.out.println("================================Main Method Ends=====================================");


	}

}
