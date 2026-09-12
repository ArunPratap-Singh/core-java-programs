package eagerSingletonClass;

public class HospitalManagementDriver {

	    public static void main(String[] args) {

	        System.out.println("========== HOSPITAL MANAGEMENT ==========");

	       
	        HospitalManagement h1 = HospitalManagement.getInstance();
	        HospitalManagement h2 = HospitalManagement.getInstance();
	        HospitalManagement h3 = HospitalManagement.getInstance();

	        h1.displayHospitalDetails();
	        System.out.println("========");
	        h2.displayHospitalDetails();
	        System.out.println("========");
	        h3.displayHospitalDetails();
	        
	        h3.setHospitalName("Medanta Hospital");
	        h3.setHospitalAddress("Lucknow");
	        h3.setHospitalContact("9564123789");
	        h3.setTotalDoctors(50);
	        h3.setTotalBeds(100);
	        
	        System.out.println("==================H3 Details After Change====================");
	        System.out.println("Object Reference is: " +h3);
	        System.out.println("Hospital Name is: " +h3.getHospitalName());
	        System.out.println("Hospital Address is: " +h3.getHospitalAddress());
	        System.out.println("Hospital Contact is: " +h3.getHospitalContact());
	        System.out.println("Hospital Doctors is: " +h3.getTotalDoctors());
	        System.out.println("Hospital Beds is: " +h3.getTotalBeds());

	        System.out.println("========================");
	        
	        // Hospital operations
	        h1.admitPatient("Rahul");
	        h1.addDoctor("Dr. Sharma");
	        h1.addBed();
	        System.out.println("==========");
	        h2.admitPatient("Kamal");
	        h2.addDoctor("Dr. Singh");
	        h2.addBed();
	        System.out.println("===========");
	        h3.admitPatient("Akash");
	        h3.addDoctor("Dr. Kumar");
	        h3.addBed();
	        System.out.println("==================");

	        System.out.println("h1 == h2 : " + (h1 == h2));
	        System.out.println("h2 == h3 : " + (h2 == h3));
	        System.out.println("h1 == h3 : " + (h1 == h3));

	

	}

}
