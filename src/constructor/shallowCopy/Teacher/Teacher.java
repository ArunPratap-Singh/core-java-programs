package constructor.shallowCopy.Teacher;

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

		Teacher(Teacher t) {

			this.name = t.name;
			this.subject = t.subject;
			this.experience = t.experience;
			this.qualification = t.qualification;
			this.s = t.s;

		}

		public String toString() {

			return "Name is: " + name + "\nSubject is: " + subject + "\nExperience is: " + experience + "\nQualification is: " + qualification + "\nS is: " + s + "\n========================";

		}

	
}
