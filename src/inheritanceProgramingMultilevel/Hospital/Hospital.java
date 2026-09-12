package inheritanceProgramingMultilevel.Hospital;

public class Hospital {
	
	    String hospitalName;
	    String hospitalLocation;
	    
	    Hospital(){
	    	
	    }

	    Hospital(String hospitalName, String hospitalLocation) {
	        this.hospitalName = hospitalName;
	        this.hospitalLocation = hospitalLocation;
	    }

	    @Override
	    public String toString() {
	        return "HospitalName is: " + hospitalName + "\nHospitalLocation is: " + hospitalLocation;
	    }
	

}
