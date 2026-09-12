package encapsulationsPrograming;

public class SchoolTeacher {
	
		private String teacherName;
		private String teacherID;
		private String subject;
		private String schoolName;
		private double salary;

		SchoolTeacher(String teacherName, String teacherID, String subject, String schoolName, double salary) {

			this.teacherName = teacherName;
			this.teacherID = teacherID;
			this.subject = subject;
			this.schoolName = schoolName;
			this.salary = salary;
		}


		public void setTeacherName(String teacherName) {

			if(teacherName.length() > 3 && teacherName.length() <= 50 && !teacherName.isBlank() && teacherName.matches("[A-Z a-z \s]+"))

				this.teacherName = teacherName;

			else

				System.out.println("Wrong Teacher Name");
		}


		public String getTeacherName() {

			return teacherName;
		}


		public void setTeacherID(String teacherID) {

			if(teacherID.length() > 3 && teacherID.length() <= 20 && !teacherID.isBlank() && teacherID.matches("[A-Z a-z 0-9]+"))

				this.teacherID = teacherID;

			else

				System.out.println("Invalid Teacher ID");
		}


		public String getTeacherID() {

			return teacherID;
		}


		public void setSubject(String subject) {

			if(subject.length() > 2 && subject.length() <= 30 && !subject.isBlank() && subject.matches("[A-Z a-z]+"))

				this.subject = subject;

			else

				System.out.println("Wrong Subject");
		}


		public String getSubject() {

			return subject;
		}


		public void setSchoolName(String schoolName) {

			if(schoolName != null && schoolName.length() > 3 && schoolName.length() <= 100 && !schoolName.isBlank() && schoolName.matches("[A-Z a-z 0-9 .]+"))

				this.schoolName = schoolName;

			else

				System.out.println("Wrong School Name");
		}


		public String getSchoolName() {

			return schoolName;
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
