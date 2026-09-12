package constructor.deepCopy.Doctor;

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

		//deep copy
		Doctor(Doctor d) {

			this.name = d.name;
			this.specialization = d.specialization;
			this.experience = d.experience;
			this.gender = d.gender;
			this.h = new Hospital();
			this.h.beds = d.h.beds;
			this.h.hospitalId = d.h.hospitalId;
			this.h.hospitalName = d.h.hospitalName;
			this.h.hospitalType = d.h.hospitalType;
			this.h.location = d.h.location;
			this.h.management = d.h.management;

		}

		public String toString() {

			return "Name is: " + name + "\nSpecialization is: " + specialization + "\nExperience is: " + experience + "\nGender is: " + gender + "\nH is: " + h + "\n========================";

		}

	

}
