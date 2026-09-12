package constructor.shallowCopy.College;

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

	    College(College c) {
	        this.collegeName = c.collegeName;
	        this.location = c.location;
	        this.fees = c.fees;
	        this.collegeType = c.collegeType;
	        this.p = c.p;
	    }

	    public String toString() {
	        return "CollegeName is: " + collegeName	+ "\nLocation is: " + location	+ "\nFees is: " + fees	+ "\nCollegeType is: " + collegeType + "\nPrincipal is: " + p + "\n========================";
	    }
	

}
