package lazySingletonClass;

public class HospitalManagement {
	
	    
	    private static HospitalManagement hm;

	    private String hospitalName;
	    private String hospitalAddress;
	    private String hospitalContact;
	    private int totalDoctors;
	    private int totalBeds;

	    private HospitalManagement() {

	        hospitalName = "Apollo Hospital";
	        hospitalAddress = "Lucknow";
	        hospitalContact = "9876543210";
	        totalDoctors = 50;
	        totalBeds = 200;
	    }

	    public static HospitalManagement getInstance() {

	        if (hm == null) {

	            hm = new HospitalManagement();
	        }

	        return hm;
	    }

	    // Getter methods

	    public String getHospitalName() {
	        return hospitalName;
	    }

	    public String getHospitalAddress() {
	        return hospitalAddress;
	    }

	    public String getHospitalContact() {
	        return hospitalContact;
	    }

	    public int getTotalDoctors() {
	        return totalDoctors;
	    }

	    public int getTotalBeds() {
	        return totalBeds;
	    }

	    // Setter methods

	    public void setHospitalName(String hospitalName) {
	        this.hospitalName = hospitalName;
	    }

	    public void setHospitalAddress(String hospitalAddress) {
	        this.hospitalAddress = hospitalAddress;
	    }

	    public void setHospitalContact(String hospitalContact) {
	        this.hospitalContact = hospitalContact;
	    }

	    public void setTotalDoctors(int totalDoctors) {
	        this.totalDoctors = totalDoctors;
	    }

	    public void setTotalBeds(int totalBeds) {
	        this.totalBeds = totalBeds;
	    }

	    // Hospital operations

	    public void admitPatient(String patientName) {

	        System.out.println(patientName + " has been admitted to the hospital.");
	    }

	    public void dischargePatient(String patientName) {

	        System.out.println(patientName + " has been discharged from the hospital.");
	    }

	    public void addDoctor(String doctorName) {

	        totalDoctors++;

	        System.out.println(doctorName + " has been added.");
	        System.out.println("Total Doctors: " + totalDoctors);
	    }

	    public void addBed() {

	        totalBeds++;

	        System.out.println("New bed added.");
	        System.out.println("Total Beds: " + totalBeds);
	    }

	    public void displayHospitalDetails() {

	        System.out.println("Hospital Name    : " + hospitalName);
	        System.out.println("Hospital Address : " + hospitalAddress);
	        System.out.println("Contact Number   : " + hospitalContact);
	        System.out.println("Total Doctors    : " + totalDoctors);
	        System.out.println("Total Beds       : " + totalBeds);
	    }
	

}
