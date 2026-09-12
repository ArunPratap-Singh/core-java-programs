package encapsulationsPrograming;

public class EmployeeDriver {
	
	public static void main(String[] args) {
		
		System.out.println("=====================Main Method Starts=======================");
		
		Employee e1 = new Employee("Mohan", "EMP101", "IT", 55000, 5000);
		Employee e2 = new Employee("Rohan", "EMP102", "HR", 60000, 6000);
		Employee e3 = new Employee("Sohan", "EMP103", "Finance", 65000, 7000);
		Employee e4 = new Employee("Ram", "EMP104", "Sales", 45000, 4000);
		Employee e5 = new Employee("Shyam", "EMP105", "Marketing", 50000, 4500);
		Employee e6 = new Employee("Manoj", "EMP106", "IT", 75000, 8000);
		Employee e7 = new Employee("Akash", "EMP107", "HR", 58000, 5500);
		Employee e8 = new Employee("Samarth", "EMP108", "Finance", 70000, 7500);
		Employee e9 = new Employee("Abhishek", "EMP109", "Sales", 48000, 4200);
		Employee e10 = new Employee("Karan Singh", "EMP110", "IT", 90000, 10000);

		Employee e11 = new Employee("Rahul", "EMP111", "Marketing", 52000, 4800);
		Employee e12 = new Employee("Vikas", "EMP112", "HR", 61000, 6200);
		Employee e13 = new Employee("Amit", "EMP113", "Finance", 67000, 7100);
		Employee e14 = new Employee("Sumit", "EMP114", "Sales", 46000, 4100);
		Employee e15 = new Employee("Ravi", "EMP115", "IT", 78000, 8500);
		Employee e16 = new Employee("Nitin", "EMP116", "Marketing", 54000, 5000);
		Employee e17 = new Employee("Varun", "EMP117", "HR", 62000, 6400);
		Employee e18 = new Employee("Ankit", "EMP118", "Finance", 69000, 7300);
		Employee e19 = new Employee("Deepak", "EMP119", "Sales", 47000, 4300);
		Employee e20 = new Employee("Pankaj", "EMP120", "IT", 82000, 9000);

		Employee e21 = new Employee("Sachin", "EMP121", "Marketing", 56000, 5200);
		Employee e22 = new Employee("Rakesh", "EMP122", "HR", 63000, 6500);
		Employee e23 = new Employee("Vivek", "EMP123", "Finance", 71000, 7600);
		Employee e24 = new Employee("Gaurav", "EMP124", "Sales", 49000, 4500);
		Employee e25 = new Employee("Harish", "EMP125", "IT", 85000, 9500);
		Employee e26 = new Employee("Suresh", "EMP126", "Marketing", 58000, 5400);
		Employee e27 = new Employee("Mahesh", "EMP127", "HR", 64000, 6700);
		Employee e28 = new Employee("Yash", "EMP128", "Finance", 73000, 7800);
		Employee e29 = new Employee("Ayush", "EMP129", "Sales", 51000, 4700);
		Employee e30 = new Employee("Kunal", "EMP130", "IT", 88000, 9800);

		Employee e31 = new Employee("Rohit", "EMP131", "Marketing", 59000, 5500);
		Employee e32 = new Employee("Mohit", "EMP132", "HR", 65000, 6900);
		Employee e33 = new Employee("Tarun", "EMP133", "Finance", 75000, 8000);
		Employee e34 = new Employee("Arjun", "EMP134", "Sales", 53000, 4900);
		Employee e35 = new Employee("Naveen", "EMP135", "IT", 91000, 10500);
		Employee e36 = new Employee("Prakash", "EMP136", "Marketing", 60000, 5600);
		Employee e37 = new Employee("Shubham", "EMP137", "HR", 67000, 7100);
		Employee e38 = new Employee("Aditya", "EMP138", "Finance", 77000, 8300);
		Employee e39 = new Employee("Raj", "EMP139", "Sales", 55000, 5100);
		Employee e40 = new Employee("Vishal", "EMP140", "IT", 94000, 11000);

		Employee e41 = new Employee("Dev", "EMP141", "Marketing", 62000, 5800);
		Employee e42 = new Employee("Rajat", "EMP142", "HR", 69000, 7300);
		Employee e43 = new Employee("Mukul", "EMP143", "Finance", 79000, 8500);
		Employee e44 = new Employee("Ashish", "EMP144", "Sales", 57000, 5300);
		Employee e45 = new Employee("Lokesh", "EMP145", "IT", 97000, 11500);
		Employee e46 = new Employee("Sanjay", "EMP146", "Marketing", 64000, 6000);
		Employee e47 = new Employee("Manish", "EMP147", "HR", 71000, 7500);
		Employee e48 = new Employee("Rishabh", "EMP148", "Finance", 81000, 8800);
		Employee e49 = new Employee("Shivam", "EMP149", "Sales", 59000, 5500);
		Employee e50 = new Employee("Varun Singh", "EMP150", "IT", 100000, 12000);
		
		System.out.println("============================Employee 1 Details=================================");
		System.out.println("Object Reference is: " +e1);
		System.out.println("Name is: " +e1.getName());
		System.out.println("Employee Id is: " +e1.getEmployeeID());
		System.out.println("Department is: " +e1.getDepartment());
		System.out.println("Salary is: " +e1.getSalary());
		System.out.println("Bonus is: " +e1.getBonus());
		
		System.out.println("============================Employee 1 Details=================================");
		System.out.println("Object Reference is: " + e1);
		System.out.println("Name is: " + e1.getName());
		System.out.println("Employee Id is: " + e1.getEmployeeID());
		System.out.println("Department is: " + e1.getDepartment());
		System.out.println("Salary is: " + e1.getSalary());
		System.out.println("Bonus is: " + e1.getBonus());

		System.out.println("============================Employee 2 Details=================================");
		System.out.println("Object Reference is: " + e2);
		System.out.println("Name is: " + e2.getName());
		System.out.println("Employee Id is: " + e2.getEmployeeID());
		System.out.println("Department is: " + e2.getDepartment());
		System.out.println("Salary is: " + e2.getSalary());
		System.out.println("Bonus is: " + e2.getBonus());

		System.out.println("============================Employee 3 Details=================================");
		System.out.println("Object Reference is: " + e3);
		System.out.println("Name is: " + e3.getName());
		System.out.println("Employee Id is: " + e3.getEmployeeID());
		System.out.println("Department is: " + e3.getDepartment());
		System.out.println("Salary is: " + e3.getSalary());
		System.out.println("Bonus is: " + e3.getBonus());

		System.out.println("============================Employee 4 Details=================================");
		System.out.println("Object Reference is: " + e4);
		System.out.println("Name is: " + e4.getName());
		System.out.println("Employee Id is: " + e4.getEmployeeID());
		System.out.println("Department is: " + e4.getDepartment());
		System.out.println("Salary is: " + e4.getSalary());
		System.out.println("Bonus is: " + e4.getBonus());

		System.out.println("============================Employee 5 Details=================================");
		System.out.println("Object Reference is: " + e5);
		System.out.println("Name is: " + e5.getName());
		System.out.println("Employee Id is: " + e5.getEmployeeID());
		System.out.println("Department is: " + e5.getDepartment());
		System.out.println("Salary is: " + e5.getSalary());
		System.out.println("Bonus is: " + e5.getBonus());

		System.out.println("============================Employee 6 Details=================================");
		System.out.println("Object Reference is: " + e6);
		System.out.println("Name is: " + e6.getName());
		System.out.println("Employee Id is: " + e6.getEmployeeID());
		System.out.println("Department is: " + e6.getDepartment());
		System.out.println("Salary is: " + e6.getSalary());
		System.out.println("Bonus is: " + e6.getBonus());

		System.out.println("============================Employee 7 Details=================================");
		System.out.println("Object Reference is: " + e7);
		System.out.println("Name is: " + e7.getName());
		System.out.println("Employee Id is: " + e7.getEmployeeID());
		System.out.println("Department is: " + e7.getDepartment());
		System.out.println("Salary is: " + e7.getSalary());
		System.out.println("Bonus is: " + e7.getBonus());

		System.out.println("============================Employee 8 Details=================================");
		System.out.println("Object Reference is: " + e8);
		System.out.println("Name is: " + e8.getName());
		System.out.println("Employee Id is: " + e8.getEmployeeID());
		System.out.println("Department is: " + e8.getDepartment());
		System.out.println("Salary is: " + e8.getSalary());
		System.out.println("Bonus is: " + e8.getBonus());

		System.out.println("============================Employee 9 Details=================================");
		System.out.println("Object Reference is: " + e9);
		System.out.println("Name is: " + e9.getName());
		System.out.println("Employee Id is: " + e9.getEmployeeID());
		System.out.println("Department is: " + e9.getDepartment());
		System.out.println("Salary is: " + e9.getSalary());
		System.out.println("Bonus is: " + e9.getBonus());

		System.out.println("============================Employee 10 Details=================================");
		System.out.println("Object Reference is: " + e10);
		System.out.println("Name is: " + e10.getName());
		System.out.println("Employee Id is: " + e10.getEmployeeID());
		System.out.println("Department is: " + e10.getDepartment());
		System.out.println("Salary is: " + e10.getSalary());
		System.out.println("Bonus is: " + e10.getBonus());

		System.out.println("============================Employee 11 Details=================================");
		System.out.println("Object Reference is: " + e11);
		System.out.println("Name is: " + e11.getName());
		System.out.println("Employee Id is: " + e11.getEmployeeID());
		System.out.println("Department is: " + e11.getDepartment());
		System.out.println("Salary is: " + e11.getSalary());
		System.out.println("Bonus is: " + e11.getBonus());

		System.out.println("============================Employee 12 Details=================================");
		System.out.println("Object Reference is: " + e12);
		System.out.println("Name is: " + e12.getName());
		System.out.println("Employee Id is: " + e12.getEmployeeID());
		System.out.println("Department is: " + e12.getDepartment());
		System.out.println("Salary is: " + e12.getSalary());
		System.out.println("Bonus is: " + e12.getBonus());

		System.out.println("============================Employee 13 Details=================================");
		System.out.println("Object Reference is: " + e13);
		System.out.println("Name is: " + e13.getName());
		System.out.println("Employee Id is: " + e13.getEmployeeID());
		System.out.println("Department is: " + e13.getDepartment());
		System.out.println("Salary is: " + e13.getSalary());
		System.out.println("Bonus is: " + e13.getBonus());

		System.out.println("============================Employee 14 Details=================================");
		System.out.println("Object Reference is: " + e14);
		System.out.println("Name is: " + e14.getName());
		System.out.println("Employee Id is: " + e14.getEmployeeID());
		System.out.println("Department is: " + e14.getDepartment());
		System.out.println("Salary is: " + e14.getSalary());
		System.out.println("Bonus is: " + e14.getBonus());

		System.out.println("============================Employee 15 Details=================================");
		System.out.println("Object Reference is: " + e15);
		System.out.println("Name is: " + e15.getName());
		System.out.println("Employee Id is: " + e15.getEmployeeID());
		System.out.println("Department is: " + e15.getDepartment());
		System.out.println("Salary is: " + e15.getSalary());
		System.out.println("Bonus is: " + e15.getBonus());

		System.out.println("============================Employee 16 Details=================================");
		System.out.println("Object Reference is: " + e16);
		System.out.println("Name is: " + e16.getName());
		System.out.println("Employee Id is: " + e16.getEmployeeID());
		System.out.println("Department is: " + e16.getDepartment());
		System.out.println("Salary is: " + e16.getSalary());
		System.out.println("Bonus is: " + e16.getBonus());

		System.out.println("============================Employee 17 Details=================================");
		System.out.println("Object Reference is: " + e17);
		System.out.println("Name is: " + e17.getName());
		System.out.println("Employee Id is: " + e17.getEmployeeID());
		System.out.println("Department is: " + e17.getDepartment());
		System.out.println("Salary is: " + e17.getSalary());
		System.out.println("Bonus is: " + e17.getBonus());

		System.out.println("============================Employee 18 Details=================================");
		System.out.println("Object Reference is: " + e18);
		System.out.println("Name is: " + e18.getName());
		System.out.println("Employee Id is: " + e18.getEmployeeID());
		System.out.println("Department is: " + e18.getDepartment());
		System.out.println("Salary is: " + e18.getSalary());
		System.out.println("Bonus is: " + e18.getBonus());

		System.out.println("============================Employee 19 Details=================================");
		System.out.println("Object Reference is: " + e19);
		System.out.println("Name is: " + e19.getName());
		System.out.println("Employee Id is: " + e19.getEmployeeID());
		System.out.println("Department is: " + e19.getDepartment());
		System.out.println("Salary is: " + e19.getSalary());
		System.out.println("Bonus is: " + e19.getBonus());

		System.out.println("============================Employee 20 Details=================================");
		System.out.println("Object Reference is: " + e20);
		System.out.println("Name is: " + e20.getName());
		System.out.println("Employee Id is: " + e20.getEmployeeID());
		System.out.println("Department is: " + e20.getDepartment());
		System.out.println("Salary is: " + e20.getSalary());
		System.out.println("Bonus is: " + e20.getBonus());

		System.out.println("============================Employee 21 Details=================================");
		System.out.println("Object Reference is: " + e21);
		System.out.println("Name is: " + e21.getName());
		System.out.println("Employee Id is: " + e21.getEmployeeID());
		System.out.println("Department is: " + e21.getDepartment());
		System.out.println("Salary is: " + e21.getSalary());
		System.out.println("Bonus is: " + e21.getBonus());

		System.out.println("============================Employee 22 Details=================================");
		System.out.println("Object Reference is: " + e22);
		System.out.println("Name is: " + e22.getName());
		System.out.println("Employee Id is: " + e22.getEmployeeID());
		System.out.println("Department is: " + e22.getDepartment());
		System.out.println("Salary is: " + e22.getSalary());
		System.out.println("Bonus is: " + e22.getBonus());

		System.out.println("============================Employee 23 Details=================================");
		System.out.println("Object Reference is: " + e23);
		System.out.println("Name is: " + e23.getName());
		System.out.println("Employee Id is: " + e23.getEmployeeID());
		System.out.println("Department is: " + e23.getDepartment());
		System.out.println("Salary is: " + e23.getSalary());
		System.out.println("Bonus is: " + e23.getBonus());

		System.out.println("============================Employee 24 Details=================================");
		System.out.println("Object Reference is: " + e24);
		System.out.println("Name is: " + e24.getName());
		System.out.println("Employee Id is: " + e24.getEmployeeID());
		System.out.println("Department is: " + e24.getDepartment());
		System.out.println("Salary is: " + e24.getSalary());
		System.out.println("Bonus is: " + e24.getBonus());

		System.out.println("============================Employee 25 Details=================================");
		System.out.println("Object Reference is: " + e25);
		System.out.println("Name is: " + e25.getName());
		System.out.println("Employee Id is: " + e25.getEmployeeID());
		System.out.println("Department is: " + e25.getDepartment());
		System.out.println("Salary is: " + e25.getSalary());
		System.out.println("Bonus is: " + e25.getBonus());

		System.out.println("============================Employee 26 Details=================================");
		System.out.println("Object Reference is: " + e26);
		System.out.println("Name is: " + e26.getName());
		System.out.println("Employee Id is: " + e26.getEmployeeID());
		System.out.println("Department is: " + e26.getDepartment());
		System.out.println("Salary is: " + e26.getSalary());
		System.out.println("Bonus is: " + e26.getBonus());

		System.out.println("============================Employee 27 Details=================================");
		System.out.println("Object Reference is: " + e27);
		System.out.println("Name is: " + e27.getName());
		System.out.println("Employee Id is: " + e27.getEmployeeID());
		System.out.println("Department is: " + e27.getDepartment());
		System.out.println("Salary is: " + e27.getSalary());
		System.out.println("Bonus is: " + e27.getBonus());

		System.out.println("============================Employee 28 Details=================================");
		System.out.println("Object Reference is: " + e28);
		System.out.println("Name is: " + e28.getName());
		System.out.println("Employee Id is: " + e28.getEmployeeID());
		System.out.println("Department is: " + e28.getDepartment());
		System.out.println("Salary is: " + e28.getSalary());
		System.out.println("Bonus is: " + e28.getBonus());

		System.out.println("============================Employee 29 Details=================================");
		System.out.println("Object Reference is: " + e29);
		System.out.println("Name is: " + e29.getName());
		System.out.println("Employee Id is: " + e29.getEmployeeID());
		System.out.println("Department is: " + e29.getDepartment());
		System.out.println("Salary is: " + e29.getSalary());
		System.out.println("Bonus is: " + e29.getBonus());

		System.out.println("============================Employee 30 Details=================================");
		System.out.println("Object Reference is: " + e30);
		System.out.println("Name is: " + e30.getName());
		System.out.println("Employee Id is: " + e30.getEmployeeID());
		System.out.println("Department is: " + e30.getDepartment());
		System.out.println("Salary is: " + e30.getSalary());
		System.out.println("Bonus is: " + e30.getBonus());

		System.out.println("============================Employee 31 Details=================================");
		System.out.println("Object Reference is: " + e31);
		System.out.println("Name is: " + e31.getName());
		System.out.println("Employee Id is: " + e31.getEmployeeID());
		System.out.println("Department is: " + e31.getDepartment());
		System.out.println("Salary is: " + e31.getSalary());
		System.out.println("Bonus is: " + e31.getBonus());

		System.out.println("============================Employee 32 Details=================================");
		System.out.println("Object Reference is: " + e32);
		System.out.println("Name is: " + e32.getName());
		System.out.println("Employee Id is: " + e32.getEmployeeID());
		System.out.println("Department is: " + e32.getDepartment());
		System.out.println("Salary is: " + e32.getSalary());
		System.out.println("Bonus is: " + e32.getBonus());

		System.out.println("============================Employee 33 Details=================================");
		System.out.println("Object Reference is: " + e33);
		System.out.println("Name is: " + e33.getName());
		System.out.println("Employee Id is: " + e33.getEmployeeID());
		System.out.println("Department is: " + e33.getDepartment());
		System.out.println("Salary is: " + e33.getSalary());
		System.out.println("Bonus is: " + e33.getBonus());

		System.out.println("============================Employee 34 Details=================================");
		System.out.println("Object Reference is: " + e34);
		System.out.println("Name is: " + e34.getName());
		System.out.println("Employee Id is: " + e34.getEmployeeID());
		System.out.println("Department is: " + e34.getDepartment());
		System.out.println("Salary is: " + e34.getSalary());
		System.out.println("Bonus is: " + e34.getBonus());

		System.out.println("============================Employee 35 Details=================================");
		System.out.println("Object Reference is: " + e35);
		System.out.println("Name is: " + e35.getName());
		System.out.println("Employee Id is: " + e35.getEmployeeID());
		System.out.println("Department is: " + e35.getDepartment());
		System.out.println("Salary is: " + e35.getSalary());
		System.out.println("Bonus is: " + e35.getBonus());

		System.out.println("============================Employee 36 Details=================================");
		System.out.println("Object Reference is: " + e36);
		System.out.println("Name is: " + e36.getName());
		System.out.println("Employee Id is: " + e36.getEmployeeID());
		System.out.println("Department is: " + e36.getDepartment());
		System.out.println("Salary is: " + e36.getSalary());
		System.out.println("Bonus is: " + e36.getBonus());

		System.out.println("============================Employee 37 Details=================================");
		System.out.println("Object Reference is: " + e37);
		System.out.println("Name is: " + e37.getName());
		System.out.println("Employee Id is: " + e37.getEmployeeID());
		System.out.println("Department is: " + e37.getDepartment());
		System.out.println("Salary is: " + e37.getSalary());
		System.out.println("Bonus is: " + e37.getBonus());

		System.out.println("============================Employee 38 Details=================================");
		System.out.println("Object Reference is: " + e38);
		System.out.println("Name is: " + e38.getName());
		System.out.println("Employee Id is: " + e38.getEmployeeID());
		System.out.println("Department is: " + e38.getDepartment());
		System.out.println("Salary is: " + e38.getSalary());
		System.out.println("Bonus is: " + e38.getBonus());

		System.out.println("============================Employee 39 Details=================================");
		System.out.println("Object Reference is: " + e39);
		System.out.println("Name is: " + e39.getName());
		System.out.println("Employee Id is: " + e39.getEmployeeID());
		System.out.println("Department is: " + e39.getDepartment());
		System.out.println("Salary is: " + e39.getSalary());
		System.out.println("Bonus is: " + e39.getBonus());

		System.out.println("============================Employee 40 Details=================================");
		System.out.println("Object Reference is: " + e40);
		System.out.println("Name is: " + e40.getName());
		System.out.println("Employee Id is: " + e40.getEmployeeID());
		System.out.println("Department is: " + e40.getDepartment());
		System.out.println("Salary is: " + e40.getSalary());
		System.out.println("Bonus is: " + e40.getBonus());

		System.out.println("============================Employee 41 Details=================================");
		System.out.println("Object Reference is: " + e41);
		System.out.println("Name is: " + e41.getName());
		System.out.println("Employee Id is: " + e41.getEmployeeID());
		System.out.println("Department is: " + e41.getDepartment());
		System.out.println("Salary is: " + e41.getSalary());
		System.out.println("Bonus is: " + e41.getBonus());

		System.out.println("============================Employee 42 Details=================================");
		System.out.println("Object Reference is: " + e42);
		System.out.println("Name is: " + e42.getName());
		System.out.println("Employee Id is: " + e42.getEmployeeID());
		System.out.println("Department is: " + e42.getDepartment());
		System.out.println("Salary is: " + e42.getSalary());
		System.out.println("Bonus is: " + e42.getBonus());

		System.out.println("============================Employee 43 Details=================================");
		System.out.println("Object Reference is: " + e43);
		System.out.println("Name is: " + e43.getName());
		System.out.println("Employee Id is: " + e43.getEmployeeID());
		System.out.println("Department is: " + e43.getDepartment());
		System.out.println("Salary is: " + e43.getSalary());
		System.out.println("Bonus is: " + e43.getBonus());

		System.out.println("============================Employee 44 Details=================================");
		System.out.println("Object Reference is: " + e44);
		System.out.println("Name is: " + e44.getName());
		System.out.println("Employee Id is: " + e44.getEmployeeID());
		System.out.println("Department is: " + e44.getDepartment());
		System.out.println("Salary is: " + e44.getSalary());
		System.out.println("Bonus is: " + e44.getBonus());

		System.out.println("============================Employee 45 Details=================================");
		System.out.println("Object Reference is: " + e45);
		System.out.println("Name is: " + e45.getName());
		System.out.println("Employee Id is: " + e45.getEmployeeID());
		System.out.println("Department is: " + e45.getDepartment());
		System.out.println("Salary is: " + e45.getSalary());
		System.out.println("Bonus is: " + e45.getBonus());

		System.out.println("============================Employee 46 Details=================================");
		System.out.println("Object Reference is: " + e46);
		System.out.println("Name is: " + e46.getName());
		System.out.println("Employee Id is: " + e46.getEmployeeID());
		System.out.println("Department is: " + e46.getDepartment());
		System.out.println("Salary is: " + e46.getSalary());
		System.out.println("Bonus is: " + e46.getBonus());

		System.out.println("============================Employee 47 Details=================================");
		System.out.println("Object Reference is: " + e47);
		System.out.println("Name is: " + e47.getName());
		System.out.println("Employee Id is: " + e47.getEmployeeID());
		System.out.println("Department is: " + e47.getDepartment());
		System.out.println("Salary is: " + e47.getSalary());
		System.out.println("Bonus is: " + e47.getBonus());

		System.out.println("============================Employee 48 Details=================================");
		System.out.println("Object Reference is: " + e48);
		System.out.println("Name is: " + e48.getName());
		System.out.println("Employee Id is: " + e48.getEmployeeID());
		System.out.println("Department is: " + e48.getDepartment());
		System.out.println("Salary is: " + e48.getSalary());
		System.out.println("Bonus is: " + e48.getBonus());

		System.out.println("============================Employee 49 Details=================================");
		System.out.println("Object Reference is: " + e49);
		System.out.println("Name is: " + e49.getName());
		System.out.println("Employee Id is: " + e49.getEmployeeID());
		System.out.println("Department is: " + e49.getDepartment());
		System.out.println("Salary is: " + e49.getSalary());
		System.out.println("Bonus is: " + e49.getBonus());

		System.out.println("============================Employee 50 Details=================================");
		System.out.println("Object Reference is: " + e50);
		System.out.println("Name is: " + e50.getName());
		System.out.println("Employee Id is: " + e50.getEmployeeID());
		System.out.println("Department is: " + e50.getDepartment());
		System.out.println("Salary is: " + e50.getSalary());
		System.out.println("Bonus is: " + e50.getBonus());
		
		System.out.println("=====================Main Method Ends=======================");
	}

}
