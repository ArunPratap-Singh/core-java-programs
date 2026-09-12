package constructor.shallowCopy.Book;

public class Book {
	
	    String title;
	    String publisher;
	    int price;
	    String language;
	    Author a;

	    Book() {
	    }

	    Book(String title, String publisher, int price, String language, Author a) {
	        this.title = title;
	        this.publisher = publisher;
	        this.price = price;
	        this.language = language;
	        this.a = a;
	    }

	    // Shallow Copy Constructor
	    Book(Book b) {
	        this.title = b.title;
	        this.publisher = b.publisher;
	        this.price = b.price;
	        this.language = b.language;
	        this.a = b.a;
	    }

	    public String toString() {
	        return "Title is: " + title + "\nPublisher is: " + publisher + "\nPrice is: " + price  + "\nLanguage is: " + language + "\nAuthor is: " + a + "\n========================";
	    }
	

}
