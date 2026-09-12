package methodChaining;

public class HospitalPatientRegistrationDriver {

	public static void main(String[] args) {

		HospitalPatientRegistration h1 = new HospitalPatientRegistration();
		HospitalPatientRegistration h2 = new HospitalPatientRegistration();
		HospitalPatientRegistration h3 = new HospitalPatientRegistration();
		HospitalPatientRegistration h4 = new HospitalPatientRegistration();
		HospitalPatientRegistration h5 = new HospitalPatientRegistration();
		HospitalPatientRegistration h6 = new HospitalPatientRegistration();
		HospitalPatientRegistration h7 = new HospitalPatientRegistration();
		HospitalPatientRegistration h8 = new HospitalPatientRegistration();
		HospitalPatientRegistration h9 = new HospitalPatientRegistration();
		HospitalPatientRegistration h10 = new HospitalPatientRegistration();
		HospitalPatientRegistration h11 = new HospitalPatientRegistration();
		HospitalPatientRegistration h12 = new HospitalPatientRegistration();
		HospitalPatientRegistration h13 = new HospitalPatientRegistration();
		HospitalPatientRegistration h14 = new HospitalPatientRegistration();
		HospitalPatientRegistration h15 = new HospitalPatientRegistration();
		HospitalPatientRegistration h16 = new HospitalPatientRegistration();
		HospitalPatientRegistration h17 = new HospitalPatientRegistration();
		HospitalPatientRegistration h18 = new HospitalPatientRegistration();
		HospitalPatientRegistration h19 = new HospitalPatientRegistration();
		HospitalPatientRegistration h20 = new HospitalPatientRegistration();

		h1.setPatientName("Arunendra Singh").setAge(32).setGender("Male").setPatientId("PAT10001").setBloodGroup("B+").setPhoneNumber("9876543210").setAddress("Lucknow, Uttar Pradesh").setDoctorName("Dr. Rajesh Sharma").setDepartment("Cardiology").setHospitalName("Apollo Hospital").setAdmissionDate("13-09-2026").setAdmissionTime("10:30 AM").setRoomType("Private Room").setRoomNumber("P-205").setRegistrationType("In-Patient").setRegistrationFee(2500.00).setPaymentMode("UPI").setInsuranceProvider("Star Health Insurance").setEmergencyContact("9876501234").setRegistrationStatus("Registered");
		h2.setPatientName("Rahul Verma").setAge(45).setGender("Male").setPatientId("PAT10002").setBloodGroup("A+").setPhoneNumber("9876543211").setAddress("Delhi, India").setDoctorName("Dr. Priya Gupta").setDepartment("Neurology").setHospitalName("Max Hospital").setAdmissionDate("14-09-2026").setAdmissionTime("11:00 AM").setRoomType("Semi-Private").setRoomNumber("SP-112").setRegistrationType("In-Patient").setRegistrationFee(2200.00).setPaymentMode("Credit Card").setInsuranceProvider("HDFC Ergo").setEmergencyContact("9876501235").setRegistrationStatus("Registered");
		h3.setPatientName("Amit Kumar").setAge(38).setGender("Male").setPatientId("PAT10003").setBloodGroup("O+").setPhoneNumber("9876543212").setAddress("Noida, Uttar Pradesh").setDoctorName("Dr. Neha Singh").setDepartment("Orthopedics").setHospitalName("Fortis Hospital").setAdmissionDate("15-09-2026").setAdmissionTime("09:30 AM").setRoomType("Private Room").setRoomNumber("P-310").setRegistrationType("In-Patient").setRegistrationFee(2800.00).setPaymentMode("UPI").setInsuranceProvider("ICICI Lombard").setEmergencyContact("9876501236").setRegistrationStatus("Registered");
		h4.setPatientName("Vikas Sharma").setAge(52).setGender("Male").setPatientId("PAT10004").setBloodGroup("B-").setPhoneNumber("9876543213").setAddress("Gurugram, Haryana").setDoctorName("Dr. Anil Mehta").setDepartment("Gastroenterology").setHospitalName("Medanta Hospital").setAdmissionDate("16-09-2026").setAdmissionTime("02:00 PM").setRoomType("Deluxe Room").setRoomNumber("D-405").setRegistrationType("In-Patient").setRegistrationFee(3500.00).setPaymentMode("Debit Card").setInsuranceProvider("Care Health Insurance").setEmergencyContact("9876501237").setRegistrationStatus("Registered");
		h5.setPatientName("Suresh Yadav").setAge(29).setGender("Male").setPatientId("PAT10005").setBloodGroup("AB+").setPhoneNumber("9876543214").setAddress("Kanpur, Uttar Pradesh").setDoctorName("Dr. Meera Singh").setDepartment("General Medicine").setHospitalName("KGMU Hospital").setAdmissionDate("17-09-2026").setAdmissionTime("08:30 AM").setRoomType("General Ward").setRoomNumber("GW-120").setRegistrationType("In-Patient").setRegistrationFee(1500.00).setPaymentMode("Cash").setInsuranceProvider("Star Health Insurance").setEmergencyContact("9876501238").setRegistrationStatus("Registered");
		h6.setPatientName("Rohit Agarwal").setAge(41).setGender("Male").setPatientId("PAT10006").setBloodGroup("A-").setPhoneNumber("9876543215").setAddress("Lucknow, Uttar Pradesh").setDoctorName("Dr. Kavita Mishra").setDepartment("Cardiology").setHospitalName("Apollo Hospital").setAdmissionDate("18-09-2026").setAdmissionTime("12:30 PM").setRoomType("Private Room").setRoomNumber("P-208").setRegistrationType("In-Patient").setRegistrationFee(2700.00).setPaymentMode("UPI").setInsuranceProvider("Bajaj Allianz").setEmergencyContact("9876501239").setRegistrationStatus("Registered");
		h7.setPatientName("Aakash Verma").setAge(35).setGender("Male").setPatientId("PAT10007").setBloodGroup("O-").setPhoneNumber("9876543216").setAddress("Delhi, India").setDoctorName("Dr. Sanjay Kapoor").setDepartment("ENT").setHospitalName("Max Hospital").setAdmissionDate("19-09-2026").setAdmissionTime("10:00 AM").setRoomType("Semi-Private").setRoomNumber("SP-215").setRegistrationType("In-Patient").setRegistrationFee(2000.00).setPaymentMode("Credit Card").setInsuranceProvider("Niva Bupa").setEmergencyContact("9876501240").setRegistrationStatus("Registered");
		h8.setPatientName("Manish Gupta").setAge(47).setGender("Male").setPatientId("PAT10008").setBloodGroup("B+").setPhoneNumber("9876543217").setAddress("Jaipur, Rajasthan").setDoctorName("Dr. Pooja Sharma").setDepartment("Dermatology").setHospitalName("Fortis Hospital").setAdmissionDate("20-09-2026").setAdmissionTime("03:30 PM").setRoomType("Private Room").setRoomNumber("P-318").setRegistrationType("In-Patient").setRegistrationFee(2400.00).setPaymentMode("UPI").setInsuranceProvider("HDFC Ergo").setEmergencyContact("9876501241").setRegistrationStatus("Registered");
		h9.setPatientName("Karan Singh").setAge(31).setGender("Male").setPatientId("PAT10009").setBloodGroup("A+").setPhoneNumber("9876543218").setAddress("Agra, Uttar Pradesh").setDoctorName("Dr. Vivek Joshi").setDepartment("Pulmonology").setHospitalName("Apollo Hospital").setAdmissionDate("21-09-2026").setAdmissionTime("09:00 AM").setRoomType("General Ward").setRoomNumber("GW-135").setRegistrationType("In-Patient").setRegistrationFee(1600.00).setPaymentMode("Debit Card").setInsuranceProvider("ICICI Lombard").setEmergencyContact("9876501242").setRegistrationStatus("Registered");
		h10.setPatientName("Nitin Srivastava").setAge(56).setGender("Male").setPatientId("PAT10010").setBloodGroup("O+").setPhoneNumber("9876543219").setAddress("Prayagraj, Uttar Pradesh").setDoctorName("Dr. Rakesh Tiwari").setDepartment("Urology").setHospitalName("Medanta Hospital").setAdmissionDate("22-09-2026").setAdmissionTime("01:30 PM").setRoomType("Deluxe Room").setRoomNumber("D-420").setRegistrationType("In-Patient").setRegistrationFee(3200.00).setPaymentMode("UPI").setInsuranceProvider("Care Health Insurance").setEmergencyContact("9876501243").setRegistrationStatus("Registered");
		h11.setPatientName("Vivek Mishra").setAge(43).setGender("Male").setPatientId("PAT10011").setBloodGroup("AB-").setPhoneNumber("9876543220").setAddress("Varanasi, Uttar Pradesh").setDoctorName("Dr. Shalini Verma").setDepartment("Ophthalmology").setHospitalName("Eye Care Centre").setAdmissionDate("23-09-2026").setAdmissionTime("11:30 AM").setRoomType("Private Room").setRoomNumber("P-225").setRegistrationType("In-Patient").setRegistrationFee(2300.00).setPaymentMode("Credit Card").setInsuranceProvider("Star Health Insurance").setEmergencyContact("9876501244").setRegistrationStatus("Registered");
		h12.setPatientName("Deepak Kumar").setAge(37).setGender("Male").setPatientId("PAT10012").setBloodGroup("B+").setPhoneNumber("9876543221").setAddress("Meerut, Uttar Pradesh").setDoctorName("Dr. Mohit Saxena").setDepartment("Nephrology").setHospitalName("Max Hospital").setAdmissionDate("24-09-2026").setAdmissionTime("04:00 PM").setRoomType("Semi-Private").setRoomNumber("SP-225").setRegistrationType("In-Patient").setRegistrationFee(2600.00).setPaymentMode("UPI").setInsuranceProvider("Niva Bupa").setEmergencyContact("9876501245").setRegistrationStatus("Registered");
		h13.setPatientName("Ravi Patel").setAge(48).setGender("Male").setPatientId("PAT10013").setBloodGroup("A+").setPhoneNumber("9876543222").setAddress("Ahmedabad, Gujarat").setDoctorName("Dr. Sunita Patel").setDepartment("Endocrinology").setHospitalName("Apollo Hospital").setAdmissionDate("25-09-2026").setAdmissionTime("10:30 AM").setRoomType("Private Room").setRoomNumber("P-230").setRegistrationType("In-Patient").setRegistrationFee(2900.00).setPaymentMode("Debit Card").setInsuranceProvider("Bajaj Allianz").setEmergencyContact("9876501246").setRegistrationStatus("Registered");
		h14.setPatientName("Pankaj Tiwari").setAge(50).setGender("Male").setPatientId("PAT10014").setBloodGroup("O+").setPhoneNumber("9876543223").setAddress("Kanpur, Uttar Pradesh").setDoctorName("Dr. Amit Srivastava").setDepartment("Pulmonology").setHospitalName("KGMU Hospital").setAdmissionDate("26-09-2026").setAdmissionTime("02:30 PM").setRoomType("General Ward").setRoomNumber("GW-145").setRegistrationType("In-Patient").setRegistrationFee(1700.00).setPaymentMode("Cash").setInsuranceProvider("ICICI Lombard").setEmergencyContact("9876501247").setRegistrationStatus("Registered");
		h15.setPatientName("Sameer Khan").setAge(34).setGender("Male").setPatientId("PAT10015").setBloodGroup("B-").setPhoneNumber("9876543224").setAddress("Bhopal, Madhya Pradesh").setDoctorName("Dr. Ritu Chawla").setDepartment("Psychiatry").setHospitalName("Fortis Hospital").setAdmissionDate("27-09-2026").setAdmissionTime("05:00 PM").setRoomType("Private Room").setRoomNumber("P-240").setRegistrationType("In-Patient").setRegistrationFee(3000.00).setPaymentMode("UPI").setInsuranceProvider("Care Health Insurance").setEmergencyContact("9876501248").setRegistrationStatus("Registered");
		h16.setPatientName("Ankit Raj").setAge(27).setGender("Male").setPatientId("PAT10016").setBloodGroup("A-").setPhoneNumber("9876543225").setAddress("Patna, Bihar").setDoctorName("Dr. Rajiv Bansal").setDepartment("General Surgery").setHospitalName("Medanta Hospital").setAdmissionDate("28-09-2026").setAdmissionTime("09:30 AM").setRoomType("Semi-Private").setRoomNumber("SP-240").setRegistrationType("In-Patient").setRegistrationFee(2100.00).setPaymentMode("Credit Card").setInsuranceProvider("HDFC Ergo").setEmergencyContact("9876501249").setRegistrationStatus("Registered");
		h17.setPatientName("Sumit Sharma").setAge(40).setGender("Male").setPatientId("PAT10017").setBloodGroup("O-").setPhoneNumber("9876543226").setAddress("Ghaziabad, Uttar Pradesh").setDoctorName("Dr. Nisha Patel").setDepartment("Dermatology").setHospitalName("Apollo Hospital").setAdmissionDate("29-09-2026").setAdmissionTime("11:00 AM").setRoomType("Private Room").setRoomNumber("P-250").setRegistrationType("In-Patient").setRegistrationFee(2500.00).setPaymentMode("UPI").setInsuranceProvider("Star Health Insurance").setEmergencyContact("9876501250").setRegistrationStatus("Registered");
		h18.setPatientName("Ramesh Yadav").setAge(59).setGender("Male").setPatientId("PAT10018").setBloodGroup("B+").setPhoneNumber("9876543227").setAddress("Ayodhya, Uttar Pradesh").setDoctorName("Dr. Ajay Tripathi").setDepartment("Orthopedics").setHospitalName("KGMU Hospital").setAdmissionDate("30-09-2026").setAdmissionTime("08:00 AM").setRoomType("Deluxe Room").setRoomNumber("D-450").setRegistrationType("In-Patient").setRegistrationFee(3400.00).setPaymentMode("Debit Card").setInsuranceProvider("Niva Bupa").setEmergencyContact("9876501251").setRegistrationStatus("Registered");
		h19.setPatientName("Varun Kapoor").setAge(46).setGender("Male").setPatientId("PAT10019").setBloodGroup("AB+").setPhoneNumber("9876543228").setAddress("Chandigarh, India").setDoctorName("Dr. Seema Arora").setDepartment("Gynecology").setHospitalName("Max Hospital").setAdmissionDate("01-10-2026").setAdmissionTime("01:00 PM").setRoomType("Private Room").setRoomNumber("P-260").setRegistrationType("In-Patient").setRegistrationFee(2800.00).setPaymentMode("UPI").setInsuranceProvider("ICICI Lombard").setEmergencyContact("9876501252").setRegistrationStatus("Registered");
		h20.setPatientName("Rajesh Kumar").setAge(62).setGender("Male").setPatientId("PAT10020").setBloodGroup("A+").setPhoneNumber("9876543229").setAddress("Gorakhpur, Uttar Pradesh").setDoctorName("Dr. Ashok Verma").setDepartment("Cardiology").setHospitalName("Apollo Hospital").setAdmissionDate("02-10-2026").setAdmissionTime("10:00 AM").setRoomType("Deluxe Room").setRoomNumber("D-470").setRegistrationType("In-Patient").setRegistrationFee(3600.00).setPaymentMode("Credit Card").setInsuranceProvider("Star Health Insurance").setEmergencyContact("9876501253").setRegistrationStatus("Registered");
		
		System.out.println("==================== Hospital Patient Registration ====================");

		h1.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");
		
		h2.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h3.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h4.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h5.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h6.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h7.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h8.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h9.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h10.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h11.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h12.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h13.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h14.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h15.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h16.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h17.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h18.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h19.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

		h20.printPatientName().printAge().printGender().printPatientId().printBloodGroup().printPhoneNumber().printAddress().printDoctorName().printDepartment().printHospitalName().printAdmissionDate().printAdmissionTime().printRoomType().printRoomNumber().printRegistrationType().printRegistrationFee().printPaymentMode().printInsuranceProvider().printEmergencyContact().printRegistrationStatus();
		System.out.println("===============================");

	}

}
