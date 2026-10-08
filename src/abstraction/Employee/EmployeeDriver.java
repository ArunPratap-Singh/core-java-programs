package abstraction.Employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1 = new Developer(1, "John Doe", "IT", "Software Developer", 30, "Male", "arun@example.com", "1234567890", "New York", 5.0, "Java", "Project A", "Spring", 40, 5000.0);
		Employee e2 = new Developer(2, "Jane Smith", "IT", "Software Developer", 28, "Female", "aman@example.com", "0987654321", "San Francisco", 3.0, "Python", "Project B", "Django", 35, 3000.0);
		Employee e3 = new Developer(3, "Mike Johnson", "IT", "Software Developer", 35, "Male", "akash@gmail.com", "5678901234", "Los Angeles", 7.0, "C#", "Project C", ".NET", 45, 7000.0);
		Employee e4 = new Developer(4, "Sarah Williams", "IT", "Senior Software Developer", 32, "Female", "sarah@gmail.com", "9876543210", "Seattle", 8.0, "Java", "Project D", "Spring Boot", 42, 8500.0);
		Employee e5 = new Developer(5, "David Brown", "IT", "Software Developer", 27, "Male", "david@gmail.com", "8765432109", "Boston", 4.0, "JavaScript", "Project E", "Node.js", 38, 4500.0);
		Employee e6 = new Developer(6, "Emily Davis", "IT", "Software Developer", 29, "Female", "emily@gmail.com", "7654321098", "Chicago", 5.5, "Python", "Project F", "Flask", 40, 5500.0);
		Employee e7 = new Developer(7, "Robert Wilson", "IT", "Senior Software Developer", 36, "Male", "robert@gmail.com", "6543210987", "Austin", 9.0, "C++", "Project G", "Qt", 45, 9000.0);
		Employee e8 = new Developer(8, "Jessica Taylor", "IT", "Software Developer", 26, "Female", "jessica@gmail.com", "5432109876", "Denver", 3.0, "Kotlin", "Project H", "Android", 36, 4000.0);
		Employee e9 = new Developer(9, "Daniel Anderson", "IT", "Lead Developer", 38, "Male", "daniel@gmail.com", "4321098765", "Dallas", 11.0, "Java", "Project I", "Spring Boot", 48, 12000.0);
		Employee e10 = new Developer(10, "Sophia Martinez", "IT", "Software Developer", 31, "Female", "sophia@gmail.com", "3210987654", "Miami", 6.0, "Go", "Project J", "Gin", 40, 6500.0);
		
		System.out.println(e1);
		System.out.println("===================");
		System.out.println(e2);
		System.out.println("===================");
		System.out.println(e3);
		System.out.println("===================");
		System.out.println(e4);
		System.out.println("===================");
		System.out.println(e5);
		System.out.println("===================");
		System.out.println(e6);
		System.out.println("===================");
		System.out.println(e7);
		System.out.println("===================");
		System.out.println(e8);
		System.out.println("===================");
		System.out.println(e9);
		System.out.println("===================");
		System.out.println(e10);
		
		System.out.println("======================e1 Details======================");
		e1.displayDetails();
		System.out.println("Salary of e1 is: " + e1.calculateSalary());
		e1.work();
		
		System.out.println("======================e2 Details======================");
		e2.displayDetails();
		System.out.println("Salary of e2 is: " + e2.calculateSalary());
		e2.work();
		
		System.out.println("======================e3 Details======================");
		e3.displayDetails();
		System.out.println("Salary of e3 is: " + e3.calculateSalary());
		e3.work();
		
		System.out.println("======================e4 Details======================");
		e4.displayDetails();
		System.out.println("Salary of e4 is: " + e4.calculateSalary());
		e4.work();
		
		System.out.println("======================e5 Details======================");
		e5.displayDetails();
		System.out.println("Salary of e5 is: " + e5.calculateSalary());
		e5.work();
		
		System.out.println("======================e6 Details======================");
		e6.displayDetails();	
		System.out.println("Salary of e6 is: " + e6.calculateSalary());
		e6.work();
		
		System.out.println("======================e7 Details======================");
		e7.displayDetails();
		System.out.println("Salary of e7 is: " + e7.calculateSalary());
		e7.work();
		
		System.out.println("======================e8 Details======================");
		e8.displayDetails();
		System.out.println("Salary of e8 is: " + e8.calculateSalary());
		e8.work();
		
		System.out.println("======================e9 Details======================");
		e9.displayDetails();
		System.out.println("Salary of e9 is: " + e9.calculateSalary());
		e9.work();
		
		System.out.println("======================e10 Details======================");
		e10.displayDetails();
		System.out.println("Salary of e10 is: " + e10.calculateSalary());
		e10.work();
		
		System.out.println("=====================================================================================");
		
		Employee e11 = new Tester(402, "Pooja", "Testing", "Automation Tester", 28, "Female", "pooja@example.com", "9876542222", "Noida", 3.5, "Automation Testing", "Selenium", "Banking Project", 300, 10000);
		Employee e12 = new Tester(403, "Rahul", "Testing", "Manual Tester", 30, "Male", "rahul@example.com", "9876541111", "Delhi", 5.0, "Manual Testing", "JIRA", "E-Commerce Project", 250, 8000);
		Employee e13 = new Tester(404, "Anjali", "Testing", "Automation Tester", 27, "Female", "anjali@example.com", "9876543333", "Gurgaon", 3.0, "Automation Testing", "Selenium", "Insurance Project", 350, 9000);
		Employee e14 = new Tester(405, "Vikas", "Testing", "Senior Tester", 34, "Male", "vikas@example.com", "9876544444", "Mumbai", 7.0, "Automation Testing", "TestNG", "Banking Project", 500, 15000);
		Employee e15 = new Tester(406, "Neha", "Testing", "QA Engineer", 29, "Female", "neha@example.com", "9876545555", "Bangalore", 4.5, "Functional Testing", "JIRA", "Healthcare Project", 280, 7500);
		Employee e16 = new Tester(407, "Amit", "Testing", "Automation Tester", 31, "Male", "amit@example.com", "9876546666", "Hyderabad", 6.0, "Automation Testing", "Selenium", "E-Commerce Project", 450, 12000);
		Employee e17 = new Tester(408, "Priya", "Testing", "QA Analyst", 26, "Female", "priya@example.com", "9876547777", "Pune", 2.5, "Manual Testing", "Postman", "API Testing Project", 220, 6500);
		Employee e18 = new Tester(409, "Suresh", "Testing", "Senior Automation Tester", 36, "Male", "suresh@example.com", "9876548888", "Chennai", 9.0, "Automation Testing", "Selenium", "Travel Project", 600, 18000);
		Employee e19 = new Tester(410, "Kavita", "Testing", "QA Engineer", 30, "Female", "kavita@example.com", "9876549999", "Kolkata", 5.0, "Performance Testing", "JMeter", "Banking Project", 320, 9500);
		Employee e20 = new Tester(411, "Rohit", "Testing", "Lead Tester", 39, "Male", "rohit@example.com", "9876540000", "Lucknow", 12.0, "Automation Testing", "Selenium", "Enterprise Project", 700, 20000);
		
		System.out.println(e11);
		System.out.println("===================");
		System.out.println(e12);
		System.out.println("===================");
		System.out.println(e13);
		System.out.println("===================");
		System.out.println(e14);
		System.out.println("===================");
		System.out.println(e15);
		System.out.println("===================");
		System.out.println(e16);
		System.out.println("===================");
		System.out.println(e17);
		System.out.println("===================");
		System.out.println(e18);
		System.out.println("===================");
		System.out.println(e19);
		System.out.println("===================");
		System.out.println(e20);
		
		System.out.println("======================e11 Details======================");
		e11.displayDetails();
		System.out.println("Salary of e11 is: " + e11.calculateSalary());
		e11.work();
		
		System.out.println("======================e12 Details======================");
		e12.displayDetails();
		System.out.println("Salary of e12 is: " + e12.calculateSalary());
		e12.work();
		
		System.out.println("======================e13 Details======================");
		e13.displayDetails();
		System.out.println("Salary of e13 is: " + e13.calculateSalary());
		e13.work();
		
		System.out.println("======================e14 Details======================");
		e14.displayDetails();
		System.out.println("Salary of e14 is: " + e14.calculateSalary());
		e14.work();
		
		System.out.println("======================e15 Details======================");
		e15.displayDetails();
		System.out.println("Salary of e15 is: " + e15.calculateSalary());
		e15.work();
		
		System.out.println("======================e16 Details======================");
		e16.displayDetails();	
		System.out.println("Salary of e16 is: " + e16.calculateSalary());
		e16.work();
		
		System.out.println("======================e17 Details======================");
		e17.displayDetails();
		System.out.println("Salary of e17 is: " + e17.calculateSalary());
		e17.work();
		
		System.out.println("======================e18 Details======================");
		e18.displayDetails();
		System.out.println("Salary of e18 is: " + e18.calculateSalary());
		e18.work();
		
		System.out.println("======================e19 Details======================");
		e19.displayDetails();
		System.out.println("Salary of e19 is: " + e19.calculateSalary());
		e19.work();
		
		System.out.println("======================e20 Details======================");
		e20.displayDetails();
		System.out.println("Salary of e20 is: " + e20.calculateSalary());
		e20.work();
		
		System.out.println("=====================================================================================");
		
		Employee e21 = new Manager(501, "Amit Sharma", "IT", "Project Manager", 35, "Male", "ravi@example.com", "9876543210", "New Delhi", 10.0, 10, "Project A", "Senior Manager", "Managing IT Projects", 20000.0);
		Employee e22 = new Manager(502, "Priya Verma", "IT", "Project Manager", 32, "Female", "priya@example.com", "9876543211", "Noida", 8.0, 12, "Project B", "Senior Manager", "Managing Software Projects", 18000.0);
		Employee e23 = new Manager(503, "Rahul Singh", "Finance", "Finance Manager", 40, "Male", "rahul@example.com", "9876543212", "Gurgaon", 15.0, 8, "Project C", "Department Manager", "Managing Finance Operations", 25000.0);
		Employee e24 = new Manager(504, "Neha Gupta", "HR", "HR Manager", 36, "Female", "neha@example.com", "9876543213", "Mumbai", 11.0, 15, "Project D", "Senior Manager", "Managing Human Resources", 22000.0);
		Employee e25 = new Manager(505, "Vikas Kumar", "IT", "Engineering Manager", 38, "Male", "vikas@example.com", "9876543214", "Bangalore", 13.0, 20, "Project E", "Engineering Manager", "Managing Development Team", 30000.0);
		Employee e26 = new Manager(506, "Anjali Mehta", "Testing", "QA Manager", 34, "Female", "anjali@example.com", "9876543215", "Pune", 9.0, 14, "Project F", "QA Manager", "Managing Testing Team", 21000.0);
		Employee e27 = new Manager(507, "Suresh Reddy", "IT", "Technical Manager", 42, "Male", "suresh@example.com", "9876543216", "Hyderabad", 17.0, 25, "Project G", "Senior Manager", "Managing Technical Operations", 35000.0);
		Employee e28 = new Manager(508, "Kavita Joshi", "Operations", "Operations Manager", 37, "Female", "kavita@example.com", "9876543217", "Chennai", 12.0, 18, "Project H", "Operations Manager", "Managing Business Operations", 24000.0);
		Employee e29 = new Manager(509, "Rohit Malhotra", "IT", "Program Manager", 45, "Male", "rohit@example.com", "9876543218", "Kolkata", 20.0, 30, "Project I", "Program Manager", "Managing Multiple Projects", 40000.0);
		Employee e30 = new Manager(510, "Sneha Kapoor", "IT", "Delivery Manager", 39, "Female", "sneha@example.com", "9876543219", "Lucknow", 14.0, 22, "Project J", "Delivery Manager", "Managing Project Delivery", 28000.0);		
		
		System.out.println(e21);
		System.out.println("===================");
		System.out.println(e22);
		System.out.println("===================");
		System.out.println(e23);
		System.out.println("===================");
		System.out.println(e24);
		System.out.println("===================");
		System.out.println(e25);
		System.out.println("===================");
		System.out.println(e26);
		System.out.println("===================");
		System.out.println(e27);
		System.out.println("===================");
		System.out.println(e28);
		System.out.println("===================");
		System.out.println(e29);
		System.out.println("===================");
		System.out.println(e30);
		
		System.out.println("======================e21 Details======================");
		e21.displayDetails();
		System.out.println("Salary of e21 is: " + e21.calculateSalary());
		e21.work();
		
		System.out.println("======================e22 Details======================");
		e22.displayDetails();
		System.out.println("Salary of e22 is: " + e22.calculateSalary());
		e22.work();
		
		System.out.println("======================e23 Details======================");
		e23.displayDetails();
		System.out.println("Salary of e23 is: " + e23.calculateSalary());
		e23.work();
		
		System.out.println("======================e24 Details======================");
		e24.displayDetails();
		System.out.println("Salary of e24 is: " + e24.calculateSalary());
		e24.work();
		
		System.out.println("======================e25 Details======================");
		e25.displayDetails();
		System.out.println("Salary of e25 is: " + e25.calculateSalary());
		e25.work();
		
		System.out.println("======================e26 Details======================");
		e26.displayDetails();	
		System.out.println("Salary of e26 is: " + e26.calculateSalary());
		e26.work();
		
		System.out.println("======================e27 Details======================");
		e27.displayDetails();
		System.out.println("Salary of e27 is: " + e27.calculateSalary());
		e27.work();
		
		System.out.println("======================e28 Details======================");
		e28.displayDetails();
		System.out.println("Salary of e28 is: " + e28.calculateSalary());
		e28.work();
		
		System.out.println("======================e29 Details======================");
		e29.displayDetails();
		System.out.println("Salary of e29 is: " + e29.calculateSalary());
		e29.work();
		
		System.out.println("======================e30 Details======================");
		e30.displayDetails();
		System.out.println("Salary of e30 is: " + e30.calculateSalary());
		e30.work();
	}

}
