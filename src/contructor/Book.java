package contructor;

public class Book {
	
	String title;
    String author;
    double price;
    
    Book() {
    	
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    public String toString() {
    	
    	return "Title is: " +title+"\nAuthor is: " +author+"\nPrice is: " +price+"\n============================";
    }

}
