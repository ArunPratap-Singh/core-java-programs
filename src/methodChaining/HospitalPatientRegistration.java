package methodChaining;

public class HospitalPatientRegistration {
	
		private String patientName;
		private int age;
		private String gender;
		private String patientId;
		private String bloodGroup;
		private String phoneNumber;
		private String address;
		private String doctorName;
		private String department;
		private String hospitalName;
		private String admissionDate;
		private String admissionTime;
		private String roomType;
		private String roomNumber;
		private String registrationType;
		private double registrationFee;
		private String paymentMode;
		private String insuranceProvider;
		private String emergencyContact;
		private String registrationStatus;

		// Setter Methods

		public HospitalPatientRegistration setPatientName(String patientName) {
			this.patientName = patientName;
			return this;
		}

		public HospitalPatientRegistration setAge(int age) {
			this.age = age;
			return this;
		}

		public HospitalPatientRegistration setGender(String gender) {
			this.gender = gender;
			return this;
		}

		public HospitalPatientRegistration setPatientId(String patientId) {
			this.patientId = patientId;
			return this;
		}

		public HospitalPatientRegistration setBloodGroup(String bloodGroup) {
			this.bloodGroup = bloodGroup;
			return this;
		}

		public HospitalPatientRegistration setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public HospitalPatientRegistration setAddress(String address) {
			this.address = address;
			return this;
		}

		public HospitalPatientRegistration setDoctorName(String doctorName) {
			this.doctorName = doctorName;
			return this;
		}

		public HospitalPatientRegistration setDepartment(String department) {
			this.department = department;
			return this;
		}

		public HospitalPatientRegistration setHospitalName(String hospitalName) {
			this.hospitalName = hospitalName;
			return this;
		}

		public HospitalPatientRegistration setAdmissionDate(String admissionDate) {
			this.admissionDate = admissionDate;
			return this;
		}

		public HospitalPatientRegistration setAdmissionTime(String admissionTime) {
			this.admissionTime = admissionTime;
			return this;
		}

		public HospitalPatientRegistration setRoomType(String roomType) {
			this.roomType = roomType;
			return this;
		}

		public HospitalPatientRegistration setRoomNumber(String roomNumber) {
			this.roomNumber = roomNumber;
			return this;
		}

		public HospitalPatientRegistration setRegistrationType(String registrationType) {
			this.registrationType = registrationType;
			return this;
		}

		public HospitalPatientRegistration setRegistrationFee(double registrationFee) {
			this.registrationFee = registrationFee;
			return this;
		}

		public HospitalPatientRegistration setPaymentMode(String paymentMode) {
			this.paymentMode = paymentMode;
			return this;
		}

		public HospitalPatientRegistration setInsuranceProvider(String insuranceProvider) {
			this.insuranceProvider = insuranceProvider;
			return this;
		}

		public HospitalPatientRegistration setEmergencyContact(String emergencyContact) {
			this.emergencyContact = emergencyContact;
			return this;
		}

		public HospitalPatientRegistration setRegistrationStatus(String registrationStatus) {
			this.registrationStatus = registrationStatus;
			return this;
		}

		// Print Methods

		public HospitalPatientRegistration printPatientName() {
			System.out.println("Patient Name: " + patientName);
			return this;
		}

		public HospitalPatientRegistration printAge() {
			System.out.println("Age: " + age);
			return this;
		}

		public HospitalPatientRegistration printGender() {
			System.out.println("Gender: " + gender);
			return this;
		}

		public HospitalPatientRegistration printPatientId() {
			System.out.println("Patient ID: " + patientId);
			return this;
		}

		public HospitalPatientRegistration printBloodGroup() {
			System.out.println("Blood Group: " + bloodGroup);
			return this;
		}

		public HospitalPatientRegistration printPhoneNumber() {
			System.out.println("Phone Number: " + phoneNumber);
			return this;
		}

		public HospitalPatientRegistration printAddress() {
			System.out.println("Address: " + address);
			return this;
		}

		public HospitalPatientRegistration printDoctorName() {
			System.out.println("Doctor Name: " + doctorName);
			return this;
		}

		public HospitalPatientRegistration printDepartment() {
			System.out.println("Department: " + department);
			return this;
		}

		public HospitalPatientRegistration printHospitalName() {
			System.out.println("Hospital Name: " + hospitalName);
			return this;
		}

		public HospitalPatientRegistration printAdmissionDate() {
			System.out.println("Admission Date: " + admissionDate);
			return this;
		}

		public HospitalPatientRegistration printAdmissionTime() {
			System.out.println("Admission Time: " + admissionTime);
			return this;
		}

		public HospitalPatientRegistration printRoomType() {
			System.out.println("Room Type: " + roomType);
			return this;
		}

		public HospitalPatientRegistration printRoomNumber() {
			System.out.println("Room Number: " + roomNumber);
			return this;
		}

		public HospitalPatientRegistration printRegistrationType() {
			System.out.println("Registration Type: " + registrationType);
			return this;
		}

		public HospitalPatientRegistration printRegistrationFee() {
			System.out.println("Registration Fee: " + registrationFee);
			return this;
		}

		public HospitalPatientRegistration printPaymentMode() {
			System.out.println("Payment Mode: " + paymentMode);
			return this;
		}

		public HospitalPatientRegistration printInsuranceProvider() {
			System.out.println("Insurance Provider: " + insuranceProvider);
			return this;
		}

		public HospitalPatientRegistration printEmergencyContact() {
			System.out.println("Emergency Contact: " + emergencyContact);
			return this;
		}

		public HospitalPatientRegistration printRegistrationStatus() {
			System.out.println("Registration Status: " + registrationStatus);
			return this;
		}
	

}
