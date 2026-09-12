package inheritanceProgramingMultilevel.Human;

public class TeamLead extends SeniorDeveloper{
	
	String teamName;
    int teamSize;
    
    TeamLead(){
    	
    }

    TeamLead(String name, int age, String gender, String city, int employeeId, double salary, String programmingLanguage, String developmentType, int experience, String specialization, String teamName, int teamSize) {

        super(name, age, gender, city, employeeId, salary, programmingLanguage, developmentType, experience, specialization);
        this.teamName = teamName;
        this.teamSize = teamSize;
    }    
        
    @Override
    public String toString() {
            return super.toString()+ "\nTeamName is: " + teamName + "\nTeamSize is: " + teamSize;
        }

}
