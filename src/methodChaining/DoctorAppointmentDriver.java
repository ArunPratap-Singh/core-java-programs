package methodChaining;

public class DoctorAppointmentDriver {

	public static void main(String[] args) {

		DoctorAppointment d1 = new DoctorAppointment();
		DoctorAppointment d2 = new DoctorAppointment();
		DoctorAppointment d3 = new DoctorAppointment();
		DoctorAppointment d4 = new DoctorAppointment();
		DoctorAppointment d5 = new DoctorAppointment();
		DoctorAppointment d6 = new DoctorAppointment();
		DoctorAppointment d7 = new DoctorAppointment();
		DoctorAppointment d8 = new DoctorAppointment();
		DoctorAppointment d9 = new DoctorAppointment();
		DoctorAppointment d10 = new DoctorAppointment();
		DoctorAppointment d11 = new DoctorAppointment();
		DoctorAppointment d12 = new DoctorAppointment();
		DoctorAppointment d13 = new DoctorAppointment();
		DoctorAppointment d14 = new DoctorAppointment();
		DoctorAppointment d15 = new DoctorAppointment();
		DoctorAppointment d16 = new DoctorAppointment();
		DoctorAppointment d17 = new DoctorAppointment();
		DoctorAppointment d18 = new DoctorAppointment();
		DoctorAppointment d19 = new DoctorAppointment();
		DoctorAppointment d20 = new DoctorAppointment();

		d1.setPatientName("Arun").setDoctorName("Dr. Rajesh Sharma").setSpecialization("Cardiologist").setHospitalName("Apollo Hospital").setCity("Lucknow").setAppointmentId("APT10001").setAppointmentDate("15-09-2026").setAppointmentTime("10:30 AM").setAppointmentType("First Consultation").setConsultationMode("In-Person").setConsultationFee(1200.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d2.setPatientName("Rahul").setDoctorName("Dr. Priya Verma").setSpecialization("Dermatologist").setHospitalName("Max Hospital").setCity("Delhi").setAppointmentId("APT10002").setAppointmentDate("16-09-2026").setAppointmentTime("11:00 AM").setAppointmentType("Follow-up").setConsultationMode("In-Person").setConsultationFee(1000.00).setPaymentMode("Credit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d3.setPatientName("Amit").setDoctorName("Dr. Neha Gupta").setSpecialization("Neurologist").setHospitalName("Fortis Hospital").setCity("Noida").setAppointmentId("APT10003").setAppointmentDate("17-09-2026").setAppointmentTime("02:30 PM").setAppointmentType("First Consultation").setConsultationMode("Video Consultation").setConsultationFee(1500.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d4.setPatientName("Vikas").setDoctorName("Dr. Anil Kumar").setSpecialization("Orthopedic").setHospitalName("Medanta Hospital").setCity("Gurugram").setAppointmentId("APT10004").setAppointmentDate("18-09-2026").setAppointmentTime("09:30 AM").setAppointmentType("Follow-up").setConsultationMode("In-Person").setConsultationFee(1300.00).setPaymentMode("Debit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d5.setPatientName("Suresh").setDoctorName("Dr. Meera Singh").setSpecialization("Pediatrician").setHospitalName("KGMU Hospital").setCity("Lucknow").setAppointmentId("APT10005").setAppointmentDate("19-09-2026").setAppointmentTime("12:00 PM").setAppointmentType("Child Consultation").setConsultationMode("In-Person").setConsultationFee(900.00).setPaymentMode("Cash").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d6.setPatientName("Rohit").setDoctorName("Dr. Kavita Mishra").setSpecialization("Gynecologist").setHospitalName("Rainbow Hospital").setCity("Kanpur").setAppointmentId("APT10006").setAppointmentDate("20-09-2026").setAppointmentTime("04:00 PM").setAppointmentType("First Consultation").setConsultationMode("Video Consultation").setConsultationFee(1100.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d7.setPatientName("Aakash").setDoctorName("Dr. Sanjay Malhotra").setSpecialization("ENT Specialist").setHospitalName("Apollo Hospital").setCity("Delhi").setAppointmentId("APT10007").setAppointmentDate("21-09-2026").setAppointmentTime("10:00 AM").setAppointmentType("First Consultation").setConsultationMode("In-Person").setConsultationFee(1000.00).setPaymentMode("Credit Card").setAppointmentStatus("Pending").setPrescriptionStatus("Pending");
		d8.setPatientName("Manish").setDoctorName("Dr. Pooja Agarwal").setSpecialization("Dentist").setHospitalName("Clove Dental").setCity("Lucknow").setAppointmentId("APT10008").setAppointmentDate("22-09-2026").setAppointmentTime("05:30 PM").setAppointmentType("Dental Checkup").setConsultationMode("In-Person").setConsultationFee(800.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d9.setPatientName("Karan").setDoctorName("Dr. Vivek Joshi").setSpecialization("General Physician").setHospitalName("Fortis Hospital").setCity("Noida").setAppointmentId("APT10009").setAppointmentDate("23-09-2026").setAppointmentTime("08:30 AM").setAppointmentType("General Checkup").setConsultationMode("Video Consultation").setConsultationFee(700.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d10.setPatientName("Nitin").setDoctorName("Dr. Rakesh Tiwari").setSpecialization("Gastroenterologist").setHospitalName("Medanta Hospital").setCity("Gurugram").setAppointmentId("APT10010").setAppointmentDate("24-09-2026").setAppointmentTime("01:00 PM").setAppointmentType("First Consultation").setConsultationMode("In-Person").setConsultationFee(1600.00).setPaymentMode("Debit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d11.setPatientName("Vivek").setDoctorName("Dr. Shalini Kapoor").setSpecialization("Ophthalmologist").setHospitalName("Eye Care Centre").setCity("Delhi").setAppointmentId("APT10011").setAppointmentDate("25-09-2026").setAppointmentTime("11:30 AM").setAppointmentType("Eye Checkup").setConsultationMode("In-Person").setConsultationFee(900.00).setPaymentMode("Cash").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d12.setPatientName("Deepak").setDoctorName("Dr. Mohit Saxena").setSpecialization("Urologist").setHospitalName("Apollo Hospital").setCity("Lucknow").setAppointmentId("APT10012").setAppointmentDate("26-09-2026").setAppointmentTime("03:00 PM").setAppointmentType("Follow-up").setConsultationMode("Video Consultation").setConsultationFee(1400.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d13.setPatientName("Ravi").setDoctorName("Dr. Sunita Yadav").setSpecialization("Endocrinologist").setHospitalName("Max Hospital").setCity("Delhi").setAppointmentId("APT10013").setAppointmentDate("27-09-2026").setAppointmentTime("09:00 AM").setAppointmentType("First Consultation").setConsultationMode("In-Person").setConsultationFee(1500.00).setPaymentMode("Credit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d14.setPatientName("Pankaj").setDoctorName("Dr. Amit Srivastava").setSpecialization("Pulmonologist").setHospitalName("KGMU Hospital").setCity("Lucknow").setAppointmentId("APT10014").setAppointmentDate("28-09-2026").setAppointmentTime("02:00 PM").setAppointmentType("Follow-up").setConsultationMode("In-Person").setConsultationFee(1200.00).setPaymentMode("UPI").setAppointmentStatus("Pending").setPrescriptionStatus("Pending");
		d15.setPatientName("Sameer").setDoctorName("Dr. Ritu Chawla").setSpecialization("Psychiatrist").setHospitalName("Fortis Hospital").setCity("Noida").setAppointmentId("APT10015").setAppointmentDate("29-09-2026").setAppointmentTime("04:30 PM").setAppointmentType("First Consultation").setConsultationMode("Video Consultation").setConsultationFee(1800.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d16.setPatientName("Ankit").setDoctorName("Dr. Rajiv Bansal").setSpecialization("Cardiologist").setHospitalName("Medanta Hospital").setCity("Gurugram").setAppointmentId("APT10016").setAppointmentDate("30-09-2026").setAppointmentTime("10:30 AM").setAppointmentType("Follow-up").setConsultationMode("In-Person").setConsultationFee(1400.00).setPaymentMode("Debit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d17.setPatientName("Sumit").setDoctorName("Dr. Nisha Patel").setSpecialization("Dermatologist").setHospitalName("Apollo Hospital").setCity("Kanpur").setAppointmentId("APT10017").setAppointmentDate("01-10-2026").setAppointmentTime("12:30 PM").setAppointmentType("Skin Consultation").setConsultationMode("Video Consultation").setConsultationFee(1000.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d18.setPatientName("Ramesh").setDoctorName("Dr. Ajay Tripathi").setSpecialization("Orthopedic").setHospitalName("KGMU Hospital").setCity("Lucknow").setAppointmentId("APT10018").setAppointmentDate("02-10-2026").setAppointmentTime("09:30 AM").setAppointmentType("Follow-up").setConsultationMode("In-Person").setConsultationFee(1250.00).setPaymentMode("Cash").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		d19.setPatientName("Varun").setDoctorName("Dr. Seema Arora").setSpecialization("Gynecologist").setHospitalName("Max Hospital").setCity("Delhi").setAppointmentId("APT10019").setAppointmentDate("03-10-2026").setAppointmentTime("03:30 PM").setAppointmentType("First Consultation").setConsultationMode("In-Person").setConsultationFee(1300.00).setPaymentMode("Credit Card").setAppointmentStatus("Confirmed").setPrescriptionStatus("Issued");
		d20.setPatientName("Raj").setDoctorName("Dr. Ashok Verma").setSpecialization("General Physician").setHospitalName("Apollo Hospital").setCity("Lucknow").setAppointmentId("APT10020").setAppointmentDate("04-10-2026").setAppointmentTime("11:00 AM").setAppointmentType("General Checkup").setConsultationMode("Video Consultation").setConsultationFee(750.00).setPaymentMode("UPI").setAppointmentStatus("Confirmed").setPrescriptionStatus("Pending");
		
		d1.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d2.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d3.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d4.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d5.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d6.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d7.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d8.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d9.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d10.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d11.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d12.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d13.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d14.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d15.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d16.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d17.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d18.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d19.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");

		d20.printPatientName().printDoctorName().printSpecialization().printHospitalName().printCity().printAppointmentId().printAppointmentDate().printAppointmentTime().printAppointmentType().printConsultationMode().printConsultationFee().printPaymentMode().printAppointmentStatus().printPrescriptionStatus();
		System.out.println("==================================================");
	}

}
