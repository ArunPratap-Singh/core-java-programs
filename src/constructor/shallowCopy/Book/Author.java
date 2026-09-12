package constructor.shallowCopy.Book;

public class Author {
	
	    int authorId;
	    String authorName;
	    int age;
	    String gender;
	    String nationality;
	    String specialization;

	    Author() {
	    }

	    Author(int authorId, String authorName, int age, String gender,
	           String nationality, String specialization) {

	        this.authorId = authorId;
	        this.authorName = authorName;
	        this.age = age;
	        this.gender = gender;
	        this.nationality = nationality;
	        this.specialization = specialization;
	    }

	    public String toString() {
	        return "AuthorId is: " + authorId + "\nAuthorName is: " + authorName + "\nAge is: " + age + "\nGender is: " + gender + "\nNationality is: " + nationality + "\nSpecialization is: " + specialization;
	    }
	

}
