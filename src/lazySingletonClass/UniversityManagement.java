package lazySingletonClass;

public class UniversityManagement {
	
	    private static UniversityManagement um;

	    private String universityName;
	    private String universityAddress;
	    private String universityContact;
	    private int totalStudents;
	    private int totalProfessors;

	    
	    private UniversityManagement() {

	        universityName = "Lucknow University";
	        universityAddress = "Lucknow";
	        universityContact = "9876543210";
	        totalStudents = 10000;
	        totalProfessors = 500;
	    }

	    public static UniversityManagement getInstance() {
	    	
	    	if(um == null) {
	    		um = new UniversityManagement();
	    	}

	        return um;
	    }

	    // Getter methods

	    public String getUniversityName() {
	        return universityName;
	    }

	    public String getUniversityAddress() {
	        return universityAddress;
	    }

	    public String getUniversityContact() {
	        return universityContact;
	    }

	    public int getTotalStudents() {
	        return totalStudents;
	    }

	    public int getTotalProfessors() {
	        return totalProfessors;
	    }

	    // Setter methods

	    public void setUniversityName(String universityName) {
	        this.universityName = universityName;
	    }

	    public void setUniversityAddress(String universityAddress) {
	        this.universityAddress = universityAddress;
	    }

	    public void setUniversityContact(String universityContact) {
	        this.universityContact = universityContact;
	    }

	    public void setTotalStudents(int totalStudents) {
	        this.totalStudents = totalStudents;
	    }

	    public void setTotalProfessors(int totalProfessors) {
	        this.totalProfessors = totalProfessors;
	    }

	    // University operations

	    public void addStudent(String studentName) {

	        totalStudents++;

	        System.out.println(studentName + " has been added.");
	        System.out.println("Total Students: " + totalStudents);
	    }

	    public void removeStudent(String studentName) {

	        if (totalStudents > 0) {

	            totalStudents--;

	            System.out.println(studentName + " has been removed.");
	            System.out.println("Total Students: " + totalStudents);
	        }
	    }

	    public void addProfessor(String professorName) {

	        totalProfessors++;

	        System.out.println(professorName + " has been added.");
	        System.out.println("Total Professors: " + totalProfessors);
	    }

	    public void removeProfessor(String professorName) {

	        if (totalProfessors > 0) {

	            totalProfessors--;

	            System.out.println(professorName + " has been removed.");
	            System.out.println("Total Professors: " + totalProfessors);
	        }
	    }

	    public void displayUniversityDetails() {

	        System.out.println("University Name    : " + universityName);
	        System.out.println("University Address : " + universityAddress);
	        System.out.println("Contact Number     : " + universityContact);
	        System.out.println("Total Students     : " + totalStudents);
	        System.out.println("Total Professors   : " + totalProfessors);
	    }
	

}
