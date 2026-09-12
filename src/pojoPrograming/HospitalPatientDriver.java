package pojoPrograming;

public class HospitalPatientDriver {

	public static void main(String[] args) {
		
		System.out.println("==================================Main Method Starts======================================");

		HospitalPatient p1 = new HospitalPatient(101, "Rahul Sharma", 28, "Male", "Viral Fever", "Dr. Amit Sharma", "General Medicine", "City Care Hospital", "B+", "31-08-2026", "Not Discharged", "A-101", "9876543210", "Lucknow, Uttar Pradesh", "Medication and Rest", "Medicine as prescribed", 500.0, 8500.0, "Under Treatment", "9876501234");
		HospitalPatient p2 = new HospitalPatient(102, "Priya Verma", 32, "Female", "Migraine", "Dr. Neha Gupta", "Neurology", "Sunrise Hospital", "A+", "30-08-2026", "Not Discharged", "B-202", "9876543211", "Delhi, India", "Observation and prescribed treatment", "Medicine as prescribed", 700.0, 12000.0, "Under Treatment", "9876501235");
		HospitalPatient p3 = new HospitalPatient(103, "Amit Kumar", 45, "Male", "Diabetes", "Dr. Rajesh Singh", "Endocrinology", "Metro Hospital", "O+", "29-08-2026", "Not Discharged", "C-303", "9876543212", "Kanpur, Uttar Pradesh", "Blood sugar management", "Medicine as prescribed", 800.0, 15000.0, "Under Treatment", "9876501236");
		HospitalPatient p4 = new HospitalPatient(104, "Sneha Patel", 26, "Female", "Asthma", "Dr. Vikram Mehta", "Pulmonology", "Green Valley Hospital", "AB+", "28-08-2026", "Not Discharged", "D-104", "9876543213", "Mumbai, Maharashtra", "Respiratory treatment", "Medicine as prescribed", 650.0, 11000.0, "Stable", "9876501237");
		HospitalPatient p5 = new HospitalPatient(105, "Rohan Singh", 38, "Male", "High Blood Pressure", "Dr. Anjali Verma", "Cardiology", "Life Care Hospital", "B-", "27-08-2026", "Not Discharged", "E-205", "9876543214", "Jaipur, Rajasthan", "Blood pressure monitoring", "Medicine as prescribed", 900.0, 18000.0, "Under Observation", "9876501238");
		HospitalPatient p6 = new HospitalPatient(106, "Kavita Sharma", 52, "Female", "Arthritis", "Dr. Suresh Kumar", "Orthopedics", "Apollo Care Hospital", "O-", "26-08-2026", "Not Discharged", "F-306", "9876543215", "Lucknow, Uttar Pradesh", "Physiotherapy and medication", "Medicine as prescribed", 750.0, 14000.0, "Improving", "9876501239");
		HospitalPatient p7 = new HospitalPatient(107, "Vikas Mishra", 34, "Male", "Food Poisoning", "Dr. Pankaj Gupta", "Gastroenterology", "Wellness Hospital", "A-", "25-08-2026", "27-08-2026", "G-107", "9876543216", "Prayagraj, Uttar Pradesh", "Hydration and medication", "Medicine as prescribed", 600.0, 9500.0, "Recovered", "9876501240");
		HospitalPatient p8 = new HospitalPatient(108, "Anjali Gupta", 41, "Female", "Thyroid Disorder", "Dr. Meera Singh", "Endocrinology", "Health First Hospital", "AB-", "24-08-2026", "Not Discharged", "H-208", "9876543217", "Noida, Uttar Pradesh", "Hormone management", "Medicine as prescribed", 850.0, 16000.0, "Under Treatment", "9876501241");
		HospitalPatient p9 = new HospitalPatient(109, "Sandeep Yadav", 29, "Male", "Dengue Fever", "Dr. Ravi Sharma", "General Medicine", "Care Plus Hospital", "O+", "23-08-2026", "Not Discharged", "I-309", "9876543218", "Varanasi, Uttar Pradesh", "Monitoring and supportive treatment", "Medicine as prescribed", 700.0, 22000.0, "Stable", "9876501242");
		HospitalPatient p10 = new HospitalPatient(110, "Pooja Singh", 36, "Female", "Skin Allergy", "Dr. Ritu Kapoor", "Dermatology", "Healthy Life Hospital", "B+", "22-08-2026", "25-08-2026", "J-110", "9876543219", "Agra, Uttar Pradesh", "Allergy management", "Medicine as prescribed", 550.0, 7500.0, "Recovered", "9876501243");
		
		        
        System.out.println("================ Patient Details 1 ================");

        System.out.println("Patient ID: " + p1.getPatientId());
        System.out.println("Patient Name: " + p1.getPatientName());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Gender: " + p1.getGender());
        System.out.println("Disease: " + p1.getDisease());
        System.out.println("Doctor Name: " + p1.getDoctorName());
        System.out.println("Department: " + p1.getDepartment());
        System.out.println("Hospital Name: " + p1.getHospitalName());
        System.out.println("Blood Group: " + p1.getBloodGroup());
        System.out.println("Admission Date: " + p1.getAdmissionDate());
        System.out.println("Discharge Date: " + p1.getDischargeDate());
        System.out.println("Room Number: " + p1.getRoomNumber());
        System.out.println("Phone Number: " + p1.getPhoneNumber());
        System.out.println("Address: " + p1.getAddress());
        System.out.println("Treatment: " + p1.getTreatment());
        System.out.println("Medicine: " + p1.getMedicine());
        System.out.println("Consultation Fee: " + p1.getConsultationFee());
        System.out.println("Total Bill: " + p1.getTotalBill());
        System.out.println("Patient Status: " + p1.getPatientStatus());
        System.out.println("Emergency Contact: " + p1.getEmergencyContact());


        System.out.println("================ Patient Details 2 ================");

        System.out.println("Patient ID: " + p2.getPatientId());
        System.out.println("Patient Name: " + p2.getPatientName());
        System.out.println("Age: " + p2.getAge());
        System.out.println("Gender: " + p2.getGender());
        System.out.println("Disease: " + p2.getDisease());
        System.out.println("Doctor Name: " + p2.getDoctorName());
        System.out.println("Department: " + p2.getDepartment());
        System.out.println("Hospital Name: " + p2.getHospitalName());
        System.out.println("Blood Group: " + p2.getBloodGroup());
        System.out.println("Admission Date: " + p2.getAdmissionDate());
        System.out.println("Discharge Date: " + p2.getDischargeDate());
        System.out.println("Room Number: " + p2.getRoomNumber());
        System.out.println("Phone Number: " + p2.getPhoneNumber());
        System.out.println("Address: " + p2.getAddress());
        System.out.println("Treatment: " + p2.getTreatment());
        System.out.println("Medicine: " + p2.getMedicine());
        System.out.println("Consultation Fee: " + p2.getConsultationFee());
        System.out.println("Total Bill: " + p2.getTotalBill());
        System.out.println("Patient Status: " + p2.getPatientStatus());
        System.out.println("Emergency Contact: " + p2.getEmergencyContact());


        System.out.println("================ Patient Details 3 ================");

        System.out.println("Patient ID: " + p3.getPatientId());
        System.out.println("Patient Name: " + p3.getPatientName());
        System.out.println("Age: " + p3.getAge());
        System.out.println("Gender: " + p3.getGender());
        System.out.println("Disease: " + p3.getDisease());
        System.out.println("Doctor Name: " + p3.getDoctorName());
        System.out.println("Department: " + p3.getDepartment());
        System.out.println("Hospital Name: " + p3.getHospitalName());
        System.out.println("Blood Group: " + p3.getBloodGroup());
        System.out.println("Admission Date: " + p3.getAdmissionDate());
        System.out.println("Discharge Date: " + p3.getDischargeDate());
        System.out.println("Room Number: " + p3.getRoomNumber());
        System.out.println("Phone Number: " + p3.getPhoneNumber());
        System.out.println("Address: " + p3.getAddress());
        System.out.println("Treatment: " + p3.getTreatment());
        System.out.println("Medicine: " + p3.getMedicine());
        System.out.println("Consultation Fee: " + p3.getConsultationFee());
        System.out.println("Total Bill: " + p3.getTotalBill());
        System.out.println("Patient Status: " + p3.getPatientStatus());
        System.out.println("Emergency Contact: " + p3.getEmergencyContact());


        System.out.println("================ Patient Details 4 ================");

        System.out.println("Patient ID: " + p4.getPatientId());
        System.out.println("Patient Name: " + p4.getPatientName());
        System.out.println("Age: " + p4.getAge());
        System.out.println("Gender: " + p4.getGender());
        System.out.println("Disease: " + p4.getDisease());
        System.out.println("Doctor Name: " + p4.getDoctorName());
        System.out.println("Department: " + p4.getDepartment());
        System.out.println("Hospital Name: " + p4.getHospitalName());
        System.out.println("Blood Group: " + p4.getBloodGroup());
        System.out.println("Admission Date: " + p4.getAdmissionDate());
        System.out.println("Discharge Date: " + p4.getDischargeDate());
        System.out.println("Room Number: " + p4.getRoomNumber());
        System.out.println("Phone Number: " + p4.getPhoneNumber());
        System.out.println("Address: " + p4.getAddress());
        System.out.println("Treatment: " + p4.getTreatment());
        System.out.println("Medicine: " + p4.getMedicine());
        System.out.println("Consultation Fee: " + p4.getConsultationFee());
        System.out.println("Total Bill: " + p4.getTotalBill());
        System.out.println("Patient Status: " + p4.getPatientStatus());
        System.out.println("Emergency Contact: " + p4.getEmergencyContact());


        System.out.println("================ Patient Details 5 ================");

        System.out.println("Patient ID: " + p5.getPatientId());
        System.out.println("Patient Name: " + p5.getPatientName());
        System.out.println("Age: " + p5.getAge());
        System.out.println("Gender: " + p5.getGender());
        System.out.println("Disease: " + p5.getDisease());
        System.out.println("Doctor Name: " + p5.getDoctorName());
        System.out.println("Department: " + p5.getDepartment());
        System.out.println("Hospital Name: " + p5.getHospitalName());
        System.out.println("Blood Group: " + p5.getBloodGroup());
        System.out.println("Admission Date: " + p5.getAdmissionDate());
        System.out.println("Discharge Date: " + p5.getDischargeDate());
        System.out.println("Room Number: " + p5.getRoomNumber());
        System.out.println("Phone Number: " + p5.getPhoneNumber());
        System.out.println("Address: " + p5.getAddress());
        System.out.println("Treatment: " + p5.getTreatment());
        System.out.println("Medicine: " + p5.getMedicine());
        System.out.println("Consultation Fee: " + p5.getConsultationFee());
        System.out.println("Total Bill: " + p5.getTotalBill());
        System.out.println("Patient Status: " + p5.getPatientStatus());
        System.out.println("Emergency Contact: " + p5.getEmergencyContact());


        System.out.println("================ Patient Details 6 ================");

        System.out.println("Patient ID: " + p6.getPatientId());
        System.out.println("Patient Name: " + p6.getPatientName());
        System.out.println("Age: " + p6.getAge());
        System.out.println("Gender: " + p6.getGender());
        System.out.println("Disease: " + p6.getDisease());
        System.out.println("Doctor Name: " + p6.getDoctorName());
        System.out.println("Department: " + p6.getDepartment());
        System.out.println("Hospital Name: " + p6.getHospitalName());
        System.out.println("Blood Group: " + p6.getBloodGroup());
        System.out.println("Admission Date: " + p6.getAdmissionDate());
        System.out.println("Discharge Date: " + p6.getDischargeDate());
        System.out.println("Room Number: " + p6.getRoomNumber());
        System.out.println("Phone Number: " + p6.getPhoneNumber());
        System.out.println("Address: " + p6.getAddress());
        System.out.println("Treatment: " + p6.getTreatment());
        System.out.println("Medicine: " + p6.getMedicine());
        System.out.println("Consultation Fee: " + p6.getConsultationFee());
        System.out.println("Total Bill: " + p6.getTotalBill());
        System.out.println("Patient Status: " + p6.getPatientStatus());
        System.out.println("Emergency Contact: " + p6.getEmergencyContact());


        System.out.println("================ Patient Details 7 ================");

        System.out.println("Patient ID: " + p7.getPatientId());
        System.out.println("Patient Name: " + p7.getPatientName());
        System.out.println("Age: " + p7.getAge());
        System.out.println("Gender: " + p7.getGender());
        System.out.println("Disease: " + p7.getDisease());
        System.out.println("Doctor Name: " + p7.getDoctorName());
        System.out.println("Department: " + p7.getDepartment());
        System.out.println("Hospital Name: " + p7.getHospitalName());
        System.out.println("Blood Group: " + p7.getBloodGroup());
        System.out.println("Admission Date: " + p7.getAdmissionDate());
        System.out.println("Discharge Date: " + p7.getDischargeDate());
        System.out.println("Room Number: " + p7.getRoomNumber());
        System.out.println("Phone Number: " + p7.getPhoneNumber());
        System.out.println("Address: " + p7.getAddress());
        System.out.println("Treatment: " + p7.getTreatment());
        System.out.println("Medicine: " + p7.getMedicine());
        System.out.println("Consultation Fee: " + p7.getConsultationFee());
        System.out.println("Total Bill: " + p7.getTotalBill());
        System.out.println("Patient Status: " + p7.getPatientStatus());
        System.out.println("Emergency Contact: " + p7.getEmergencyContact());


        System.out.println("================ Patient Details 8 ================");

        System.out.println("Patient ID: " + p8.getPatientId());
        System.out.println("Patient Name: " + p8.getPatientName());
        System.out.println("Age: " + p8.getAge());
        System.out.println("Gender: " + p8.getGender());
        System.out.println("Disease: " + p8.getDisease());
        System.out.println("Doctor Name: " + p8.getDoctorName());
        System.out.println("Department: " + p8.getDepartment());
        System.out.println("Hospital Name: " + p8.getHospitalName());
        System.out.println("Blood Group: " + p8.getBloodGroup());
        System.out.println("Admission Date: " + p8.getAdmissionDate());
        System.out.println("Discharge Date: " + p8.getDischargeDate());
        System.out.println("Room Number: " + p8.getRoomNumber());
        System.out.println("Phone Number: " + p8.getPhoneNumber());
        System.out.println("Address: " + p8.getAddress());
        System.out.println("Treatment: " + p8.getTreatment());
        System.out.println("Medicine: " + p8.getMedicine());
        System.out.println("Consultation Fee: " + p8.getConsultationFee());
        System.out.println("Total Bill: " + p8.getTotalBill());
        System.out.println("Patient Status: " + p8.getPatientStatus());
        System.out.println("Emergency Contact: " + p8.getEmergencyContact());


        System.out.println("================ Patient Details 9 ================");

        System.out.println("Patient ID: " + p9.getPatientId());
        System.out.println("Patient Name: " + p9.getPatientName());
        System.out.println("Age: " + p9.getAge());
        System.out.println("Gender: " + p9.getGender());
        System.out.println("Disease: " + p9.getDisease());
        System.out.println("Doctor Name: " + p9.getDoctorName());
        System.out.println("Department: " + p9.getDepartment());
        System.out.println("Hospital Name: " + p9.getHospitalName());
        System.out.println("Blood Group: " + p9.getBloodGroup());
        System.out.println("Admission Date: " + p9.getAdmissionDate());
        System.out.println("Discharge Date: " + p9.getDischargeDate());
        System.out.println("Room Number: " + p9.getRoomNumber());
        System.out.println("Phone Number: " + p9.getPhoneNumber());
        System.out.println("Address: " + p9.getAddress());
        System.out.println("Treatment: " + p9.getTreatment());
        System.out.println("Medicine: " + p9.getMedicine());
        System.out.println("Consultation Fee: " + p9.getConsultationFee());
        System.out.println("Total Bill: " + p9.getTotalBill());
        System.out.println("Patient Status: " + p9.getPatientStatus());
        System.out.println("Emergency Contact: " + p9.getEmergencyContact());


        System.out.println("================ Patient Details 10 ================");

        System.out.println("Patient ID: " + p10.getPatientId());
        System.out.println("Patient Name: " + p10.getPatientName());
        System.out.println("Age: " + p10.getAge());
        System.out.println("Gender: " + p10.getGender());
        System.out.println("Disease: " + p10.getDisease());
        System.out.println("Doctor Name: " + p10.getDoctorName());
        System.out.println("Department: " + p10.getDepartment());
        System.out.println("Hospital Name: " + p10.getHospitalName());
        System.out.println("Blood Group: " + p10.getBloodGroup());
        System.out.println("Admission Date: " + p10.getAdmissionDate());
        System.out.println("Discharge Date: " + p10.getDischargeDate());
        System.out.println("Room Number: " + p10.getRoomNumber());
        System.out.println("Phone Number: " + p10.getPhoneNumber());
        System.out.println("Address: " + p10.getAddress());
        System.out.println("Treatment: " + p10.getTreatment());
        System.out.println("Medicine: " + p10.getMedicine());
        System.out.println("Consultation Fee: " + p10.getConsultationFee());
        System.out.println("Total Bill: " + p10.getTotalBill());
        System.out.println("Patient Status: " + p10.getPatientStatus());
        System.out.println("Emergency Contact: " + p10.getEmergencyContact());
        
        System.out.println("=================================Main Method Ends==========================================");
	}

}
