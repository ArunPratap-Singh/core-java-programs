package constructor.deepCopy.Library;

public class Library {
	
	    String libraryName;
	    String location;
	    int totalBooks;
	    String libraryType;
	    Librarian l;

	    Library() {
	    }

	    Library(String libraryName, String location, int totalBooks, String libraryType, Librarian l) {

	        this.libraryName = libraryName;
	        this.location = location;
	        this.totalBooks = totalBooks;
	        this.libraryType = libraryType;
	        this.l = l;
	    }

	    // deep Copy Constructor
	    Library(Library lib) {

	        this.libraryName = lib.libraryName;
	        this.location = lib.location;
	        this.totalBooks = lib.totalBooks;
	        this.libraryType = lib.libraryType;
	        this.l = new Librarian();
	        this.l.age = lib.l.age;
	        this.l.experience = lib.l.experience;
	        this.l.gender = lib.l.gender;
	        this.l.librarianId = lib.l.librarianId;
	        this.l.librarianName = lib.l.librarianName;
	        this.l.qualification = lib.l.qualification;
	    }

	    public String toString() {

	        return "LibraryName is: " + libraryName + "\nLocation is: " + location + "\nTotalBooks is: " + totalBooks + "\nLibraryType is: " + libraryType + "\nL is: " + l + "\n========================";
	    }
	

}
