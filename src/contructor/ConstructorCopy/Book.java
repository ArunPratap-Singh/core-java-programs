package contructor.ConstructorCopy;

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
    
    Book(Book b){
    	
    	this.title = b.title;
    	this.title = b.title;
    	this.price = b.price;
    }
    
    public String toString() {
    	
    	return "Title is: " +title+"\nAuthor is: " +author+"\nPrice is: " +price+"\n============================";
    }

}
