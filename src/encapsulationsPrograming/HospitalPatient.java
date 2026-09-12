package encapsulationsPrograming;

public class HospitalPatient {

		private String patientName;
		private String patientID;
		private int age;
		private String disease;
		private String doctorName;

		HospitalPatient(String patientName, String patientID, int age, String disease, String doctorName) {

			this.patientName = patientName;
			this.patientID = patientID;
			this.age = age;
			this.disease = disease;
			this.doctorName = doctorName;
		}


		public void setPatientName(String patientName) {

			if(patientName.length() > 2 && patientName.length() <= 50 && !patientName.isBlank() && patientName.matches("[A-Z a-z \s]+"))

				this.patientName = patientName;

			else

				System.out.println("Wrong Patient Name");
		}


		public String getPatientName() {

			return patientName;
		}


		public void setPatientID(String patientID) {

			if(patientID.length() > 3 && patientID.length() <= 20 && !patientID.isBlank() && patientID.matches("[A-Z a-z 0-9]+"))

				this.patientID = patientID;

			else

				System.out.println("Invalid Patient ID");
		}


		public String getPatientID() {

			return patientID;
		}


		public void setAge(int age) {

			if(age > 0 && age <= 120)

				this.age = age;

			else

				System.out.println("Invalid Age");
		}


		public int getAge() {

			return age;
		}


		public void setDisease(String disease) {

			if(disease.length() > 2 && disease.length() <= 50 && !disease.isBlank() && disease.matches("[A-Z a-z \s]+"))

				this.disease = disease;

			else

				System.out.println("Invalid Disease");
		}


		public String getDisease() {

			return disease;
		}


		public void setDoctorName(String doctorName) {

			if(doctorName.length() > 3 &&doctorName.length() <= 50 && !doctorName.isBlank() && doctorName.matches("[A-Z a-z \s]+"))

				this.doctorName = doctorName;

			else

				System.out.println("Invalid Doctor Name");
		}


		public String getDoctorName() {

			return doctorName;
		}

	
}
