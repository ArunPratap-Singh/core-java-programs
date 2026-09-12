package constructor.shallowCopy.Library;

public class Librarian {
	
	    int librarianId;
	    String librarianName;
	    int age;
	    String gender;
	    String qualification;
	    int experience;

	    Librarian() {
	    }

	    Librarian(int librarianId, String librarianName, int age, String gender, String qualification, int experience) {

	        this.librarianId = librarianId;
	        this.librarianName = librarianName;
	        this.age = age;
	        this.gender = gender;
	        this.qualification = qualification;
	        this.experience = experience;
	    }

	    public String toString() {

	        return "LibrarianId is: " + librarianId + "\nLibrarianName is: " + librarianName + "\nAge is: " + age + "\nGender is: " + gender + "\nQualification is: " + qualification + "\nExperience is: " + experience;
	    }
	

}
