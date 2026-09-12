package encapsulationsPrograming;

public class Doctor {
	
		private String doctorName;
		private String doctorID;
		private String specialization;
		private String hospitalName;
		private double consultationFee;

		Doctor(String doctorName, String doctorID, String specialization, String hospitalName, double consultationFee) {

			this.doctorName = doctorName;
			this.doctorID = doctorID;
			this.specialization = specialization;
			this.hospitalName = hospitalName;
			this.consultationFee = consultationFee;
		}


		public void setDoctorName(String doctorName) {

			if(doctorName.length() > 3 && doctorName.length() <= 50 && !doctorName.isBlank() && doctorName.matches("[A-Z a-z \s]+"))

				this.doctorName = doctorName;

			else

				System.out.println("Wrong Doctor Name");
		}


		public String getDoctorName() {

			return doctorName;
		}


		public void setDoctorID(String doctorID) {

			if(doctorID.length() > 3 && doctorID.length() <= 20 && !doctorID.isBlank() && doctorID.matches("[A-Z a-z 0-9]+"))

				this.doctorID = doctorID;

			else

				System.out.println("Invalid Doctor ID");
		}


		public String getDoctorID() {

			return doctorID;
		}


		public void setSpecialization(String specialization) {

			if(specialization.length() > 2 &&specialization.length() <= 50 && !specialization.isBlank() && specialization.matches("[A-Z a-z \s]+"))

				this.specialization = specialization;

			else

				System.out.println("Wrong Specialization");
		}


		public String getSpecialization() {

			return specialization;
		}


		public void setHospitalName(String hospitalName) {

			if(hospitalName.length() > 3 && hospitalName.length() <= 100 && !hospitalName.isBlank() && hospitalName.matches("[A-Z a-z 0-9 .]+"))

				this.hospitalName = hospitalName;

			else

				System.out.println("Wrong Hospital Name");
		}


		public String getHospitalName() {

			return hospitalName;
		}


		public void setConsultationFee(double consultationFee) {

			if(consultationFee > 0)

				this.consultationFee = consultationFee;

			else

				System.out.println("Wrong Consultation Fee");
		}


		public double getConsultationFee() {

			return consultationFee;
		}

	

}
