package pojoPrograming;

public class EmployeeManagement {
	
		private int employeeID;
		private String employeeName;
		private int age;
		private String gender;
		private double salary;
		private String department;
		private String designation;
		private String email;
		private long contact;
		private String address;
		private int experience;
		private int joiningYear;
		private String employmentStatus;

		
		public EmployeeManagement() {

		}

		public EmployeeManagement(int employeeID, String employeeName, int age, String gender, double salary, String department, String designation, String email, long contact, String address, int experience, int joiningYear, String employmentStatus) {

			this.employeeID = employeeID;
			this.employeeName = employeeName;
			this.age = age;
			this.gender = gender;
			this.salary = salary;
			this.department = department;
			this.designation = designation;
			this.email = email;
			this.contact = contact;
			this.address = address;
			this.experience = experience;
			this.joiningYear = joiningYear;
			this.employmentStatus = employmentStatus;
		}

		public int getEmployeeID() {

			return employeeID;
		}


		public void setEmployeeID(int employeeID) {

			this.employeeID = employeeID;
		}


		public String getEmployeeName() {

			return employeeName;
		}


		public void setEmployeeName(String employeeName) {

			this.employeeName = employeeName;
		}


		public int getAge() {

			return age;
		}


		public void setAge(int age) {

			this.age = age;
		}

		public String getGender() {

			return gender;
		}


		public void setGender(String gender) {

			this.gender = gender;
		}


		public double getSalary() {

			return salary;
		}


		public void setSalary(double salary) {

			this.salary = salary;
		}


		public String getDepartment() {

			return department;
		}


		public void setDepartment(String department) {

			this.department = department;
		}

		public String getDesignation() {

			return designation;
		}


		public void setDesignation(String designation) {

			this.designation = designation;
		}

		public String getEmail() {

			return email;
		}


		public void setEmail(String email) {

			this.email = email;
		}


		public long getContact() {

			return contact;
		}


		public void setContact(long contact) {

			this.contact = contact;
		}

		public String getAddress() {

			return address;
		}


		public void setAddress(String address) {

			this.address = address;
		}


		public int getExperience() {

			return experience;
		}


		public void setExperience(int experience) {

			this.experience = experience;
		}


		public int getJoiningYear() {

			return joiningYear;
		}


		public void setJoiningYear(int joiningYear) {

			this.joiningYear = joiningYear;
		}

		public String getEmploymentStatus() {

			return employmentStatus;
		}

		public void setEmploymentStatus(String employmentStatus) {

			this.employmentStatus = employmentStatus;
		}


	

}
