package encapsulationsPrograming;

public class CollegeStudent {
	
		private String name;
		private int rollno;
		private String course;
		private String college;
		private double percentage;
		
		CollegeStudent(){
			
		}

		CollegeStudent(String name, int rollno, String course, String college, double percentage) {

			this.name = name;
			this.rollno = rollno;
			this.course = course;
			this.college = college;
			this.percentage = percentage;
		}

		public void setName(String name) {

			if(name.length() > 3 && name.length() <= 50 && !name.isBlank() && name.matches("[A-Z a-z]+"))

				this.name = name;

			else
				System.out.println("Wrong name entered");
		}

		public String getName() {

			return name;
		}

		public void setRollNo(int rollno) {

			if(rollno > 0)

				this.rollno = rollno;

			else
				System.out.println("Wrong RollNo");
		}

		public int getRollNo() {

			return rollno;
		}

		public void setCourse(String course) {

			if(course.length() > 2 && course.length() <= 50 && !course.isBlank() && course.matches("[A-Z a-z]+"))

				this.course = course;

			else
				System.out.println("Wrong Course");
		}

		public String getCourse() {

			return course;
		}

		public void setCollege(String college) {

			if(college.length() > 3 && college.length() <= 100 && !college.isBlank() && college.matches("[A-Z a-z \s]+"))

				this.college = college;

			else
				System.out.println("Wrong College Name");
		}

		public String getCollege() {

			return college;
		}

		public void setPercentage(double percentage) {

			if(percentage >= 0 && percentage <= 100)

				this.percentage = percentage;

			else
				System.out.println("Wrong Percentage");
		}

		public double getPercentage() {

			return percentage;
		}
	

}
