package encapsulationsPrograming;

public class Department {
	
		private String departmentName;
		private String departmentID;
		private String managerName;
		private String location;
		private String employeeList;
		
		Department(){
			
		}	

		Department(String departmentName, String departmentID, String managerName, String location, String employeeList) {

			this.departmentName = departmentName;
			this.departmentID = departmentID;
			this.managerName = managerName;
			this.location = location;
			this.employeeList = employeeList;
		}


		public void setDepartmentName(String departmentName) {

			if(departmentName != null && departmentName.length() > 2 && departmentName.length() <= 50 && !departmentName.isBlank() && departmentName.matches("[A-Z a-z \s]+"))

				this.departmentName = departmentName;

			else

				System.out.println("Wrong Department Name");
		}


		public String getDepartmentName() {

			return departmentName;
		}


		public void setDepartmentID(String departmentID) {

			if(departmentID != null && departmentID.length() > 3 && departmentID.length() <= 20 && !departmentID.isBlank() && departmentID.matches("[A-Z a-z 0-9]+"))

				this.departmentID = departmentID;

			else

				System.out.println("Invalid Department ID");
		}


		public String getDepartmentID() {

			return departmentID;
		}


		public void setManagerName(String managerName) {

			if(managerName != null && managerName.length() > 3 && managerName.length() <= 50 && !managerName.isBlank() && managerName.matches("[A-Z a-z .]+"))

				this.managerName = managerName;

			else

				System.out.println("Wrong Manager Name");
		}


		public String getManagerName() {

			return managerName;
		}


		public void setLocation(String location) {

			if(location != null && location.length() > 2 && location.length() <= 50 && !location.isBlank() && location.matches("[A-Z a-z 0-9]+"))

				this.location = location;

			else

				System.out.println("Wrong Location");
		}


		public String getLocation() {

			return location;
		}


		public void setEmployeeList(String employeeList) {

			if(employeeList != null && employeeList.length() > 2 && employeeList.length() <= 200 && !employeeList.isBlank())

				this.employeeList = employeeList;

			else

				System.out.println("Invalid Employee List");
		}


		public String getEmployeeList() {

			return employeeList;
		}

	

}
