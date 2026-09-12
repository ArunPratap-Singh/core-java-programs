package inheritancePrograming.University;

public class University {
	
	 String universityName;
	 String universityLocation;
	 int universityCode;
	 
	 University(){
		 
	 }

	 University(String universityName, String universityLocation, int universityCode) {

	        this.universityName = universityName;
	        this.universityLocation = universityLocation;
	        this.universityCode = universityCode;
	 }
	 
	 public void conductExamination() {
		 System.out.println(universityName+ " Conducts Examinations ");
	 }
	 
	 @Override
	 public String toString() {
		 return "\nUniversityName is: " +universityName+"\nUniversityLocation is: " +universityLocation+"\nUniversityCode is: " +universityCode;
	 }
	 
	 

}
