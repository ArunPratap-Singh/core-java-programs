package inheritanceProgramingMultilevel.Human;

public class ProjectManager extends TeamLead {

	String projectName;
	double projectBudget;
	
	ProjectManager(){
		
	}

	ProjectManager(String name, int age, String gender, String city, int employeeId, double salary, String programmingLanguage, String developmentType, int experience, String specialization, String teamName, int teamSize, String projectName, double projectBudget) {

		super(name, age, gender, city, employeeId, salary, programmingLanguage, developmentType, experience, specialization, teamName, teamSize);
		this.projectName = projectName;
		this.projectBudget = projectBudget;
	}

	@Override
	public String toString() {
		return super.toString() +"\nProjectName is: " + projectName +"\nProjectBudget is: " + projectBudget +"\n=====================";
	}

}
