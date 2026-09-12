package constructor.shallowCopy.College;

public class Principal {
	
	    int principalId;
	    String principalName;
	    int age;
	    String gender;
	    String qualification;
	    int experience;

	    Principal() {
	    }

	    Principal(int principalId, String principalName, int age, String gender, String qualification, int experience) {

	        this.principalId = principalId;
	        this.principalName = principalName;
	        this.age = age;
	        this.gender = gender;
	        this.qualification = qualification;
	        this.experience = experience;
	    }

	    public String toString() {
	        return "PrincipalId is: " + principalId + "\nPrincipalName is: " + principalName + "\nAge is: " + age + "\nGender is: " + gender + "\nQualification is: " + qualification + "\nExperience is: " + experience;
	    }
	

}
