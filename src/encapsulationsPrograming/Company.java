package encapsulationsPrograming;

public class Company {
	
		private String companyName;
		private String employeeName;
		private String employeeID;
		private String department;
		private double salary;

		Company(String companyName, String employeeName, String employeeID, String department, double salary) {

			this.companyName = companyName;
			this.employeeName = employeeName;
			this.employeeID = employeeID;
			this.department = department;
			this.salary = salary;
		}


		public void setCompanyName(String companyName) {

			if(companyName != null && companyName.length() > 2 && companyName.length() <= 100 && !companyName.isBlank() && companyName.matches("[A-Z a-z 0-9 \s]+"))

				this.companyName = companyName;

			else

				System.out.println("Wrong Company Name");
		}


		public String getCompanyName() {

			return companyName;
		}


		public void setEmployeeName(String employeeName) {

			if(employeeName != null && employeeName.length() > 3 && employeeName.length() <= 50 && !employeeName.isBlank() && employeeName.matches("[A-Z a-z \s]+"))

				this.employeeName = employeeName;

			else

				System.out.println("Wrong Employee Name");
		}


		public String getEmployeeName() {

			return employeeName;
		}


		public void setEmployeeID(String employeeID) {

			if(employeeID != null && employeeID.length() > 3 && employeeID.length() <= 20 && !employeeID.isBlank() && employeeID.matches("[A-Z a-z 0-9]+"))

				this.employeeID = employeeID;

			else

				System.out.println("Invalid Employee ID");
		}


		public String getEmployeeID() {

			return employeeID;
		}


		public void setDepartment(String department) {

			if(department != null && department.length() > 2 && department.length() <= 40 && !department.isBlank() && department.matches("[A-Z a-z \s]+"))

				this.department = department;

			else

				System.out.println("Wrong Department");
		}


		public String getDepartment() {

			return department;
		}


		public void setSalary(double salary) {

			if(salary > 0)

				this.salary = salary;

			else

				System.out.println("Wrong Salary");
		}


		public double getSalary() {

			return salary;
		}

	

}
