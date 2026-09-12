package encapsulationsPrograming;

public class DoctorDriver {

	public static void main(String[] args) {
		
		System.out.println("=================================Main Method Starts===================================");
		
		Doctor d1 = new Doctor("Dr. Sharma", "DOC101", "Cardiologist", "Apollo Hospital", 1500.00);
		Doctor d2 = new Doctor("Dr. Verma", "DOC102", "Neurologist", "Max Hospital", 1800.00);
		Doctor d3 = new Doctor("Dr. Gupta", "DOC103", "Dermatologist", "Fortis Hospital", 1200.00);
		Doctor d4 = new Doctor("Dr. Mehta", "DOC104", "Orthopedic", "Medanta Hospital", 1600.00);
		Doctor d5 = new Doctor("Dr. Singh", "DOC105", "Pediatrician", "AIIMS Hospital", 1000.00);
		Doctor d6 = new Doctor("Dr. Kapoor", "DOC106", "Gynecologist", "Apollo Hospital", 1400.00);
		Doctor d7 = new Doctor("Dr. Kumar", "DOC107", "ENT", "Max Hospital", 900.00);
		Doctor d8 = new Doctor("Dr. Agarwal", "DOC108", "Psychiatrist", "Fortis Hospital", 1700.00);
		Doctor d9 = new Doctor("Dr. Mishra", "DOC109", "General Physician", "Medanta Hospital", 800.00);
		Doctor d10 = new Doctor("Dr. Tiwari", "DOC110", "Surgeon", "AIIMS Hospital", 2000.00);

		Doctor d11 = new Doctor("Dr. Joshi", "DOC111", "Cardiologist", "Apollo Hospital", 1550.00);
		Doctor d12 = new Doctor("Dr. Saxena", "DOC112", "Neurologist", "Max Hospital", 1850.00);
		Doctor d13 = new Doctor("Dr. Malhotra", "DOC113", "Dermatologist", "Fortis Hospital", 1250.00);
		Doctor d14 = new Doctor("Dr. Bansal", "DOC114", "Orthopedic", "Medanta Hospital", 1650.00);
		Doctor d15 = new Doctor("Dr. Chandra", "DOC115", "Pediatrician", "AIIMS Hospital", 1050.00);
		Doctor d16 = new Doctor("Dr. Sinha", "DOC116", "Gynecologist", "Apollo Hospital", 1450.00);
		Doctor d17 = new Doctor("Dr. Tripathi", "DOC117", "ENT", "Max Hospital", 950.00);
		Doctor d18 = new Doctor("Dr. Pandey", "DOC118", "Psychiatrist", "Fortis Hospital", 1750.00);
		Doctor d19 = new Doctor("Dr. Srivastava", "DOC119", "General Physician", "Medanta Hospital", 850.00);
		Doctor d20 = new Doctor("Dr. Yadav", "DOC120", "Surgeon", "AIIMS Hospital", 2100.00);

		Doctor d21 = new Doctor("Dr. Rao", "DOC121", "Cardiologist", "Apollo Hospital", 1600.00);
		Doctor d22 = new Doctor("Dr. Nair", "DOC122", "Neurologist", "Max Hospital", 1900.00);
		Doctor d23 = new Doctor("Dr. Iyer", "DOC123", "Dermatologist", "Fortis Hospital", 1300.00);
		Doctor d24 = new Doctor("Dr. Reddy", "DOC124", "Orthopedic", "Medanta Hospital", 1700.00);
		Doctor d25 = new Doctor("Dr. Patel", "DOC125", "Pediatrician", "AIIMS Hospital", 1100.00);
		Doctor d26 = new Doctor("Dr. Shah", "DOC126", "Gynecologist", "Apollo Hospital", 1500.00);
		Doctor d27 = new Doctor("Dr. Desai", "DOC127", "ENT", "Max Hospital", 1000.00);
		Doctor d28 = new Doctor("Dr. Menon", "DOC128", "Psychiatrist", "Fortis Hospital", 1800.00);
		Doctor d29 = new Doctor("Dr. Kulkarni", "DOC129", "General Physician", "Medanta Hospital", 900.00);
		Doctor d30 = new Doctor("Dr. Thakur", "DOC130", "Surgeon", "AIIMS Hospital", 2200.00);

		Doctor d31 = new Doctor("Dr. Khanna", "DOC131", "Cardiologist", "Apollo Hospital", 1650.00);
		Doctor d32 = new Doctor("Dr. Kapoor", "DOC132", "Neurologist", "Max Hospital", 1950.00);
		Doctor d33 = new Doctor("Dr. Arora", "DOC133", "Dermatologist", "Fortis Hospital", 1350.00);
		Doctor d34 = new Doctor("Dr. Grover", "DOC134", "Orthopedic", "Medanta Hospital", 1750.00);
		Doctor d35 = new Doctor("Dr. Anand", "DOC135", "Pediatrician", "AIIMS Hospital", 1150.00);
		Doctor d36 = new Doctor("Dr. Jain", "DOC136", "Gynecologist", "Apollo Hospital", 1550.00);
		Doctor d37 = new Doctor("Dr. Bhatia", "DOC137", "ENT", "Max Hospital", 1050.00);
		Doctor d38 = new Doctor("Dr. Oberoi", "DOC138", "Psychiatrist", "Fortis Hospital", 1850.00);
		Doctor d39 = new Doctor("Dr. Khurana", "DOC139", "General Physician", "Medanta Hospital", 950.00);
		Doctor d40 = new Doctor("Dr. Khandelwal", "DOC140", "Surgeon", "AIIMS Hospital", 2300.00);

		Doctor d41 = new Doctor("Dr. Goyal", "DOC141", "Cardiologist", "Apollo Hospital", 1700.00);
		Doctor d42 = new Doctor("Dr. Mehra", "DOC142", "Neurologist", "Max Hospital", 2000.00);
		Doctor d43 = new Doctor("Dr. Sethi", "DOC143", "Dermatologist", "Fortis Hospital", 1400.00);
		Doctor d44 = new Doctor("Dr. Wadhwa", "DOC144", "Orthopedic", "Medanta Hospital", 1800.00);
		Doctor d45 = new Doctor("Dr. Puri", "DOC145", "Pediatrician", "AIIMS Hospital", 1200.00);
		Doctor d46 = new Doctor("Dr. Bhalla", "DOC146", "Gynecologist", "Apollo Hospital", 1600.00);
		Doctor d47 = new Doctor("Dr. Vohra", "DOC147", "ENT", "Max Hospital", 1100.00);
		Doctor d48 = new Doctor("Dr. Chopra", "DOC148", "Psychiatrist", "Fortis Hospital", 1900.00);
		Doctor d49 = new Doctor("Dr. Bedi", "DOC149", "General Physician", "Medanta Hospital", 1000.00);
		Doctor d50 = new Doctor("Dr. Raghav", "DOC150", "Surgeon", "AIIMS Hospital", 2400.00);
		
		System.out.println("=========================Doctor Details 1===========================");
		System.out.println("Object Reference is: " + d1);
		System.out.println("Doctor Name is: " + d1.getDoctorName());
		System.out.println("Doctor ID is: " + d1.getDoctorID());
		System.out.println("Specialization is: " + d1.getSpecialization());
		System.out.println("Hospital Name is: " + d1.getHospitalName());
		System.out.println("Consultation Fee is: " + d1.getConsultationFee());
		
		System.out.println("===========================Doctor Details 2===========================");
		System.out.println("Object Reference is: " +d2);
		System.out.println("Doctor Name is: " +d2.getDoctorName());
		System.out.println("Doctor ID is: " +d2.getDoctorID());
		System.out.println("Specialization is: " +d2.getSpecialization());
		System.out.println("Hospital Name is: " +d2.getHospitalName());
		System.out.println("Consultation Fee is: " +d2.getConsultationFee());
		
		System.out.println("=========================Doctor Details 3===========================");
		System.out.println("Object Reference is: " + d3);
		System.out.println("Doctor Name is: " + d3.getDoctorName());
		System.out.println("Doctor ID is: " + d3.getDoctorID());
		System.out.println("Specialization is: " + d3.getSpecialization());
		System.out.println("Hospital Name is: " + d3.getHospitalName());
		System.out.println("Consultation Fee is: " + d3.getConsultationFee());

		System.out.println("=========================Doctor Details 4===========================");
		System.out.println("Object Reference is: " + d4);
		System.out.println("Doctor Name is: " + d4.getDoctorName());
		System.out.println("Doctor ID is: " + d4.getDoctorID());
		System.out.println("Specialization is: " + d4.getSpecialization());
		System.out.println("Hospital Name is: " + d4.getHospitalName());
		System.out.println("Consultation Fee is: " + d4.getConsultationFee());

		System.out.println("=========================Doctor Details 5===========================");
		System.out.println("Object Reference is: " + d5);
		System.out.println("Doctor Name is: " + d5.getDoctorName());
		System.out.println("Doctor ID is: " + d5.getDoctorID());
		System.out.println("Specialization is: " + d5.getSpecialization());
		System.out.println("Hospital Name is: " + d5.getHospitalName());
		System.out.println("Consultation Fee is: " + d5.getConsultationFee());

		System.out.println("=========================Doctor Details 6===========================");
		System.out.println("Object Reference is: " + d6);
		System.out.println("Doctor Name is: " + d6.getDoctorName());
		System.out.println("Doctor ID is: " + d6.getDoctorID());
		System.out.println("Specialization is: " + d6.getSpecialization());
		System.out.println("Hospital Name is: " + d6.getHospitalName());
		System.out.println("Consultation Fee is: " + d6.getConsultationFee());

		System.out.println("=========================Doctor Details 7===========================");
		System.out.println("Object Reference is: " + d7);
		System.out.println("Doctor Name is: " + d7.getDoctorName());
		System.out.println("Doctor ID is: " + d7.getDoctorID());
		System.out.println("Specialization is: " + d7.getSpecialization());
		System.out.println("Hospital Name is: " + d7.getHospitalName());
		System.out.println("Consultation Fee is: " + d7.getConsultationFee());

		System.out.println("=========================Doctor Details 8===========================");
		System.out.println("Object Reference is: " + d8);
		System.out.println("Doctor Name is: " + d8.getDoctorName());
		System.out.println("Doctor ID is: " + d8.getDoctorID());
		System.out.println("Specialization is: " + d8.getSpecialization());
		System.out.println("Hospital Name is: " + d8.getHospitalName());
		System.out.println("Consultation Fee is: " + d8.getConsultationFee());

		System.out.println("=========================Doctor Details 9===========================");
		System.out.println("Object Reference is: " + d9);
		System.out.println("Doctor Name is: " + d9.getDoctorName());
		System.out.println("Doctor ID is: " + d9.getDoctorID());
		System.out.println("Specialization is: " + d9.getSpecialization());
		System.out.println("Hospital Name is: " + d9.getHospitalName());
		System.out.println("Consultation Fee is: " + d9.getConsultationFee());

		System.out.println("=========================Doctor Details 10===========================");
		System.out.println("Object Reference is: " + d10);
		System.out.println("Doctor Name is: " + d10.getDoctorName());
		System.out.println("Doctor ID is: " + d10.getDoctorID());
		System.out.println("Specialization is: " + d10.getSpecialization());
		System.out.println("Hospital Name is: " + d10.getHospitalName());
		System.out.println("Consultation Fee is: " + d10.getConsultationFee());

		System.out.println("=========================Doctor Details 11===========================");
		System.out.println("Object Reference is: " + d11);
		System.out.println("Doctor Name is: " + d11.getDoctorName());
		System.out.println("Doctor ID is: " + d11.getDoctorID());
		System.out.println("Specialization is: " + d11.getSpecialization());
		System.out.println("Hospital Name is: " + d11.getHospitalName());
		System.out.println("Consultation Fee is: " + d11.getConsultationFee());

		System.out.println("=========================Doctor Details 12===========================");
		System.out.println("Object Reference is: " + d12);
		System.out.println("Doctor Name is: " + d12.getDoctorName());
		System.out.println("Doctor ID is: " + d12.getDoctorID());
		System.out.println("Specialization is: " + d12.getSpecialization());
		System.out.println("Hospital Name is: " + d12.getHospitalName());
		System.out.println("Consultation Fee is: " + d12.getConsultationFee());

		System.out.println("=========================Doctor Details 13===========================");
		System.out.println("Object Reference is: " + d13);
		System.out.println("Doctor Name is: " + d13.getDoctorName());
		System.out.println("Doctor ID is: " + d13.getDoctorID());
		System.out.println("Specialization is: " + d13.getSpecialization());
		System.out.println("Hospital Name is: " + d13.getHospitalName());
		System.out.println("Consultation Fee is: " + d13.getConsultationFee());

		System.out.println("=========================Doctor Details 14===========================");
		System.out.println("Object Reference is: " + d14);
		System.out.println("Doctor Name is: " + d14.getDoctorName());
		System.out.println("Doctor ID is: " + d14.getDoctorID());
		System.out.println("Specialization is: " + d14.getSpecialization());
		System.out.println("Hospital Name is: " + d14.getHospitalName());
		System.out.println("Consultation Fee is: " + d14.getConsultationFee());

		System.out.println("=========================Doctor Details 15===========================");
		System.out.println("Object Reference is: " + d15);
		System.out.println("Doctor Name is: " + d15.getDoctorName());
		System.out.println("Doctor ID is: " + d15.getDoctorID());
		System.out.println("Specialization is: " + d15.getSpecialization());
		System.out.println("Hospital Name is: " + d15.getHospitalName());
		System.out.println("Consultation Fee is: " + d15.getConsultationFee());

		System.out.println("=========================Doctor Details 16===========================");
		System.out.println("Object Reference is: " + d16);
		System.out.println("Doctor Name is: " + d16.getDoctorName());
		System.out.println("Doctor ID is: " + d16.getDoctorID());
		System.out.println("Specialization is: " + d16.getSpecialization());
		System.out.println("Hospital Name is: " + d16.getHospitalName());
		System.out.println("Consultation Fee is: " + d16.getConsultationFee());

		System.out.println("=========================Doctor Details 17===========================");
		System.out.println("Object Reference is: " + d17);
		System.out.println("Doctor Name is: " + d17.getDoctorName());
		System.out.println("Doctor ID is: " + d17.getDoctorID());
		System.out.println("Specialization is: " + d17.getSpecialization());
		System.out.println("Hospital Name is: " + d17.getHospitalName());
		System.out.println("Consultation Fee is: " + d17.getConsultationFee());

		System.out.println("=========================Doctor Details 18===========================");
		System.out.println("Object Reference is: " + d18);
		System.out.println("Doctor Name is: " + d18.getDoctorName());
		System.out.println("Doctor ID is: " + d18.getDoctorID());
		System.out.println("Specialization is: " + d18.getSpecialization());
		System.out.println("Hospital Name is: " + d18.getHospitalName());
		System.out.println("Consultation Fee is: " + d18.getConsultationFee());

		System.out.println("=========================Doctor Details 19===========================");
		System.out.println("Object Reference is: " + d19);
		System.out.println("Doctor Name is: " + d19.getDoctorName());
		System.out.println("Doctor ID is: " + d19.getDoctorID());
		System.out.println("Specialization is: " + d19.getSpecialization());
		System.out.println("Hospital Name is: " + d19.getHospitalName());
		System.out.println("Consultation Fee is: " + d19.getConsultationFee());

		System.out.println("=========================Doctor Details 20===========================");
		System.out.println("Object Reference is: " + d20);
		System.out.println("Doctor Name is: " + d20.getDoctorName());
		System.out.println("Doctor ID is: " + d20.getDoctorID());
		System.out.println("Specialization is: " + d20.getSpecialization());
		System.out.println("Hospital Name is: " + d20.getHospitalName());
		System.out.println("Consultation Fee is: " + d20.getConsultationFee());

		System.out.println("=========================Doctor Details 21===========================");
		System.out.println("Object Reference is: " + d21);
		System.out.println("Doctor Name is: " + d21.getDoctorName());
		System.out.println("Doctor ID is: " + d21.getDoctorID());
		System.out.println("Specialization is: " + d21.getSpecialization());
		System.out.println("Hospital Name is: " + d21.getHospitalName());
		System.out.println("Consultation Fee is: " + d21.getConsultationFee());

		System.out.println("=========================Doctor Details 22===========================");
		System.out.println("Object Reference is: " + d22);
		System.out.println("Doctor Name is: " + d22.getDoctorName());
		System.out.println("Doctor ID is: " + d22.getDoctorID());
		System.out.println("Specialization is: " + d22.getSpecialization());
		System.out.println("Hospital Name is: " + d22.getHospitalName());
		System.out.println("Consultation Fee is: " + d22.getConsultationFee());

		System.out.println("=========================Doctor Details 23===========================");
		System.out.println("Object Reference is: " + d23);
		System.out.println("Doctor Name is: " + d23.getDoctorName());
		System.out.println("Doctor ID is: " + d23.getDoctorID());
		System.out.println("Specialization is: " + d23.getSpecialization());
		System.out.println("Hospital Name is: " + d23.getHospitalName());
		System.out.println("Consultation Fee is: " + d23.getConsultationFee());

		System.out.println("=========================Doctor Details 24===========================");
		System.out.println("Object Reference is: " + d24);
		System.out.println("Doctor Name is: " + d24.getDoctorName());
		System.out.println("Doctor ID is: " + d24.getDoctorID());
		System.out.println("Specialization is: " + d24.getSpecialization());
		System.out.println("Hospital Name is: " + d24.getHospitalName());
		System.out.println("Consultation Fee is: " + d24.getConsultationFee());

		System.out.println("=========================Doctor Details 25===========================");
		System.out.println("Object Reference is: " + d25);
		System.out.println("Doctor Name is: " + d25.getDoctorName());
		System.out.println("Doctor ID is: " + d25.getDoctorID());
		System.out.println("Specialization is: " + d25.getSpecialization());
		System.out.println("Hospital Name is: " + d25.getHospitalName());
		System.out.println("Consultation Fee is: " + d25.getConsultationFee());

		System.out.println("=========================Doctor Details 26===========================");
		System.out.println("Object Reference is: " + d26);
		System.out.println("Doctor Name is: " + d26.getDoctorName());
		System.out.println("Doctor ID is: " + d26.getDoctorID());
		System.out.println("Specialization is: " + d26.getSpecialization());
		System.out.println("Hospital Name is: " + d26.getHospitalName());
		System.out.println("Consultation Fee is: " + d26.getConsultationFee());

		System.out.println("=========================Doctor Details 27===========================");
		System.out.println("Object Reference is: " + d27);
		System.out.println("Doctor Name is: " + d27.getDoctorName());
		System.out.println("Doctor ID is: " + d27.getDoctorID());
		System.out.println("Specialization is: " + d27.getSpecialization());
		System.out.println("Hospital Name is: " + d27.getHospitalName());
		System.out.println("Consultation Fee is: " + d27.getConsultationFee());

		System.out.println("=========================Doctor Details 28===========================");
		System.out.println("Object Reference is: " + d28);
		System.out.println("Doctor Name is: " + d28.getDoctorName());
		System.out.println("Doctor ID is: " + d28.getDoctorID());
		System.out.println("Specialization is: " + d28.getSpecialization());
		System.out.println("Hospital Name is: " + d28.getHospitalName());
		System.out.println("Consultation Fee is: " + d28.getConsultationFee());

		System.out.println("=========================Doctor Details 29===========================");
		System.out.println("Object Reference is: " + d29);
		System.out.println("Doctor Name is: " + d29.getDoctorName());
		System.out.println("Doctor ID is: " + d29.getDoctorID());
		System.out.println("Specialization is: " + d29.getSpecialization());
		System.out.println("Hospital Name is: " + d29.getHospitalName());
		System.out.println("Consultation Fee is: " + d29.getConsultationFee());

		System.out.println("=========================Doctor Details 30===========================");
		System.out.println("Object Reference is: " + d30);
		System.out.println("Doctor Name is: " + d30.getDoctorName());
		System.out.println("Doctor ID is: " + d30.getDoctorID());
		System.out.println("Specialization is: " + d30.getSpecialization());
		System.out.println("Hospital Name is: " + d30.getHospitalName());
		System.out.println("Consultation Fee is: " + d30.getConsultationFee());

		System.out.println("=========================Doctor Details 31===========================");
		System.out.println("Object Reference is: " + d31);
		System.out.println("Doctor Name is: " + d31.getDoctorName());
		System.out.println("Doctor ID is: " + d31.getDoctorID());
		System.out.println("Specialization is: " + d31.getSpecialization());
		System.out.println("Hospital Name is: " + d31.getHospitalName());
		System.out.println("Consultation Fee is: " + d31.getConsultationFee());

		System.out.println("=========================Doctor Details 32===========================");
		System.out.println("Object Reference is: " + d32);
		System.out.println("Doctor Name is: " + d32.getDoctorName());
		System.out.println("Doctor ID is: " + d32.getDoctorID());
		System.out.println("Specialization is: " + d32.getSpecialization());
		System.out.println("Hospital Name is: " + d32.getHospitalName());
		System.out.println("Consultation Fee is: " + d32.getConsultationFee());

		System.out.println("=========================Doctor Details 33===========================");
		System.out.println("Object Reference is: " + d33);
		System.out.println("Doctor Name is: " + d33.getDoctorName());
		System.out.println("Doctor ID is: " + d33.getDoctorID());
		System.out.println("Specialization is: " + d33.getSpecialization());
		System.out.println("Hospital Name is: " + d33.getHospitalName());
		System.out.println("Consultation Fee is: " + d33.getConsultationFee());

		System.out.println("=========================Doctor Details 34===========================");
		System.out.println("Object Reference is: " + d34);
		System.out.println("Doctor Name is: " + d34.getDoctorName());
		System.out.println("Doctor ID is: " + d34.getDoctorID());
		System.out.println("Specialization is: " + d34.getSpecialization());
		System.out.println("Hospital Name is: " + d34.getHospitalName());
		System.out.println("Consultation Fee is: " + d34.getConsultationFee());

		System.out.println("=========================Doctor Details 35===========================");
		System.out.println("Object Reference is: " + d35);
		System.out.println("Doctor Name is: " + d35.getDoctorName());
		System.out.println("Doctor ID is: " + d35.getDoctorID());
		System.out.println("Specialization is: " + d35.getSpecialization());
		System.out.println("Hospital Name is: " + d35.getHospitalName());
		System.out.println("Consultation Fee is: " + d35.getConsultationFee());

		System.out.println("=========================Doctor Details 36===========================");
		System.out.println("Object Reference is: " + d36);
		System.out.println("Doctor Name is: " + d36.getDoctorName());
		System.out.println("Doctor ID is: " + d36.getDoctorID());
		System.out.println("Specialization is: " + d36.getSpecialization());
		System.out.println("Hospital Name is: " + d36.getHospitalName());
		System.out.println("Consultation Fee is: " + d36.getConsultationFee());

		System.out.println("=========================Doctor Details 37===========================");
		System.out.println("Object Reference is: " + d37);
		System.out.println("Doctor Name is: " + d37.getDoctorName());
		System.out.println("Doctor ID is: " + d37.getDoctorID());
		System.out.println("Specialization is: " + d37.getSpecialization());
		System.out.println("Hospital Name is: " + d37.getHospitalName());
		System.out.println("Consultation Fee is: " + d37.getConsultationFee());

		System.out.println("=========================Doctor Details 38===========================");
		System.out.println("Object Reference is: " + d38);
		System.out.println("Doctor Name is: " + d38.getDoctorName());
		System.out.println("Doctor ID is: " + d38.getDoctorID());
		System.out.println("Specialization is: " + d38.getSpecialization());
		System.out.println("Hospital Name is: " + d38.getHospitalName());
		System.out.println("Consultation Fee is: " + d38.getConsultationFee());

		System.out.println("=========================Doctor Details 39===========================");
		System.out.println("Object Reference is: " + d39);
		System.out.println("Doctor Name is: " + d39.getDoctorName());
		System.out.println("Doctor ID is: " + d39.getDoctorID());
		System.out.println("Specialization is: " + d39.getSpecialization());
		System.out.println("Hospital Name is: " + d39.getHospitalName());
		System.out.println("Consultation Fee is: " + d39.getConsultationFee());

		System.out.println("=========================Doctor Details 40===========================");
		System.out.println("Object Reference is: " + d40);
		System.out.println("Doctor Name is: " + d40.getDoctorName());
		System.out.println("Doctor ID is: " + d40.getDoctorID());
		System.out.println("Specialization is: " + d40.getSpecialization());
		System.out.println("Hospital Name is: " + d40.getHospitalName());
		System.out.println("Consultation Fee is: " + d40.getConsultationFee());

		System.out.println("=========================Doctor Details 41===========================");
		System.out.println("Object Reference is: " + d41);
		System.out.println("Doctor Name is: " + d41.getDoctorName());
		System.out.println("Doctor ID is: " + d41.getDoctorID());
		System.out.println("Specialization is: " + d41.getSpecialization());
		System.out.println("Hospital Name is: " + d41.getHospitalName());
		System.out.println("Consultation Fee is: " + d41.getConsultationFee());

		System.out.println("=========================Doctor Details 42===========================");
		System.out.println("Object Reference is: " + d42);
		System.out.println("Doctor Name is: " + d42.getDoctorName());
		System.out.println("Doctor ID is: " + d42.getDoctorID());
		System.out.println("Specialization is: " + d42.getSpecialization());
		System.out.println("Hospital Name is: " + d42.getHospitalName());
		System.out.println("Consultation Fee is: " + d42.getConsultationFee());

		System.out.println("=========================Doctor Details 43===========================");
		System.out.println("Object Reference is: " + d43);
		System.out.println("Doctor Name is: " + d43.getDoctorName());
		System.out.println("Doctor ID is: " + d43.getDoctorID());
		System.out.println("Specialization is: " + d43.getSpecialization());
		System.out.println("Hospital Name is: " + d43.getHospitalName());
		System.out.println("Consultation Fee is: " + d43.getConsultationFee());

		System.out.println("=========================Doctor Details 44===========================");
		System.out.println("Object Reference is: " + d44);
		System.out.println("Doctor Name is: " + d44.getDoctorName());
		System.out.println("Doctor ID is: " + d44.getDoctorID());
		System.out.println("Specialization is: " + d44.getSpecialization());
		System.out.println("Hospital Name is: " + d44.getHospitalName());
		System.out.println("Consultation Fee is: " + d44.getConsultationFee());

		System.out.println("=========================Doctor Details 45===========================");
		System.out.println("Object Reference is: " + d45);
		System.out.println("Doctor Name is: " + d45.getDoctorName());
		System.out.println("Doctor ID is: " + d45.getDoctorID());
		System.out.println("Specialization is: " + d45.getSpecialization());
		System.out.println("Hospital Name is: " + d45.getHospitalName());
		System.out.println("Consultation Fee is: " + d45.getConsultationFee());

		System.out.println("=========================Doctor Details 46===========================");
		System.out.println("Object Reference is: " + d46);
		System.out.println("Doctor Name is: " + d46.getDoctorName());
		System.out.println("Doctor ID is: " + d46.getDoctorID());
		System.out.println("Specialization is: " + d46.getSpecialization());
		System.out.println("Hospital Name is: " + d46.getHospitalName());
		System.out.println("Consultation Fee is: " + d46.getConsultationFee());

		System.out.println("=========================Doctor Details 47===========================");
		System.out.println("Object Reference is: " + d47);
		System.out.println("Doctor Name is: " + d47.getDoctorName());
		System.out.println("Doctor ID is: " + d47.getDoctorID());
		System.out.println("Specialization is: " + d47.getSpecialization());
		System.out.println("Hospital Name is: " + d47.getHospitalName());
		System.out.println("Consultation Fee is: " + d47.getConsultationFee());

		System.out.println("=========================Doctor Details 48===========================");
		System.out.println("Object Reference is: " + d48);
		System.out.println("Doctor Name is: " + d48.getDoctorName());
		System.out.println("Doctor ID is: " + d48.getDoctorID());
		System.out.println("Specialization is: " + d48.getSpecialization());
		System.out.println("Hospital Name is: " + d48.getHospitalName());
		System.out.println("Consultation Fee is: " + d48.getConsultationFee());

		System.out.println("=========================Doctor Details 49===========================");
		System.out.println("Object Reference is: " + d49);
		System.out.println("Doctor Name is: " + d49.getDoctorName());
		System.out.println("Doctor ID is: " + d49.getDoctorID());
		System.out.println("Specialization is: " + d49.getSpecialization());
		System.out.println("Hospital Name is: " + d49.getHospitalName());
		System.out.println("Consultation Fee is: " + d49.getConsultationFee());

		System.out.println("=========================Doctor Details 50===========================");
		System.out.println("Object Reference is: " + d50);
		System.out.println("Doctor Name is: " + d50.getDoctorName());
		System.out.println("Doctor ID is: " + d50.getDoctorID());
		System.out.println("Specialization is: " + d50.getSpecialization());
		System.out.println("Hospital Name is: " + d50.getHospitalName());
		System.out.println("Consultation Fee is: " + d50.getConsultationFee());
		
		System.out.println("===================================Main Method Ends====================================");

	}

}
