package constructor.shallowCopy.Library;

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

	    // Shallow Copy Constructor
	    Library(Library lib) {

	        this.libraryName = lib.libraryName;
	        this.location = lib.location;
	        this.totalBooks = lib.totalBooks;
	        this.libraryType = lib.libraryType;
	        this.l = lib.l;
	    }

	    public String toString() {

	        return "LibraryName is: " + libraryName + "\nLocation is: " + location + "\nTotalBooks is: " + totalBooks + "\nLibraryType is: " + libraryType + "\nL is: " + l + "\n========================";
	    }
	

}
