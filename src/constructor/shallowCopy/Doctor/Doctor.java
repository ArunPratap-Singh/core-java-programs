package constructor.shallowCopy.Doctor;

public class Doctor {
	
		String name;
		String specialization;
		int experience;
		String gender;
		Hospital h;

		Doctor() {

		}

		Doctor(String name, String specialization, int experience, String gender, Hospital h) {

			this.name = name;
			this.specialization = specialization;
			this.experience = experience;
			this.gender = gender;
			this.h = h;

		}

		Doctor(Doctor d) {

			this.name = d.name;
			this.specialization = d.specialization;
			this.experience = d.experience;
			this.gender = d.gender;
			this.h = d.h;

		}

		public String toString() {

			return "Name is: " + name + "\nSpecialization is: " + specialization + "\nExperience is: " + experience + "\nGender is: " + gender + "\nH is: " + h + "\n========================";

		}

	

}
