package constructor.shallowCopy.House;

public class Owner {
	
	    int ownerId;
	    String ownerName;
	    int age;
	    String gender;
	    String occupation;
	    String nationality;

	    Owner() {
	    }

	    Owner(int ownerId, String ownerName, int age, String gender, String occupation, String nationality) {

	        this.ownerId = ownerId;
	        this.ownerName = ownerName;
	        this.age = age;
	        this.gender = gender;
	        this.occupation = occupation;
	        this.nationality = nationality;
	    }

	    public String toString() {
	        return "OwnerId is: " + ownerId + "\nOwnerName is: " + ownerName + "\nAge is: " + age + "\nGender is: " + gender + "\nOccupation is: " + occupation + "\nNationality is: " + nationality;
	    }
	

}
