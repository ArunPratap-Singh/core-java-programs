package inheritancePrograming.Hospital;

public class Hospital {
	
	    String hospitalName;
	    String location;
	    int hospitalId;
	    
	    Hospital(){
	    	
	    }	

	    Hospital(String hospitalName, String location, int hospitalId) {

	        this.hospitalName = hospitalName;
	        this.location = location;
	        this.hospitalId = hospitalId;
	    }
	    
	    @Override
	   public String toString() {
		   
		   return "Hospital Name is: " +hospitalName+"\nLocation is: " +location+"\nHospitalID is: " +hospitalId+"\n===============================";
	   }
	

}
