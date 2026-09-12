package inheritanceProgramingMultilevel.Hospital;

public class ChiefSurgeon extends SeniorSurgeon{
	
	    String departmentName;
	    String chiefResponsibility;
	    
	    ChiefSurgeon(){
	    	
	    }

	    ChiefSurgeon(String hospitalName, String hospitalLocation, int staffId, String staffName, int doctorId, double salary, String specialization, int experience, String surgeryType, int surgeriesPerformed, String seniorityLevel, int teamSize, String departmentName, String chiefResponsibility) {

	        super(hospitalName, hospitalLocation, staffId, staffName, doctorId, salary, specialization, experience, surgeryType, surgeriesPerformed, seniorityLevel, teamSize);
	        this.departmentName = departmentName;
	        this.chiefResponsibility = chiefResponsibility;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nDepartmentName is: " + departmentName + "\nChiefResponsibility is: " + chiefResponsibility + "\n==========================";
	    }
	

}
