package methodChaining;

public class DoctorAppointment {
	
		private String patientName;
		private String doctorName;
		private String specialization;
		private String hospitalName;
		private String city;
		private String appointmentId;
		private String appointmentDate;
		private String appointmentTime;
		private String appointmentType;
		private String consultationMode;
		private double consultationFee;
		private String paymentMode;
		private String appointmentStatus;
		private String prescriptionStatus;
		
		//Setters

		public DoctorAppointment setPatientName(String patientName) {
			this.patientName = patientName;
			return this;
		}

		public DoctorAppointment setDoctorName(String doctorName) {
			this.doctorName = doctorName;
			return this;
		}

		public DoctorAppointment setSpecialization(String specialization) {
			this.specialization = specialization;
			return this;
		}

		public DoctorAppointment setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
			return this;
		}

		public DoctorAppointment setCity(String city) {
			this.city = city;
			return this;
		}

		public DoctorAppointment setAppointmentId(String appointmentId) {
			this.appointmentId = appointmentId;
			return this;
		}

		public DoctorAppointment setAppointmentDate(String appointmentDate) {
			this.appointmentDate = appointmentDate;
			return this;
		}

		public DoctorAppointment setAppointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
			return this;
		}

		public DoctorAppointment setAppointmentType(String appointmentType) {
			this.appointmentType = appointmentType;
			return this;
		}

		public DoctorAppointment setConsultationMode(String consultationMode) {
			this.consultationMode = consultationMode;
			return this;
		}

		public DoctorAppointment setConsultationFee(double consultationFee) {
			this.consultationFee = consultationFee;
			return this;
		}

		public DoctorAppointment setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public DoctorAppointment setAppointmentStatus(String appointmentStatus) {
			this.appointmentStatus = appointmentStatus;
			return this;
		}

		public DoctorAppointment setPrescriptionStatus(String prescriptionStatus) {
			this.prescriptionStatus = prescriptionStatus;
			return this;
		}
		
		//Getters

		public DoctorAppointment printPatientName() {
			System.out.println("Patient Name: " + patientName);
			return this;
		}

		public DoctorAppointment printDoctorName() {
			System.out.println("Doctor Name: " + doctorName);
			return this;
		}

		public DoctorAppointment printSpecialization() {
			System.out.println("Specialization: " + specialization);
			return this;
		}

		public DoctorAppointment printHospitalName() {
			System.out.println("Hospital Name: " + hospitalName);
			return this;
		}

		public DoctorAppointment printCity() {
			System.out.println("City: " + city);
			return this;
		}

		public DoctorAppointment printAppointmentId() {
			System.out.println("Appointment ID: " + appointmentId);
			return this;
		}

		public DoctorAppointment printAppointmentDate() {
			System.out.println("Appointment Date: " + appointmentDate);
			return this;
		}

		public DoctorAppointment printAppointmentTime() {
			System.out.println("Appointment Time: " + appointmentTime);
			return this;
		}

		public DoctorAppointment printAppointmentType() {
			System.out.println("Appointment Type: " + appointmentType);
			return this;
		}

		public DoctorAppointment printConsultationMode() {
			System.out.println("Consultation Mode: " + consultationMode);
			return this;
		}

		public DoctorAppointment printConsultationFee() {
			System.out.println("Consultation Fee: " + consultationFee);
			return this;
		}

		public DoctorAppointment printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public DoctorAppointment printAppointmentStatus() {
			System.out.println("Appointment Status: " + appointmentStatus);
			return this;
		}

		public DoctorAppointment printPrescriptionStatus() {
			System.out.println("Prescription Status: " + prescriptionStatus);
			return this;
		}
	

}
