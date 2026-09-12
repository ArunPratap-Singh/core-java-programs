package constructor.deepCopy.Book;

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

	    // deep Copy Constructor
	    Book(Book b) {
	        this.title = b.title;
	        this.publisher = b.publisher;
	        this.price = b.price;
	        this.language = b.language;
	        this.a = new Author();
	        this.a.age = b.a.age;
	        this.a.authorId = b.a.authorId;
	        this.a.authorName = b.a.authorName;
	        this.a.gender = b.a.gender;
	        this.a.nationality = b.a.nationality;
	        this.a.specialization = b.a.specialization;
	    }

	    public String toString() {
	        return "Title is: " + title + "\nPublisher is: " + publisher + "\nPrice is: " + price  + "\nLanguage is: " + language + "\nAuthor is: " + a + "\n========================";
	    }
	

}
