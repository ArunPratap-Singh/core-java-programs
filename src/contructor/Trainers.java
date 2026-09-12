package contructor;

public class Trainers {
	
	    String trainerName;
	    String specialization;
	    int experience;
	    double salary;

	    Trainers() {
	    }

	    Trainers(String trainerName, String specialization, int experience, double salary) {
	        this.trainerName = trainerName;
	        this.specialization = specialization;
	        this.experience = experience;
	        this.salary = salary;
	    }

	    public String toString() {
	        return "Trainer Name is: " +trainerName+ "\nSpecialization is: " +specialization+ "\nExperience is: " +experience+ " years"+"\nSalary is: " +salary+ "\n==============================";
	    }
	

}
