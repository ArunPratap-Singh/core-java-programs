package constructor.deepCopy.Teacher;

public class Teacher {
	
		String name;
		String subject;
		int experience;
		String qualification;
		School s;

		Teacher() {

		}

		Teacher(String name, String subject, int experience, String qualification, School s) {

			this.name = name;
			this.subject = subject;
			this.experience = experience;
			this.qualification = qualification;
			this.s = s;

		}

		//Deep copy
		Teacher(Teacher t) {

			this.name = t.name;
			this.subject = t.subject;
			this.experience = t.experience;
			this.qualification = t.qualification;
			this.s = new School();
			this.s.board = t.s.board;
			this.s.location = t.s.location;
			this.s.schoolId = t.s.schoolId;
			this.s.schoolName = t.s.schoolName;
			this.s.schoolType = t.s.schoolType;
			this.s.students = t.s.students;

		}

		public String toString() {

			return "Name is: " + name + "\nSubject is: " + subject + "\nExperience is: " + experience + "\nQualification is: " + qualification + "\nS is: " + s + "\n========================";

		}

	
}
