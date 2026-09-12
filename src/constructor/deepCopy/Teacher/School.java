package constructor.deepCopy.Teacher;

public class School {
	
		int schoolId;
		String schoolName;
		String location;
		int students;
		String schoolType;
		String board;

		School() {

		}

		School(int schoolId, String schoolName, String location, int students, String schoolType, String board) {

			this.schoolId = schoolId;
			this.schoolName = schoolName;
			this.location = location;
			this.students = students;
			this.schoolType = schoolType;
			this.board = board;

		}

		public String toString() {

			return "SchoolId is: " + schoolId + "\nSchoolName is: " + schoolName + "\nLocation is: " + location + "\nStudents is: " + students + "\nSchoolType is: " + schoolType + "\nBoard is: " + board;

		}

	

}
