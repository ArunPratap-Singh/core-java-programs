package inheritanceProgramingMultilevel.Hospital;

public class MedicalStaff extends Hospital {
	
	    int staffId;
	    String staffName;
	    
	    MedicalStaff(){
	    	
	    }

	    MedicalStaff(String hospitalName, String hospitalLocation, int staffId, String staffName) {

	        super(hospitalName, hospitalLocation);
	        this.staffId = staffId;
	        this.staffName = staffName;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nStaffId is: " + staffId + "\nStaffName is: " + staffName;
	    }
	

}
