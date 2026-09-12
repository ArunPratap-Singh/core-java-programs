package encapsulationsPrograming;

public class DepartmentDriver {

	public static void main(String[] args) {
		
		System.out.println("===============================Main Method Starts===================================");
		
		Department d1 = new Department("IT", "DEPT101", "Mr. Sharma", "Noida", "Mohan, Rohan, Sohan");
		Department d2 = new Department("HR", "DEPT102", "Mrs. Verma", "Lucknow", "Rahul, Shyam, Amit");
		Department d3 = new Department("Finance", "DEPT103", "Mr. Gupta", "Delhi", "Ankit, Ravi, Pankaj");
		Department d4 = new Department("Marketing", "DEPT104", "Mrs. Mehta", "Mumbai", "Karan, Nitin, Varun");
		Department d5 = new Department("Testing", "DEPT105", "Mr. Singh", "Pune", "Akash, Deepak, Vivek");
		Department d6 = new Department("Development", "DEPT106", "Mr. Kumar", "Bangalore", "Raj, Mohit, Suresh");
		Department d7 = new Department("Support", "DEPT107", "Mr. Gupta", "Hyderabad", "Ajay, Vikas, Tarun");
		Department d8 = new Department("Sales", "DEPT108", "Mrs. Kapoor", "Gurugram", "Arjun, Kunal, Manish");
		Department d9 = new Department("Security", "DEPT109", "Mr. Mishra", "Chennai", "Ravi, Amit, Lokesh");
		Department d10 = new Department("Operations", "DEPT110", "Mrs. Tiwari", "Kolkata", "Neeraj, Pankaj, Sanjay");

		Department d11 = new Department("Research", "DEPT111", "Mr. Sharma", "Noida", "Aman, Rohit, Sandeep");
		Department d12 = new Department("Administration", "DEPT112", "Mrs. Verma", "Lucknow", "Piyush, Naveen, Ashish");
		Department d13 = new Department("Training", "DEPT113", "Mr. Gupta", "Delhi", "Vikas, Sumit, Ankit");
		Department d14 = new Department("Recruitment", "DEPT114", "Mrs. Mehta", "Mumbai", "Rohan, Karan, Deepak");
		Department d15 = new Department("Accounts", "DEPT115", "Mr. Singh", "Pune", "Manoj, Ajay, Varun");
		Department d16 = new Department("Quality", "DEPT116", "Mr. Kumar", "Bangalore", "Akash, Rahul, Sohan");
		Department d17 = new Department("Production", "DEPT117", "Mr. Gupta", "Hyderabad", "Vivek, Raj, Mohit");
		Department d18 = new Department("Logistics", "DEPT118", "Mrs. Kapoor", "Gurugram", "Arjun, Nitin, Tarun");
		Department d19 = new Department("Legal", "DEPT119", "Mr. Mishra", "Chennai", "Lokesh, Sanjay, Pankaj");
		Department d20 = new Department("Procurement", "DEPT120", "Mrs. Tiwari", "Kolkata", "Neeraj, Shyam, Amit");

		Department d21 = new Department("IT", "DEPT121", "Mr. Sharma", "Delhi", "Mohan, Rahul, Kunal");
		Department d22 = new Department("HR", "DEPT122", "Mrs. Verma", "Noida", "Suresh, Pankaj, Rohit");
		Department d23 = new Department("Finance", "DEPT123", "Mr. Gupta", "Lucknow", "Deepak, Amit, Naveen");
		Department d24 = new Department("Marketing", "DEPT124", "Mrs. Mehta", "Pune", "Karan, Varun, Ashish");
		Department d25 = new Department("Testing", "DEPT125", "Mr. Singh", "Mumbai", "Akash, Manoj, Vivek");
		Department d26 = new Department("Development", "DEPT126", "Mr. Kumar", "Chennai", "Raj, Sohan, Piyush");
		Department d27 = new Department("Support", "DEPT127", "Mr. Gupta", "Bangalore", "Ajay, Tarun, Vikas");
		Department d28 = new Department("Sales", "DEPT128", "Mrs. Kapoor", "Hyderabad", "Arjun, Manish, Rakesh");
		Department d29 = new Department("Security", "DEPT129", "Mr. Mishra", "Noida", "Lokesh, Ravi, Sanjay");
		Department d30 = new Department("Operations", "DEPT130", "Mrs. Tiwari", "Delhi", "Neeraj, Amit, Suresh");

		Department d31 = new Department("Research", "DEPT131", "Mr. Sharma", "Lucknow", "Aman, Rohit, Mohit");
		Department d32 = new Department("Administration", "DEPT132", "Mrs. Verma", "Pune", "Naveen, Pankaj, Shyam");
		Department d33 = new Department("Training", "DEPT133", "Mr. Gupta", "Mumbai", "Sumit, Ankit, Rahul");
		Department d34 = new Department("Recruitment", "DEPT134", "Mrs. Mehta", "Chennai", "Rohan, Deepak, Karan");
		Department d35 = new Department("Accounts", "DEPT135", "Mr. Singh", "Bangalore", "Manoj, Ajay, Varun");
		Department d36 = new Department("Quality", "DEPT136", "Mr. Kumar", "Hyderabad", "Akash, Vivek, Raj");
		Department d37 = new Department("Production", "DEPT137", "Mr. Gupta", "Noida", "Sohan, Mohit, Tarun");
		Department d38 = new Department("Logistics", "DEPT138", "Mrs. Kapoor", "Delhi", "Arjun, Nitin, Kunal");
		Department d39 = new Department("Legal", "DEPT139", "Mr. Mishra", "Lucknow", "Lokesh, Sanjay, Piyush");
		Department d40 = new Department("Procurement", "DEPT140", "Mrs. Tiwari", "Pune", "Neeraj, Shyam, Rakesh");

		Department d41 = new Department("IT", "DEPT141", "Mr. Sharma", "Mumbai", "Mohan, Suresh, Amit");
		Department d42 = new Department("HR", "DEPT142", "Mrs. Verma", "Bangalore", "Rahul, Ashish, Pankaj");
		Department d43 = new Department("Finance", "DEPT143", "Mr. Gupta", "Hyderabad", "Ankit, Ravi, Deepak");
		Department d44 = new Department("Marketing", "DEPT144", "Mrs. Mehta", "Noida", "Karan, Varun, Mohit");
		Department d45 = new Department("Testing", "DEPT145", "Mr. Singh", "Delhi", "Akash, Vivek, Raj");
		Department d46 = new Department("Development", "DEPT146", "Mr. Kumar", "Lucknow", "Sohan, Piyush, Aman");
		Department d47 = new Department("Support", "DEPT147", "Mr. Gupta", "Pune", "Ajay, Tarun, Nitin");
		Department d48 = new Department("Sales", "DEPT148", "Mrs. Kapoor", "Mumbai", "Arjun, Manish, Rohan");
		Department d49 = new Department("Security", "DEPT149", "Mr. Mishra", "Bangalore", "Lokesh, Sanjay, Neeraj");
		Department d50 = new Department("Operations", "DEPT150", "Mrs. Tiwari", "Hyderabad", "Rakesh, Shyam, Amit");
		
				
		System.out.println("=========================Department Employee Details 1===========================");
		System.out.println("Object Reference is: " + d1);
		System.out.println("Department Name is: " + d1.getDepartmentName());
		System.out.println("Department ID is: " + d1.getDepartmentID());
		System.out.println("Manager Name is: " + d1.getManagerName());
		System.out.println("Location is: " + d1.getLocation());
		System.out.println("Employee List is: " + d1.getEmployeeList());

		System.out.println("=========================Department Employee Details 2===========================");
		System.out.println("Object Reference is: " + d2);
		System.out.println("Department Name is: " + d2.getDepartmentName());
		System.out.println("Department ID is: " + d2.getDepartmentID());
		System.out.println("Manager Name is: " + d2.getManagerName());
		System.out.println("Location is: " + d2.getLocation());
		System.out.println("Employee List is: " + d2.getEmployeeList());

		System.out.println("=========================Department Employee Details 3===========================");
		System.out.println("Object Reference is: " + d3);
		System.out.println("Department Name is: " + d3.getDepartmentName());
		System.out.println("Department ID is: " + d3.getDepartmentID());
		System.out.println("Manager Name is: " + d3.getManagerName());
		System.out.println("Location is: " + d3.getLocation());
		System.out.println("Employee List is: " + d3.getEmployeeList());

		System.out.println("=========================Department Employee Details 4===========================");
		System.out.println("Object Reference is: " + d4);
		System.out.println("Department Name is: " + d4.getDepartmentName());
		System.out.println("Department ID is: " + d4.getDepartmentID());
		System.out.println("Manager Name is: " + d4.getManagerName());
		System.out.println("Location is: " + d4.getLocation());
		System.out.println("Employee List is: " + d4.getEmployeeList());

		System.out.println("=========================Department Employee Details 5===========================");
		System.out.println("Object Reference is: " + d5);
		System.out.println("Department Name is: " + d5.getDepartmentName());
		System.out.println("Department ID is: " + d5.getDepartmentID());
		System.out.println("Manager Name is: " + d5.getManagerName());
		System.out.println("Location is: " + d5.getLocation());
		System.out.println("Employee List is: " + d5.getEmployeeList());

		System.out.println("=========================Department Employee Details 6===========================");
		System.out.println("Object Reference is: " + d6);
		System.out.println("Department Name is: " + d6.getDepartmentName());
		System.out.println("Department ID is: " + d6.getDepartmentID());
		System.out.println("Manager Name is: " + d6.getManagerName());
		System.out.println("Location is: " + d6.getLocation());
		System.out.println("Employee List is: " + d6.getEmployeeList());

		System.out.println("=========================Department Employee Details 7===========================");
		System.out.println("Object Reference is: " + d7);
		System.out.println("Department Name is: " + d7.getDepartmentName());
		System.out.println("Department ID is: " + d7.getDepartmentID());
		System.out.println("Manager Name is: " + d7.getManagerName());
		System.out.println("Location is: " + d7.getLocation());
		System.out.println("Employee List is: " + d7.getEmployeeList());

		System.out.println("=========================Department Employee Details 8===========================");
		System.out.println("Object Reference is: " + d8);
		System.out.println("Department Name is: " + d8.getDepartmentName());
		System.out.println("Department ID is: " + d8.getDepartmentID());
		System.out.println("Manager Name is: " + d8.getManagerName());
		System.out.println("Location is: " + d8.getLocation());
		System.out.println("Employee List is: " + d8.getEmployeeList());

		System.out.println("=========================Department Employee Details 9===========================");
		System.out.println("Object Reference is: " + d9);
		System.out.println("Department Name is: " + d9.getDepartmentName());
		System.out.println("Department ID is: " + d9.getDepartmentID());
		System.out.println("Manager Name is: " + d9.getManagerName());
		System.out.println("Location is: " + d9.getLocation());
		System.out.println("Employee List is: " + d9.getEmployeeList());

		System.out.println("=========================Department Employee Details 10===========================");
		System.out.println("Object Reference is: " + d10);
		System.out.println("Department Name is: " + d10.getDepartmentName());
		System.out.println("Department ID is: " + d10.getDepartmentID());
		System.out.println("Manager Name is: " + d10.getManagerName());
		System.out.println("Location is: " + d10.getLocation());
		System.out.println("Employee List is: " + d10.getEmployeeList());

		System.out.println("=========================Department Employee Details 11===========================");
		System.out.println("Object Reference is: " + d11);
		System.out.println("Department Name is: " + d11.getDepartmentName());
		System.out.println("Department ID is: " + d11.getDepartmentID());
		System.out.println("Manager Name is: " + d11.getManagerName());
		System.out.println("Location is: " + d11.getLocation());
		System.out.println("Employee List is: " + d11.getEmployeeList());

		System.out.println("=========================Department Employee Details 12===========================");
		System.out.println("Object Reference is: " + d12);
		System.out.println("Department Name is: " + d12.getDepartmentName());
		System.out.println("Department ID is: " + d12.getDepartmentID());
		System.out.println("Manager Name is: " + d12.getManagerName());
		System.out.println("Location is: " + d12.getLocation());
		System.out.println("Employee List is: " + d12.getEmployeeList());

		System.out.println("=========================Department Employee Details 13===========================");
		System.out.println("Object Reference is: " + d13);
		System.out.println("Department Name is: " + d13.getDepartmentName());
		System.out.println("Department ID is: " + d13.getDepartmentID());
		System.out.println("Manager Name is: " + d13.getManagerName());
		System.out.println("Location is: " + d13.getLocation());
		System.out.println("Employee List is: " + d13.getEmployeeList());

		System.out.println("=========================Department Employee Details 14===========================");
		System.out.println("Object Reference is: " + d14);
		System.out.println("Department Name is: " + d14.getDepartmentName());
		System.out.println("Department ID is: " + d14.getDepartmentID());
		System.out.println("Manager Name is: " + d14.getManagerName());
		System.out.println("Location is: " + d14.getLocation());
		System.out.println("Employee List is: " + d14.getEmployeeList());

		System.out.println("=========================Department Employee Details 15===========================");
		System.out.println("Object Reference is: " + d15);
		System.out.println("Department Name is: " + d15.getDepartmentName());
		System.out.println("Department ID is: " + d15.getDepartmentID());
		System.out.println("Manager Name is: " + d15.getManagerName());
		System.out.println("Location is: " + d15.getLocation());
		System.out.println("Employee List is: " + d15.getEmployeeList());

		System.out.println("=========================Department Employee Details 16===========================");
		System.out.println("Object Reference is: " + d16);
		System.out.println("Department Name is: " + d16.getDepartmentName());
		System.out.println("Department ID is: " + d16.getDepartmentID());
		System.out.println("Manager Name is: " + d16.getManagerName());
		System.out.println("Location is: " + d16.getLocation());
		System.out.println("Employee List is: " + d16.getEmployeeList());

		System.out.println("=========================Department Employee Details 17===========================");
		System.out.println("Object Reference is: " + d17);
		System.out.println("Department Name is: " + d17.getDepartmentName());
		System.out.println("Department ID is: " + d17.getDepartmentID());
		System.out.println("Manager Name is: " + d17.getManagerName());
		System.out.println("Location is: " + d17.getLocation());
		System.out.println("Employee List is: " + d17.getEmployeeList());

		System.out.println("=========================Department Employee Details 18===========================");
		System.out.println("Object Reference is: " + d18);
		System.out.println("Department Name is: " + d18.getDepartmentName());
		System.out.println("Department ID is: " + d18.getDepartmentID());
		System.out.println("Manager Name is: " + d18.getManagerName());
		System.out.println("Location is: " + d18.getLocation());
		System.out.println("Employee List is: " + d18.getEmployeeList());

		System.out.println("=========================Department Employee Details 19===========================");
		System.out.println("Object Reference is: " + d19);
		System.out.println("Department Name is: " + d19.getDepartmentName());
		System.out.println("Department ID is: " + d19.getDepartmentID());
		System.out.println("Manager Name is: " + d19.getManagerName());
		System.out.println("Location is: " + d19.getLocation());
		System.out.println("Employee List is: " + d19.getEmployeeList());

		System.out.println("=========================Department Employee Details 20===========================");
		System.out.println("Object Reference is: " + d20);
		System.out.println("Department Name is: " + d20.getDepartmentName());
		System.out.println("Department ID is: " + d20.getDepartmentID());
		System.out.println("Manager Name is: " + d20.getManagerName());
		System.out.println("Location is: " + d20.getLocation());
		System.out.println("Employee List is: " + d20.getEmployeeList());

		System.out.println("=========================Department Employee Details 21===========================");
		System.out.println("Object Reference is: " + d21);
		System.out.println("Department Name is: " + d21.getDepartmentName());
		System.out.println("Department ID is: " + d21.getDepartmentID());
		System.out.println("Manager Name is: " + d21.getManagerName());
		System.out.println("Location is: " + d21.getLocation());
		System.out.println("Employee List is: " + d21.getEmployeeList());

		System.out.println("=========================Department Employee Details 22===========================");
		System.out.println("Object Reference is: " + d22);
		System.out.println("Department Name is: " + d22.getDepartmentName());
		System.out.println("Department ID is: " + d22.getDepartmentID());
		System.out.println("Manager Name is: " + d22.getManagerName());
		System.out.println("Location is: " + d22.getLocation());
		System.out.println("Employee List is: " + d22.getEmployeeList());

		System.out.println("=========================Department Employee Details 23===========================");
		System.out.println("Object Reference is: " + d23);
		System.out.println("Department Name is: " + d23.getDepartmentName());
		System.out.println("Department ID is: " + d23.getDepartmentID());
		System.out.println("Manager Name is: " + d23.getManagerName());
		System.out.println("Location is: " + d23.getLocation());
		System.out.println("Employee List is: " + d23.getEmployeeList());

		System.out.println("=========================Department Employee Details 24===========================");
		System.out.println("Object Reference is: " + d24);
		System.out.println("Department Name is: " + d24.getDepartmentName());
		System.out.println("Department ID is: " + d24.getDepartmentID());
		System.out.println("Manager Name is: " + d24.getManagerName());
		System.out.println("Location is: " + d24.getLocation());
		System.out.println("Employee List is: " + d24.getEmployeeList());

		System.out.println("=========================Department Employee Details 25===========================");
		System.out.println("Object Reference is: " + d25);
		System.out.println("Department Name is: " + d25.getDepartmentName());
		System.out.println("Department ID is: " + d25.getDepartmentID());
		System.out.println("Manager Name is: " + d25.getManagerName());
		System.out.println("Location is: " + d25.getLocation());
		System.out.println("Employee List is: " + d25.getEmployeeList());

		System.out.println("=========================Department Employee Details 26===========================");
		System.out.println("Object Reference is: " + d26);
		System.out.println("Department Name is: " + d26.getDepartmentName());
		System.out.println("Department ID is: " + d26.getDepartmentID());
		System.out.println("Manager Name is: " + d26.getManagerName());
		System.out.println("Location is: " + d26.getLocation());
		System.out.println("Employee List is: " + d26.getEmployeeList());

		System.out.println("=========================Department Employee Details 27===========================");
		System.out.println("Object Reference is: " + d27);
		System.out.println("Department Name is: " + d27.getDepartmentName());
		System.out.println("Department ID is: " + d27.getDepartmentID());
		System.out.println("Manager Name is: " + d27.getManagerName());
		System.out.println("Location is: " + d27.getLocation());
		System.out.println("Employee List is: " + d27.getEmployeeList());

		System.out.println("=========================Department Employee Details 28===========================");
		System.out.println("Object Reference is: " + d28);
		System.out.println("Department Name is: " + d28.getDepartmentName());
		System.out.println("Department ID is: " + d28.getDepartmentID());
		System.out.println("Manager Name is: " + d28.getManagerName());
		System.out.println("Location is: " + d28.getLocation());
		System.out.println("Employee List is: " + d28.getEmployeeList());

		System.out.println("=========================Department Employee Details 29===========================");
		System.out.println("Object Reference is: " + d29);
		System.out.println("Department Name is: " + d29.getDepartmentName());
		System.out.println("Department ID is: " + d29.getDepartmentID());
		System.out.println("Manager Name is: " + d29.getManagerName());
		System.out.println("Location is: " + d29.getLocation());
		System.out.println("Employee List is: " + d29.getEmployeeList());

		System.out.println("=========================Department Employee Details 30===========================");
		System.out.println("Object Reference is: " + d30);
		System.out.println("Department Name is: " + d30.getDepartmentName());
		System.out.println("Department ID is: " + d30.getDepartmentID());
		System.out.println("Manager Name is: " + d30.getManagerName());
		System.out.println("Location is: " + d30.getLocation());
		System.out.println("Employee List is: " + d30.getEmployeeList());

		System.out.println("=========================Department Employee Details 31===========================");
		System.out.println("Object Reference is: " + d31);
		System.out.println("Department Name is: " + d31.getDepartmentName());
		System.out.println("Department ID is: " + d31.getDepartmentID());
		System.out.println("Manager Name is: " + d31.getManagerName());
		System.out.println("Location is: " + d31.getLocation());
		System.out.println("Employee List is: " + d31.getEmployeeList());

		System.out.println("=========================Department Employee Details 32===========================");
		System.out.println("Object Reference is: " + d32);
		System.out.println("Department Name is: " + d32.getDepartmentName());
		System.out.println("Department ID is: " + d32.getDepartmentID());
		System.out.println("Manager Name is: " + d32.getManagerName());
		System.out.println("Location is: " + d32.getLocation());
		System.out.println("Employee List is: " + d32.getEmployeeList());

		System.out.println("=========================Department Employee Details 33===========================");
		System.out.println("Object Reference is: " + d33);
		System.out.println("Department Name is: " + d33.getDepartmentName());
		System.out.println("Department ID is: " + d33.getDepartmentID());
		System.out.println("Manager Name is: " + d33.getManagerName());
		System.out.println("Location is: " + d33.getLocation());
		System.out.println("Employee List is: " + d33.getEmployeeList());

		System.out.println("=========================Department Employee Details 34===========================");
		System.out.println("Object Reference is: " + d34);
		System.out.println("Department Name is: " + d34.getDepartmentName());
		System.out.println("Department ID is: " + d34.getDepartmentID());
		System.out.println("Manager Name is: " + d34.getManagerName());
		System.out.println("Location is: " + d34.getLocation());
		System.out.println("Employee List is: " + d34.getEmployeeList());

		System.out.println("=========================Department Employee Details 35===========================");
		System.out.println("Object Reference is: " + d35);
		System.out.println("Department Name is: " + d35.getDepartmentName());
		System.out.println("Department ID is: " + d35.getDepartmentID());
		System.out.println("Manager Name is: " + d35.getManagerName());
		System.out.println("Location is: " + d35.getLocation());
		System.out.println("Employee List is: " + d35.getEmployeeList());

		System.out.println("=========================Department Employee Details 36===========================");
		System.out.println("Object Reference is: " + d36);
		System.out.println("Department Name is: " + d36.getDepartmentName());
		System.out.println("Department ID is: " + d36.getDepartmentID());
		System.out.println("Manager Name is: " + d36.getManagerName());
		System.out.println("Location is: " + d36.getLocation());
		System.out.println("Employee List is: " + d36.getEmployeeList());

		System.out.println("=========================Department Employee Details 37===========================");
		System.out.println("Object Reference is: " + d37);
		System.out.println("Department Name is: " + d37.getDepartmentName());
		System.out.println("Department ID is: " + d37.getDepartmentID());
		System.out.println("Manager Name is: " + d37.getManagerName());
		System.out.println("Location is: " + d37.getLocation());
		System.out.println("Employee List is: " + d37.getEmployeeList());

		System.out.println("=========================Department Employee Details 38===========================");
		System.out.println("Object Reference is: " + d38);
		System.out.println("Department Name is: " + d38.getDepartmentName());
		System.out.println("Department ID is: " + d38.getDepartmentID());
		System.out.println("Manager Name is: " + d38.getManagerName());
		System.out.println("Location is: " + d38.getLocation());
		System.out.println("Employee List is: " + d38.getEmployeeList());

		System.out.println("=========================Department Employee Details 39===========================");
		System.out.println("Object Reference is: " + d39);
		System.out.println("Department Name is: " + d39.getDepartmentName());
		System.out.println("Department ID is: " + d39.getDepartmentID());
		System.out.println("Manager Name is: " + d39.getManagerName());
		System.out.println("Location is: " + d39.getLocation());
		System.out.println("Employee List is: " + d39.getEmployeeList());

		System.out.println("=========================Department Employee Details 40===========================");
		System.out.println("Object Reference is: " + d40);
		System.out.println("Department Name is: " + d40.getDepartmentName());
		System.out.println("Department ID is: " + d40.getDepartmentID());
		System.out.println("Manager Name is: " + d40.getManagerName());
		System.out.println("Location is: " + d40.getLocation());
		System.out.println("Employee List is: " + d40.getEmployeeList());

		System.out.println("=========================Department Employee Details 41===========================");
		System.out.println("Object Reference is: " + d41);
		System.out.println("Department Name is: " + d41.getDepartmentName());
		System.out.println("Department ID is: " + d41.getDepartmentID());
		System.out.println("Manager Name is: " + d41.getManagerName());
		System.out.println("Location is: " + d41.getLocation());
		System.out.println("Employee List is: " + d41.getEmployeeList());

		System.out.println("=========================Department Employee Details 42===========================");
		System.out.println("Object Reference is: " + d42);
		System.out.println("Department Name is: " + d42.getDepartmentName());
		System.out.println("Department ID is: " + d42.getDepartmentID());
		System.out.println("Manager Name is: " + d42.getManagerName());
		System.out.println("Location is: " + d42.getLocation());
		System.out.println("Employee List is: " + d42.getEmployeeList());

		System.out.println("=========================Department Employee Details 43===========================");
		System.out.println("Object Reference is: " + d43);
		System.out.println("Department Name is: " + d43.getDepartmentName());
		System.out.println("Department ID is: " + d43.getDepartmentID());
		System.out.println("Manager Name is: " + d43.getManagerName());
		System.out.println("Location is: " + d43.getLocation());
		System.out.println("Employee List is: " + d43.getEmployeeList());

		System.out.println("=========================Department Employee Details 44===========================");
		System.out.println("Object Reference is: " + d44);
		System.out.println("Department Name is: " + d44.getDepartmentName());
		System.out.println("Department ID is: " + d44.getDepartmentID());
		System.out.println("Manager Name is: " + d44.getManagerName());
		System.out.println("Location is: " + d44.getLocation());
		System.out.println("Employee List is: " + d44.getEmployeeList());

		System.out.println("=========================Department Employee Details 45===========================");
		System.out.println("Object Reference is: " + d45);
		System.out.println("Department Name is: " + d45.getDepartmentName());
		System.out.println("Department ID is: " + d45.getDepartmentID());
		System.out.println("Manager Name is: " + d45.getManagerName());
		System.out.println("Location is: " + d45.getLocation());
		System.out.println("Employee List is: " + d45.getEmployeeList());

		System.out.println("=========================Department Employee Details 46===========================");
		System.out.println("Object Reference is: " + d46);
		System.out.println("Department Name is: " + d46.getDepartmentName());
		System.out.println("Department ID is: " + d46.getDepartmentID());
		System.out.println("Manager Name is: " + d46.getManagerName());
		System.out.println("Location is: " + d46.getLocation());
		System.out.println("Employee List is: " + d46.getEmployeeList());

		System.out.println("=========================Department Employee Details 47===========================");
		System.out.println("Object Reference is: " + d47);
		System.out.println("Department Name is: " + d47.getDepartmentName());
		System.out.println("Department ID is: " + d47.getDepartmentID());
		System.out.println("Manager Name is: " + d47.getManagerName());
		System.out.println("Location is: " + d47.getLocation());
		System.out.println("Employee List is: " + d47.getEmployeeList());

		System.out.println("=========================Department Employee Details 48===========================");
		System.out.println("Object Reference is: " + d48);
		System.out.println("Department Name is: " + d48.getDepartmentName());
		System.out.println("Department ID is: " + d48.getDepartmentID());
		System.out.println("Manager Name is: " + d48.getManagerName());
		System.out.println("Location is: " + d48.getLocation());
		System.out.println("Employee List is: " + d48.getEmployeeList());

		System.out.println("=========================Department Employee Details 49===========================");
		System.out.println("Object Reference is: " + d49);
		System.out.println("Department Name is: " + d49.getDepartmentName());
		System.out.println("Department ID is: " + d49.getDepartmentID());
		System.out.println("Manager Name is: " + d49.getManagerName());
		System.out.println("Location is: " + d49.getLocation());
		System.out.println("Employee List is: " + d49.getEmployeeList());

		System.out.println("=========================Department Employee Details 50===========================");
		System.out.println("Object Reference is: " + d50);
		System.out.println("Department Name is: " + d50.getDepartmentName());
		System.out.println("Department ID is: " + d50.getDepartmentID());
		System.out.println("Manager Name is: " + d50.getManagerName());
		System.out.println("Location is: " + d50.getLocation());
		System.out.println("Employee List is: " + d50.getEmployeeList());

		System.out.println("========================================Main Method Ends===========================================");
	}

}
