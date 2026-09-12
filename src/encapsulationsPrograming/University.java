package encapsulationsPrograming;

public class University {
	
		private String studentName;
		private String studentID;
		private String course;
		private String collegeName;
		private double percentage;
		private String studentRecord;
		
		University(){
			
		}

		University(String studentName, String studentID, String course, String collegeName, double percentage, String studentRecord) {

			setStudentName(studentName);
			setStudentID(studentID);
			setCourse(course);
			setCollegeName(collegeName);
			setPercentage(percentage);
			setStudentRecord(studentRecord);
		}


		public void setStudentName(String studentName) {

			if(studentName != null && studentName.length() > 3 && studentName.length() <= 50 && !studentName.isBlank() && studentName.matches("[A-Z a-z .]+")) {

				this.studentName = studentName;
			}
			else {

				System.out.println("Wrong Student Name");
			}
		}


		public String getStudentName() {

			return studentName;
		}


		public void setStudentID(String studentID) {

			if(studentID != null && studentID.length() >= 5 && studentID.length() <= 20 && !studentID.isBlank() && studentID.matches("[A-Z a-z 0-9]+")) {

				this.studentID = studentID;
			}
			else {

				System.out.println("Invalid Student ID");
			}
		}


		public String getStudentID() {

			return studentID;
		}


		public void setCourse(String course) {

			if(course != null && course.length() >= 2 && course.length() <= 50 && !course.isBlank() && course.matches("[A-Z a-z \s +]+")) {

				this.course = course;
			}
			else {

				System.out.println("Wrong Course");
			}
		}


		public String getCourse() {

			return course;
		}


		public void setCollegeName(String collegeName) {

			if(collegeName != null && collegeName.length() > 3 && collegeName.length() <= 100 && !collegeName.isBlank() && collegeName.matches("[A-Z a-z 0-9 .]+")) {

				this.collegeName = collegeName;
			}
			else {

				System.out.println("Wrong College Name");
			}
		}


		public String getCollegeName() {

			return collegeName;
		}


		public void setPercentage(double percentage) {

			if(percentage >= 0 && percentage <= 100) {

				this.percentage = percentage;
			}
			else {

				System.out.println("Invalid Percentage");
			}
		}


		public double getPercentage() {

			return percentage;
		}


		public void setStudentRecord(String studentRecord) {

			if(studentRecord != null && studentRecord.length() >= 5 && studentRecord.length() <= 200 && !studentRecord.isBlank()) {

				this.studentRecord = studentRecord;
			}
			else {

				System.out.println("Invalid Student Record");
			}
		}


		public String getStudentRecord() {

			return studentRecord;
		}


		public void updateStudentRecord(String newRecord) {

			if(newRecord != null && !newRecord.isBlank() && newRecord.length() >= 5 && newRecord.length() <= 200) {

				this.studentRecord = newRecord;

				System.out.println("Student Record Updated Successfully");
			}
			else {

				System.out.println("Cannot Update Student Record");
			}
		}


		public boolean isPassed() {

			return percentage >= 40;
		}


		public String getGrade() {

			if(percentage >= 90)
				return "A+";

			else if(percentage >= 80)
				return "A";

			else if(percentage >= 70)
				return "B";

			else if(percentage >= 60)
				return "C";

			else if(percentage >= 50)
				return "D";

			else if(percentage >= 40)
				return "E";

			else
				return "F";
		}

	

}
