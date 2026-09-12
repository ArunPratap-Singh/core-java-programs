package encapsulationsPrograming;

public class HospitalManagement {
	
		private String patientName;
		private String patientID;
		private int patientAge;
		private String disease;
		private String doctorName;
		private String doctorID;
		private String specialization;
		private double consultationFee;
		private String roomType;
		private boolean admitted;


		HospitalManagement(String patientName, String patientID, int patientAge, String disease, String doctorName, String doctorID, String specialization, double consultationFee, String roomType, boolean admitted) {

			this.patientName = patientName;
			this.patientID = patientID;
			this.patientAge = patientAge;
			this.disease = disease;
			this.doctorName = doctorName;
			this.doctorID = doctorID;
			this.specialization = specialization;
			this.consultationFee = consultationFee;
			this.roomType = roomType;
			this.admitted = admitted;
		}


		public void setPatientName(String patientName) {

			if(patientName != null && patientName.length() > 3 && patientName.length() <= 50 && !patientName.isBlank() && patientName.matches("[A-Z a-z \s]+")) {

				this.patientName = patientName;
			}
			else {

				System.out.println("Wrong Patient Name");
			}
		}


		public String getPatientName() {

			return patientName;
		}


		public void setPatientID(String patientID) {

			if(patientID != null && patientID.length() >= 5 && patientID.length() <= 20 && !patientID.isBlank() && patientID.matches("[A-Z a-z 0-9]+")) {

				this.patientID = patientID;
			}
			else {

				System.out.println("Invalid Patient ID");
			}
		}


		public String getPatientID() {

			return patientID;
		}


		public void setPatientAge(int patientAge) {

			if(patientAge > 0 && patientAge <= 120) {

				this.patientAge = patientAge;
			}
			else {

				System.out.println("Invalid Patient Age");
			}
		}


		public int getPatientAge() {

			return patientAge;
		}


		public void setDisease(String disease) {

			if(disease != null && disease.length() >= 2 && disease.length() <= 100 && !disease.isBlank() && disease.matches("[A-Z a-z \s]+")) {

				this.disease = disease;
			}
			else {

				System.out.println("Invalid Disease");
			}
		}


		public String getDisease() {

			return disease;
		}


		public void setDoctorName(String doctorName) {

			if(doctorName != null && doctorName.length() > 3 && doctorName.length() <= 50 && !doctorName.isBlank() && doctorName.matches("[A-Z a-z \s]+")) {

				this.doctorName = doctorName;
			}
			else {

				System.out.println("Wrong Doctor Name");
			}
		}


		public String getDoctorName() {

			return doctorName;
		}


		public void setDoctorID(String doctorID) {

			if(doctorID != null && doctorID.length() >= 5 && doctorID.length() <= 20 && !doctorID.isBlank() && doctorID.matches("[A-Z a-z 0-9]+")) {

				this.doctorID = doctorID;
			}
			else {

				System.out.println("Invalid Doctor ID");
			}
		}


		public String getDoctorID() {

			return doctorID;
		}


		public void setSpecialization(String specialization) {

			if(specialization != null && specialization.length() > 3 && specialization.length() <= 50 && !specialization.isBlank() && specialization.matches("[A-Z a-z \s]+")) {

				this.specialization = specialization;
			}
			else {

				System.out.println("Invalid Specialization");
			}
		}


		public String getSpecialization() {

			return specialization;
		}


		public void setConsultationFee(double consultationFee) {

			if(consultationFee > 0)

				this.consultationFee = consultationFee;

			else

				System.out.println("Invalid Consultation Fee");
		}


		public double getConsultationFee() {

			return consultationFee;
		}


		public void setRoomType(String roomType) {

			if(roomType != null && roomType.length() > 2 && roomType.length() <= 30 && !roomType.isBlank() && roomType.matches("[A-Z a-z 0-9 \s]+")) {

				this.roomType = roomType;
			}
			else {

				System.out.println("Invalid Room Type");
			}
		}


		public String getRoomType() {

			return roomType;
		}


		public void setAdmitted(boolean admitted) {

			this.admitted = admitted;
		}


		public boolean getAdmitted() {

			return admitted;
		}


		public void admitPatient() {

			if(!admitted) {

				admitted = true;

				System.out.println("Patient Admitted Successfully");
			}
			else {

				System.out.println("Patient is Already Admitted");
			}
		}


		public void dischargePatient() {

			if(admitted) {

				admitted = false;

				System.out.println("Patient Discharged Successfully");
			}
			else {

				System.out.println("Patient is Not Currently Admitted");
			}
		}


		public void changeDoctor(String newDoctorName, String newDoctorID, String newSpecialization, double newFee) {

			if(newDoctorName != null && !newDoctorName.isBlank() && newDoctorID != null && !newDoctorID.isBlank() && newSpecialization != null && !newSpecialization.isBlank() && newFee > 0) {

				this.doctorName = newDoctorName;
				this.doctorID = newDoctorID;
				this.specialization = newSpecialization;
				this.consultationFee = newFee;

				System.out.println("Doctor Details Updated Successfully");
			}
			else {

				System.out.println("Invalid Doctor Details");
			}
		}


		public String getPatientStatus() {

			if(admitted)

				return "Admitted";

			else

				return "Not Admitted";
		}

	

}
