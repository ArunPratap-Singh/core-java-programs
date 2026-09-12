package constructor.deepCopy.College;

public class College {
	
	    String collegeName;
	    String location;
	    int fees;
	    String collegeType;
	    Principal p;

	    College() {
	    }

	    College(String collegeName, String location, int fees, String collegeType, Principal p) {
	        this.collegeName = collegeName;
	        this.location = location;
	        this.fees = fees;
	        this.collegeType = collegeType;
	        this.p = p;
	    }

	    //deep copy
	    College(College c) {
	        this.collegeName = c.collegeName;
	        this.location = c.location;
	        this.fees = c.fees;
	        this.collegeType = c.collegeType;
	        this.p = new Principal();
	        this.p.age = c.p.age;
	        this.p.experience = c.p.experience;
	        this.p.gender = c.p.gender;
	        this.p.principalId = c.p.principalId;
	        this.p.principalName = c.p.principalName;
	        this.p.qualification = c.p.qualification;
	    }

	    public String toString() {
	        return "CollegeName is: " + collegeName	+ "\nLocation is: " + location	+ "\nFees is: " + fees	+ "\nCollegeType is: " + collegeType + "\nPrincipal is: " + p + "\n========================";
	    }
	

}
